
package net.mcreator.moreoresmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.block.Blocks;

import net.mcreator.moreoresmod.itemgroup.MoreOresTabItemGroup;
import net.mcreator.moreoresmod.MoreoresmodModElements;

@MoreoresmodModElements.ModElement.Tag
public class ObsidianSwordItem extends MoreoresmodModElements.ModElement {
	@ObjectHolder("moreoresmod:obsidian_sword")
	public static final Item block = null;
	public ObsidianSwordItem(MoreoresmodModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2380;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 7f;
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
		}, 3, -1.2f, new Item.Properties().group(MoreOresTabItemGroup.tab)) {
		}.setRegistryName("obsidian_sword"));
	}
}
