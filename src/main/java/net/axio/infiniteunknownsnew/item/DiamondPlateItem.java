
package net.axio.infiniteunknownsnew.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DiamondPlateItem extends Item {
	public DiamondPlateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
