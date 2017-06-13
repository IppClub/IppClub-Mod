package org.ippclub.mod

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import net.minecraftforge.fml.common.SidedProxy
import org.ippclub.mod.client.IppClubTab
import org.ippclub.mod.item.ModItems
import org.ippclub.mod.proxy.CommonProxy
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent
import org.ippclub.mod.recipe.ModRecipes
import net.minecraftforge.fml.common.event.FMLInitializationEvent



/**
 * @author Jin
 */
@Mod(modid = ModEntry.modId, name = ModEntry.modName, modLanguageAdapter = "net.shadowfacts.forgelin.KotlinAdapter")
object ModEntry {
	const val modId = "ippclub"
	const val modName = "IppClub"
	val creativeTab = IppClubTab()

	@SidedProxy(serverSide = "org.ippclub.mod.proxy.CommonProxy", clientSide = "org.ippclub.mod.proxy.ClientProxy")
	var proxy: CommonProxy? = null

	@Mod.EventHandler
	fun preInit(event: FMLPreInitializationEvent) {
		println("Hello IppClub!")
		ModItems.setup()
		proxy?.registerRenderers()
	}

	@Mod.EventHandler
	fun init(event: FMLInitializationEvent) {
		ModRecipes.setup()
	}

	@Mod.EventHandler
	fun postInit(event: FMLPostInitializationEvent) {
	}
}
