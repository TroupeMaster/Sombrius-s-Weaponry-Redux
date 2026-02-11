
package net.mcreator.mortiusweaponryredux.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MusketBallPieceItem extends Item {
	public MusketBallPieceItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
