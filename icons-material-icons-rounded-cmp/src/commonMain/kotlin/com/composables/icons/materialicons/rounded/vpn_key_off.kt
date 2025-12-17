package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Vpn_key_off: ImageVector
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(3.98f, 6.81f)
                    curveTo(2.2f, 7.85f, 1f, 9.79f, 1f, 12f)
                    curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                    curveToRelative(2.21f, 0f, 4.15f, -1.2f, 5.18f, -2.99f)
                    lineToRelative(6.89f, 6.89f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                    lineTo(3.51f, 3.51f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    lineTo(3.98f, 6.81f)
                    close()
                    moveTo(8.99f, 11.82f)
                    curveTo(9f, 11.88f, 9f, 11.94f, 9f, 12f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                    reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                    curveToRelative(0.06f, 0f, 0.12f, 0f, 0.18f, 0.01f)
                    lineTo(8.99f, 11.82f)
                    close()
                    moveTo(20.32f, 17.5f)
                    curveTo(20.74f, 17.13f, 21f, 16.59f, 21f, 16f)
                    verticalLineToRelative(-2f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                    horizontalLineToRelative(-8.17f)
                    lineTo(20.32f, 17.5f)
                }
            }
        }.build()
        
        return _Vpn_key_off!!
    }

private var _Vpn_key_off: ImageVector? = null

