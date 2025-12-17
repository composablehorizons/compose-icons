package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Traffic_jam: ImageVector
    get() {
        if (_Traffic_jam != null) return _Traffic_jam!!
        
        _Traffic_jam = ImageVector.Builder(
            name = "traffic_jam",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 840f)
                verticalLineToRelative(-320f)
                lineToRelative(85f, -203f)
                quadToRelative(7f, -17f, 22f, -27f)
                reflectiveQuadToRelative(33f, -10f)
                horizontalLineToRelative(360f)
                quadToRelative(18f, 0f, 33f, 10f)
                reflectiveQuadToRelative(22f, 27f)
                lineToRelative(85f, 203f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 880f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 840f)
                verticalLineToRelative(-40f)
                horizontalLineTo(160f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(120f, 880f)
                horizontalLineTo(80f)
                close()
                moveToRelative(72f, -440f)
                horizontalLineToRelative(415f)
                lineToRelative(-33f, -80f)
                horizontalLineTo(186f)
                lineToRelative(-34f, 80f)
                close()
                moveToRelative(68f, 240f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(280f, 620f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(220f, 560f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(160f, 620f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(220f, 680f)
                close()
                moveToRelative(280f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(560f, 620f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(500f, 560f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(440f, 620f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(500f, 680f)
                close()
                moveToRelative(220f, 80f)
                verticalLineToRelative(-344f)
                lineToRelative(-73f, -176f)
                horizontalLineTo(227f)
                lineToRelative(18f, -43f)
                quadToRelative(7f, -17f, 22f, -27f)
                reflectiveQuadToRelative(33f, -10f)
                horizontalLineToRelative(360f)
                quadToRelative(18f, 0f, 33f, 10f)
                reflectiveQuadToRelative(22f, 27f)
                lineToRelative(85f, 203f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 760f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(120f, -120f)
                verticalLineToRelative(-344f)
                lineToRelative(-73f, -176f)
                horizontalLineTo(347f)
                lineToRelative(18f, -43f)
                quadToRelative(7f, -17f, 22f, -27f)
                reflectiveQuadToRelative(33f, -10f)
                horizontalLineToRelative(360f)
                quadToRelative(18f, 0f, 33f, 10f)
                reflectiveQuadToRelative(22f, 27f)
                lineToRelative(85f, 203f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 640f)
                horizontalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Traffic_jam!!
    }

private var _Traffic_jam: ImageVector? = null

