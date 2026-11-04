package fr.ateastudio.farmersdelight.block

import net.kyori.adventure.key.Key
import xyz.xenondevs.nova.world.block.state.property.BooleanProperty
import xyz.xenondevs.nova.world.block.state.property.EnumProperty
import xyz.xenondevs.nova.world.block.state.property.IntProperty

/**
 * Nova 0.25 properties declare their complete allowed value domain at construction.
 * The old 0.24 .scope(...) API no longer exists.
 */
object BlockStateProperties {
    val AGE = IntProperty(Key.key("farmersdelight", "age"), 0..7)
    val MAX_AGE = IntProperty(Key.key("farmersdelight", "max_age"), 0..7)
    val BUDDING_AGE = IntProperty(Key.key("farmersdelight", "budding_age"), -1..7)
    val HEATED = BooleanProperty(Key.key("farmersdelight", "heated"))
    val SUPPORT = EnumProperty<CookingPotSupport>(
        Key.key("farmersdelight", "support"),
        CookingPotSupport.NONE,
        CookingPotSupport.HANDLE,
        CookingPotSupport.TRAY
    )
    val PAIRED = BooleanProperty(Key.key("farmersdelight", "paired"))
    val BITES = IntProperty(Key.key("farmersdelight", "bites"), 0..3)
    val SERVINGS = IntProperty(Key.key("farmersdelight", "servings"), 0..8)
}

/**
 * Compatibility aliases retained so existing block behavior can be migrated
 * incrementally without losing the intended state domains.
 */
object ScopedBlockStateProperties {
    val AGE = BlockStateProperties.AGE
    val MAX_AGE = BlockStateProperties.MAX_AGE
    val BUDDING_AGE = BlockStateProperties.BUDDING_AGE
    val HEATED = BlockStateProperties.HEATED
    val SUPPORT = BlockStateProperties.SUPPORT
    val PAIRED = BlockStateProperties.PAIRED
    val BITES = BlockStateProperties.BITES
    val SERVINGS = BlockStateProperties.SERVINGS
}
