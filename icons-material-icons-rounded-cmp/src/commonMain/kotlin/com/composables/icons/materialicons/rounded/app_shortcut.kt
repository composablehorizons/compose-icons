package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.App_shortcut: ImageVector
    get() {
        if (_App_shortcut != null) return _App_shortcut!!
        
        _App_shortcut = ImageVector.Builder(
            name = "app_shortcut",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 18f)
                        horizontalLineTo(7f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(10f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(3f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(7f)
                        curveTo(5.9f, 1f, 5f, 1.9f, 5f, 3f)
                        verticalLineToRelative(18f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(10f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.38f, 9.62f)
                        lineToRelative(0.4f, 0.87f)
                        curveToRelative(0.09f, 0.2f, 0.37f, 0.2f, 0.46f, 0f)
                        lineToRelative(0.4f, -0.87f)
                        lineToRelative(0.87f, -0.4f)
                        curveToRelative(0.2f, -0.09f, 0.2f, -0.37f, 0f, -0.46f)
                        lineToRelative(-0.87f, -0.4f)
                        lineToRelative(-0.4f, -0.87f)
                        curveToRelative(-0.09f, -0.2f, -0.37f, -0.2f, -0.46f, 0f)
                        lineToRelative(-0.4f, 0.87f)
                        lineToRelative(-0.87f, 0.4f)
                        curveToRelative(-0.2f, 0.09f, -0.2f, 0.37f, 0f, 0.46f)
                        lineTo(20.38f, 9.62f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.54f, 9f)
                        lineToRelative(-0.79f, 1.75f)
                        lineTo(13f, 11.54f)
                        curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0f, 0.91f)
                        lineToRelative(1.75f, 0.79f)
                        lineTo(15.54f, 15f)
                        curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0f)
                        lineToRelative(0.79f, -1.75f)
                        lineTo(19f, 12.46f)
                        curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0f, -0.91f)
                        lineToRelative(-1.75f, -0.79f)
                        lineTo(16.46f, 9f)
                        curveTo(16.28f, 8.61f, 15.72f, 8.61f, 15.54f, 9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.77f, 13.5f)
                        lineToRelative(-0.4f, 0.87f)
                        lineToRelative(-0.87f, 0.4f)
                        curveToRelative(-0.2f, 0.09f, -0.2f, 0.37f, 0f, 0.46f)
                        lineToRelative(0.87f, 0.4f)
                        lineToRelative(0.4f, 0.87f)
                        curveToRelative(0.09f, 0.2f, 0.37f, 0.2f, 0.46f, 0f)
                        lineToRelative(0.4f, -0.87f)
                        lineToRelative(0.87f, -0.4f)
                        curveToRelative(0.2f, -0.09f, 0.2f, -0.37f, 0f, -0.46f)
                        lineToRelative(-0.87f, -0.4f)
                        lineToRelative(-0.4f, -0.87f)
                        curveTo(21.14f, 13.31f, 20.86f, 13.31f, 20.77f, 13.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _App_shortcut!!
    }

private var _App_shortcut: ImageVector? = null

