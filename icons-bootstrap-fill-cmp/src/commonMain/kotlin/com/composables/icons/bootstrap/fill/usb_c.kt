package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.UsbC: ImageVector
    get() {
        if (_UsbC != null) return _UsbC!!
        
        _UsbC = ImageVector.Builder(
            name = "usb-c",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 5f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 6f)
                horizontalLineToRelative(10f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, -6f)
                close()
                moveToRelative(0.5f, 2.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
            }
        }.build()
        
        return _UsbC!!
    }

private var _UsbC: ImageVector? = null

