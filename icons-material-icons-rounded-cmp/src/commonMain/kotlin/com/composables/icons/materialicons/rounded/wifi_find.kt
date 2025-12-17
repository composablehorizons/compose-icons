package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Wifi_find: ImageVector
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
                            lineToRelative(0.36f, -0.37f)
                            curveToRelative(0.86f, -0.86f, 0.76f, -2.27f, -0.2f, -3.01f)
                            curveTo(19.44f, 5.3f, 15.87f, 4f, 12f, 4f)
                            curveTo(8.13f, 4f, 4.56f, 5.3f, 1.71f, 7.48f)
                            curveToRelative(-0.96f, 0.74f, -1.06f, 2.15f, -0.2f, 3.01f)
                            lineToRelative(9.08f, 9.09f)
                            curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0f)
                            lineToRelative(0.45f, -0.45f)
                            curveTo(12.14f, 18.09f, 11f, 16.2f, 11f, 14f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(20.44f, 16.03f)
                            curveTo(20.79f, 15.44f, 21f, 14.75f, 21f, 14f)
                            curveToRelative(0f, -2.24f, -1.76f, -4f, -4f, -4f)
                            reflectiveCurveToRelative(-4f, 1.76f, -4f, 4f)
                            curveToRelative(0f, 2.24f, 1.76f, 4f, 4f, 4f)
                            curveToRelative(0.75f, 0f, 1.44f, -0.21f, 2.03f, -0.56f)
                            lineToRelative(1.85f, 1.85f)
                            curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                            curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                            lineTo(20.44f, 16.03f)
                            close()
                            moveTo(17f, 16f)
                            curveToRelative(-1.12f, 0f, -2f, -0.88f, -2f, -2f)
                            curveToRelative(0f, -1.12f, 0.88f, -2f, 2f, -2f)
                            reflectiveCurveToRelative(2f, 0.88f, 2f, 2f)
                            curveTo(19f, 15.12f, 18.12f, 16f, 17f, 16f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Wifi_find!!
    }

private var _Wifi_find: ImageVector? = null

