
package net.mcreator.mortiusweaponryredux.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MundaneFlaskItem extends Item {
	public MundaneFlaskItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
