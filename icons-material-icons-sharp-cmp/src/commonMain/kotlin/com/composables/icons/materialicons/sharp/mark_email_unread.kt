package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Mark_email_unread: ImageVector
    get() {
        if (_Mark_email_unread != null) return _Mark_email_unread!!
        
        _Mark_email_unread = ImageVector.Builder(
            name = "mark_email_unread",
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
                    moveTo(22f, 8.98f)
                    verticalLineTo(20f)
                    horizontalLineTo(2f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(12.1f)
                    curveTo(14.04f, 4.32f, 14f, 4.66f, 14f, 5f)
                    curveToRelative(0f, 1.48f, 0.65f, 2.79f, 1.67f, 3.71f)
                    lineTo(12f, 11f)
                    lineTo(4f, 6f)
                    verticalLineToRelative(2f)
                    lineToRelative(8f, 5f)
                    lineToRelative(5.3f, -3.32f)
                    curveTo(17.84f, 9.88f, 18.4f, 10f, 19f, 10f)
                    curveTo(20.13f, 10f, 21.16f, 9.61f, 22f, 8.98f)
                    close()
                    moveTo(16f, 5f)
                    curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                    reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                    reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                    reflectiveCurveTo(16f, 3.34f, 16f, 5f)
                    close()
                }
            }
        }.build()
        
        return _Mark_email_unread!!
    }

private var _Mark_email_unread: ImageVector? = null

