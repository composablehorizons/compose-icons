package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ArrowBottomLeft: ImageVector
    get() {
        if (_ArrowBottomLeft != null) return _ArrowBottomLeft!!
        
        _ArrowBottomLeft = ImageVector.Builder(
            name = "arrow-bottom-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.50019f, 12f)
                curveTo(3.36778f, 12f, 3.24037f, 11.9471f, 3.14667f, 11.8535f)
                curveTo(3.05319f, 11.7599f, 3.0003f, 11.6323f, 3.00019f, 11.5f)
                verticalLineTo(6f)
                lineTo(3.00995f, 5.89844f)
                curveTo(3.05682f, 5.67099f, 3.25888f, 5.50009f, 3.50019f, 5.5f)
                curveTo(3.74179f, 5.50009f, 3.94388f, 5.67154f, 3.99042f, 5.89941f)
                lineTo(4.00019f, 6f)
                verticalLineTo(10.293f)
                lineTo(10.6467f, 3.64648f)
                curveTo(10.8418f, 3.45132f, 11.1584f, 3.45152f, 11.3537f, 3.64648f)
                curveTo(11.5487f, 3.84177f, 11.5489f, 4.15835f, 11.3537f, 4.35352f)
                lineTo(4.70722f, 11f)
                horizontalLineTo(9.00019f)
                curveTo(9.2762f, 11f, 9.50004f, 11.224f, 9.50019f, 11.5f)
                curveTo(9.50004f, 11.776f, 9.2762f, 12f, 9.00019f, 12f)
                horizontalLineTo(3.50019f)
                close()
            }
        }.build()
        
        return _ArrowBottomLeft!!
    }

private var _ArrowBottomLeft: ImageVector? = null

