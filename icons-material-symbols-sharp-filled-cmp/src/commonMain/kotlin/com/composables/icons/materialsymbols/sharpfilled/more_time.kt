package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.More_time: ImageVector
    get() {
        if (_More_time != null) return _More_time!!
        
        _More_time = ImageVector.Builder(
            name = "more_time",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 840f)
                quadToRelative(-75f, 0f, -140.5f, -28f)
                reflectiveQuadTo(185f, 735f)
                quadToRelative(-49f, -49f, -77f, -114.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -75f, 28f, -140.5f)
                reflectiveQuadTo(185f, 225f)
                quadToRelative(49f, -49f, 114.5f, -77f)
                reflectiveQuadTo(440f, 120f)
                quadToRelative(21f, 0f, 40.5f, 2.5f)
                reflectiveQuadTo(520f, 130f)
                verticalLineToRelative(82f)
                quadToRelative(-20f, -6f, -39.5f, -9f)
                reflectiveQuadToRelative(-40.5f, -3f)
                quadToRelative(-118f, 0f, -199f, 81f)
                reflectiveQuadToRelative(-81f, 199f)
                quadToRelative(0f, 118f, 81f, 199f)
                reflectiveQuadToRelative(199f, 81f)
                quadToRelative(118f, 0f, 199f, -81f)
                reflectiveQuadToRelative(81f, -199f)
                quadToRelative(0f, -11f, -1f, -20f)
                reflectiveQuadToRelative(-3f, -20f)
                horizontalLineToRelative(82f)
                quadToRelative(2f, 11f, 2f, 20f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 75f, -28f, 140.5f)
                reflectiveQuadTo(695f, 735f)
                quadToRelative(-49f, 49f, -114.5f, 77f)
                reflectiveQuadTo(440f, 840f)
                close()
                moveToRelative(112f, -192f)
                lineTo(400f, 496f)
                verticalLineToRelative(-216f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(184f)
                lineToRelative(128f, 128f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(168f, -288f)
                verticalLineToRelative(-120f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(800f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _More_time!!
    }

private var _More_time: ImageVector? = null

