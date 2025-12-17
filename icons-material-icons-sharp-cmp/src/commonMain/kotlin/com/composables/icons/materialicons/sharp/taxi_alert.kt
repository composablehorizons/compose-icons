package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Taxi_alert: ImageVector
    get() {
        if (_Taxi_alert != null) return _Taxi_alert!!
        
        _Taxi_alert = ImageVector.Builder(
            name = "taxi_alert",
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
                            moveTo(18f, 13f)
                            curveToRelative(-1.91f, 0f, -3.63f, -0.76f, -4.89f, -2f)
                            horizontalLineTo(4.81f)
                            lineToRelative(1.04f, -3f)
                            horizontalLineToRelative(5.44f)
                            curveTo(11.1f, 7.37f, 11f, 6.7f, 11f, 6f)
                            reflectiveCurveToRelative(0.1f, -1.37f, 0.29f, -2f)
                            horizontalLineTo(8f)
                            verticalLineToRelative(2f)
                            horizontalLineTo(4.43f)
                            lineTo(2f, 13f)
                            verticalLineToRelative(9f)
                            horizontalLineToRelative(3f)
                            verticalLineToRelative(-2f)
                            horizontalLineToRelative(12f)
                            verticalLineToRelative(2f)
                            horizontalLineToRelative(3f)
                            verticalLineToRelative(-9f)
                            lineToRelative(-0.09f, -0.27f)
                            curveTo(19.3f, 12.9f, 18.66f, 13f, 18f, 13f)
                            close()
                            moveTo(6.5f, 17f)
                            curveTo(5.67f, 17f, 5f, 16.33f, 5f, 15.5f)
                            reflectiveCurveTo(5.67f, 14f, 6.5f, 14f)
                            reflectiveCurveTo(8f, 14.67f, 8f, 15.5f)
                            reflectiveCurveTo(7.33f, 17f, 6.5f, 17f)
                            close()
                            moveTo(15.5f, 17f)
                            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                            reflectiveCurveTo(16.33f, 17f, 15.5f, 17f)
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
                            moveTo(18.5f, 9f)
                            horizontalLineToRelative(-1f)
                            verticalLineTo(8f)
                            horizontalLineToRelative(1f)
                            verticalLineTo(9f)
                            close()
                            moveTo(18.5f, 7f)
                            horizontalLineToRelative(-1f)
                            verticalLineTo(3f)
                            horizontalLineToRelative(1f)
                            verticalLineTo(7f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Taxi_alert!!
    }

private var _Taxi_alert: ImageVector? = null

