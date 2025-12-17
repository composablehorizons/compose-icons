package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Traffic_jam: ImageVector
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
                moveTo(160f, 880f)
                horizontalLineTo(40f)
                verticalLineToRelative(-360f)
                lineToRelative(100f, -240f)
                horizontalLineToRelative(440f)
                lineToRelative(100f, 240f)
                verticalLineToRelative(360f)
                horizontalLineTo(560f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-8f, -440f)
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
                lineToRelative(33f, -80f)
                horizontalLineToRelative(440f)
                lineToRelative(100f, 240f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, -120f)
                verticalLineToRelative(-344f)
                lineToRelative(-73f, -176f)
                horizontalLineTo(347f)
                lineToRelative(33f, -80f)
                horizontalLineToRelative(440f)
                lineToRelative(100f, 240f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Traffic_jam!!
    }

private var _Traffic_jam: ImageVector? = null

