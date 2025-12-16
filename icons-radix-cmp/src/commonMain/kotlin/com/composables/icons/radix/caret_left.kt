package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.CaretLeft: ImageVector
    get() {
        if (_CaretLeft != null) return _CaretLeft!!
        
        _CaretLeft = ImageVector.Builder(
            name = "caret-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.04988f, 7.50012f)
                curveTo(5.04994f, 7.6194f, 5.09737f, 7.73413f, 5.18172f, 7.81848f)
                lineTo(8.18172f, 10.8185f)
                lineTo(8.25203f, 10.8761f)
                curveTo(8.4267f, 10.9914f, 8.66466f, 10.9723f, 8.81844f, 10.8185f)
                curveTo(8.97222f, 10.6647f, 8.99141f, 10.4267f, 8.87606f, 10.2521f)
                lineTo(8.81844f, 10.1818f)
                lineTo(6.1368f, 7.50012f)
                lineTo(8.81844f, 4.81848f)
                curveTo(8.99411f, 4.64281f, 8.99398f, 4.35751f, 8.81844f, 4.18176f)
                curveTo(8.6427f, 4.00602f, 8.35746f, 4.00602f, 8.18172f, 4.18176f)
                lineTo(5.18172f, 7.18176f)
                curveTo(5.09733f, 7.26615f, 5.04988f, 7.38077f, 5.04988f, 7.50012f)
                close()
            }
        }.build()
        
        return _CaretLeft!!
    }

private var _CaretLeft: ImageVector? = null

