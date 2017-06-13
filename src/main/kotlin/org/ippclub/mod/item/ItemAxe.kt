package org.ippclub.mod.item

import net.minecraft.item.Item
import org.ippclub.mod.ModEntry

class ItemAxe(material: Item.ToolMaterial, private val name: String):
		net.minecraft.item.ItemAxe(material, 8f, -3.1f), ItemModelProvider {
	init {
		unlocalizedName = name
		creativeTab = ModEntry.creativeTab
		setRegistryName(name)
	}

	override fun registerItemModel(item: Item) {
		ModEntry.proxy?.registerItemRenderer(this, 0, name)
	}
}
