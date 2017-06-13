package org.ippclub.mod.client

import net.minecraft.creativetab.CreativeTabs
import org.ippclub.mod.ModEntry
import org.ippclub.mod.item.ModItems

open class IppClubTab: CreativeTabs(ModEntry.modId) {
	init {
		backgroundImageName = "ippclubmod.png"
	}

	override fun getTabIconItem() = ModItems.ingotCopper!!

	override fun hasSearchBar() = true
}
