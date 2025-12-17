package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Local_pizza: ImageVector
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
                moveTo(480f, 880f)
                lineTo(80f, 280f)
                quadToRelative(85f, -72f, 186.5f, -116f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(112f, 0f, 213.5f, 43.5f)
                reflectiveQuadTo(880f, 280f)
                lineTo(480f, 880f)
                close()
                moveToRelative(0f, -144f)
                lineToRelative(292f, -438f)
                quadToRelative(-65f, -45f, -139f, -71.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(-79f, 0f, -152.5f, 26.5f)
                reflectiveQuadTo(188f, 298f)
                lineToRelative(292f, 438f)
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
                moveToRelative(0f, 136f)
                close()
            }
        }.build()
        
        return _Local_pizza!!
    }

private var _Local_pizza: ImageVector? = null

