package net.axio.infiniteunknownsnew.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;

import net.axio.infiniteunknownsnew.init.InfiniteUnknownsNewModItems;

public class ProcessSimpleMachiningTableProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double count = 0;
		ItemStack output = ItemStack.EMPTY;
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).copy();
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 11)).getItem() == InfiniteUnknownsNewModItems.IRON_MACHINING_HAMMER.get()) {
			if (ProcessEasyMachiningProcedure.execute(world, x, y, z, new ItemStack(Blocks.AIR), new ItemStack(Items.GOLD_INGOT), new ItemStack(Blocks.AIR), new ItemStack(Items.GOLD_INGOT), new ItemStack(Items.APPLE), new ItemStack(Items.GOLD_INGOT),
					new ItemStack(Blocks.AIR), new ItemStack(Items.GOLD_INGOT), new ItemStack(Blocks.AIR)) && (new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							if (world instanceof ILevelExtension _ext) {
								IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
								if (_itemHandler != null)
									return _itemHandler.getStackInSlot(slotid).copy();
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack(world, BlockPos.containing(x, y, z), 10)).getItem() == Blocks.AIR.asItem()) {
				output = new ItemStack(Items.GOLDEN_APPLE);
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = output.copy();
					_setstack.setCount(1);
					_itemHandlerModifiable.setStackInSlot(10, _setstack);
				}
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 11;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
				ProcessClearProcedure.execute(world, x, y, z);
			} else if (ProcessEasyMachiningProcedure.execute(world, x, y, z, new ItemStack(Items.IRON_INGOT), new ItemStack(Items.IRON_INGOT), new ItemStack(Blocks.AIR), new ItemStack(Blocks.AIR), new ItemStack(Blocks.AIR), new ItemStack(Blocks.AIR),
					new ItemStack(Blocks.AIR), new ItemStack(Blocks.AIR), new ItemStack(Blocks.AIR)) && (new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							if (world instanceof ILevelExtension _ext) {
								IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
								if (_itemHandler != null)
									return _itemHandler.getStackInSlot(slotid).copy();
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack(world, BlockPos.containing(x, y, z), 10)).getItem() == Blocks.AIR.asItem()) {
				output = new ItemStack(InfiniteUnknownsNewModItems.IRON_PLATE.get());
				{
					final String _tagName = "precision";
					final double _tagValue = (Math.ceil(Mth.nextDouble(RandomSource.create(), 0, 10) * 100) / 100);
					CustomData.update(DataComponents.CUSTOM_DATA, output, tag -> tag.putDouble(_tagName, _tagValue));
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = output.copy();
					_setstack.setCount(1);
					_itemHandlerModifiable.setStackInSlot(10, _setstack);
				}
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 11;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
				ProcessClearProcedure.execute(world, x, y, z);
			} else if (ProcessEasyMachiningProcedure.execute(world, x, y, z, new ItemStack(Items.IRON_INGOT), new ItemStack(Blocks.AIR), new ItemStack(Blocks.AIR), new ItemStack(Items.IRON_INGOT), new ItemStack(Blocks.AIR), new ItemStack(Blocks.AIR),
					new ItemStack(Blocks.AIR), new ItemStack(Blocks.AIR), new ItemStack(Blocks.AIR)) && (new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							if (world instanceof ILevelExtension _ext) {
								IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
								if (_itemHandler != null)
									return _itemHandler.getStackInSlot(slotid).copy();
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack(world, BlockPos.containing(x, y, z), 10)).getItem() == Blocks.AIR.asItem()) {
				output = new ItemStack(InfiniteUnknownsNewModItems.IRON_BAR.get());
				{
					final String _tagName = "precision";
					final double _tagValue = (Math.ceil(Mth.nextDouble(RandomSource.create(), 0, 10) * 100) / 100);
					CustomData.update(DataComponents.CUSTOM_DATA, output, tag -> tag.putDouble(_tagName, _tagValue));
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = output.copy();
					_setstack.setCount(1);
					_itemHandlerModifiable.setStackInSlot(10, _setstack);
				}
				if (world instanceof ILevelExtension _ext && world instanceof ServerLevel _serverLevel
						&& _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 11;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.hurtAndBreak(1, _serverLevel, null, _stkprov -> {
					});
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
				ProcessClearProcedure.execute(world, x, y, z);
			}
		}
	}
}
