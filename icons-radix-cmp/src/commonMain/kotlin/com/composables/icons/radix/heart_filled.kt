package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.HeartFilled: ImageVector
    get() {
        if (_HeartFilled != null) return _HeartFilled!!
        
        _HeartFilled = ImageVector.Builder(
            name = "heart-filled",
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
                curveTo(10.2633f, 11.3564f, 8.92163f, 12.5507f, 8.0058f, 13.3661f)
                curveTo(7.94628f, 13.4191f, 7.88869f, 13.4707f, 7.83295f, 13.5204f)
                curveTo(7.64328f, 13.6897f, 7.35659f, 13.6897f, 7.16693f, 13.5204f)
                curveTo(7.11121f, 13.4707f, 7.05356f, 13.4191f, 6.99408f, 13.3661f)
                curveTo(6.07823f, 12.5507f, 4.73659f, 11.3563f, 3.59955f, 9.96967f)
                curveTo(2.39901f, 8.50547f, 1.35248f, 6.7403f, 1.35248f, 4.90521f)
                curveTo(1.35254f, 2.94492f, 2.93607f, 1.35248f, 4.89349f, 1.35248f)
                curveTo(6.2577f, 1.35249f, 6.8605f, 1.92341f, 7.49994f, 2.93549f)
                curveTo(8.13935f, 1.92344f, 8.74229f, 1.35253f, 10.1064f, 1.35248f)
                close()
            }
        }.build()
        
        return _HeartFilled!!
    }

private var _HeartFilled: ImageVector? = null

