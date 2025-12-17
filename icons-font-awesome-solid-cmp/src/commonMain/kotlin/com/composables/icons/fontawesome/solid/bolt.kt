package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Bolt: ImageVector
    get() {
        if (_Bolt != null) return _Bolt!!
        
        _Bolt = ImageVector.Builder(
            name = "bolt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(296f, 160f)
                horizontalLineTo(180.6f)
                lineToRelative(42.6f, -129.8f)
                curveTo(227.2f, 15f, 215.7f, 0f, 200f, 0f)
                horizontalLineTo(56f)
                curveTo(44f, 0f, 33.8f, 8.9f, 32.2f, 20.8f)
                lineToRelative(-32f, 240f)
                curveTo(-1.7f, 275.2f, 9.5f, 288f, 24f, 288f)
                horizontalLineToRelative(118.7f)
                lineTo(96.6f, 482.5f)
                curveToRelative(-3.6f, 15.2f, 8f, 29.5f, 23.3f, 29.5f)
                curveToRelative(8.4f, 0f, 16.4f, -4.4f, 20.8f, -12f)
                lineToRelative(176f, -304f)
                curveToRelative(9.3f, -15.9f, -2.2f, -36f, -20.7f, -36f)
                close()
            }
        }.build()
        
        return _Bolt!!
    }

private var _Bolt: ImageVector? = null

