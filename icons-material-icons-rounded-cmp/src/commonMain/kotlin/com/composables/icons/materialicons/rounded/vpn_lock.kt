package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Vpn_lock: ImageVector
    get() {
        if (_Vpn_lock != null) return _Vpn_lock!!
        
        _Vpn_lock = ImageVector.Builder(
            name = "vpn_lock",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19.92f, 11f)
                    curveToRelative(0.44f, 3.63f, -1.52f, 5.85f, -2.02f, 6.39f)
                    curveTo(17.64f, 16.58f, 16.9f, 16f, 16f, 16f)
                    horizontalLineToRelative(-1f)
                    verticalLineToRelative(-3f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(2f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(2.46f)
                    curveTo(14.05f, 2.16f, 13.05f, 2f, 12f, 2f)
                    curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                    reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                    curveToRelative(5.73f, 0f, 10.51f, -4.86f, 9.95f, -11f)
                    horizontalLineTo(19.92f)
                    close()
                    moveTo(11f, 19.93f)
                    curveTo(7.05f, 19.44f, 4f, 16.08f, 4f, 12f)
                    curveToRelative(0f, -0.62f, 0.08f, -1.21f, 0.21f, -1.79f)
                    lineTo(9f, 15f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    verticalLineTo(19.93f)
                    close()
                    moveTo(22f, 4f)
                    verticalLineTo(3.11f)
                    curveToRelative(0f, -1f, -0.68f, -1.92f, -1.66f, -2.08f)
                    curveTo(19.08f, 0.82f, 18f, 1.79f, 18f, 3f)
                    verticalLineToRelative(1f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(3f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(4f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineTo(5f)
                    curveTo(23f, 4.45f, 22.55f, 4f, 22f, 4f)
                    close()
                    moveTo(21f, 4f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(3f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    verticalLineTo(4f)
                    close()
                }
            }
        }.build()
        
        return _Vpn_lock!!
    }

private var _Vpn_lock: ImageVector? = null

