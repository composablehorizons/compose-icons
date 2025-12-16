package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ExclamationTriangle: ImageVector
    get() {
        if (_ExclamationTriangle != null) return _ExclamationTriangle!!
        
        _ExclamationTriangle = ImageVector.Builder(
            name = "exclamation-triangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.64204f, 0.483078f)
                curveTo(7.10887f, -0.10392f, 8.04464f, -0.0624346f, 8.44477f, 0.608078f)
                lineTo(14.8393f, 11.3366f)
                curveTo(15.2761f, 12.0697f, 14.7473f, 12.9995f, 13.894f, 12.9997f)
                horizontalLineTo(1.1059f)
                curveTo(0.252569f, 12.9994f, -0.275364f, 12.0697f, 0.161567f, 11.3366f)
                lineTo(6.55512f, 0.608078f)
                lineTo(6.64204f, 0.483078f)
                close()
                moveTo(7.45161f, 1.08366f)
                lineTo(7.4145f, 1.12077f)
                lineTo(1.01997f, 11.8483f)
                curveTo(0.980388f, 11.9148f, 1.02858f, 11.9994f, 1.1059f, 11.9997f)
                horizontalLineTo(13.894f)
                curveTo(13.9714f, 11.9995f, 14.0196f, 11.9149f, 13.9799f, 11.8483f)
                lineTo(7.58637f, 1.12077f)
                curveTo(7.55727f, 1.07208f, 7.49625f, 1.05933f, 7.45161f, 1.08366f)
                close()
                moveTo(7.49946f, 9.72624f)
                curveTo(7.91367f, 9.72624f, 8.24946f, 10.062f, 8.24946f, 10.4762f)
                curveTo(8.24933f, 10.8903f, 7.91359f, 11.2262f, 7.49946f, 11.2262f)
                curveTo(7.08549f, 11.226f, 6.74958f, 10.8902f, 6.74946f, 10.4762f)
                curveTo(6.74946f, 10.0622f, 7.08542f, 9.72645f, 7.49946f, 9.72624f)
                close()
                moveTo(7.49946f, 3.78679f)
                curveTo(7.88158f, 3.78679f, 8.1879f, 4.10418f, 8.17329f, 4.48601f)
                lineTo(8.01899f, 8.48698f)
                curveTo(8.00826f, 8.76597f, 7.77866f, 8.98698f, 7.49946f, 8.98698f)
                curveTo(7.22048f, 8.98673f, 6.99163f, 8.76581f, 6.9809f, 8.48698f)
                lineTo(6.82661f, 4.48601f)
                curveTo(6.812f, 4.10434f, 7.11756f, 3.78706f, 7.49946f, 3.78679f)
                close()
            }
        }.build()
        
        return _ExclamationTriangle!!
    }

private var _ExclamationTriangle: ImageVector? = null

