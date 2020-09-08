
package net.mcreator.moreoresmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;
import net.minecraft.block.Blocks;

import net.mcreator.moreoresmod.itemgroup.MoreOresTabItemGroup;
import net.mcreator.moreoresmod.MoreoresmodModElements;

@MoreoresmodModElements.ModElement.Tag
public class ObsidianAxeItem extends MoreoresmodModElements.ModElement {
	@ObjectHolder("moreoresmod:obsidian_axe")
	public static final Item block = null;
	public ObsidianAxeItem(MoreoresmodModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
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
				return Ingredient.fromStacks(new ItemStack(Blocks.OBSIDIAN, (int) (1)));
			}
		}, 1, -2.7f, new Item.Properties().group(MoreOresTabItemGroup.tab)) {
		}.setRegistryName("obsidian_axe"));
	}
}
