package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Travel_luggage_and_bags: ImageVector
    get() {
        if (_Travel_luggage_and_bags != null) return _Travel_luggage_and_bags!!
        
        _Travel_luggage_and_bags = ImageVector.Builder(
            name = "travel_luggage_and_bags",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 760f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 80f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 120f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 320f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 880f)
                quadToRelative(-16f, 0f, -22.5f, -14.5f)
                reflectiveQuadTo(600f, 840f)
                horizontalLineTo(360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 880f)
                quadToRelative(-16f, 0f, -22.5f, -14.5f)
                reflectiveQuadTo(280f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 760f)
                close()
                moveToRelative(240f, -520f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(40f, 240f)
                quadToRelative(53f, 0f, 103.5f, -13.5f)
                reflectiveQuadTo(680f, 426f)
                verticalLineToRelative(-106f)
                horizontalLineTo(280f)
                verticalLineToRelative(106f)
                quadToRelative(46f, 27f, 96.5f, 40.5f)
                reflectiveQuadTo(480f, 480f)
                close()
                moveToRelative(-40f, 80f)
                verticalLineToRelative(-2f)
                quadToRelative(-42f, -5f, -82f, -15f)
                reflectiveQuadToRelative(-78f, -27f)
                verticalLineToRelative(244f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-244f)
                quadToRelative(-38f, 17f, -78f, 27f)
                reflectiveQuadToRelative(-82f, 15f)
                verticalLineToRelative(2f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 560f)
                close()
                moveToRelative(40f, 40f)
                close()
                moveToRelative(0f, -120f)
                close()
                moveToRelative(0f, 36f)
                close()
            }
        }.build()
        
        return _Travel_luggage_and_bags!!
    }

private var _Travel_luggage_and_bags: ImageVector? = null

