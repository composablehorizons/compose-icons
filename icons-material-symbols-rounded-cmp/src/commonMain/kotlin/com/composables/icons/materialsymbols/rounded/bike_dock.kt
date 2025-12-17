package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Bike_dock: ImageVector
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
                moveTo(158f, 840f)
                quadToRelative(-17f, 0f, -27.5f, -13f)
                reflectiveQuadTo(120f, 797f)
                quadToRelative(0f, -17f, 10f, -29.5f)
                reflectiveQuadToRelative(26f, -17.5f)
                lineToRelative(134f, -38f)
                lineToRelative(61f, -521f)
                quadToRelative(4f, -30f, 26.5f, -50.5f)
                reflectiveQuadTo(431f, 120f)
                horizontalLineToRelative(97f)
                quadToRelative(31f, 0f, 53.5f, 20.5f)
                reflectiveQuadTo(608f, 191f)
                lineToRelative(61f, 521f)
                lineToRelative(133f, 38f)
                quadToRelative(17f, 5f, 27.5f, 17f)
                reflectiveQuadToRelative(10.5f, 29f)
                quadToRelative(0f, 18f, -11.5f, 31f)
                reflectiveQuadTo(800f, 840f)
                horizontalLineTo(158f)
                close()
                moveToRelative(282f, -120f)
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

