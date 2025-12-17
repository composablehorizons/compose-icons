package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Local_pizza: ImageVector
    get() {
        if (_Local_pizza != null) return _Local_pizza!!
        
        _Local_pizza = ImageVector.Builder(
            name = "local_pizza",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 120f)
                quadToRelative(88f, 0f, 179f, 30f)
                reflectiveQuadToRelative(161f, 84f)
                quadToRelative(16f, 12f, 24f, 29f)
                reflectiveQuadToRelative(8f, 35f)
                quadToRelative(0f, 11f, -3.5f, 22.5f)
                reflectiveQuadTo(838f, 343f)
                lineTo(547f, 780f)
                quadToRelative(-12f, 18f, -30f, 27f)
                reflectiveQuadToRelative(-37f, 9f)
                quadToRelative(-19f, 0f, -37f, -9f)
                reflectiveQuadToRelative(-30f, -27f)
                lineTo(122f, 343f)
                quadToRelative(-7f, -11f, -10f, -22f)
                reflectiveQuadToRelative(-3f, -22f)
                quadToRelative(0f, -18f, 8f, -35f)
                reflectiveQuadToRelative(24f, -29f)
                quadToRelative(70f, -53f, 160.5f, -84f)
                reflectiveQuadTo(480f, 120f)
                close()
                moveTo(380f, 400f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(440f, 340f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(380f, 280f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(320f, 340f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(380f, 400f)
                close()
                moveToRelative(100f, 200f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 540f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 540f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 600f)
                close()
            }
        }.build()
        
        return _Local_pizza!!
    }

private var _Local_pizza: ImageVector? = null

