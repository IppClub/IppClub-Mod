package org.ippclub.mod.item

import net.minecraftforge.oredict.OreDictionary

class ItemOre(name: String, private val oreName: String): ItemBase(name), ItemOreDict {
	override fun initOreDict() {
		OreDictionary.registerOre(oreName, this)
	}
}
