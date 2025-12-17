package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Rocket_launch: ImageVector
    get() {
        if (_Rocket_launch != null) return _Rocket_launch!!
        
        _Rocket_launch = ImageVector.Builder(
            name = "rocket_launch",
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
                        moveTo(9.19f, 6.35f)
                        curveToRelative(-2.04f, 2.29f, -3.44f, 5.58f, -3.57f, 5.89f)
                        lineToRelative(-2.26f, -0.97f)
                        curveToRelative(-0.65f, -0.28f, -0.81f, -1.13f, -0.31f, -1.63f)
                        lineToRelative(3.01f, -3.01f)
                        curveToRelative(0.47f, -0.47f, 1.15f, -0.68f, 1.81f, -0.55f)
                        lineTo(9.19f, 6.35f)
                        lineTo(9.19f, 6.35f)
                        close()
                        moveTo(10.68f, 16.51f)
                        curveToRelative(0.3f, 0.3f, 0.74f, 0.38f, 1.12f, 0.2f)
                        curveToRelative(1.16f, -0.54f, 3.65f, -1.81f, 5.26f, -3.42f)
                        curveToRelative(4.59f, -4.59f, 4.63f, -8.33f, 4.36f, -9.93f)
                        curveToRelative(-0.07f, -0.4f, -0.39f, -0.72f, -0.79f, -0.79f)
                        curveToRelative(-1.6f, -0.27f, -5.34f, -0.23f, -9.93f, 4.36f)
                        curveToRelative(-1.61f, 1.61f, -2.87f, 4.1f, -3.42f, 5.26f)
                        curveToRelative(-0.18f, 0.38f, -0.09f, 0.83f, 0.2f, 1.12f)
                        lineTo(10.68f, 16.51f)
                        close()
                        moveTo(17.65f, 14.81f)
                        curveToRelative(-2.29f, 2.04f, -5.58f, 3.44f, -5.89f, 3.57f)
                        lineToRelative(0.97f, 2.26f)
                        curveToRelative(0.28f, 0.65f, 1.13f, 0.81f, 1.63f, 0.31f)
                        lineToRelative(3.01f, -3.01f)
                        curveToRelative(0.47f, -0.47f, 0.68f, -1.15f, 0.55f, -1.81f)
                        lineTo(17.65f, 14.81f)
                        lineTo(17.65f, 14.81f)
                        close()
                        moveTo(8.94f, 17.41f)
                        curveToRelative(0.2f, 1.06f, -0.15f, 2.04f, -0.82f, 2.71f)
                        curveToRelative(-0.77f, 0.77f, -3.16f, 1.34f, -4.71f, 1.64f)
                        curveToRelative(-0.69f, 0.13f, -1.3f, -0.48f, -1.17f, -1.17f)
                        curveToRelative(0.3f, -1.55f, 0.86f, -3.94f, 1.64f, -4.71f)
                        curveToRelative(0.67f, -0.67f, 1.65f, -1.02f, 2.71f, -0.82f)
                        curveTo(7.76f, 15.28f, 8.72f, 16.24f, 8.94f, 17.41f)
                        close()
                        moveTo(13f, 9f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                        reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                        reflectiveCurveTo(13f, 10.1f, 13f, 9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Rocket_launch!!
    }

private var _Rocket_launch: ImageVector? = null

