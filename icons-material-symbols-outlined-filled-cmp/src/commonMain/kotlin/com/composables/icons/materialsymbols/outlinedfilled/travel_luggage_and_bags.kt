package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Travel_luggage_and_bags: ImageVector
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
                moveTo(440f, 240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(40f, 240f)
                quadToRelative(-76f, 0f, -145f, -31.5f)
                reflectiveQuadTo(200f, 378f)
                verticalLineToRelative(-58f)
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
                verticalLineToRelative(58f)
                quadToRelative(-66f, 39f, -135f, 70.5f)
                reflectiveQuadTo(480f, 480f)
                close()
                moveTo(280f, 880f)
                verticalLineToRelative(-40f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 760f)
                verticalLineToRelative(-292f)
                quadToRelative(56f, 34f, 115.5f, 58f)
                reflectiveQuadTo(440f, 558f)
                verticalLineToRelative(42f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-42f)
                quadToRelative(65f, -8f, 124.5f, -32f)
                reflectiveQuadTo(760f, 468f)
                verticalLineToRelative(292f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 840f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(360f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Travel_luggage_and_bags!!
    }

private var _Travel_luggage_and_bags: ImageVector? = null

