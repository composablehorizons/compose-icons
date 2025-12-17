package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Notification_add: ImageVector
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
                    moveTo(10f, 20f)
                    horizontalLineToRelative(4f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    reflectiveCurveTo(10f, 21.1f, 10f, 20f)
                    close()
                    moveTo(14f, 9f)
                    curveToRelative(0f, 2.61f, 1.67f, 4.83f, 4f, 5.66f)
                    lineTo(18f, 17f)
                    horizontalLineToRelative(1f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(5f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(-7f)
                    curveToRelative(0f, -2.79f, 1.91f, -5.14f, 4.5f, -5.8f)
                    verticalLineTo(3.5f)
                    curveTo(10.5f, 2.67f, 11.17f, 2f, 12f, 2f)
                    reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                    verticalLineToRelative(0.7f)
                    curveToRelative(0.71f, 0.18f, 1.36f, 0.49f, 1.95f, 0.9f)
                    curveTo(14.54f, 6.14f, 14f, 7.51f, 14f, 9f)
                    close()
                    moveTo(23f, 8f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(6f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-2f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveTo(24f, 8.45f, 23.55f, 8f, 23f, 8f)
                    close()
                }
            }
        }.build()
        
        return _Notification_add!!
    }

private var _Notification_add: ImageVector? = null

