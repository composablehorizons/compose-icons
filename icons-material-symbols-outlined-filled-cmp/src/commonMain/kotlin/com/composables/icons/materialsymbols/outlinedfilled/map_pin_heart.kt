package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Map_pin_heart: ImageVector
    get() {
        if (_Map_pin_heart != null) return _Map_pin_heart!!
        
        _Map_pin_heart = ImageVector.Builder(
            name = "map_pin_heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 572f)
                quadToRelative(54f, -50f, 84f, -80f)
                reflectiveQuadToRelative(47f, -50f)
                quadToRelative(16f, -20f, 22.5f, -37f)
                reflectiveQuadToRelative(6.5f, -37f)
                quadToRelative(0f, -36f, -26f, -62f)
                reflectiveQuadToRelative(-62f, -26f)
                quadToRelative(-21f, 0f, -40.5f, 8.5f)
                reflectiveQuadTo(480f, 312f)
                quadToRelative(-12f, -15f, -31f, -23.5f)
                reflectiveQuadToRelative(-41f, -8.5f)
                quadToRelative(-36f, 0f, -62f, 26f)
                reflectiveQuadToRelative(-26f, 62f)
                quadToRelative(0f, 21f, 6f, 37f)
                reflectiveQuadToRelative(22f, 36f)
                quadToRelative(17f, 20f, 46f, 50f)
                reflectiveQuadToRelative(86f, 81f)
                close()
                moveToRelative(0f, 308f)
                quadTo(319f, 743f, 239.5f, 625.5f)
                reflectiveQuadTo(160f, 408f)
                quadToRelative(0f, -150f, 96.5f, -239f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(127f, 0f, 223.5f, 89f)
                reflectiveQuadTo(800f, 408f)
                quadToRelative(0f, 100f, -79.5f, 217.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Map_pin_heart!!
    }

private var _Map_pin_heart: ImageVector? = null

