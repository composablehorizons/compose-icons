package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Bike_dock: ImageVector
    get() {
        if (_Bike_dock != null) return _Bike_dock!!
        
        _Bike_dock = ImageVector.Builder(
            name = "bike_dock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-80f)
                lineToRelative(170f, -49f)
                lineToRelative(62f, -520f)
                quadToRelative(4f, -30f, 26f, -50.5f)
                reflectiveQuadToRelative(53f, -20.5f)
                horizontalLineToRelative(98f)
                quadToRelative(31f, 0f, 53f, 20.5f)
                reflectiveQuadToRelative(26f, 50.5f)
                lineToRelative(62f, 520f)
                lineToRelative(170f, 49f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(320f, -120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 240f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Bike_dock!!
    }

private var _Bike_dock: ImageVector? = null

