package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Rocket: ImageVector
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
            }
            group {
                group {
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(7.98f, 18.25f)
                            curveToRelative(-0.29f, -0.9f, -0.57f, -1.94f, -0.76f, -3f)
                            lineTo(6f, 16.07f)
                            verticalLineToRelative(2.98f)
                            lineTo(7.98f, 18.25f)
                            close()
                            moveTo(12f, 4.36f)
                            curveToRelative(0f, 0f, -3f, 2.02f, -3f, 8.64f)
                            curveToRelative(0f, 2.25f, 1f, 5f, 1f, 5f)
                            horizontalLineToRelative(4f)
                            curveToRelative(0f, 0f, 1f, -2.75f, 1f, -5f)
                            curveTo(15f, 6.38f, 12f, 4.36f, 12f, 4.36f)
                            close()
                            moveTo(12f, 13f)
                            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                            curveTo(14f, 12.1f, 13.1f, 13f, 12f, 13f)
                            close()
                            moveTo(18f, 19.05f)
                            verticalLineToRelative(-2.98f)
                            lineToRelative(-1.22f, -0.81f)
                            curveToRelative(-0.19f, 1.05f, -0.47f, 2.1f, -0.76f, 3f)
                            lineTo(18f, 19.05f)
                            close()
                        }
                    }
                }
                group {
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(14f, 11f)
                            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                            reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                            reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                            reflectiveCurveTo(14f, 12.1f, 14f, 11f)
                            close()
                            moveTo(7.98f, 18.25f)
                            curveToRelative(-0.29f, -0.9f, -0.57f, -1.94f, -0.76f, -3f)
                            lineTo(6f, 16.07f)
                            verticalLineToRelative(2.98f)
                            lineTo(7.98f, 18.25f)
                            close()
                            moveTo(12f, 2f)
                            curveToRelative(0f, 0f, 5f, 2f, 5f, 11f)
                            lineToRelative(2.11f, 1.41f)
                            curveToRelative(0.56f, 0.37f, 0.89f, 1f, 0.89f, 1.66f)
                            verticalLineTo(22f)
                            lineToRelative(-5f, -2f)
                            horizontalLineTo(9f)
                            lineToRelative(-5f, 2f)
                            verticalLineToRelative(-5.93f)
                            curveToRelative(0f, -0.67f, 0.33f, -1.29f, 0.89f, -1.66f)
                            lineTo(7f, 13f)
                            curveTo(7f, 4f, 12f, 2f, 12f, 2f)
                            close()
                            moveTo(12f, 4.36f)
                            curveToRelative(0f, 0f, -3f, 2.02f, -3f, 8.64f)
                            curveToRelative(0f, 2.25f, 1f, 5f, 1f, 5f)
                            horizontalLineToRelative(4f)
                            curveToRelative(0f, 0f, 1f, -2.75f, 1f, -5f)
                            curveTo(15f, 6.38f, 12f, 4.36f, 12f, 4.36f)
                            close()
                            moveTo(18f, 19.05f)
                            verticalLineToRelative(-2.98f)
                            lineToRelative(-1.22f, -0.81f)
                            curveToRelative(-0.19f, 1.05f, -0.47f, 2.1f, -0.76f, 3f)
                            lineTo(18f, 19.05f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Rocket!!
    }

private var _Rocket: ImageVector? = null

