package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Vpn_key_off: ImageVector
    get() {
        if (_Vpn_key_off != null) return _Vpn_key_off!!
        
        _Vpn_key_off = ImageVector.Builder(
            name = "vpn_key_off",
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
                        moveTo(17f, 14.17f)
                        verticalLineTo(13f)
                        horizontalLineToRelative(-1.17f)
                        lineToRelative(-2f, -2f)
                        horizontalLineTo(21f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(3f)
                        lineTo(17f, 14.17f)
                        close()
                        moveTo(7f, 16f)
                        curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                        curveToRelative(0f, -1.67f, 1.02f, -3.1f, 2.47f, -3.7f)
                        lineToRelative(1.71f, 1.71f)
                        curveTo(7.12f, 10f, 7.06f, 10f, 7f, 10f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                        reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                        curveToRelative(0f, -0.06f, 0f, -0.12f, -0.01f, -0.18f)
                        lineToRelative(1.74f, 1.74f)
                        curveTo(10.22f, 14.48f, 9.14f, 16f, 7f, 16f)
                        close()
                    }
                }
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2.81f, 2.81f)
                        lineTo(1.39f, 4.22f)
                        lineToRelative(2.59f, 2.59f)
                        curveTo(2.2f, 7.85f, 1f, 9.79f, 1f, 12f)
                        curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                        curveToRelative(2.22f, 0f, 4.15f, -1.21f, 5.19f, -3f)
                        lineToRelative(7.59f, 7.61f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(2.81f, 2.81f)
                        close()
                        moveTo(7f, 16f)
                        curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                        curveToRelative(0f, -1.67f, 1.02f, -3.1f, 2.47f, -3.7f)
                        lineToRelative(1.71f, 1.71f)
                        curveTo(7.12f, 10f, 7.06f, 10f, 7f, 10f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                        reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                        curveToRelative(0f, -0.06f, 0f, -0.12f, -0.01f, -0.18f)
                        lineToRelative(1.74f, 1.74f)
                        curveTo(10.22f, 14.48f, 9.14f, 16f, 7f, 16f)
                        close()
                        moveTo(17f, 14.17f)
                        verticalLineTo(13f)
                        horizontalLineToRelative(-1.17f)
                        lineTo(17f, 14.17f)
                        close()
                        moveTo(13.83f, 11f)
                        horizontalLineTo(21f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(3f)
                        lineToRelative(2f, 2f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(9f)
                        horizontalLineTo(11.83f)
                        lineTo(13.83f, 11f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Vpn_key_off!!
    }

private var _Vpn_key_off: ImageVector? = null

