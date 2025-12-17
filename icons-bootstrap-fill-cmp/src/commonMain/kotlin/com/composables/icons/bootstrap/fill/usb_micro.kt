package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.UsbMicro: ImageVector
    get() {
        if (_UsbMicro != null) return _UsbMicro!!
        
        _UsbMicro = ImageVector.Builder(
            name = "usb-micro",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.707f, 4f)
                arcTo(1f, 1f, 0f, false, false, 2f, 4.293f)
                lineTo(0.293f, 6f)
                arcTo(1f, 1f, 0f, false, false, 0f, 6.707f)
                verticalLineTo(11f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(6.707f)
                arcTo(1f, 1f, 0f, false, false, 15.707f, 6f)
                lineTo(14f, 4.293f)
                arcTo(1f, 1f, 0f, false, false, 13.293f, 4f)
                close()
                moveTo(4.5f, 7f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
            }
        }.build()
        
        return _UsbMicro!!
    }

private var _UsbMicro: ImageVector? = null

