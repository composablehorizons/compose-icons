package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Mark_chat_read: ImageVector
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
                    moveTo(12.03f, 17.5f)
                    curveTo(12.01f, 17.67f, 12f, 17.83f, 12f, 18f)
                    verticalLineToRelative(0f)
                    horizontalLineTo(6f)
                    lineToRelative(-4f, 4f)
                    verticalLineTo(2f)
                    horizontalLineToRelative(20f)
                    verticalLineToRelative(8.68f)
                    curveTo(21.09f, 10.25f, 20.08f, 10f, 19f, 10f)
                    curveToRelative(-3.87f, 0f, -7f, 3.13f, -7f, 7f)
                    curveTo(12f, 17.17f, 12.01f, 17.33f, 12.03f, 17.5f)
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

