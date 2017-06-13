package org.ippclub.mod.client

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item
import org.ippclub.mod.ModEntry
import org.ippclub.mod.item.ModItems

open class IppClubTab: CreativeTabs(ModEntry.modid) {
	init {
		backgroundImageName = "ippclubmod.png"
	}

	override fun getTabIconItem(): Item {
		return ModItems.ingotCopper!!
	}

	override fun hasSearchBar() = true
}
