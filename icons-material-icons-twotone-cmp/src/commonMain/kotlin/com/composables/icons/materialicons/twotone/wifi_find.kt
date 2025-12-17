package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Wifi_find: ImageVector
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
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22.59f, 10.39f)
                        lineTo(24f, 8.98f)
                        curveTo(20.93f, 5.9f, 16.69f, 4f, 12f, 4f)
                        curveTo(7.31f, 4f, 3.07f, 5.9f, 0f, 8.98f)
                        lineTo(12f, 21f)
                        lineToRelative(1.41f, -1.42f)
                        lineTo(2.93f, 9.08f)
                        curveTo(5.45f, 7.16f, 8.59f, 6f, 12f, 6f)
                        curveTo(16.13f, 6f, 19.88f, 7.68f, 22.59f, 10.39f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(23f, 18.59f)
                        lineToRelative(-2.56f, -2.56f)
                        curveTo(20.79f, 15.44f, 21f, 14.75f, 21f, 14f)
                        curveToRelative(0f, -2.24f, -1.76f, -4f, -4f, -4f)
                        reflectiveCurveToRelative(-4f, 1.76f, -4f, 4f)
                        curveToRelative(0f, 2.24f, 1.76f, 4f, 4f, 4f)
                        curveToRelative(0.75f, 0f, 1.44f, -0.21f, 2.03f, -0.56f)
                        lineTo(21.59f, 20f)
                        lineTo(23f, 18.59f)
                        close()
                        moveTo(15f, 14f)
                        curveToRelative(0f, -1.12f, 0.88f, -2f, 2f, -2f)
                        reflectiveCurveToRelative(2f, 0.88f, 2f, 2f)
                        curveToRelative(0f, 1.12f, -0.88f, 2f, -2f, 2f)
                        reflectiveCurveTo(15f, 15.12f, 15f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22.59f, 10.39f)
                        curveTo(19.88f, 7.68f, 16.13f, 6f, 12f, 6f)
                        curveTo(8.59f, 6f, 5.45f, 7.16f, 2.93f, 9.08f)
                        lineToRelative(2.26f, 2.26f)
                        lineToRelative(8.24f, 8.24f)
                        lineToRelative(0.46f, -0.46f)
                        curveTo(12.15f, 18.09f, 11f, 16.21f, 11f, 14f)
                        curveToRelative(0f, -1.62f, 0.62f, -3.13f, 1.75f, -4.25f)
                        reflectiveCurveTo(15.38f, 8f, 17f, 8f)
                        curveToRelative(2.21f, 0f, 4.09f, 1.15f, 5.13f, 2.89f)
                        lineToRelative(0.49f, -0.49f)
                        lineToRelative(-0.02f, -0.02f)
                        lineTo(22.59f, 10.39f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Wifi_find!!
    }

private var _Wifi_find: ImageVector? = null

