package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Vpn_key_off: ImageVector
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
                        moveTo(20.83f, 18f)
                        horizontalLineTo(21f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-4f)
                        horizontalLineTo(12.83f)
                        lineTo(20.83f, 18f)
                        close()
                        moveTo(19.78f, 22.61f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(2.81f, 2.81f)
                        lineTo(1.39f, 4.22f)
                        lineToRelative(2.59f, 2.59f)
                        curveTo(2.2f, 7.85f, 1f, 9.79f, 1f, 12f)
                        curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                        curveToRelative(2.21f, 0f, 4.15f, -1.2f, 5.18f, -2.99f)
                        lineTo(19.78f, 22.61f)
                        close()
                        moveTo(8.99f, 11.82f)
                        curveTo(9f, 11.88f, 9f, 11.94f, 9f, 12f)
                        curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                        reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                        reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                        curveToRelative(0.06f, 0f, 0.12f, 0f, 0.18f, 0.01f)
                        lineTo(8.99f, 11.82f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Vpn_key_off!!
    }

private var _Vpn_key_off: ImageVector? = null

