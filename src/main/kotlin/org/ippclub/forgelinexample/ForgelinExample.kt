package org.ippclub.forgelinexample

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

/**
 * @author Jin
 */
@Mod(modid = "ForgelinExample", modLanguageAdapter = "net.shadowfacts.forgelin.KotlinAdapter")
object ForgelinExample {

	@Mod.EventHandler
	fun preInit(event: FMLPreInitializationEvent) {
		println("Hello IppClub!")
	}

}