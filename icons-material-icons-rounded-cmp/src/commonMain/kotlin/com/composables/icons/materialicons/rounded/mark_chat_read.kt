package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Mark_chat_read: ImageVector
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
                    moveTo(18.05f, 19.29f)
                    curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                    lineToRelative(-2.12f, -2.12f)
                    curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineToRelative(1.41f, 1.41f)
                    lineToRelative(3.54f, -3.54f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                    lineTo(18.05f, 19.29f)
                    close()
                    moveTo(12f, 17f)
                    curveToRelative(0f, -3.87f, 3.13f, -7f, 7f, -7f)
                    curveToRelative(1.08f, 0f, 2.09f, 0.25f, 3f, 0.68f)
                    verticalLineTo(4f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                    verticalLineToRelative(18f)
                    lineToRelative(4f, -4f)
                    horizontalLineToRelative(6f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.17f, 0.01f, -0.33f, 0.03f, -0.5f)
                    curveTo(12.01f, 17.33f, 12f, 17.17f, 12f, 17f)
                    close()
                }
            }
        }.build()
        
        return _Mark_chat_read!!
    }

private var _Mark_chat_read: ImageVector? = null

