
package net.axio.infiniteunknownsnew.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IronBarItem extends Item {
	public IronBarItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
