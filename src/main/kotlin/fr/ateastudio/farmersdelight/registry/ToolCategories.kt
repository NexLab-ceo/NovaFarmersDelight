package fr.ateastudio.farmersdelight.registry

import net.kyori.adventure.key.Key

/**
 * Custom tool category identifiers in Nova 0.25 are namespaced Keys,
 * not registry-created ToolCategory objects.
 */
@Suppress("unused")
object ToolCategories {
    val KNIFE: Key = Key.key("farmersdelight", "knife")
}
