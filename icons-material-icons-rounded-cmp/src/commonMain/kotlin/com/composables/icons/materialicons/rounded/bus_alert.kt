package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Bus_alert: ImageVector
    get() {
        if (_Bus_alert != null) return _Bus_alert!!
        
        _Bus_alert = ImageVector.Builder(
            name = "bus_alert",
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
                            curveToRelative(0f, 0.95f, 0.38f, 1.81f, 1f, 2.44f)
                            verticalLineToRelative(1.56f)
                            curveTo(3f, 21.33f, 3.67f, 22f, 4.5f, 22f)
                            horizontalLineToRelative(0f)
                            curveTo(5.33f, 22f, 6f, 21.33f, 6f, 20.5f)
                            verticalLineTo(20f)
                            horizontalLineToRelative(8f)
                            verticalLineToRelative(0.5f)
                            curveToRelative(0f, 0.82f, 0.67f, 1.5f, 1.5f, 1.5f)
                            horizontalLineToRelative(0f)
                            curveToRelative(0.82f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                            verticalLineToRelative(-1.56f)
                            curveToRelative(0.62f, -0.63f, 1f, -1.49f, 1f, -2.44f)
                            verticalLineTo(13f)
                            curveToRelative(-1.91f, 0f, -3.63f, -0.76f, -4.89f, -2f)
                            horizontalLineTo(4f)
                            close()
                            moveTo(6.5f, 17f)
                            curveTo(5.67f, 17f, 5f, 16.33f, 5f, 15.5f)
                            reflectiveCurveTo(5.67f, 14f, 6.5f, 14f)
                            reflectiveCurveTo(8f, 14.67f, 8f, 15.5f)
                            reflectiveCurveTo(7.33f, 17f, 6.5f, 17f)
                            close()
                            moveTo(15f, 15.5f)
                            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                            reflectiveCurveTo(12f, 16.33f, 12f, 15.5f)
                            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                            reflectiveCurveTo(15f, 14.67f, 15f, 15.5f)
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
                            moveTo(18.5f, 6.5f)
                            curveTo(18.5f, 6.78f, 18.28f, 7f, 18f, 7f)
                            reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                            verticalLineToRelative(-3f)
                            curveTo(17.5f, 3.22f, 17.72f, 3f, 18f, 3f)
                            reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                            verticalLineTo(6.5f)
                            close()
                            moveTo(18.5f, 8.5f)
                            curveTo(18.5f, 8.78f, 18.28f, 9f, 18f, 9f)
                            reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                            reflectiveCurveTo(17.72f, 8f, 18f, 8f)
                            reflectiveCurveTo(18.5f, 8.22f, 18.5f, 8.5f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Bus_alert!!
    }

private var _Bus_alert: ImageVector? = null

