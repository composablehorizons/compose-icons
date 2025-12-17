package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Agriculture: ImageVector
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
                    group {
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
                            moveTo(22f, 14.06f)
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
                            horizontalLineTo(8.96f)
                            curveToRelative(-0.22f, -0.16f, -0.45f, -0.3f, -0.69f, -0.43f)
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
                            curveToRelative(0.1f, -0.26f, 0.18f, -0.54f, 0.24f, -0.82f)
                            horizontalLineToRelative(5.16f)
                            curveTo(16.03f, 16.16f, 16f, 16.33f, 16f, 16.5f)
                            curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                            reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                            curveTo(23f, 15.55f, 22.62f, 14.69f, 22f, 14.06f)
                            close()
                            moveTo(6f, 18f)
                            curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                            reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                            reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                            reflectiveCurveTo(7.66f, 18f, 6f, 18f)
                            close()
                            moveTo(10.87f, 14f)
                            curveToRelative(-0.04f, -0.18f, -0.08f, -0.35f, -0.13f, -0.52f)
                            lineToRelative(-0.91f, 0.34f)
                            lineToRelative(-0.18f, -0.47f)
                            lineTo(10.58f, 13f)
                            curveToRelative(0f, 0f, 0.42f, 0f, 0.42f, 0f)
                            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                            verticalLineTo(8f)
                            horizontalLineToRelative(5f)
                            verticalLineToRelative(5.05f)
                            curveTo(19.84f, 13.03f, 19.67f, 13f, 19.5f, 13f)
                            curveToRelative(-0.95f, 0f, -1.81f, 0.38f, -2.44f, 1f)
                            horizontalLineTo(10.87f)
                            close()
                            moveTo(19.5f, 18f)
                            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                            reflectiveCurveTo(20.33f, 18f, 19.5f, 18f)
                            close()
                        }
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 13.05f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(-5f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                        curveToRelative(0f, 0f, -0.42f, 0f, -0.42f, 0f)
                        curveToRelative(0.14f, 0.32f, 0.25f, 0.65f, 0.32f, 1f)
                        horizontalLineToRelative(6.16f)
                        curveToRelative(0.63f, -0.62f, 1.49f, -1f, 2.44f, -1f)
                        curveTo(19.67f, 13f, 19.84f, 13.03f, 20f, 13.05f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Agriculture!!
    }

private var _Agriculture: ImageVector? = null

