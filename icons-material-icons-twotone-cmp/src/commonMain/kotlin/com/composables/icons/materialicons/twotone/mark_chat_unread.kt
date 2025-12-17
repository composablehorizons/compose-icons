package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Mark_chat_unread: ImageVector
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
                    moveTo(4f, 16f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(7.9f)
                    curveTo(19.68f, 7.96f, 19.34f, 8f, 19f, 8f)
                    curveToRelative(-2.42f, 0f, -4.44f, -1.72f, -4.9f, -4f)
                    horizontalLineTo(4f)
                    verticalLineTo(16f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(20f, 7.9f)
                    curveToRelative(0.74f, -0.15f, 1.42f, -0.48f, 2f, -0.92f)
                    verticalLineTo(16f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    horizontalLineTo(6f)
                    lineToRelative(-4f, 4f)
                    verticalLineTo(4f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineToRelative(10.1f)
                    curveTo(14.04f, 2.32f, 14f, 2.66f, 14f, 3f)
                    reflectiveCurveToRelative(0.04f, 0.68f, 0.1f, 1f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(12f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(7.9f)
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

