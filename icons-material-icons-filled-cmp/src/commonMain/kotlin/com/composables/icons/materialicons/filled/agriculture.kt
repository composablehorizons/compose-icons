package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Agriculture: ImageVector
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.5f, 12f)
                        curveToRelative(0.93f, 0f, 1.78f, 0.28f, 2.5f, 0.76f)
                        verticalLineTo(8f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineToRelative(-6.29f)
                        lineToRelative(-1.06f, -1.06f)
                        lineToRelative(1.41f, -1.41f)
                        lineToRelative(-0.71f, -0.71f)
                        lineTo(9.82f, 6.35f)
                        lineToRelative(0.71f, 0.71f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(13f, 6.71f)
                        verticalLineTo(9f)
                        curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                        horizontalLineToRelative(-0.54f)
                        curveToRelative(0.95f, 1.06f, 1.54f, 2.46f, 1.54f, 4f)
                        curveToRelative(0f, 0.34f, -0.04f, 0.67f, -0.09f, 1f)
                        horizontalLineToRelative(3.14f)
                        curveTo(15.3f, 13.75f, 17.19f, 12f, 19.5f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.5f, 13f)
                        curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                        reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                        reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                        reflectiveCurveTo(21.43f, 13f, 19.5f, 13f)
                        close()
                        moveTo(19.5f, 18f)
                        curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                        reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                        reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                        reflectiveCurveTo(20.33f, 18f, 19.5f, 18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4f, 9f)
                        horizontalLineToRelative(5f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(4f)
                        curveTo(3.45f, 7f, 3f, 7.45f, 3f, 8f)
                        curveTo(3f, 8.55f, 3.45f, 9f, 4f, 9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9.83f, 13.82f)
                        lineToRelative(-0.18f, -0.47f)
                        lineTo(10.58f, 13f)
                        curveToRelative(-0.46f, -1.06f, -1.28f, -1.91f, -2.31f, -2.43f)
                        lineToRelative(-0.4f, 0.89f)
                        lineToRelative(-0.46f, -0.21f)
                        lineToRelative(0.4f, -0.9f)
                        curveTo(7.26f, 10.13f, 6.64f, 10f, 6f, 10f)
                        curveToRelative(-0.53f, 0f, -1.04f, 0.11f, -1.52f, 0.26f)
                        lineToRelative(0.34f, 0.91f)
                        lineToRelative(-0.47f, 0.18f)
                        lineTo(4f, 10.42f)
                        curveToRelative(-1.06f, 0.46f, -1.91f, 1.28f, -2.43f, 2.31f)
                        lineToRelative(0.89f, 0.4f)
                        lineToRelative(-0.21f, 0.46f)
                        lineToRelative(-0.9f, -0.4f)
                        curveTo(1.13f, 13.74f, 1f, 14.36f, 1f, 15f)
                        curveToRelative(0f, 0.53f, 0.11f, 1.04f, 0.26f, 1.52f)
                        lineToRelative(0.91f, -0.34f)
                        lineToRelative(0.18f, 0.47f)
                        lineTo(1.42f, 17f)
                        curveToRelative(0.46f, 1.06f, 1.28f, 1.91f, 2.31f, 2.43f)
                        lineToRelative(0.4f, -0.89f)
                        lineToRelative(0.46f, 0.21f)
                        lineToRelative(-0.4f, 0.9f)
                        curveTo(4.74f, 19.87f, 5.36f, 20f, 6f, 20f)
                        curveToRelative(0.53f, 0f, 1.04f, -0.11f, 1.52f, -0.26f)
                        lineToRelative(-0.34f, -0.91f)
                        lineToRelative(0.47f, -0.18f)
                        lineTo(8f, 19.58f)
                        curveToRelative(1.06f, -0.46f, 1.91f, -1.28f, 2.43f, -2.31f)
                        lineToRelative(-0.89f, -0.4f)
                        lineToRelative(0.21f, -0.46f)
                        lineToRelative(0.9f, 0.4f)
                        curveTo(10.87f, 16.26f, 11f, 15.64f, 11f, 15f)
                        curveToRelative(0f, -0.53f, -0.11f, -1.04f, -0.26f, -1.52f)
                        lineTo(9.83f, 13.82f)
                        close()
                        moveTo(7.15f, 17.77f)
                        curveToRelative(-1.53f, 0.63f, -3.29f, -0.09f, -3.92f, -1.62f)
                        curveToRelative(-0.63f, -1.53f, 0.09f, -3.29f, 1.62f, -3.92f)
                        curveToRelative(1.53f, -0.63f, 3.29f, 0.09f, 3.92f, 1.62f)
                        curveTo(9.41f, 15.38f, 8.68f, 17.14f, 7.15f, 17.77f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Agriculture!!
    }

private var _Agriculture: ImageVector? = null

