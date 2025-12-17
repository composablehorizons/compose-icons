package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Taxi_alert: ImageVector
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
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4f, 18f)
                        horizontalLineToRelative(14f)
                        verticalLineToRelative(-5f)
                        horizontalLineTo(4f)
                        verticalLineTo(18f)
                        close()
                        moveTo(15.5f, 14f)
                        curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                        reflectiveCurveTo(16.33f, 17f, 15.5f, 17f)
                        reflectiveCurveTo(14f, 16.33f, 14f, 15.5f)
                        reflectiveCurveTo(14.67f, 14f, 15.5f, 14f)
                        close()
                        moveTo(6.5f, 14f)
                        curveTo(7.33f, 14f, 8f, 14.67f, 8f, 15.5f)
                        reflectiveCurveTo(7.33f, 17f, 6.5f, 17f)
                        reflectiveCurveTo(5f, 16.33f, 5f, 15.5f)
                        reflectiveCurveTo(5.67f, 14f, 6.5f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 15.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 6.5f, 17f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 5f, 15.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 8f, 15.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 15.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 15.5f, 17f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 14f, 15.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 17f, 15.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 18f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(-5f)
                        horizontalLineToRelative(14f)
                        curveToRelative(-1.91f, 0f, -3.63f, -0.76f, -4.89f, -2f)
                        horizontalLineTo(4.81f)
                        lineToRelative(1.04f, -3f)
                        horizontalLineToRelative(5.44f)
                        curveTo(11.1f, 7.37f, 11f, 6.7f, 11f, 6f)
                        reflectiveCurveToRelative(0.1f, -1.37f, 0.29f, -2f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(5.5f)
                        curveTo(4.84f, 6f, 4.29f, 6.42f, 4.08f, 7.01f)
                        lineTo(2f, 13f)
                        verticalLineToRelative(8f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(12f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-8f)
                        lineToRelative(-0.09f, -0.27f)
                        curveTo(19.3f, 12.9f, 18.66f, 13f, 18f, 13f)
                        verticalLineTo(18f)
                        close()
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
                            moveTo(18.5f, 3f)
                            verticalLineToRelative(4f)
                            horizontalLineToRelative(-1f)
                            verticalLineTo(3f)
                            horizontalLineTo(18.5f)
                            close()
                            moveTo(18.5f, 9f)
                            horizontalLineToRelative(-1f)
                            verticalLineTo(8f)
                            horizontalLineToRelative(1f)
                            verticalLineTo(9f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Taxi_alert!!
    }

private var _Taxi_alert: ImageVector? = null

