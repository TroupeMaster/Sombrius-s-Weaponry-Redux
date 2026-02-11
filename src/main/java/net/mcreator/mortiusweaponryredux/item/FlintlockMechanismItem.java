
package net.mcreator.mortiusweaponryredux.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FlintlockMechanismItem extends Item {
	public FlintlockMechanismItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
