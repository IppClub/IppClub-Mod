package org.ippclub.mod.proxy

import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.client.resources.I18n
import net.minecraft.item.Item
import net.minecraftforge.client.model.ModelLoader
import org.ippclub.mod.ModEntry

class ClientProxy : CommonProxy() {
	override fun registerItemRenderer(item: Item, meta: Int, id: String) {
		ModelLoader.setCustomModelResourceLocation(item, meta,
				ModelResourceLocation(ModEntry.modId + ":" + id, "inventory"))
	}

	override fun localize(unlocalized: String, vararg args: Any): String {
		return I18n.format(unlocalized, *args)
	}

	override fun registerRenderers() {
		//ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPedestal::class.java, TESRPedestal())
	}
}