package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.DeviceTablet: ImageVector
    get() {
        if (_DeviceTablet != null) return _DeviceTablet!!
        
        _DeviceTablet = ImageVector.Builder(
            name = "device-tablet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 18f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.125f, 1.5f)
                arcTo(3.375f, 3.375f, 0f, false, false, 3.75f, 4.875f)
                verticalLineToRelative(14.25f)
                arcTo(3.375f, 3.375f, 0f, false, false, 7.125f, 22.5f)
                horizontalLineToRelative(9.75f)
                arcToRelative(3.375f, 3.375f, 0f, false, false, 3.375f, -3.375f)
                verticalLineTo(4.875f)
                arcTo(3.375f, 3.375f, 0f, false, false, 16.875f, 1.5f)
                horizontalLineToRelative(-9.75f)
                close()
                moveTo(6f, 4.875f)
                curveToRelative(0f, -0.621f, 0.504f, -1.125f, 1.125f, -1.125f)
                horizontalLineToRelative(9.75f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineToRelative(14.25f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                horizontalLineToRelative(-9.75f)
                arcTo(1.125f, 1.125f, 0f, false, true, 6f, 19.125f)
                verticalLineTo(4.875f)
                close()
            }
        }.build()
        
        return _DeviceTablet!!
    }

private var _DeviceTablet: ImageVector? = null

