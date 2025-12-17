package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ArrowSmallRight: ImageVector
    get() {
        if (_ArrowSmallRight != null) return _ArrowSmallRight!!
        
        _ArrowSmallRight = ImageVector.Builder(
            name = "arrow-small-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.854f, 9.85398f)
                lineTo(10.854f, 7.85398f)
                curveTo(11.049f, 7.65898f, 11.049f, 7.34198f, 10.854f, 7.14698f)
                lineTo(8.854f, 5.14698f)
                curveTo(8.659f, 4.95198f, 8.342f, 4.95198f, 8.147f, 5.14698f)
                curveTo(7.952f, 5.34198f, 7.952f, 5.65898f, 8.147f, 5.85398f)
                lineTo(9.293f, 6.99998f)
                horizontalLineTo(4.5f)
                curveTo(4.224f, 6.99998f, 4f, 7.22398f, 4f, 7.49998f)
                curveTo(4f, 7.77598f, 4.224f, 7.99998f, 4.5f, 7.99998f)
                horizontalLineTo(9.293f)
                lineTo(8.147f, 9.14598f)
                curveTo(8.049f, 9.24398f, 8.001f, 9.37198f, 8.001f, 9.49998f)
                curveTo(8.001f, 9.62798f, 8.05f, 9.75598f, 8.147f, 9.85398f)
                curveTo(8.342f, 10.049f, 8.659f, 10.049f, 8.854f, 9.85398f)
                close()
            }
        }.build()
        
        return _ArrowSmallRight!!
    }

private var _ArrowSmallRight: ImageVector? = null

