package org.ippclub.mod.item

import net.minecraft.item.Item
import org.ippclub.mod.ModEntry

open class ItemBase(protected var name: String): Item(), ItemModelProvider {
	init {
		unlocalizedName = name
		creativeTab = ModEntry.creativeTab
		setRegistryName(name)
	}

	override fun registerItemModel(item: Item) {
		ModEntry.proxy?.registerItemRenderer(item, 0, name)
	}
}
