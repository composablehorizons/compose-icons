package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Mix: ImageVector
    get() {
        if (_Mix != null) return _Mix!!
        
        _Mix = ImageVector.Builder(
            name = "mix",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.59979f, 8.82434f)
                curveTo(1.59991f, 8.32473f, 2.10284f, 7.99678f, 2.54999f, 8.17004f)
                lineTo(2.63885f, 8.21204f)
                lineTo(6.57245f, 10.3878f)
                lineTo(6.65741f, 10.4425f)
                curveTo(7.02571f, 10.7193f, 7.02591f, 11.282f, 6.65741f, 11.5587f)
                lineTo(6.57245f, 11.6134f)
                lineTo(2.63885f, 13.7892f)
                curveTo(2.17257f, 14.0469f, 1.60035f, 13.7095f, 1.59979f, 13.1769f)
                verticalLineTo(8.82434f)
                close()
                moveTo(13.0002f, 8.29993f)
                curveTo(13.3867f, 8.30002f, 13.7004f, 8.61358f, 13.7004f, 9.00012f)
                verticalLineTo(13.0001f)
                curveTo(13.7003f, 13.3866f, 13.3867f, 13.7002f, 13.0002f, 13.7003f)
                horizontalLineTo(9.00018f)
                curveTo(8.61362f, 13.7003f, 8.30004f, 13.3867f, 8.29999f, 13.0001f)
                verticalLineTo(9.00012f)
                curveTo(8.29999f, 8.61352f, 8.61358f, 8.29993f, 9.00018f, 8.29993f)
                horizontalLineTo(13.0002f)
                close()
                moveTo(2.50018f, 12.8361f)
                lineTo(5.81952f, 11.0001f)
                lineTo(2.50018f, 9.16321f)
                verticalLineTo(12.8361f)
                close()
                moveTo(9.20038f, 12.7999f)
                horizontalLineTo(12.8f)
                verticalLineTo(9.20032f)
                horizontalLineTo(9.20038f)
                verticalLineTo(12.7999f)
                close()
                moveTo(4.00018f, 1.24915f)
                curveTo(5.51931f, 1.24925f, 6.75114f, 2.48097f, 6.75116f, 4.00012f)
                curveTo(6.75105f, 5.5192f, 5.51926f, 6.75099f, 4.00018f, 6.7511f)
                curveTo(2.48103f, 6.75108f, 1.24931f, 5.51925f, 1.24921f, 4.00012f)
                curveTo(1.24922f, 2.48091f, 2.48098f, 1.24916f, 4.00018f, 1.24915f)
                close()
                moveTo(12.8068f, 1.55676f)
                curveTo(12.9826f, 1.38103f, 13.2678f, 1.38103f, 13.4435f, 1.55676f)
                curveTo(13.6191f, 1.73251f, 13.6192f, 2.01781f, 13.4435f, 2.19348f)
                lineTo(11.6369f, 4.00012f)
                lineTo(13.4435f, 5.80676f)
                lineTo(13.5012f, 5.87708f)
                curveTo(13.6165f, 6.05174f, 13.5973f, 6.2897f, 13.4435f, 6.44348f)
                curveTo(13.2898f, 6.59725f, 13.0518f, 6.61646f, 12.8771f, 6.5011f)
                lineTo(12.8068f, 6.44348f)
                lineTo(11.0002f, 4.63684f)
                lineTo(9.19354f, 6.44348f)
                curveTo(9.01787f, 6.61913f, 8.73257f, 6.61902f, 8.55682f, 6.44348f)
                curveTo(8.38109f, 6.26775f, 8.38111f, 5.9825f, 8.55682f, 5.80676f)
                lineTo(10.3635f, 4.00012f)
                lineTo(8.55682f, 2.19348f)
                lineTo(8.49921f, 2.12317f)
                curveTo(8.38371f, 1.94849f, 8.403f, 1.7106f, 8.55682f, 1.55676f)
                curveTo(8.71066f, 1.40293f, 8.94854f, 1.38364f, 9.12323f, 1.49915f)
                lineTo(9.19354f, 1.55676f)
                lineTo(11.0002f, 3.3634f)
                lineTo(12.8068f, 1.55676f)
                close()
                moveTo(4.00018f, 2.14954f)
                curveTo(2.97803f, 2.14955f, 2.14961f, 2.97797f, 2.1496f, 4.00012f)
                curveTo(2.1497f, 5.0222f, 2.97809f, 5.85069f, 4.00018f, 5.85071f)
                curveTo(5.0222f, 5.8506f, 5.85066f, 5.02214f, 5.85077f, 4.00012f)
                curveTo(5.85075f, 2.97803f, 5.02226f, 2.14964f, 4.00018f, 2.14954f)
                close()
            }
        }.build()
        
        return _Mix!!
    }

private var _Mix: ImageVector? = null

