package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.UsbMini: ImageVector
    get() {
        if (_UsbMini != null) return _UsbMini!!
        
        _UsbMini = ImageVector.Builder(
            name = "usb-mini",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(1.293f)
                lineTo(0.293f, 7f)
                arcTo(1f, 1f, 0f, false, false, 0f, 7.707f)
                verticalLineTo(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(7.707f)
                arcTo(1f, 1f, 0f, false, false, 15.707f, 7f)
                lineTo(14f, 5.293f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
                moveToRelative(0f, 1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1.293f)
                arcToRelative(1f, 1f, 0f, false, false, 0.293f, 0.707f)
                lineTo(15f, 7.707f)
                verticalLineTo(12f)
                horizontalLineTo(1f)
                verticalLineTo(7.707f)
                lineTo(2.707f, 6f)
                arcTo(1f, 1f, 0f, false, false, 3f, 5.293f)
                close()
            }
        }.build()
        
        return _UsbMini!!
    }

private var _UsbMini: ImageVector? = null

