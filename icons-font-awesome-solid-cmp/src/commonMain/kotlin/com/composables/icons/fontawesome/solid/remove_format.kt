package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.RemoveFormat: ImageVector
    get() {
        if (_RemoveFormat != null) return _RemoveFormat!!
        
        _RemoveFormat = ImageVector.Builder(
            name = "remove-format",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(336f, 416f)
                horizontalLineToRelative(-11.17f)
                lineToRelative(9.26f, -27.77f)
                lineTo(267f, 336.4f)
                lineTo(240.49f, 416f)
                horizontalLineTo(208f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(128f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
                moveToRelative(297.82f, 42.1f)
                lineTo(377f, 259.59f)
                lineTo(426.17f, 112f)
                horizontalLineTo(544f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(48f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineTo(176f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(43.9f)
                lineTo(45.46f, 3.38f)
                arcTo(16f, 16f, 0f, false, false, 23f, 6.19f)
                lineTo(3.37f, 31.46f)
                arcToRelative(16f, 16f, 0f, false, false, 2.81f, 22.45f)
                lineToRelative(588.36f, 454.72f)
                arcToRelative(16f, 16f, 0f, false, false, 22.46f, -2.81f)
                lineToRelative(19.64f, -25.27f)
                arcToRelative(16f, 16f, 0f, false, false, -2.82f, -22.45f)
                close()
                moveTo(309.91f, 207.76f)
                lineTo(224f, 141.36f)
                verticalLineTo(112f)
                horizontalLineToRelative(117.83f)
                close()
            }
        }.build()
        
        return _RemoveFormat!!
    }

private var _RemoveFormat: ImageVector? = null

