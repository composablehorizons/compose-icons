package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PhoneVibrate: ImageVector
    get() {
        if (_PhoneVibrate != null) return _PhoneVibrate!!
        
        _PhoneVibrate = ImageVector.Builder(
            name = "phone-vibrate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
                moveTo(6f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 12f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                moveTo(1.599f, 4.058f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.208f, 0.676f)
                arcTo(7f, 7f, 0f, false, false, 1f, 8f)
                curveToRelative(0f, 1.18f, 0.292f, 2.292f, 0.807f, 3.266f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.884f, 0.468f)
                arcTo(8f, 8f, 0f, false, true, 0f, 8f)
                curveToRelative(0f, -1.347f, 0.334f, -2.619f, 0.923f, -3.734f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.676f, -0.208f)
                moveToRelative(12.802f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.676f, 0.208f)
                arcTo(8f, 8f, 0f, false, true, 16f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, -0.923f, 3.734f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.884f, -0.468f)
                arcTo(7f, 7f, 0f, false, false, 15f, 8f)
                curveToRelative(0f, -1.18f, -0.292f, -2.292f, -0.807f, -3.266f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.208f, -0.676f)
                moveTo(3.057f, 5.534f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.284f, 0.648f)
                arcTo(5f, 5f, 0f, false, false, 3f, 8f)
                curveToRelative(0f, 0.642f, 0.12f, 1.255f, 0.34f, 1.818f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.93f, 0.364f)
                arcTo(6f, 6f, 0f, false, true, 2f, 8f)
                curveToRelative(0f, -0.769f, 0.145f, -1.505f, 0.41f, -2.182f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.647f, -0.284f)
                moveToRelative(9.886f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.648f, 0.284f)
                curveTo(13.855f, 6.495f, 14f, 7.231f, 14f, 8f)
                reflectiveCurveToRelative(-0.145f, 1.505f, -0.41f, 2.182f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.93f, -0.364f)
                curveTo(12.88f, 9.255f, 13f, 8.642f, 13f, 8f)
                reflectiveCurveToRelative(-0.12f, -1.255f, -0.34f, -1.818f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.283f, -0.648f)
            }
        }.build()
        
        return _PhoneVibrate!!
    }

private var _PhoneVibrate: ImageVector? = null

