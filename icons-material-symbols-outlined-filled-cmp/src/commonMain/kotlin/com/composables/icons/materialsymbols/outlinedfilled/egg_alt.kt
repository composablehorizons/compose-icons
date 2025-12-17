package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Egg_alt: ImageVector
    get() {
        if (_Egg_alt != null) return _Egg_alt!!
        
        _Egg_alt = ImageVector.Builder(
            name = "egg_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 880f)
                quadToRelative(-67f, 0f, -101.5f, -22.5f)
                reflectiveQuadTo(480f, 810f)
                quadToRelative(-19f, -20f, -36.5f, -35f)
                reflectiveQuadTo(399f, 760f)
                quadToRelative(-45f, 0f, -100f, -15.5f)
                reflectiveQuadToRelative(-103.5f, -51f)
                quadTo(147f, 658f, 114f, 601f)
                reflectiveQuadTo(80f, 461f)
                quadToRelative(-2f, -167f, 82.5f, -274f)
                reflectiveQuadTo(399f, 80f)
                quadToRelative(71f, 0f, 120f, 20.5f)
                reflectiveQuadToRelative(84.5f, 51.5f)
                quadToRelative(35.5f, 31f, 60f, 68.5f)
                reflectiveQuadTo(710f, 293f)
                quadToRelative(12f, 20f, 24f, 36.5f)
                reflectiveQuadToRelative(26f, 30.5f)
                quadToRelative(60f, 60f, 90f, 105f)
                reflectiveQuadToRelative(30f, 136f)
                quadToRelative(0f, 120f, -74.5f, 199.5f)
                reflectiveQuadTo(640f, 880f)
                close()
                moveTo(480f, 620f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
            }
        }.build()
        
        return _Egg_alt!!
    }

private var _Egg_alt: ImageVector? = null

