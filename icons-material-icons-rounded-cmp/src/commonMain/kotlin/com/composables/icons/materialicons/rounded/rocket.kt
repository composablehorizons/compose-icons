package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Rocket: ImageVector
    get() {
        if (_Rocket != null) return _Rocket!!
        
        _Rocket = ImageVector.Builder(
            name = "rocket",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(11.41f, 2.87f)
                    curveToRelative(0.35f, -0.26f, 0.82f, -0.26f, 1.18f, 0f)
                    curveTo(13.81f, 3.75f, 16.5f, 6.46f, 16.5f, 13f)
                    curveToRelative(0f, 2.16f, -0.78f, 4.76f, -1.36f, 6.35f)
                    curveTo(15f, 19.74f, 14.63f, 20f, 14.21f, 20f)
                    lineToRelative(-4.41f, 0f)
                    curveToRelative(-0.42f, 0f, -0.8f, -0.26f, -0.94f, -0.65f)
                    curveTo(8.28f, 17.76f, 7.5f, 15.16f, 7.5f, 13f)
                    curveTo(7.5f, 6.46f, 10.19f, 3.75f, 11.41f, 2.87f)
                    close()
                    moveTo(14f, 11f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                    reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                    reflectiveCurveTo(14f, 12.1f, 14f, 11f)
                    close()
                    moveTo(7.69f, 20.52f)
                    curveToRelative(-0.48f, -1.23f, -1.52f, -4.17f, -1.67f, -6.87f)
                    lineToRelative(-1.13f, 0.75f)
                    curveTo(4.33f, 14.78f, 4f, 15.4f, 4f, 16.07f)
                    verticalLineToRelative(4.45f)
                    curveToRelative(0f, 0.71f, 0.71f, 1.19f, 1.37f, 0.93f)
                    lineTo(7.69f, 20.52f)
                    close()
                    moveTo(20f, 20.52f)
                    verticalLineToRelative(-4.45f)
                    curveToRelative(0f, -0.67f, -0.33f, -1.29f, -0.89f, -1.66f)
                    lineToRelative(-1.13f, -0.75f)
                    curveToRelative(-0.15f, 2.69f, -1.2f, 5.64f, -1.67f, 6.87f)
                    lineToRelative(2.32f, 0.93f)
                    curveTo(19.29f, 21.71f, 20f, 21.23f, 20f, 20.52f)
                    close()
                }
            }
        }.build()
        
        return _Rocket!!
    }

private var _Rocket: ImageVector? = null

