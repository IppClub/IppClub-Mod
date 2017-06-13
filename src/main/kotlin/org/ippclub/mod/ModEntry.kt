package org.ippclub.mod

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import net.minecraftforge.fml.common.SidedProxy
import org.ippclub.mod.client.IppClubTab
import org.ippclub.mod.item.ModItems
import org.ippclub.mod.proxy.CommonProxy

/**
 * @author Jin
 */
@Mod(modid = "ippclub", name = "IppClub", modLanguageAdapter = "net.shadowfacts.forgelin.KotlinAdapter")
object ModEntry {
	val modid = "ippclub"
	val creativeTab = IppClubTab()

	@Mod.EventHandler
	fun preInit(event: FMLPreInitializationEvent) {
		println("Hello IppClub!")
		ModItems.init()
		proxy?.registerRenderers()
	}

	@SidedProxy(serverSide = "org.ippclub.mod.proxy.CommonProxy", clientSide = "org.ippclub.mod.proxy.ClientProxy")
	var proxy: CommonProxy? = null
}
