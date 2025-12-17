package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Format_textdirection_vertical: ImageVector
    get() {
        if (_Format_textdirection_vertical != null) return _Format_textdirection_vertical!!
        
        _Format_textdirection_vertical = ImageVector.Builder(
            name = "format_textdirection_vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 720f)
                verticalLineToRelative(-200f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadTo(80f, 360f)
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
                moveToRelative(480f, 80f)
                lineTo(560f, 640f)
                lineToRelative(56f, -56f)
                lineToRelative(64f, 63f)
                verticalLineToRelative(-447f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(447f)
                lineToRelative(64f, -64f)
                lineToRelative(56f, 57f)
                lineToRelative(-160f, 160f)
                close()
                moveTo(240f, 440f)
                verticalLineToRelative(-160f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(160f, 360f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(240f, 440f)
                close()
                moveToRelative(0f, -80f)
                close()
            }
        }.build()
        
        return _Format_textdirection_vertical!!
    }

private var _Format_textdirection_vertical: ImageVector? = null

