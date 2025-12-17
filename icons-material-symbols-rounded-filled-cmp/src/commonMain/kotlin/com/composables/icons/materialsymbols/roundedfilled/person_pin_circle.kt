package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Person_pin_circle: ImageVector
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
                moveTo(480f, 853f)
                quadToRelative(-14f, 0f, -28f, -5f)
                reflectiveQuadToRelative(-25f, -15f)
                quadToRelative(-65f, -60f, -115f, -117f)
                reflectiveQuadToRelative(-83.5f, -110.5f)
                quadToRelative(-33.5f, -53.5f, -51f, -103f)
                reflectiveQuadTo(160f, 408f)
                quadToRelative(0f, -150f, 96.5f, -239f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(127f, 0f, 223.5f, 89f)
                reflectiveQuadTo(800f, 408f)
                quadToRelative(0f, 45f, -17.5f, 94.5f)
                reflectiveQuadToRelative(-51f, 103f)
                quadTo(698f, 659f, 648f, 716f)
                reflectiveQuadTo(533f, 833f)
                quadToRelative(-11f, 10f, -25f, 15f)
                reflectiveQuadToRelative(-28f, 5f)
                close()
                moveToRelative(0f, -253f)
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
            }
        }.build()
        
        return _Person_pin_circle!!
    }

private var _Person_pin_circle: ImageVector? = null

