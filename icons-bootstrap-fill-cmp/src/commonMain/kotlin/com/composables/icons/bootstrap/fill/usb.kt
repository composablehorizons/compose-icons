package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Usb: ImageVector
    get() {
        if (_Usb != null) return _Usb!!
        
        _Usb = ImageVector.Builder(
            name = "usb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.5f, 5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(15f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
                moveToRelative(1.75f, 1.5f)
                horizontalLineToRelative(11.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(1f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, 0.25f)
                horizontalLineTo(2.25f)
                arcTo(0.25f, 0.25f, 0f, false, true, 2f, 7.75f)
                verticalLineToRelative(-1f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, -0.25f)
            }
        }.build()
        
        return _Usb!!
    }

private var _Usb: ImageVector? = null

