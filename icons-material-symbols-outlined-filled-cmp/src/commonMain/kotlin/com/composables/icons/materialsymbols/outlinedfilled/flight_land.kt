package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Flight_land: ImageVector
    get() {
        if (_Flight_land != null) return _Flight_land!!
        
        _Flight_land = ImageVector.Builder(
            name = "flight_land",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(754f, 636f)
                lineTo(120f, 460f)
                verticalLineToRelative(-220f)
                lineToRelative(60f, 20f)
                lineToRelative(28f, 84f)
                lineToRelative(192f, 54f)
                verticalLineToRelative(-318f)
                lineToRelative(80f, 20f)
                lineToRelative(110f, 350f)
                lineToRelative(200f, 56f)
                quadToRelative(23f, 6f, 36.5f, 24.5f)
                reflectiveQuadTo(840f, 572f)
                quadToRelative(0f, 33f, -27f, 53f)
                reflectiveQuadToRelative(-59f, 11f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Flight_land!!
    }

private var _Flight_land: ImageVector? = null

