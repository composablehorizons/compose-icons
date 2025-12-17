package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.PhoneVibrate: ImageVector
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
                moveTo(4f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(5f, 7f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                moveTo(1.807f, 4.734f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.884f, -0.468f)
                arcTo(8f, 8f, 0f, false, false, 0f, 8f)
                curveToRelative(0f, 1.347f, 0.334f, 2.618f, 0.923f, 3.734f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.884f, -0.468f)
                arcTo(7f, 7f, 0f, false, true, 1f, 8f)
                curveToRelative(0f, -1.18f, 0.292f, -2.292f, 0.807f, -3.266f)
                moveToRelative(13.27f, -0.468f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.884f, 0.468f)
                curveTo(14.708f, 5.708f, 15f, 6.819f, 15f, 8f)
                curveToRelative(0f, 1.18f, -0.292f, 2.292f, -0.807f, 3.266f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.884f, 0.468f)
                arcTo(8f, 8f, 0f, false, false, 16f, 8f)
                arcToRelative(8f, 8f, 0f, false, false, -0.923f, -3.734f)
                moveTo(3.34f, 6.182f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.93f, -0.364f)
                arcTo(6f, 6f, 0f, false, false, 2f, 8f)
                curveToRelative(0f, 0.769f, 0.145f, 1.505f, 0.41f, 2.182f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.93f, -0.364f)
                arcTo(5f, 5f, 0f, false, true, 3f, 8f)
                curveToRelative(0f, -0.642f, 0.12f, -1.255f, 0.34f, -1.818f)
                moveToRelative(10.25f, -0.364f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.93f, 0.364f)
                curveToRelative(0.22f, 0.563f, 0.34f, 1.176f, 0.34f, 1.818f)
                reflectiveCurveToRelative(-0.12f, 1.255f, -0.34f, 1.818f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.93f, 0.364f)
                curveTo(13.856f, 9.505f, 14f, 8.769f, 14f, 8f)
                reflectiveCurveToRelative(-0.145f, -1.505f, -0.41f, -2.182f)
            }
        }.build()
        
        return _PhoneVibrate!!
    }

private var _PhoneVibrate: ImageVector? = null

