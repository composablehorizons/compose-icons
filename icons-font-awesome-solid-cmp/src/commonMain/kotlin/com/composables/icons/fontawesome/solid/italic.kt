package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Italic: ImageVector
    get() {
        if (_Italic != null) return _Italic!!
        
        _Italic = ImageVector.Builder(
            name = "italic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 48f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, 16f)
                horizontalLineToRelative(-62.76f)
                lineToRelative(-80f, 320f)
                horizontalLineTo(208f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, 16f)
                horizontalLineTo(16f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, -16f)
                horizontalLineToRelative(62.76f)
                lineToRelative(80f, -320f)
                horizontalLineTo(112f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, -16f)
                verticalLineTo(48f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, -16f)
                horizontalLineToRelative(192f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, 16f)
                close()
            }
        }.build()
        
        return _Italic!!
    }

private var _Italic: ImageVector? = null

