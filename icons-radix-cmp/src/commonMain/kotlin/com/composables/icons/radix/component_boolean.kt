package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ComponentBoolean: ImageVector
    get() {
        if (_ComponentBoolean != null) return _ComponentBoolean!!
        
        _ComponentBoolean = ImageVector.Builder(
            name = "component-boolean",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.22415f, 1.42515f)
                curveTo(7.41824f, 1.29685f, 7.68311f, 1.31868f, 7.85403f, 1.4896f)
                lineTo(13.5103f, 7.14683f)
                lineTo(13.5747f, 7.22397f)
                curveTo(13.703f, 7.41807f, 13.6812f, 7.68294f, 13.5103f, 7.85386f)
                lineTo(7.85403f, 13.5101f)
                curveTo(7.65879f, 13.7053f, 7.34227f, 13.7053f, 7.147f, 13.5101f)
                lineTo(1.48977f, 7.85386f)
                curveTo(1.29457f, 7.65865f, 1.29469f, 7.3421f, 1.48977f, 7.14683f)
                lineTo(7.147f, 1.4896f)
                lineTo(7.22415f, 1.42515f)
                close()
                moveTo(2.55032f, 7.50034f)
                lineTo(7.50051f, 12.4496f)
                verticalLineTo(2.55015f)
                lineTo(2.55032f, 7.50034f)
                close()
            }
        }.build()
        
        return _ComponentBoolean!!
    }

private var _ComponentBoolean: ImageVector? = null

