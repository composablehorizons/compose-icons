package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Format_textdirection_l_to_r: ImageVector
    get() {
        if (_Format_textdirection_l_to_r != null) return _Format_textdirection_l_to_r!!
        
        _Format_textdirection_l_to_r = ImageVector.Builder(
            name = "format_textdirection_l_to_r",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 600f)
                verticalLineToRelative(-200f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, -280f)
                verticalLineToRelative(-160f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(280f, 240f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(360f, 320f)
                close()
                moveToRelative(0f, -80f)
                close()
                moveTo(680f, 880f)
                lineToRelative(-56f, -56f)
                lineToRelative(64f, -64f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(568f)
                lineToRelative(-64f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineTo(680f, 880f)
                close()
            }
        }.build()
        
        return _Format_textdirection_l_to_r!!
    }

private var _Format_textdirection_l_to_r: ImageVector? = null

