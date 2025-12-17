package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Vpn_lock: ImageVector
    get() {
        if (_Vpn_lock != null) return _Vpn_lock!!
        
        _Vpn_lock = ImageVector.Builder(
            name = "vpn_lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                curveToRelative(0.9f, 0f, 1.64f, 0.58f, 1.9f, 1.39f)
                curveTo(18.2f, 16.97f, 19f, 15.08f, 19f, 13f)
                curveToRelative(0f, -0.34f, -0.04f, -0.67f, -0.08f, -1f)
                horizontalLineTo(17f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineTo(6f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveToRelative(-4f, 9f)
                verticalLineToRelative(-1f)
                lineToRelative(-4.79f, -4.79f)
                curveTo(3.08f, 11.79f, 3f, 12.38f, 3f, 13f)
                curveToRelative(0f, 4.08f, 3.05f, 7.44f, 7f, 7.93f)
                verticalLineTo(19f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.92f, 12f)
                curveToRelative(0.04f, 0.33f, 0.08f, 0.66f, 0.08f, 1f)
                curveToRelative(0f, 2.08f, -0.8f, 3.97f, -2.1f, 5.39f)
                curveToRelative(-0.26f, -0.81f, -1f, -1.39f, -1.9f, -1.39f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(3.46f)
                curveToRelative(-0.95f, -0.3f, -1.95f, -0.46f, -3f, -0.46f)
                curveTo(5.48f, 3f, 1f, 7.48f, 1f, 13f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                curveToRelative(0f, -0.34f, -0.02f, -0.67f, -0.05f, -1f)
                horizontalLineToRelative(-2.03f)
                close()
                moveTo(10f, 20.93f)
                curveToRelative(-3.95f, -0.49f, -7f, -3.85f, -7f, -7.93f)
                curveToRelative(0f, -0.62f, 0.08f, -1.21f, 0.21f, -1.79f)
                lineTo(8f, 16f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                verticalLineToRelative(1.93f)
                close()
                moveTo(22f, 4f)
                verticalLineToRelative(-0.5f)
                curveTo(22f, 2.12f, 20.88f, 1f, 19.5f, 1f)
                reflectiveCurveTo(17f, 2.12f, 17f, 3.5f)
                verticalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveToRelative(-1f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineTo(4f)
                close()
            }
        }.build()
        
        return _Vpn_lock!!
    }

private var _Vpn_lock: ImageVector? = null

