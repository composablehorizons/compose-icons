package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Travel_luggage_and_bags: ImageVector
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
                moveTo(280f, 880f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(600f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(360f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, -640f)
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
                moveToRelative(-40f, 120f)
                verticalLineToRelative(-42f)
                quadToRelative(-42f, -5f, -82f, -15f)
                reflectiveQuadToRelative(-78f, -27f)
                verticalLineToRelative(244f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-244f)
                quadToRelative(-38f, 17f, -78f, 27f)
                reflectiveQuadToRelative(-82f, 15f)
                verticalLineToRelative(42f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, 0f)
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

