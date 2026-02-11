
package net.mcreator.mortiusweaponryredux.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ThickFlaskItem extends Item {
	public ThickFlaskItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
