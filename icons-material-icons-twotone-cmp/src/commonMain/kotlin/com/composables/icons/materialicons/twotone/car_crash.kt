package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Car_crash: ImageVector
    get() {
        if (_Car_crash != null) return _Car_crash!!
        
        _Car_crash = ImageVector.Builder(
            name = "car_crash",
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
                            moveTo(17.91f, 13f)
                            curveToRelative(0.06f, 0.16f, 0.09f, 0.33f, 0.09f, 0.5f)
                            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                            reflectiveCurveTo(15f, 14.33f, 15f, 13.5f)
                            curveToRelative(0f, -0.39f, 0.15f, -0.74f, 0.39f, -1f)
                            curveToRelative(-0.86f, -0.35f, -1.63f, -0.86f, -2.29f, -1.5f)
                            horizontalLineTo(5f)
                            verticalLineToRelative(5f)
                            horizontalLineToRelative(14f)
                            verticalLineToRelative(-3.07f)
                            curveTo(18.67f, 12.98f, 18.39f, 13f, 17.91f, 13f)
                            close()
                            moveTo(7.5f, 15f)
                            curveTo(6.67f, 15f, 6f, 14.33f, 6f, 13.5f)
                            reflectiveCurveTo(6.67f, 12f, 7.5f, 12f)
                            reflectiveCurveTo(9f, 12.67f, 9f, 13.5f)
                            reflectiveCurveTo(8.33f, 15f, 7.5f, 15f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(18f, 1f)
                            curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                            reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                            reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                            reflectiveCurveTo(20.76f, 1f, 18f, 1f)
                            close()
                            moveTo(18.5f, 7f)
                            horizontalLineToRelative(-1f)
                            verticalLineTo(3f)
                            horizontalLineToRelative(1f)
                            verticalLineTo(7f)
                            close()
                            moveTo(18.5f, 8f)
                            verticalLineToRelative(1f)
                            horizontalLineToRelative(-1f)
                            verticalLineTo(8f)
                            horizontalLineTo(18.5f)
                            close()
                            moveTo(6f, 13.5f)
                            curveTo(6f, 12.67f, 6.67f, 12f, 7.5f, 12f)
                            reflectiveCurveTo(9f, 12.67f, 9f, 13.5f)
                            reflectiveCurveTo(8.33f, 15f, 7.5f, 15f)
                            reflectiveCurveTo(6f, 14.33f, 6f, 13.5f)
                            close()
                            moveTo(19f, 12.93f)
                            curveToRelative(0.65f, -0.09f, 1.34f, -0.28f, 2f, -0.6f)
                            horizontalLineToRelative(0f)
                            verticalLineTo(19f)
                            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                            horizontalLineToRelative(-1f)
                            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                            verticalLineToRelative(-1f)
                            horizontalLineTo(6f)
                            verticalLineToRelative(1f)
                            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                            horizontalLineTo(4f)
                            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                            verticalLineToRelative(-8f)
                            lineToRelative(2.08f, -5.99f)
                            curveTo(5.29f, 4.42f, 5.84f, 4f, 6.5f, 4f)
                            lineToRelative(4.79f, 0f)
                            curveTo(11.1f, 4.63f, 11f, 5.31f, 11f, 6f)
                            horizontalLineTo(6.85f)
                            lineTo(5.81f, 9f)
                            horizontalLineToRelative(5.86f)
                            verticalLineToRelative(0f)
                            curveToRelative(0.36f, 0.75f, 0.84f, 1.43f, 1.43f, 2f)
                            lineTo(5f, 11f)
                            verticalLineToRelative(5f)
                            horizontalLineToRelative(14f)
                            lineTo(19f, 12.93f)
                            close()
                            moveTo(17.91f, 13f)
                            curveToRelative(-0.89f, -0.01f, -1.74f, -0.19f, -2.53f, -0.51f)
                            curveTo(15.15f, 12.76f, 15f, 13.11f, 15f, 13.5f)
                            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                            curveTo(18f, 13.32f, 17.97f, 13.16f, 17.91f, 13f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Car_crash!!
    }

private var _Car_crash: ImageVector? = null

