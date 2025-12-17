package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Airline_stops: ImageVector
    get() {
        if (_Airline_stops != null) return _Airline_stops!!
        
        _Airline_stops = ImageVector.Builder(
            name = "airline_stops",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 680f)
                quadToRelative(-14f, -127f, -102.5f, -214.5f)
                reflectiveQuadTo(124f, 363f)
                quadToRelative(-18f, -2f, -31f, -14f)
                reflectiveQuadToRelative(-13f, -29f)
                quadToRelative(0f, -17f, 12f, -28.5f)
                reflectiveQuadToRelative(29f, -9.5f)
                quadToRelative(117f, 11f, 212.5f, 77f)
                reflectiveQuadTo(480f, 532f)
                quadToRelative(38f, -81f, 100f, -143.5f)
                reflectiveQuadTo(719f, 280f)
                horizontalLineTo(600f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 200f)
                horizontalLineToRelative(200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 240f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 440f)
                verticalLineToRelative(-92f)
                quadToRelative(-93f, 57f, -160f, 141f)
                reflectiveQuadToRelative(-80f, 191f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 760f)
                horizontalLineTo(400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 680f)
                horizontalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Airline_stops!!
    }

private var _Airline_stops: ImageVector? = null

