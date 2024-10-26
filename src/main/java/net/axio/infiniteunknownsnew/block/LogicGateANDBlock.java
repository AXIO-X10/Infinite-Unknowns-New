
package net.axio.infiniteunknownsnew.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.axio.infiniteunknownsnew.procedures.ProcessLogicGateANDProcedure;

public class LogicGateANDBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public LogicGateANDBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(13, 2, 12, 14, 3, 13), box(13, 2, 3, 14, 3, 4), box(2, 2, 12, 3, 3, 13), box(2, 2, 3, 3, 3, 4), box(2, 2, 2, 4, 3, 3), box(2, 2, 13, 4, 3, 14), box(12, 2, 2, 14, 3, 3), box(12, 2, 13, 14, 3, 14),
					box(0, 0, 0, 16, 2, 16), box(6, 2, 11, 10, 3, 12), box(6, 2, 13, 10, 3, 14), box(6, 2, 2, 10, 3, 3), box(2, 2, 6, 14, 3, 10), box(6, 2, 4, 10, 3, 6));
			case NORTH -> Shapes.or(box(2, 2, 3, 3, 3, 4), box(2, 2, 12, 3, 3, 13), box(13, 2, 3, 14, 3, 4), box(13, 2, 12, 14, 3, 13), box(12, 2, 13, 14, 3, 14), box(12, 2, 2, 14, 3, 3), box(2, 2, 13, 4, 3, 14), box(2, 2, 2, 4, 3, 3),
					box(0, 0, 0, 16, 2, 16), box(6, 2, 4, 10, 3, 5), box(6, 2, 2, 10, 3, 3), box(6, 2, 13, 10, 3, 14), box(2, 2, 6, 14, 3, 10), box(6, 2, 10, 10, 3, 12));
			case EAST -> Shapes.or(box(12, 2, 2, 13, 3, 3), box(3, 2, 2, 4, 3, 3), box(12, 2, 13, 13, 3, 14), box(3, 2, 13, 4, 3, 14), box(2, 2, 12, 3, 3, 14), box(13, 2, 12, 14, 3, 14), box(2, 2, 2, 3, 3, 4), box(13, 2, 2, 14, 3, 4),
					box(0, 0, 0, 16, 2, 16), box(11, 2, 6, 12, 3, 10), box(13, 2, 6, 14, 3, 10), box(2, 2, 6, 3, 3, 10), box(6, 2, 2, 10, 3, 14), box(4, 2, 6, 6, 3, 10));
			case WEST -> Shapes.or(box(3, 2, 13, 4, 3, 14), box(12, 2, 13, 13, 3, 14), box(3, 2, 2, 4, 3, 3), box(12, 2, 2, 13, 3, 3), box(13, 2, 2, 14, 3, 4), box(2, 2, 2, 3, 3, 4), box(13, 2, 12, 14, 3, 14), box(2, 2, 12, 3, 3, 14),
					box(0, 0, 0, 16, 2, 16), box(4, 2, 6, 5, 3, 10), box(2, 2, 6, 3, 3, 10), box(13, 2, 6, 14, 3, 10), box(6, 2, 2, 10, 3, 14), box(10, 2, 6, 12, 3, 10));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		ProcessLogicGateANDProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		world.scheduleTick(pos, this, 1);
	}
}
