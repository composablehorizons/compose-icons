package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Circles: ImageVector
    get() {
        if (_Circles != null) return _Circles!!
        
        _Circles = ImageVector.Builder(
            name = "circles",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 40f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                close()
                moveTo(185f, 775f)
                quadToRelative(-51f, -51f, -78f, -117f)
                reflectiveQuadTo(80f, 520f)
                quadToRelative(0f, -106f, 56f, -193f)
                reflectiveQuadToRelative(152f, -132f)
                quadToRelative(29f, -12f, 54f, 5f)
                reflectiveQuadToRelative(20f, 45f)
                quadToRelative(-8f, 73f, 17f, 141.5f)
                reflectiveQuadTo(456f, 507f)
                quadToRelative(51f, 51f, 119f, 75.5f)
                reflectiveQuadTo(715f, 599f)
                quadToRelative(28f, -3f, 45f, 19f)
                reflectiveQuadToRelative(7f, 49f)
                quadToRelative(-44f, 97f, -132f, 155f)
                reflectiveQuadTo(440f, 880f)
                quadToRelative(-72f, 0f, -138f, -27f)
                reflectiveQuadToRelative(-117f, -78f)
                close()
            }
        }.build()
        
        return _Circles!!
    }

private var _Circles: ImageVector? = null

