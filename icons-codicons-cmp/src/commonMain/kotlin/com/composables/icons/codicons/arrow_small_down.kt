package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ArrowSmallDown: ImageVector
    get() {
        if (_ArrowSmallDown != null) return _ArrowSmallDown!!
        
        _ArrowSmallDown = ImageVector.Builder(
            name = "arrow-small-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.85398f, 8.854f)
                lineTo(7.85398f, 10.854f)
                curveTo(7.65898f, 11.049f, 7.34198f, 11.049f, 7.14698f, 10.854f)
                lineTo(5.14698f, 8.854f)
                curveTo(4.95198f, 8.659f, 4.95198f, 8.342f, 5.14698f, 8.147f)
                curveTo(5.34198f, 7.952f, 5.65898f, 7.952f, 5.85398f, 8.147f)
                lineTo(6.99998f, 9.293f)
                verticalLineTo(4.5f)
                curveTo(6.99998f, 4.224f, 7.22398f, 4f, 7.49998f, 4f)
                curveTo(7.77598f, 4f, 7.99998f, 4.224f, 7.99998f, 4.5f)
                verticalLineTo(9.293f)
                lineTo(9.14598f, 8.147f)
                curveTo(9.24398f, 8.049f, 9.37198f, 8.001f, 9.49998f, 8.001f)
                curveTo(9.62798f, 8.001f, 9.75598f, 8.05f, 9.85398f, 8.147f)
                curveTo(10.049f, 8.342f, 10.049f, 8.659f, 9.85398f, 8.854f)
                close()
            }
        }.build()
        
        return _ArrowSmallDown!!
    }

private var _ArrowSmallDown: ImageVector? = null

