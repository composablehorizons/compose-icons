package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Agriculture: ImageVector
    get() {
        if (_Agriculture != null) return _Agriculture!!
        
        _Agriculture = ImageVector.Builder(
            name = "agriculture",
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
                        moveTo(19.5f, 11.97f)
                        curveToRelative(0.93f, 0f, 1.78f, 0.28f, 2.5f, 0.76f)
                        verticalLineTo(7.97f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineToRelative(-6.29f)
                        lineToRelative(-1.06f, -1.06f)
                        lineToRelative(1.06f, -1.06f)
                        curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                        reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0f)
                        lineToRelative(-2.83f, 2.83f)
                        curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                        lineToRelative(1.06f, -1.06f)
                        lineTo(13f, 6.68f)
                        verticalLineToRelative(2.29f)
                        curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                        horizontalLineToRelative(-0.54f)
                        curveToRelative(0.95f, 1.06f, 1.54f, 2.46f, 1.54f, 4f)
                        curveToRelative(0f, 0.34f, -0.04f, 0.67f, -0.09f, 1f)
                        horizontalLineToRelative(3.14f)
                        curveTo(15.3f, 13.73f, 17.19f, 11.97f, 19.5f, 11.97f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.5f, 12.97f)
                        curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                        reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                        reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                        reflectiveCurveTo(21.43f, 12.97f, 19.5f, 12.97f)
                        close()
                        moveTo(19.5f, 17.97f)
                        curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                        reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                        reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                        reflectiveCurveTo(20.33f, 17.97f, 19.5f, 17.97f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4f, 8.97f)
                        horizontalLineToRelative(5f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(4f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        curveTo(3f, 8.53f, 3.45f, 8.97f, 4f, 8.97f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9.83f, 13.79f)
                        lineToRelative(-0.18f, -0.47f)
                        lineToRelative(0.93f, -0.35f)
                        curveToRelative(-0.46f, -1.06f, -1.28f, -1.91f, -2.31f, -2.43f)
                        lineToRelative(-0.4f, 0.89f)
                        lineToRelative(-0.46f, -0.21f)
                        lineToRelative(0.4f, -0.9f)
                        curveTo(7.26f, 10.11f, 6.64f, 9.97f, 6f, 9.97f)
                        curveToRelative(-0.53f, 0f, -1.04f, 0.11f, -1.52f, 0.26f)
                        lineToRelative(0.34f, 0.91f)
                        lineToRelative(-0.47f, 0.18f)
                        lineTo(4f, 10.4f)
                        curveToRelative(-1.06f, 0.46f, -1.91f, 1.28f, -2.43f, 2.31f)
                        lineToRelative(0.89f, 0.4f)
                        lineToRelative(-0.21f, 0.46f)
                        lineToRelative(-0.9f, -0.4f)
                        curveTo(1.13f, 13.72f, 1f, 14.33f, 1f, 14.97f)
                        curveToRelative(0f, 0.53f, 0.11f, 1.04f, 0.26f, 1.52f)
                        lineToRelative(0.91f, -0.34f)
                        lineToRelative(0.18f, 0.47f)
                        lineToRelative(-0.93f, 0.35f)
                        curveToRelative(0.46f, 1.06f, 1.28f, 1.91f, 2.31f, 2.43f)
                        lineToRelative(0.4f, -0.89f)
                        lineToRelative(0.46f, 0.21f)
                        lineToRelative(-0.4f, 0.9f)
                        curveToRelative(0.57f, 0.22f, 1.18f, 0.35f, 1.82f, 0.35f)
                        curveToRelative(0.53f, 0f, 1.04f, -0.11f, 1.52f, -0.26f)
                        lineTo(7.18f, 18.8f)
                        lineToRelative(0.47f, -0.18f)
                        lineTo(8f, 19.55f)
                        curveToRelative(1.06f, -0.46f, 1.91f, -1.28f, 2.43f, -2.31f)
                        lineToRelative(-0.89f, -0.4f)
                        lineToRelative(0.21f, -0.46f)
                        lineToRelative(0.9f, 0.4f)
                        curveToRelative(0.22f, -0.57f, 0.35f, -1.18f, 0.35f, -1.82f)
                        curveToRelative(0f, -0.53f, -0.11f, -1.04f, -0.26f, -1.52f)
                        lineTo(9.83f, 13.79f)
                        close()
                        moveTo(7.15f, 17.75f)
                        curveToRelative(-1.53f, 0.63f, -3.29f, -0.09f, -3.92f, -1.62f)
                        curveToRelative(-0.63f, -1.53f, 0.09f, -3.29f, 1.62f, -3.92f)
                        curveToRelative(1.53f, -0.63f, 3.29f, 0.09f, 3.92f, 1.62f)
                        curveTo(9.41f, 15.36f, 8.68f, 17.11f, 7.15f, 17.75f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Agriculture!!
    }

private var _Agriculture: ImageVector? = null

