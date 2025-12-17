package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Italic: ImageVector
    get() {
        if (_Italic != null) return _Italic!!
        
        _Italic = ImageVector.Builder(
            name = "italic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 2.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 8.75f, 2f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-3.215f)
                lineToRelative(-4.483f, 13f)
                horizontalLineToRelative(2.698f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(3.215f)
                lineToRelative(4.483f, -13f)
                horizontalLineTo(8.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 8f, 2.75f)
                close()
            }
        }.build()
        
        return _Italic!!
    }

private var _Italic: ImageVector? = null

