package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Bus_alert: ImageVector
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
                            moveTo(8f, 15.5f)
                            arcTo(1.5f, 1.5f, 0f, false, true, 6.5f, 17f)
                            arcTo(1.5f, 1.5f, 0f, false, true, 5f, 15.5f)
                            arcTo(1.5f, 1.5f, 0f, false, true, 8f, 15.5f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(15f, 15.5f)
                            arcTo(1.5f, 1.5f, 0f, false, true, 13.5f, 17f)
                            arcTo(1.5f, 1.5f, 0f, false, true, 12f, 15.5f)
                            arcTo(1.5f, 1.5f, 0f, false, true, 15f, 15.5f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(4f, 11f)
                            verticalLineTo(8f)
                            horizontalLineToRelative(7.29f)
                            curveTo(11.1f, 7.37f, 11f, 6.7f, 11f, 6f)
                            horizontalLineTo(4.43f)
                            curveToRelative(0.83f, -0.71f, 2.98f, -1.09f, 6.65f, -0.98f)
                            curveToRelative(0.1f, -0.7f, 0.3f, -1.37f, 0.59f, -1.99f)
                            curveTo(2.97f, 2.67f, 2f, 5.02f, 2f, 7f)
                            verticalLineToRelative(9.5f)
                            curveToRelative(0f, 0.95f, 0.38f, 1.81f, 1f, 2.44f)
                            verticalLineTo(21f)
                            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                            horizontalLineToRelative(1f)
                            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                            verticalLineToRelative(-1f)
                            horizontalLineToRelative(8f)
                            verticalLineToRelative(1f)
                            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                            horizontalLineToRelative(1f)
                            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                            verticalLineToRelative(-2.06f)
                            curveToRelative(0.62f, -0.63f, 1f, -1.49f, 1f, -2.44f)
                            verticalLineTo(13f)
                            curveToRelative(-1.91f, 0f, -3.63f, -0.76f, -4.89f, -2f)
                            horizontalLineTo(4f)
                            close()
                            moveTo(16f, 16f)
                            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                            horizontalLineTo(6f)
                            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                            verticalLineToRelative(-3f)
                            horizontalLineToRelative(12f)
                            verticalLineTo(16f)
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
        
        return _Bus_alert!!
    }

private var _Bus_alert: ImageVector? = null

