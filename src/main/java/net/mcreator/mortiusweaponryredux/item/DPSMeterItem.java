
package net.mcreator.mortiusweaponryredux.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DPSMeterItem extends Item {
	public DPSMeterItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
