package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Mark_chat_read: ImageVector
    get() {
        if (_Mark_chat_read != null) return _Mark_chat_read!!
        
        _Mark_chat_read = ImageVector.Builder(
            name = "mark_chat_read",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19f, 10f)
                    curveToRelative(0.34f, 0f, 0.67f, 0.03f, 1f, 0.08f)
                    verticalLineTo(4f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(12f)
                    horizontalLineToRelative(8.08f)
                    curveTo(12.57f, 12.61f, 15.47f, 10f, 19f, 10f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(17.34f, 20f)
                    lineToRelative(-3.54f, -3.54f)
                    lineToRelative(1.41f, -1.41f)
                    lineToRelative(2.12f, 2.12f)
                    lineToRelative(4.24f, -4.24f)
                    lineTo(23f, 14.34f)
                    lineTo(17.34f, 20f)
                    close()
                    moveTo(12.08f, 16f)
                    horizontalLineTo(4f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(16f)
                    verticalLineToRelative(6.08f)
                    curveToRelative(0.71f, 0.1f, 1.38f, 0.31f, 2f, 0.6f)
                    verticalLineTo(4f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                    verticalLineToRelative(18f)
                    lineToRelative(4f, -4f)
                    horizontalLineToRelative(6f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.14f, 0.02f, -0.27f, 0.03f, -0.4f)
                    curveTo(12.01f, 17.4f, 12f, 17.2f, 12f, 17f)
                    curveTo(12f, 16.66f, 12.03f, 16.33f, 12.08f, 16f)
                    close()
                }
            }
        }.build()
        
        return _Mark_chat_read!!
    }

private var _Mark_chat_read: ImageVector? = null

