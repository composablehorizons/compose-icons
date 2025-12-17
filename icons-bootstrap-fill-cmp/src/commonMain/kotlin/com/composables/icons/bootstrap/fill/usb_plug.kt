package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.UsbPlug: ImageVector
    get() {
        if (_UsbPlug != null) return _UsbPlug!!
        
        _UsbPlug = ImageVector.Builder(
            name = "usb-plug",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(4f)
                horizontalLineTo(6f)
                close()
                moveTo(7f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineTo(1f)
                close()
                moveToRelative(2f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineTo(1f)
                close()
                moveTo(5.5f, 5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(4.894f)
                arcToRelative(2f, 2f, 0f, false, false, 0.336f, 1.11f)
                lineToRelative(0.83f, 1.245f)
                curveToRelative(0.544f, 0.816f, 0.834f, 1.774f, 0.834f, 2.754f)
                curveToRelative(0f, 0.275f, 0.222f, 0.497f, 0.497f, 0.497f)
                horizontalLineToRelative(2.006f)
                arcToRelative(0.497f, 0.497f, 0f, false, false, 0.497f, -0.497f)
                curveToRelative(0f, -0.98f, 0.29f, -1.938f, 0.834f, -2.754f)
                lineToRelative(0.83f, -1.245f)
                arcToRelative(2f, 2f, 0f, false, false, 0.336f, -1.11f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
            }
        }.build()
        
        return _UsbPlug!!
    }

private var _UsbPlug: ImageVector? = null

