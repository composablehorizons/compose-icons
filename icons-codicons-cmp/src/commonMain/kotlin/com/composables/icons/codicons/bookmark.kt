package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Bookmark: ImageVector
    get() {
        if (_Bookmark != null) return _Bookmark!!
        
        _Bookmark = ImageVector.Builder(
            name = "bookmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.77942f, 13.9187f)
                curveTo(3.44716f, 14.1405f, 3.00177f, 13.9024f, 3.00177f, 13.5029f)
                verticalLineTo(4.01167f)
                curveTo(3.00177f, 2.9085f, 3.89502f, 2.01365f, 4.99819f, 2.01168f)
                lineTo(10.9982f, 2.00092f)
                curveTo(12.1028f, 1.99895f, 12.9998f, 2.89277f, 13.0018f, 3.99734f)
                verticalLineTo(13.5029f)
                curveTo(13.0018f, 13.9024f, 12.5564f, 14.1405f, 12.2241f, 13.9187f)
                lineTo(8.00177f, 11.0994f)
                lineTo(3.77942f, 13.9187f)
                close()
                moveTo(12.0018f, 4.00092f)
                lineTo(11.9948f, 3.88252f)
                curveTo(11.9362f, 3.38529f, 11.5128f, 3.00001f, 11f, 3.00092f)
                lineTo(4.99998f, 3.01168f)
                curveTo(4.44839f, 3.01266f, 4.00177f, 3.46009f, 4.00177f, 4.01167f)
                verticalLineTo(12.5678f)
                lineTo(7.72412f, 10.0824f)
                curveTo(7.89221f, 9.97018f, 8.11133f, 9.97018f, 8.27942f, 10.0824f)
                lineTo(12.0018f, 12.5678f)
                verticalLineTo(4.00092f)
                close()
            }
        }.build()
        
        return _Bookmark!!
    }

private var _Bookmark: ImageVector? = null

