package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Menstrual_health: ImageVector
    get() {
        if (_Menstrual_health != null) return _Menstrual_health!!
        
        _Menstrual_health = ImageVector.Builder(
            name = "menstrual_health",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 100f)
                verticalLineToRelative(380f)
                quadToRelative(0f, 91f, 36f, 168f)
                reflectiveQuadToRelative(99f, 132f)
                quadToRelative(-26f, -38f, -40.5f, -83.5f)
                reflectiveQuadTo(160f, 600f)
                quadToRelative(0f, -74f, 30.5f, -154.5f)
                reflectiveQuadTo(292f, 259f)
                lineTo(80f, 100f)
                close()
                moveToRelative(400f, 37f)
                quadTo(347f, 297f, 293.5f, 412.5f)
                reflectiveQuadTo(240f, 600f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                quadToRelative(100f, 0f, 170f, -70f)
                reflectiveQuadToRelative(70f, -170f)
                quadToRelative(0f, -72f, -54f, -188.5f)
                reflectiveQuadTo(480f, 137f)
                close()
                moveToRelative(400f, -37f)
                lineTo(668f, 259f)
                quadToRelative(71f, 106f, 101.5f, 186.5f)
                reflectiveQuadTo(800f, 600f)
                quadToRelative(0f, 51f, -14.5f, 96.5f)
                reflectiveQuadTo(745f, 780f)
                quadToRelative(63f, -55f, 99f, -132f)
                reflectiveQuadToRelative(36f, -168f)
                verticalLineToRelative(-380f)
                close()
            }
        }.build()
        
        return _Menstrual_health!!
    }

private var _Menstrual_health: ImageVector? = null

