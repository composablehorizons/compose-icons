package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Home_mini: ImageVector
    get() {
        if (_Home_mini != null) return _Home_mini!!
        
        _Home_mini = ImageVector.Builder(
            name = "home_mini",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 760f)
                quadToRelative(-116f, 0f, -198f, -82f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -38f, 18.5f, -86f)
                reflectiveQuadToRelative(64.5f, -91.5f)
                quadToRelative(46f, -43.5f, 123f, -73f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(117f, 0f, 194f, 29.5f)
                reflectiveQuadToRelative(123f, 73f)
                quadToRelative(46f, 43.5f, 64.5f, 91.5f)
                reflectiveQuadToRelative(18.5f, 86f)
                quadToRelative(0f, 116f, -82f, 198f)
                reflectiveQuadToRelative(-198f, 82f)
                horizontalLineTo(360f)
                close()
                moveToRelative(6f, -80f)
                horizontalLineToRelative(228f)
                quadToRelative(63f, 0f, 114.5f, -33.5f)
                reflectiveQuadTo(784f, 560f)
                horizontalLineTo(176f)
                quadToRelative(24f, 53f, 75.5f, 86.5f)
                reflectiveQuadTo(366f, 680f)
                close()
                moveToRelative(114f, -120f)
                close()
                moveToRelative(0f, -40f)
                close()
                moveToRelative(-320f, -40f)
                horizontalLineToRelative(640f)
                quadToRelative(0f, -30f, -16f, -65f)
                reflectiveQuadToRelative(-53.5f, -65f)
                quadToRelative(-37.5f, -30f, -99f, -50f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-90f, 0f, -151f, 20f)
                reflectiveQuadToRelative(-98.5f, 50f)
                quadToRelative(-37.5f, 30f, -54f, 65f)
                reflectiveQuadTo(160f, 480f)
                close()
                moveToRelative(320f, 0f)
                close()
            }
        }.build()
        
        return _Home_mini!!
    }

private var _Home_mini: ImageVector? = null

