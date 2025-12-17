package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.UsbPlug: ImageVector
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
                moveTo(6f, 5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(4.394f)
                curveToRelative(0f, 0.494f, 0.146f, 0.976f, 0.42f, 1.387f)
                lineToRelative(1.038f, 1.558f)
                curveToRelative(0.354f, 0.53f, 0.542f, 1.152f, 0.542f, 1.789f)
                curveToRelative(0f, 0.481f, 0.39f, 0.872f, 0.872f, 0.872f)
                horizontalLineToRelative(1.256f)
                curveToRelative(0.481f, 0f, 0.872f, -0.39f, 0.872f, -0.872f)
                curveToRelative(0f, -0.637f, 0.188f, -1.26f, 0.541f, -1.789f)
                lineToRelative(1.04f, -1.558f)
                arcTo(2.5f, 2.5f, 0f, false, false, 12f, 10.394f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
                moveToRelative(0f, 1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4.394f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -0.252f, 0.832f)
                lineTo(9.71f, 12.784f)
                arcTo(4.2f, 4.2f, 0f, false, false, 9.002f, 15f)
                horizontalLineTo(7.998f)
                arcToRelative(4.2f, 4.2f, 0f, false, false, -0.707f, -2.216f)
                lineToRelative(-1.04f, -1.558f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6f, 10.394f)
                close()
            }
        }.build()
        
        return _UsbPlug!!
    }

private var _UsbPlug: ImageVector? = null

