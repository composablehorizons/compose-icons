package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Reload: ImageVector
    get() {
        if (_Reload != null) return _Reload!!
        
        _Reload = ImageVector.Builder(
            name = "reload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.50037f, 0.850006f)
                curveTo(10.6644f, 0.850189f, 12.2943f, 3.06869f, 12.9994f, 4.31094f)
                lineTo(13.0004f, 4.31192f)
                verticalLineTo(2.5004f)
                curveTo(13.0004f, 2.22425f, 13.2242f, 2.0004f, 13.5004f, 2.0004f)
                curveTo(13.7763f, 2.00059f, 14.0004f, 2.22438f, 14.0004f, 2.5004f)
                verticalLineTo(5.5004f)
                curveTo(14.0002f, 5.77625f, 13.7762f, 6.0002f, 13.5004f, 6.0004f)
                horizontalLineTo(10.5004f)
                curveTo(10.2243f, 6.0004f, 10.0006f, 5.77637f, 10.0004f, 5.5004f)
                curveTo(10.0004f, 5.22425f, 10.2242f, 5.0004f, 10.5004f, 5.0004f)
                horizontalLineTo(12.2328f)
                lineTo(12.1215f, 4.79239f)
                curveTo(11.4802f, 3.66597f, 10.1107f, 1.85019f, 7.50037f, 1.85001f)
                curveTo(4.06019f, 1.85001f, 1.84998f, 4.665f, 1.84998f, 7.5004f)
                curveTo(1.85018f, 10.3357f, 4.06034f, 13.1498f, 7.50037f, 13.1498f)
                curveTo(9.16525f, 13.1497f, 10.5296f, 12.496f, 11.5013f, 11.5072f)
                lineTo(11.6927f, 11.3031f)
                curveTo(12.126f, 10.8159f, 12.4715f, 10.2575f, 12.7172f, 9.66055f)
                lineTo(12.765f, 9.57071f)
                curveTo(12.8948f, 9.37795f, 13.1462f, 9.2963f, 13.3695f, 9.38809f)
                curveTo(13.6248f, 9.49314f, 13.7468f, 9.78515f, 13.642f, 10.0404f)
                lineTo(13.5111f, 10.3373f)
                curveTo(13.2362f, 10.9247f, 12.877f, 11.4767f, 12.4398f, 11.9682f)
                lineTo(12.2142f, 12.2084f)
                curveTo(11.062f, 13.3807f, 9.44396f, 14.1497f, 7.50037f, 14.1498f)
                curveTo(3.43771f, 14.1498f, 0.850179f, 10.8149f, 0.849976f, 7.5004f)
                curveTo(0.849976f, 4.1858f, 3.43755f, 0.850006f, 7.50037f, 0.850006f)
                close()
            }
        }.build()
        
        return _Reload!!
    }

private var _Reload: ImageVector? = null

