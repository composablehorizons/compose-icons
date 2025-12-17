package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Mark_chat_unread: ImageVector
    get() {
        if (_Mark_chat_unread != null) return _Mark_chat_unread!!
        
        _Mark_chat_unread = ImageVector.Builder(
            name = "mark_chat_unread",
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
                    moveTo(22f, 6.98f)
                    verticalLineTo(16f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    horizontalLineTo(6f)
                    lineToRelative(-4f, 4f)
                    verticalLineTo(4f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineToRelative(10.1f)
                    curveTo(14.04f, 2.32f, 14f, 2.66f, 14f, 3f)
                    curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                    curveTo(20.13f, 8f, 21.16f, 7.61f, 22f, 6.98f)
                    close()
                    moveTo(16f, 3f)
                    curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                    reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                    reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                    reflectiveCurveTo(16f, 1.34f, 16f, 3f)
                    close()
                }
            }
        }.build()
        
        return _Mark_chat_unread!!
    }

private var _Mark_chat_unread: ImageVector? = null

