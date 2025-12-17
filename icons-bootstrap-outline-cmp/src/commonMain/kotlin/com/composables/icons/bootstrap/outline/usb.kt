package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Usb: ImageVector
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
                moveTo(2.25f, 7f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(11.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-1f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, -0.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 5.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 5f)
                horizontalLineToRelative(15f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(1f, 10f)
                horizontalLineToRelative(14f)
                verticalLineTo(6f)
                horizontalLineTo(1f)
                close()
            }
        }.build()
        
        return _Usb!!
    }

private var _Usb: ImageVector? = null

