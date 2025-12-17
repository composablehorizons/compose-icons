package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Person_pin_circle: ImageVector
    get() {
        if (_Person_pin_circle != null) return _Person_pin_circle!!
        
        _Person_pin_circle = ImageVector.Builder(
            name = "person_pin_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 600f)
                quadToRelative(56f, 0f, 101f, -27.5f)
                reflectiveQuadToRelative(71f, -72.5f)
                quadToRelative(-35f, -29f, -79f, -44.5f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(-49f, 0f, -93f, 15.5f)
                reflectiveQuadTo(308f, 500f)
                quadToRelative(26f, 45f, 71f, 72.5f)
                reflectiveQuadTo(480f, 600f)
                close()
                moveToRelative(0f, -200f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 320f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 320f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 400f)
                close()
                moveToRelative(0f, 374f)
                quadToRelative(122f, -112f, 181f, -203.5f)
                reflectiveQuadTo(720f, 408f)
                quadToRelative(0f, -109f, -69.5f, -178.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-101f, 0f, -170.5f, 69.5f)
                reflectiveQuadTo(240f, 408f)
                quadToRelative(0f, 71f, 59f, 162.5f)
                reflectiveQuadTo(480f, 774f)
                close()
                moveToRelative(0f, 106f)
                quadTo(319f, 743f, 239.5f, 625.5f)
                reflectiveQuadTo(160f, 408f)
                quadToRelative(0f, -150f, 96.5f, -239f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(127f, 0f, 223.5f, 89f)
                reflectiveQuadTo(800f, 408f)
                quadToRelative(0f, 100f, -79.5f, 217.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -480f)
                close()
            }
        }.build()
        
        return _Person_pin_circle!!
    }

private var _Person_pin_circle: ImageVector? = null

