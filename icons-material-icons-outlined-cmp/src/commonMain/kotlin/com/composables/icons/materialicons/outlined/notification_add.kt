package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Notification_add: ImageVector
    get() {
        if (_Notification_add != null) return _Notification_add!!
        
        _Notification_add = ImageVector.Builder(
            name = "notification_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(16f, 14f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-7f)
                    curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                    curveToRelative(0.85f, 0f, 1.64f, 0.26f, 2.28f, 0.72f)
                    lineToRelative(1.43f, -1.43f)
                    curveToRelative(-0.64f, -0.51f, -1.39f, -0.88f, -2.21f, -1.09f)
                    verticalLineTo(3.5f)
                    curveTo(13.5f, 2.67f, 12.83f, 2f, 12f, 2f)
                    reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                    verticalLineToRelative(0.7f)
                    curveTo(7.91f, 4.86f, 6f, 7.21f, 6f, 10f)
                    verticalLineToRelative(7f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(16f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-3f)
                    horizontalLineTo(16f)
                    close()
                    moveTo(12f, 22f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    horizontalLineToRelative(-4f)
                    curveTo(10f, 21.1f, 10.9f, 22f, 12f, 22f)
                    close()
                    moveTo(24f, 8f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(-3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(8f)
                    close()
                }
            }
        }.build()
        
        return _Notification_add!!
    }

private var _Notification_add: ImageVector? = null

