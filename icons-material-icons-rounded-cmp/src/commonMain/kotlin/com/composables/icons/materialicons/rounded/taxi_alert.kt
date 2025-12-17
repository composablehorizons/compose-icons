package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Taxi_alert: ImageVector
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
                            horizontalLineTo(9f)
                            curveTo(8.45f, 4f, 8f, 4.45f, 8f, 5f)
                            verticalLineToRelative(1f)
                            horizontalLineTo(5.5f)
                            curveTo(4.84f, 6f, 4.29f, 6.42f, 4.08f, 7.01f)
                            lineTo(2f, 13f)
                            verticalLineToRelative(7.5f)
                            curveTo(2f, 21.32f, 2.67f, 22f, 3.5f, 22f)
                            reflectiveCurveTo(5f, 21.32f, 5f, 20.5f)
                            verticalLineTo(20f)
                            horizontalLineToRelative(12f)
                            verticalLineToRelative(0.5f)
                            curveToRelative(0f, 0.82f, 0.67f, 1.5f, 1.5f, 1.5f)
                            reflectiveCurveToRelative(1.5f, -0.68f, 1.5f, -1.5f)
                            verticalLineTo(13f)
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
                            moveTo(18f, 9f)
                            curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                            reflectiveCurveTo(17.72f, 8f, 18f, 8f)
                            reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                            reflectiveCurveTo(18.28f, 9f, 18f, 9f)
                            close()
                            moveTo(18.5f, 6.5f)
                            curveTo(18.5f, 6.78f, 18.28f, 7f, 18f, 7f)
                            reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                            verticalLineToRelative(-3f)
                            curveTo(17.5f, 3.22f, 17.72f, 3f, 18f, 3f)
                            reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                            verticalLineTo(6.5f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Taxi_alert!!
    }

private var _Taxi_alert: ImageVector? = null

