package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ArrowTopLeft: ImageVector
    get() {
        if (_ArrowTopLeft != null) return _ArrowTopLeft!!
        
        _ArrowTopLeft = ImageVector.Builder(
            name = "arrow-top-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.50019f, 3f)
                curveTo(3.36778f, 3.00005f, 3.24037f, 3.05295f, 3.14667f, 3.14648f)
                curveTo(3.05319f, 3.24013f, 3.0003f, 3.36768f, 3.00019f, 3.5f)
                verticalLineTo(9f)
                lineTo(3.00995f, 9.10156f)
                curveTo(3.05682f, 9.32901f, 3.25888f, 9.49991f, 3.50019f, 9.5f)
                curveTo(3.74179f, 9.49991f, 3.94388f, 9.32846f, 3.99042f, 9.10059f)
                lineTo(4.00019f, 9f)
                verticalLineTo(4.70703f)
                lineTo(10.6467f, 11.3535f)
                curveTo(10.8418f, 11.5487f, 11.1584f, 11.5485f, 11.3537f, 11.3535f)
                curveTo(11.5487f, 11.1582f, 11.5489f, 10.8416f, 11.3537f, 10.6465f)
                lineTo(4.70722f, 4f)
                horizontalLineTo(9.00019f)
                curveTo(9.2762f, 3.99996f, 9.50004f, 3.77599f, 9.50019f, 3.5f)
                curveTo(9.50004f, 3.22401f, 9.2762f, 3.00004f, 9.00019f, 3f)
                horizontalLineTo(3.50019f)
                close()
            }
        }.build()
        
        return _ArrowTopLeft!!
    }

private var _ArrowTopLeft: ImageVector? = null

