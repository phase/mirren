package xyz.jadonfowler.mirren

import com.google.inject.Inject
import org.slf4j.Logger
import org.spongepowered.api.event.Listener
import org.spongepowered.api.event.game.state.GameStartedServerEvent
import org.spongepowered.api.plugin.Plugin

@Plugin(
        id = "mirren",
        name = "Mirren",
        description = "Library for intercepting and modifying Packets",
        authors = arrayOf("phase")
)
class Mirren {

    @Inject
    private val logger: Logger? = null

    @Listener
    fun onServerStart(event: GameStartedServerEvent) {
        // TODO
    }

}
