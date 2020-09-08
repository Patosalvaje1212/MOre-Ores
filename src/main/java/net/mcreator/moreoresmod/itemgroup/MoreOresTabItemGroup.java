
package net.mcreator.moreoresmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.moreoresmod.item.ObsidianSwordItem;
import net.mcreator.moreoresmod.MoreoresmodModElements;

@MoreoresmodModElements.ModElement.Tag
public class MoreOresTabItemGroup extends MoreoresmodModElements.ModElement {
	public MoreOresTabItemGroup(MoreoresmodModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmore_ores_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ObsidianSwordItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
