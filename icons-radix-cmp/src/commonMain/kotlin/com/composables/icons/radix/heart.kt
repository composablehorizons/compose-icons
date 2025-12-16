package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Heart: ImageVector
    get() {
        if (_Heart != null) return _Heart!!
        
        _Heart = ImageVector.Builder(
            name = "heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.1064f, 1.35248f)
                curveTo(12.0638f, 1.35248f, 13.6473f, 2.94492f, 13.6474f, 4.90521f)
                curveTo(13.6474f, 6.7403f, 12.6009f, 8.50547f, 11.4003f, 9.96967f)
                curveTo(10.1894f, 11.4465f, 8.74654f, 12.7053f, 7.83295f, 13.5204f)
                curveTo(7.66692f, 13.6686f, 7.42664f, 13.6873f, 7.24213f, 13.5761f)
                lineTo(7.16693f, 13.5204f)
                curveTo(6.25332f, 12.7053f, 4.81048f, 11.4465f, 3.59955f, 9.96967f)
                curveTo(2.39901f, 8.50547f, 1.35248f, 6.7403f, 1.35248f, 4.90521f)
                curveTo(1.35254f, 2.94492f, 2.93607f, 1.35248f, 4.89349f, 1.35248f)
                curveTo(6.00828f, 1.35249f, 6.73512f, 1.76016f, 7.20892f, 2.29486f)
                curveTo(7.3207f, 2.42103f, 7.41678f, 2.55386f, 7.49994f, 2.68549f)
                curveTo(7.58311f, 2.55384f, 7.67916f, 2.42105f, 7.79095f, 2.29486f)
                curveTo(8.26473f, 1.76015f, 8.99164f, 1.35253f, 10.1064f, 1.35248f)
                close()
                moveTo(10.1064f, 2.35248f)
                curveTo(9.27088f, 2.35252f, 8.81923f, 2.64293f, 8.53998f, 2.95795f)
                curveTo(8.23362f, 3.30375f, 8.10371f, 3.70259f, 7.96185f, 4.04584f)
                curveTo(7.88455f, 4.23285f, 7.7023f, 4.35541f, 7.49994f, 4.35541f)
                curveTo(7.2976f, 4.35538f, 7.11531f, 4.23284f, 7.03802f, 4.04584f)
                curveTo(6.89617f, 3.70259f, 6.76625f, 3.30374f, 6.4599f, 2.95795f)
                curveTo(6.18063f, 2.64294f, 5.72904f, 2.35249f, 4.89349f, 2.35248f)
                curveTo(3.49202f, 2.35248f, 2.35254f, 3.49353f, 2.35248f, 4.90521f)
                curveTo(2.35248f, 6.38153f, 3.20998f, 7.91647f, 4.37299f, 9.3349f)
                curveTo(5.39394f, 10.5801f, 6.5947f, 11.668f, 7.49994f, 12.4755f)
                curveTo(8.40519f, 11.668f, 9.60687f, 10.5801f, 10.6279f, 9.3349f)
                curveTo(11.7907f, 7.91658f, 12.6474f, 6.38139f, 12.6474f, 4.90521f)
                curveTo(12.6473f, 3.49353f, 11.5079f, 2.35248f, 10.1064f, 2.35248f)
                close()
            }
        }.build()
        
        return _Heart!!
    }

private var _Heart: ImageVector? = null

