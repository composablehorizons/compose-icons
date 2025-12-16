package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Thumbsup: ImageVector
    get() {
        if (_Thumbsup != null) return _Thumbsup!!
        
        _Thumbsup = ImageVector.Builder(
            name = "thumbsup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.999f, 6.00002f)
                horizontalLineTo(10.672f)
                lineTo(11.207f, 4.21802f)
                curveTo(11.278f, 3.98102f, 11.314f, 3.73902f, 11.314f, 3.49602f)
                curveTo(11.314f, 2.12002f, 10.192f, 0.999023f, 8.81298f, 0.999023f)
                curveTo(8.42998f, 0.999023f, 8.08498f, 1.21202f, 7.91398f, 1.55402f)
                lineTo(5.82998f, 5.72202f)
                curveTo(5.74498f, 5.89202f, 5.57398f, 5.99802f, 5.38298f, 5.99802f)
                horizontalLineTo(3.00098f)
                curveTo(1.89798f, 5.99802f, 1.00098f, 6.89502f, 1.00098f, 7.99802f)
                verticalLineTo(12.998f)
                curveTo(1.00098f, 14.101f, 1.89798f, 14.998f, 3.00098f, 14.998f)
                horizontalLineTo(11.163f)
                curveTo(12.727f, 14.998f, 13.283f, 13.796f, 13.565f, 12.893f)
                lineTo(14.908f, 8.59602f)
                curveTo(14.969f, 8.40102f, 15f, 8.19902f, 15f, 7.99602f)
                curveTo(15f, 6.89402f, 14.103f, 5.99802f, 12.999f, 5.99802f)
                verticalLineTo(6.00002f)
                close()
                moveTo(1.99998f, 13f)
                verticalLineTo(8.00002f)
                curveTo(1.99998f, 7.44902f, 2.44898f, 7.00002f, 2.99998f, 7.00002f)
                horizontalLineTo(3.99998f)
                verticalLineTo(14f)
                horizontalLineTo(2.99998f)
                curveTo(2.44898f, 14f, 1.99998f, 13.551f, 1.99998f, 13f)
                close()
                moveTo(13.954f, 8.29802f)
                lineTo(12.611f, 12.596f)
                curveTo(12.247f, 13.761f, 11.769f, 13.999f, 11.163f, 13.999f)
                horizontalLineTo(5.00098f)
                verticalLineTo(6.99902f)
                horizontalLineTo(5.38298f)
                curveTo(5.95498f, 6.99902f, 6.46898f, 6.68102f, 6.72498f, 6.17002f)
                lineTo(8.80898f, 2.00202f)
                curveTo(8.80898f, 2.00202f, 8.81098f, 2.00002f, 8.81298f, 2.00002f)
                curveTo(9.64098f, 2.00002f, 10.314f, 2.67102f, 10.314f, 3.49702f)
                curveTo(10.314f, 3.64202f, 10.292f, 3.78802f, 10.249f, 3.93202f)
                lineTo(9.52098f, 6.35702f)
                curveTo(9.47598f, 6.50802f, 9.50398f, 6.67202f, 9.59898f, 6.79902f)
                curveTo(9.69398f, 6.92602f, 9.84198f, 7.00102f, 9.99998f, 7.00102f)
                horizontalLineTo(12.999f)
                curveTo(13.551f, 7.00102f, 14f, 7.44802f, 14f, 7.99902f)
                curveTo(14f, 8.10002f, 13.984f, 8.20102f, 13.954f, 8.30002f)
                verticalLineTo(8.29802f)
                close()
            }
        }.build()
        
        return _Thumbsup!!
    }

private var _Thumbsup: ImageVector? = null

