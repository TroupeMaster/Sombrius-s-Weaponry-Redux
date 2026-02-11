
package net.mcreator.mortiusweaponryredux.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BlazeRodHandleItem extends Item {
	public BlazeRodHandleItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
