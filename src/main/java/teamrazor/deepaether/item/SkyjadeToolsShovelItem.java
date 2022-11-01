
package teamrazor.deepaether.item;

import teamrazor.deepaether.init.DeepAetherModTabs;
import teamrazor.deepaether.init.DeepAetherModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import teamrazor.deepaether.tags.SkyjadeTool;

public class SkyjadeToolsShovelItem extends ShovelItem implements SkyjadeTool {
	public SkyjadeToolsShovelItem(Tier tier, int i, float v, Properties properties) {
		super(tier, i, v, properties);
	}
}
