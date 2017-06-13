package org.ippclub.mod.item

import net.minecraft.item.Item
import net.minecraftforge.fml.common.registry.GameRegistry

object ModItems {
    var ingotCopper: ItemBase? = null

    fun init() {
        ingotCopper = register(ItemOre("ingotCopper", "ingotCopper"))
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