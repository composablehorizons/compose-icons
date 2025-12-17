package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Stack_hexagon: ImageVector
    get() {
        if (_Stack_hexagon != null) return _Stack_hexagon!!
        
        _Stack_hexagon = ImageVector.Builder(
            name = "stack_hexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(228f, 875f)
                quadToRelative(-33f, 5f, -59.5f, -15.5f)
                reflectiveQuadTo(138f, 806f)
                lineTo(85f, 369f)
                quadToRelative(-4f, -33f, 16f, -59f)
                reflectiveQuadToRelative(53f, -30f)
                lineToRelative(46f, -6f)
                verticalLineToRelative(326f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                horizontalLineToRelative(372f)
                quadToRelative(-6f, 24f, -24f, 41.5f)
                reflectiveQuadTo(664f, 822f)
                lineTo(228f, 875f)
                close()
                moveToRelative(132f, -195f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(280f, 600f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 80f)
                horizontalLineToRelative(440f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 680f)
                horizontalLineTo(360f)
                close()
                moveToRelative(200f, -151f)
                quadToRelative(9f, 5f, 20f, 5f)
                reflectiveQuadToRelative(20f, -5f)
                lineToRelative(100f, -57f)
                quadToRelative(9f, -5f, 14.5f, -14.5f)
                reflectiveQuadTo(720f, 437f)
                verticalLineToRelative(-114f)
                quadToRelative(0f, -11f, -5.5f, -20.5f)
                reflectiveQuadTo(700f, 288f)
                lineToRelative(-100f, -57f)
                quadToRelative(-9f, -5f, -20f, -5f)
                reflectiveQuadToRelative(-20f, 5f)
                lineToRelative(-100f, 57f)
                quadToRelative(-9f, 5f, -14.5f, 14.5f)
                reflectiveQuadTo(440f, 323f)
                verticalLineToRelative(114f)
                quadToRelative(0f, 11f, 5.5f, 20.5f)
                reflectiveQuadTo(460f, 472f)
                lineToRelative(100f, 57f)
                close()
            }
        }.build()
        
        return _Stack_hexagon!!
    }

private var _Stack_hexagon: ImageVector? = null

