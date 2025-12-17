package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Range_hood: ImageVector
    get() {
        if (_Range_hood != null) return _Range_hood!!
        
        _Range_hood = ImageVector.Builder(
            name = "range_hood",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-168f)
                quadToRelative(0f, -16f, 6.5f, -30.5f)
                reflectiveQuadTo(104f, 496f)
                lineToRelative(176f, -176f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 120f)
                horizontalLineToRelative(240f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 200f)
                verticalLineToRelative(120f)
                lineToRelative(177f, 177f)
                quadToRelative(11f, 11f, 17f, 25.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                verticalLineToRelative(167f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -600f)
                horizontalLineTo(360f)
                verticalLineToRelative(119f)
                quadToRelative(0f, 16f, -6f, 30.5f)
                reflectiveQuadTo(337f, 375f)
                lineTo(232f, 480f)
                horizontalLineToRelative(496f)
                lineTo(623f, 375f)
                quadToRelative(-11f, -11f, -17f, -25.5f)
                reflectiveQuadToRelative(-6f, -30.5f)
                verticalLineToRelative(-119f)
                horizontalLineTo(480f)
                close()
                moveTo(160f, 720f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-160f)
                horizontalLineTo(160f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(270f, -52f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(400f, 638f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(430f, 608f)
                horizontalLineToRelative(100f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(560f, 638f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(530f, 668f)
                horizontalLineTo(430f)
                close()
            }
        }.build()
        
        return _Range_hood!!
    }

private var _Range_hood: ImageVector? = null

