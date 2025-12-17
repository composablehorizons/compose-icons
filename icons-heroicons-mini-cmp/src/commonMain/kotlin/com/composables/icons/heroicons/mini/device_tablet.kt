package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.DeviceTablet: ImageVector
    get() {
        if (_DeviceTablet != null) return _DeviceTablet!!
        
        _DeviceTablet = ImageVector.Builder(
            name = "device-tablet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 1f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                horizontalLineToRelative(10f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineTo(4f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                horizontalLineTo(5f)
                close()
                moveTo(3.5f, 4f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5f, 2.5f)
                horizontalLineToRelative(10f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16.5f, 4f)
                verticalLineToRelative(12f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineTo(5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3.5f, 16f)
                verticalLineTo(4f)
                close()
                moveToRelative(5.25f, 11.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-2.5f)
                close()
            }
        }.build()
        
        return _DeviceTablet!!
    }

private var _DeviceTablet: ImageVector? = null

