package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Wifi_find: ImageVector
    get() {
        if (_Wifi_find != null) return _Wifi_find!!
        
        _Wifi_find = ImageVector.Builder(
            name = "wifi_find",
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
                            moveTo(11f, 14f)
                            curveToRelative(0f, -3.36f, 2.64f, -6f, 6f, -6f)
                            curveToRelative(2.2f, 0f, 4.08f, 1.13f, 5.13f, 2.86f)
                            lineTo(24f, 8.98f)
                            curveTo(20.93f, 5.9f, 16.69f, 4f, 12f, 4f)
                            curveTo(7.31f, 4f, 3.07f, 5.9f, 0f, 8.98f)
                            lineTo(12f, 21f)
                            lineToRelative(1.86f, -1.87f)
                            curveTo(12.14f, 18.09f, 11f, 16.2f, 11f, 14f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(21f, 14f)
                            curveToRelative(0f, -2.24f, -1.76f, -4f, -4f, -4f)
                            reflectiveCurveToRelative(-4f, 1.76f, -4f, 4f)
                            curveToRelative(0f, 2.24f, 1.76f, 4f, 4f, 4f)
                            curveToRelative(0.75f, 0f, 1.44f, -0.21f, 2.03f, -0.56f)
                            lineTo(21.59f, 20f)
                            lineTo(23f, 18.59f)
                            lineToRelative(-2.56f, -2.56f)
                            curveTo(20.79f, 15.44f, 21f, 14.75f, 21f, 14f)
                            close()
                            moveTo(15f, 14f)
                            curveToRelative(0f, -1.12f, 0.88f, -2f, 2f, -2f)
                            reflectiveCurveToRelative(2f, 0.88f, 2f, 2f)
                            curveToRelative(0f, 1.12f, -0.88f, 2f, -2f, 2f)
                            reflectiveCurveTo(15f, 15.12f, 15f, 14f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Wifi_find!!
    }

private var _Wifi_find: ImageVector? = null

