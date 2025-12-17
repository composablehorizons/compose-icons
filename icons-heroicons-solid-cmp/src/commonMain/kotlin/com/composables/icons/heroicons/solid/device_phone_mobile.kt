package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.DevicePhoneMobile: ImageVector
    get() {
        if (_DevicePhoneMobile != null) return _DevicePhoneMobile!!
        
        _DevicePhoneMobile = ImageVector.Builder(
            name = "device-phone-mobile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 18.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.625f, 0.75f)
                arcTo(3.375f, 3.375f, 0f, false, false, 5.25f, 4.125f)
                verticalLineToRelative(15.75f)
                arcToRelative(3.375f, 3.375f, 0f, false, false, 3.375f, 3.375f)
                horizontalLineToRelative(6.75f)
                arcToRelative(3.375f, 3.375f, 0f, false, false, 3.375f, -3.375f)
                verticalLineTo(4.125f)
                arcTo(3.375f, 3.375f, 0f, false, false, 15.375f, 0.75f)
                horizontalLineToRelative(-6.75f)
                close()
                moveTo(7.5f, 4.125f)
                curveTo(7.5f, 3.504f, 8.004f, 3f, 8.625f, 3f)
                horizontalLineTo(9.75f)
                verticalLineToRelative(0.375f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                horizontalLineToRelative(2.25f)
                curveToRelative(0.621f, 0f, 1.125f, -0.504f, 1.125f, -1.125f)
                verticalLineTo(3f)
                horizontalLineToRelative(1.125f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineToRelative(15.75f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                horizontalLineToRelative(-6.75f)
                arcTo(1.125f, 1.125f, 0f, false, true, 7.5f, 19.875f)
                verticalLineTo(4.125f)
                close()
            }
        }.build()
        
        return _DevicePhoneMobile!!
    }

private var _DevicePhoneMobile: ImageVector? = null

