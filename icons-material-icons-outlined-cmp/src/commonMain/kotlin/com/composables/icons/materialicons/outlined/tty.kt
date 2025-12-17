package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Tty: ImageVector
    get() {
        if (_Tty != null) return _Tty!!
        
        _Tty = ImageVector.Builder(
            name = "tty",
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
                    moveTo(16f, 6f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(6f)
                    close()
                    moveTo(18f, 7f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7f)
                    close()
                    moveTo(19f, 9f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(9f)
                    close()
                    moveTo(19f, 4f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(4f)
                    close()
                    moveTo(15f, 7f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7f)
                    close()
                    moveTo(19f, 10f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(10f)
                    close()
                    moveTo(16f, 10f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(10f)
                    close()
                    moveTo(13f, 4f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(4f)
                    close()
                    moveTo(20f, 15.82f)
                    verticalLineToRelative(4.15f)
                    curveToRelative(0f, 0.56f, -0.47f, 1.03f, -1.03f, 1f)
                    curveToRelative(-2.89f, -0.17f, -5.6f, -1.03f, -7.97f, -2.4f)
                    curveTo(8.27f, 16.99f, 6.01f, 14.73f, 4.43f, 12f)
                    curveTo(3.05f, 9.63f, 2.2f, 6.92f, 2.03f, 4.03f)
                    curveTo(2f, 3.47f, 2.47f, 3f, 3.03f, 3f)
                    horizontalLineToRelative(4.15f)
                    curveToRelative(0.48f, 0f, 0.89f, 0.34f, 0.98f, 0.8f)
                    lineTo(8.9f, 7.48f)
                    curveToRelative(0.07f, 0.33f, -0.04f, 0.67f, -0.27f, 0.9f)
                    lineTo(6.1f, 10.9f)
                    curveToRelative(1.43f, 2.5f, 3.5f, 4.57f, 6f, 6f)
                    lineToRelative(2.52f, -2.52f)
                    curveToRelative(0.24f, -0.24f, 0.58f, -0.34f, 0.9f, -0.27f)
                    lineToRelative(3.67f, 0.73f)
                    curveTo(19.66f, 14.93f, 20f, 15.34f, 20f, 15.82f)
                    close()
                    moveTo(5.18f, 8.99f)
                    lineToRelative(1.65f, -1.65f)
                    lineTo(6.36f, 5f)
                    horizontalLineTo(4.13f)
                    curveTo(4.3f, 6.37f, 4.66f, 7.71f, 5.18f, 8.99f)
                    close()
                    moveTo(18f, 16.64f)
                    lineToRelative(-2.34f, -0.47f)
                    lineToRelative(-1.65f, 1.65f)
                    curveToRelative(1.28f, 0.52f, 2.63f, 0.87f, 3.99f, 1.05f)
                    verticalLineTo(16.64f)
                    close()
                    moveTo(20f, 4f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(4f)
                    horizontalLineTo(20f)
                    close()
                    moveTo(20f, 12f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(12f)
                    close()
                    moveTo(13f, 10f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(10f)
                    close()
                }
            }
        }.build()
        
        return _Tty!!
    }

private var _Tty: ImageVector? = null

