
package net.mcreator.moreoresmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.moreoresmod.itemgroup.MoreOresTabItemGroup;
import net.mcreator.moreoresmod.MoreoresmodModElements;

@MoreoresmodModElements.ModElement.Tag
public class ObsidianHoeItem extends MoreoresmodModElements.ModElement {
	@ObjectHolder("moreoresmod:obsidian_hoe")
	public static final Item block = null;
	public ObsidianHoeItem(MoreoresmodModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 2380;
			}

			public float getEfficiency() {
				return 2f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 70;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -3f, new Item.Properties().group(MoreOresTabItemGroup.tab)) {
		}.setRegistryName("obsidian_hoe"));
	}
}
