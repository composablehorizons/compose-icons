package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Flight_land: ImageVector
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
                lineTo(149f, 468f)
                quadToRelative(-13f, -4f, -21f, -14f)
                reflectiveQuadToRelative(-8f, -24f)
                verticalLineToRelative(-155f)
                quadToRelative(0f, -13f, 10.5f, -20.5f)
                reflectiveQuadTo(153f, 251f)
                lineToRelative(15f, 5f)
                quadToRelative(6f, 2f, 10f, 6f)
                reflectiveQuadToRelative(6f, 10f)
                lineToRelative(24f, 72f)
                lineToRelative(192f, 54f)
                verticalLineToRelative(-273f)
                quadToRelative(0f, -17f, 13.5f, -28f)
                reflectiveQuadToRelative(30.5f, -6f)
                lineToRelative(17f, 4f)
                quadToRelative(9f, 2f, 15.5f, 8.5f)
                reflectiveQuadTo(486f, 119f)
                lineToRelative(104f, 331f)
                lineToRelative(200f, 56f)
                quadToRelative(23f, 6f, 36.5f, 24.5f)
                reflectiveQuadTo(840f, 572f)
                quadToRelative(0f, 33f, -27f, 53f)
                reflectiveQuadToRelative(-59f, 11f)
                close()
                moveTo(160f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 760f)
                horizontalLineToRelative(640f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 840f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Flight_land!!
    }

private var _Flight_land: ImageVector? = null

