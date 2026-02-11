
package net.mcreator.mortiusweaponryredux.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FlaskOfGunpowderItem extends Item {
	public FlaskOfGunpowderItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
