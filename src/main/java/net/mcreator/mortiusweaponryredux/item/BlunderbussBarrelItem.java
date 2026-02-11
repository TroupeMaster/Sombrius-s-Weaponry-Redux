
package net.mcreator.mortiusweaponryredux.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BlunderbussBarrelItem extends Item {
	public BlunderbussBarrelItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
