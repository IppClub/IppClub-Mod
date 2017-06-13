package org.ippclub.mod.item

import net.minecraft.item.Item

interface ItemModelProvider {
	fun registerItemModel(item: Item)
}