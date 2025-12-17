package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Railway_alert: ImageVector
    get() {
        if (_Railway_alert != null) return _Railway_alert!!
        
        _Railway_alert = ImageVector.Builder(
            name = "railway_alert",
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
                            moveTo(4f, 16.5f)
                            curveTo(4f, 17.33f, 4.67f, 18f, 5.5f, 18f)
                            horizontalLineToRelative(9f)
                            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                            verticalLineTo(13f)
                            horizontalLineTo(4f)
                            verticalLineTo(16.5f)
                            close()
                            moveTo(10f, 14f)
                            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                            reflectiveCurveTo(10.83f, 17f, 10f, 17f)
                            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                            reflectiveCurveTo(9.17f, 14f, 10f, 14f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(4.43f, 6f)
                            horizontalLineTo(11f)
                            curveToRelative(0f, -0.33f, 0.03f, -0.66f, 0.08f, -0.98f)
                            curveTo(7.71f, 4.92f, 5.33f, 5.23f, 4.43f, 6f)
                            close()
                        }
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4f, 11f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(7.29f)
                        curveTo(11.1f, 7.37f, 11f, 6.7f, 11f, 6f)
                        horizontalLineTo(4.43f)
                        curveToRelative(0.9f, -0.77f, 3.28f, -1.08f, 6.65f, -0.98f)
                        curveToRelative(0.1f, -0.7f, 0.3f, -1.37f, 0.59f, -1.99f)
                        curveTo(2.97f, 2.67f, 2f, 5.02f, 2f, 7f)
                        verticalLineToRelative(9.5f)
                        curveTo(2f, 18.43f, 3.57f, 20f, 5.5f, 20f)
                        lineTo(4f, 21f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(12f)
                        verticalLineToRelative(-1f)
                        lineToRelative(-1.5f, -1f)
                        curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                        verticalLineTo(13f)
                        curveToRelative(-1.91f, 0f, -3.63f, -0.76f, -4.89f, -2f)
                        horizontalLineTo(4f)
                        close()
                        moveTo(16f, 16.5f)
                        curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                        horizontalLineToRelative(-9f)
                        curveTo(4.67f, 18f, 4f, 17.33f, 4f, 16.5f)
                        verticalLineTo(13f)
                        horizontalLineToRelative(12f)
                        verticalLineTo(16.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11.5f, 15.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 10f, 17f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 8.5f, 15.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 11.5f, 15.5f)
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
        
        return _Railway_alert!!
    }

private var _Railway_alert: ImageVector? = null

