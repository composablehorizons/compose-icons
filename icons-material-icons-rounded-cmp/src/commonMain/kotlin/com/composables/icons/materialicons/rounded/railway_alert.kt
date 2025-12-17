package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Railway_alert: ImageVector
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
                            moveTo(4f, 11f)
                            verticalLineTo(8f)
                            horizontalLineToRelative(7.29f)
                            curveToRelative(-0.77f, -2.6f, 0.21f, -4.61f, 0.37f, -4.97f)
                            curveTo(2.97f, 2.67f, 2f, 5.02f, 2f, 7f)
                            verticalLineToRelative(9.5f)
                            curveTo(2f, 18.43f, 3.57f, 20f, 5.5f, 20f)
                            lineToRelative(-1.21f, 0.81f)
                            curveTo(4.11f, 20.93f, 4f, 21.13f, 4f, 21.35f)
                            verticalLineToRelative(0f)
                            curveTo(4f, 21.71f, 4.29f, 22f, 4.65f, 22f)
                            horizontalLineToRelative(10.7f)
                            curveToRelative(0.36f, 0f, 0.65f, -0.29f, 0.65f, -0.65f)
                            verticalLineToRelative(0f)
                            curveToRelative(0f, -0.22f, -0.11f, -0.42f, -0.29f, -0.54f)
                            lineTo(14.5f, 20f)
                            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                            verticalLineTo(13f)
                            curveToRelative(-1.91f, 0f, -3.63f, -0.76f, -4.89f, -2f)
                            horizontalLineTo(4f)
                            close()
                            moveTo(10f, 17f)
                            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                            curveTo(11.5f, 16.33f, 10.83f, 17f, 10f, 17f)
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
                            curveTo(17.5f, 8.22f, 17.72f, 8f, 18f, 8f)
                            reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                            curveTo(18.5f, 8.78f, 18.28f, 9f, 18f, 9f)
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
        
        return _Railway_alert!!
    }

private var _Railway_alert: ImageVector? = null

