package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Heading: ImageVector
    get() {
        if (_Heading != null) return _Heading!!
        
        _Heading = ImageVector.Builder(
            name = "heading",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.34534f, 2.05997f)
                curveTo(6.55018f, 2.10209f, 6.70471f, 2.28309f, 6.70471f, 2.5004f)
                curveTo(6.70462f, 2.71765f, 6.55015f, 2.89874f, 6.34534f, 2.94083f)
                lineTo(6.25452f, 2.95059f)
                horizontalLineTo(5.04944f)
                verticalLineTo(7.0502f)
                horizontalLineTo(9.94983f)
                verticalLineTo(2.95059f)
                horizontalLineTo(8.75452f)
                curveTo(8.50605f, 2.95059f, 8.30443f, 2.74884f, 8.30432f, 2.5004f)
                curveTo(8.30432f, 2.25187f, 8.50599f, 2.0502f, 8.75452f, 2.0502f)
                horizontalLineTo(12.2545f)
                lineTo(12.3453f, 2.05997f)
                curveTo(12.5502f, 2.10209f, 12.7047f, 2.28309f, 12.7047f, 2.5004f)
                curveTo(12.7046f, 2.71765f, 12.5502f, 2.89874f, 12.3453f, 2.94083f)
                lineTo(12.2545f, 2.95059f)
                horizontalLineTo(11.0494f)
                verticalLineTo(12.0502f)
                horizontalLineTo(12.2545f)
                lineTo(12.3453f, 12.06f)
                curveTo(12.5502f, 12.1021f, 12.7047f, 12.2831f, 12.7047f, 12.5004f)
                curveTo(12.7046f, 12.7176f, 12.5502f, 12.8987f, 12.3453f, 12.9408f)
                lineTo(12.2545f, 12.9506f)
                horizontalLineTo(8.75452f)
                curveTo(8.50605f, 12.9506f, 8.30443f, 12.7488f, 8.30432f, 12.5004f)
                curveTo(8.30432f, 12.2519f, 8.50599f, 12.0502f, 8.75452f, 12.0502f)
                horizontalLineTo(9.94983f)
                verticalLineTo(7.95059f)
                horizontalLineTo(5.04944f)
                verticalLineTo(12.0502f)
                horizontalLineTo(6.25452f)
                lineTo(6.34534f, 12.06f)
                curveTo(6.55018f, 12.1021f, 6.70471f, 12.2831f, 6.70471f, 12.5004f)
                curveTo(6.70462f, 12.7176f, 6.55015f, 12.8987f, 6.34534f, 12.9408f)
                lineTo(6.25452f, 12.9506f)
                horizontalLineTo(2.75452f)
                curveTo(2.50605f, 12.9506f, 2.30443f, 12.7488f, 2.30432f, 12.5004f)
                curveTo(2.30432f, 12.2519f, 2.50599f, 12.0502f, 2.75452f, 12.0502f)
                horizontalLineTo(3.94983f)
                verticalLineTo(2.95059f)
                horizontalLineTo(2.75452f)
                curveTo(2.50605f, 2.95059f, 2.30443f, 2.74884f, 2.30432f, 2.5004f)
                curveTo(2.30432f, 2.25187f, 2.50599f, 2.0502f, 2.75452f, 2.0502f)
                horizontalLineTo(6.25452f)
                lineTo(6.34534f, 2.05997f)
                close()
            }
        }.build()
        
        return _Heading!!
    }

private var _Heading: ImageVector? = null

