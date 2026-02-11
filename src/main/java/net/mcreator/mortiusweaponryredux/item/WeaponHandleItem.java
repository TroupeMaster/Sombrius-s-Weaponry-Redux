
package net.mcreator.mortiusweaponryredux.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class WeaponHandleItem extends Item {
	public WeaponHandleItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
