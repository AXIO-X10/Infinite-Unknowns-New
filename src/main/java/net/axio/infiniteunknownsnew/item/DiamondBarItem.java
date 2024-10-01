
package net.axio.infiniteunknownsnew.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DiamondBarItem extends Item {
	public DiamondBarItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
