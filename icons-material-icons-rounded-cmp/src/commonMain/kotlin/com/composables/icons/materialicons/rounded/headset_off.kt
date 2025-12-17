package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Headset_off: ImageVector
    get() {
        if (_Headset_off != null) return _Headset_off!!
        
        _Headset_off = ImageVector.Builder(
            name = "headset_off",
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
                        moveTo(12f, 4f)
                        curveToRelative(3.87f, 0f, 7f, 3.13f, 7f, 7f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(-2f)
                        curveToRelative(-0.6f, 0f, -1.13f, 0.27f, -1.49f, 0.68f)
                        lineTo(21f, 18.17f)
                        verticalLineTo(11f)
                        curveToRelative(0f, -4.97f, -4.03f, -9f, -9f, -9f)
                        curveTo(9.98f, 2f, 8.12f, 2.67f, 6.62f, 3.8f)
                        lineToRelative(1.43f, 1.43f)
                        curveTo(9.17f, 4.45f, 10.53f, 4f, 12f, 4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21.19f, 21.19f)
                        lineTo(2.81f, 2.81f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        curveTo(1f, 3.2f, 1f, 3.83f, 1.39f, 4.22f)
                        lineToRelative(2.63f, 2.63f)
                        curveTo(3.37f, 8.09f, 3f, 9.5f, 3f, 11f)
                        verticalLineToRelative(7f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(2f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-4f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -0.94f, 0.19f, -1.83f, 0.52f, -2.65f)
                        lineTo(15f, 17.83f)
                        verticalLineTo(18f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(0.17f)
                        lineToRelative(1f, 1f)
                        horizontalLineTo(13f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(6f)
                        curveToRelative(0.36f, 0f, 0.68f, -0.1f, 0.97f, -0.26f)
                        curveToRelative(0.38f, 0.23f, 0.89f, 0.2f, 1.22f, -0.13f)
                        curveTo(21.58f, 22.22f, 21.58f, 21.58f, 21.19f, 21.19f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Headset_off!!
    }

private var _Headset_off: ImageVector? = null

