package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.UsbDrive: ImageVector
    get() {
        if (_UsbDrive != null) return _UsbDrive!!
        
        _UsbDrive = ImageVector.Builder(
            name = "usb-drive",
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
                moveTo(6f, 5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(8.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 6.5f, 16f)
                horizontalLineToRelative(4f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
                moveToRelative(0f, 1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(8.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                close()
            }
        }.build()
        
        return _UsbDrive!!
    }

private var _UsbDrive: ImageVector? = null

