package org.ippclub.mod.recipe

import org.ippclub.mod.item.ModItems
import net.minecraft.item.ItemStack
import net.minecraftforge.fml.common.registry.GameRegistry
import net.minecraft.init.Items

object ModRecipes {
	fun setup() {
		GameRegistry.addShapedRecipe(
			ItemStack(ModItems.copperAxe),
			" CC",
			" SC",
			" S ",
			'C', ModItems.ingotCopper,
			'S', Items.STICK)
	}
}
