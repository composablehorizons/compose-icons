package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Mark_email_unread: ImageVector
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
                    moveTo(4f, 6f)
                    horizontalLineToRelative(10.1f)
                    curveToRelative(0.22f, 1.07f, 0.79f, 2f, 1.57f, 2.71f)
                    lineTo(12f, 11f)
                    lineTo(4f, 6f)
                    close()
                    moveTo(4f, 8f)
                    verticalLineToRelative(10f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(9.9f)
                    curveToRelative(-0.32f, 0.07f, -0.66f, 0.1f, -1f, 0.1f)
                    curveToRelative(-0.6f, 0f, -1.16f, -0.12f, -1.7f, -0.32f)
                    lineTo(12f, 13f)
                    lineTo(4f, 8f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(20f, 9.9f)
                    curveToRelative(0.74f, -0.15f, 1.42f, -0.48f, 2f, -0.92f)
                    verticalLineTo(18f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    horizontalLineTo(4f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineTo(6f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineToRelative(10.1f)
                    curveTo(14.04f, 4.32f, 14f, 4.66f, 14f, 5f)
                    reflectiveCurveToRelative(0.04f, 0.68f, 0.1f, 1f)
                    horizontalLineTo(4f)
                    lineToRelative(8f, 5f)
                    lineToRelative(3.67f, -2.29f)
                    curveToRelative(0.47f, 0.43f, 1.02f, 0.76f, 1.63f, 0.98f)
                    lineTo(12f, 13f)
                    lineTo(4f, 8f)
                    verticalLineToRelative(10f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(9.9f)
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

