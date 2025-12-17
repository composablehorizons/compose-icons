package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Mark_email_read: ImageVector
    get() {
        if (_Mark_email_read != null) return _Mark_email_read!!
        
        _Mark_email_read = ImageVector.Builder(
            name = "mark_email_read",
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
                    moveTo(20f, 8f)
                    verticalLineToRelative(4.08f)
                    curveTo(19.67f, 12.03f, 19.34f, 12f, 19f, 12f)
                    curveToRelative(-3.53f, 0f, -6.43f, 2.61f, -6.92f, 6f)
                    horizontalLineTo(4f)
                    verticalLineTo(8f)
                    lineToRelative(8f, 5f)
                    lineTo(20f, 8f)
                    close()
                    moveTo(20f, 6f)
                    horizontalLineTo(4f)
                    lineToRelative(8f, 5f)
                    lineTo(20f, 6f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12.08f, 18f)
                    horizontalLineTo(4f)
                    verticalLineTo(8f)
                    lineToRelative(8f, 5f)
                    lineToRelative(8f, -5f)
                    verticalLineToRelative(4.08f)
                    curveToRelative(0.71f, 0.1f, 1.38f, 0.31f, 2f, 0.6f)
                    verticalLineTo(6f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 4f, 2.01f, 4.9f, 2.01f, 6f)
                    lineTo(2f, 18f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(8.08f)
                    curveTo(12.03f, 19.67f, 12f, 19.34f, 12f, 19f)
                    reflectiveCurveTo(12.03f, 18.33f, 12.08f, 18f)
                    close()
                    moveTo(20f, 6f)
                    lineToRelative(-8f, 5f)
                    lineTo(4f, 6f)
                    horizontalLineTo(20f)
                    close()
                    moveTo(17.34f, 22f)
                    lineToRelative(-3.54f, -3.54f)
                    lineToRelative(1.41f, -1.41f)
                    lineToRelative(2.12f, 2.12f)
                    lineToRelative(4.24f, -4.24f)
                    lineTo(23f, 16.34f)
                    lineTo(17.34f, 22f)
                    close()
                }
            }
        }.build()
        
        return _Mark_email_read!!
    }

private var _Mark_email_read: ImageVector? = null

