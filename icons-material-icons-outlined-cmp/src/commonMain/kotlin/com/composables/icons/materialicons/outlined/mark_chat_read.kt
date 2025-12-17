package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Mark_chat_read: ImageVector
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
                    moveTo(12f, 18f)
                    lineToRelative(-6f, 0f)
                    lineToRelative(-4f, 4f)
                    verticalLineTo(4f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineToRelative(16f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    verticalLineToRelative(7f)
                    lineToRelative(-2f, 0f)
                    verticalLineTo(4f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(12f)
                    lineToRelative(8f, 0f)
                    verticalLineTo(18f)
                    close()
                    moveTo(23f, 14.34f)
                    lineToRelative(-1.41f, -1.41f)
                    lineToRelative(-4.24f, 4.24f)
                    lineToRelative(-2.12f, -2.12f)
                    lineToRelative(-1.41f, 1.41f)
                    lineTo(17.34f, 20f)
                    lineTo(23f, 14.34f)
                    close()
                }
            }
        }.build()
        
        return _Mark_chat_read!!
    }

private var _Mark_chat_read: ImageVector? = null

