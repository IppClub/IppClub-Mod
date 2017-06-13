package org.ippclub.mod.item

import net.minecraft.item.Item
import net.minecraftforge.fml.common.registry.GameRegistry
import net.minecraftforge.common.util.EnumHelper

object ModItems {
	object material {
		val copperTool = EnumHelper.addToolMaterial("COPPER", 2, 500, 6f, 2f, 14)
	}

	var ingotCopper: ItemBase? = null
	var copperAxe: ItemAxe? = null

	fun setup() {
		ingotCopper = register(ItemOre("ingotCopper", "ingotCopper"))
		copperAxe = register(ItemAxe(material.copperTool, "copperAxe"))
	}

	 private fun <T : Item> register(item: T): T {
		GameRegistry.register(item)
		if (item is ItemModelProvider) {
			item.registerItemModel(item)
		}
		if (item is ItemOreDict) {
			item.initOreDict()
		}
		return item
	 }
}
