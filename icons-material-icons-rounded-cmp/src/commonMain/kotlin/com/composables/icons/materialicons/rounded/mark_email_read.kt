package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Mark_email_read: ImageVector
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
                }
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.05f, 21.29f)
                        curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                        lineToRelative(-2.12f, -2.12f)
                        curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                        lineToRelative(1.41f, 1.41f)
                        lineToRelative(3.54f, -3.54f)
                        curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                        lineTo(18.05f, 21.29f)
                        close()
                        moveTo(12.08f, 20f)
                        horizontalLineTo(4f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        verticalLineTo(6f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                        verticalLineToRelative(6.68f)
                        curveTo(21.09f, 12.25f, 20.08f, 12f, 19f, 12f)
                        curveToRelative(-3.87f, 0f, -7f, 3.13f, -7f, 7f)
                        curveTo(12f, 19.34f, 12.03f, 19.67f, 12.08f, 20f)
                        close()
                        moveTo(11.47f, 12.67f)
                        curveToRelative(0.32f, 0.2f, 0.74f, 0.2f, 1.06f, 0f)
                        lineToRelative(7.07f, -4.42f)
                        curveTo(19.85f, 8.09f, 20f, 7.82f, 20f, 7.53f)
                        curveToRelative(0f, -0.67f, -0.73f, -1.07f, -1.3f, -0.72f)
                        lineTo(12f, 11f)
                        lineTo(5.3f, 6.81f)
                        curveTo(4.73f, 6.46f, 4f, 6.86f, 4f, 7.53f)
                        curveToRelative(0f, 0.29f, 0.15f, 0.56f, 0.4f, 0.72f)
                        lineTo(11.47f, 12.67f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Mark_email_read!!
    }

private var _Mark_email_read: ImageVector? = null

