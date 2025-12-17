package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Indent: ImageVector
    get() {
        if (_Indent != null) return _Indent!!
        
        _Indent = ImageVector.Builder(
            name = "indent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.50002f, 3f)
                curveTo(2.77602f, 3f, 3.00002f, 3.224f, 3.00002f, 3.5f)
                verticalLineTo(6.5f)
                curveTo(3.00002f, 7.327f, 3.67302f, 8f, 4.50002f, 8f)
                horizontalLineTo(12.293f)
                lineTo(9.64702f, 5.354f)
                curveTo(9.45202f, 5.159f, 9.45202f, 4.842f, 9.64702f, 4.647f)
                curveTo(9.84202f, 4.452f, 10.159f, 4.452f, 10.354f, 4.647f)
                lineTo(13.854f, 8.147f)
                curveTo(14.049f, 8.342f, 14.049f, 8.659f, 13.854f, 8.854f)
                lineTo(10.354f, 12.354f)
                curveTo(10.256f, 12.452f, 10.128f, 12.5f, 10f, 12.5f)
                curveTo(9.87202f, 12.5f, 9.74402f, 12.451f, 9.64602f, 12.354f)
                curveTo(9.45102f, 12.159f, 9.45102f, 11.842f, 9.64602f, 11.647f)
                lineTo(12.292f, 9.001f)
                horizontalLineTo(4.49902f)
                curveTo(3.12002f, 9.001f, 1.99902f, 7.88f, 1.99902f, 6.501f)
                verticalLineTo(3.501f)
                curveTo(1.99902f, 3.225f, 2.22302f, 3.001f, 2.49902f, 3.001f)
                lineTo(2.50002f, 3f)
                close()
            }
        }.build()
        
        return _Indent!!
    }

private var _Indent: ImageVector? = null

