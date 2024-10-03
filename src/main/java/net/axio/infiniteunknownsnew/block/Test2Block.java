
package net.axio.infiniteunknownsnew.block;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.BlockPos;

public class Test2Block extends Block {
	public static final BooleanProperty STATUS = BooleanProperty.create("status");
	public static final IntegerProperty EBIN = IntegerProperty.create("ebin", 0, 100);
	public static final IntegerProperty EB_TYPE = IntegerProperty.create("eb_type", 0, 1);

	public Test2Block() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1f, 10f));
		this.registerDefaultState(this.stateDefinition.any().setValue(STATUS, false).setValue(EBIN, 5).setValue(EB_TYPE, 1));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(STATUS, EBIN, EB_TYPE);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(STATUS, false).setValue(EBIN, 5).setValue(EB_TYPE, 1);
	}
}
