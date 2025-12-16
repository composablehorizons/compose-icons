package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Image: ImageVector
    get() {
        if (_Image != null) return _Image!!
        
        _Image = ImageVector.Builder(
            name = "image",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 1f)
                curveTo(13.3284f, 1f, 14f, 1.67157f, 14f, 2.5f)
                verticalLineTo(12.5f)
                curveTo(14f, 13.3284f, 13.3284f, 14f, 12.5f, 14f)
                horizontalLineTo(2.5f)
                curveTo(1.72334f, 14f, 1.08461f, 13.4097f, 1.00781f, 12.6533f)
                lineTo(1f, 12.5f)
                verticalLineTo(2.5f)
                curveTo(1f, 1.67157f, 1.67157f, 1f, 2.5f, 1f)
                horizontalLineTo(12.5f)
                close()
                moveTo(2f, 9.63574f)
                verticalLineTo(12.5f)
                lineTo(2.00977f, 12.6006f)
                curveTo(2.04966f, 12.7961f, 2.20392f, 12.9503f, 2.39941f, 12.9902f)
                lineTo(2.5f, 13f)
                horizontalLineTo(8.94141f)
                lineTo(7.52832f, 11.4395f)
                verticalLineTo(11.4385f)
                lineTo(3.98828f, 7.64746f)
                lineTo(2f, 9.63574f)
                close()
                moveTo(8.4834f, 11.1523f)
                lineTo(10.1553f, 13f)
                horizontalLineTo(12.5f)
                lineTo(12.6006f, 12.9902f)
                curveTo(12.7961f, 12.9503f, 12.9503f, 12.7961f, 12.9902f, 12.6006f)
                lineTo(13f, 12.5f)
                verticalLineTo(10.6367f)
                lineTo(11f, 8.63672f)
                lineTo(8.4834f, 11.1523f)
                close()
                moveTo(2.39941f, 2.00977f)
                curveTo(2.17145f, 2.05629f, 2f, 2.25829f, 2f, 2.5f)
                verticalLineTo(8.36328f)
                lineTo(3.68164f, 6.68164f)
                lineTo(3.75195f, 6.625f)
                curveTo(3.82721f, 6.57522f, 3.91621f, 6.54823f, 4.00781f, 6.5498f)
                curveTo(4.1298f, 6.55192f, 4.24585f, 6.60417f, 4.3291f, 6.69336f)
                lineTo(7.87305f, 10.4893f)
                lineTo(10.6816f, 7.68164f)
                lineTo(10.752f, 7.62402f)
                curveTo(10.9266f, 7.50851f, 11.1645f, 7.5278f, 11.3184f, 7.68164f)
                lineTo(13f, 9.36328f)
                verticalLineTo(2.5f)
                curveTo(13f, 2.25829f, 12.8286f, 2.05629f, 12.6006f, 2.00977f)
                lineTo(12.5f, 2f)
                horizontalLineTo(2.5f)
                lineTo(2.39941f, 2.00977f)
                close()
                moveTo(7.5f, 3.74902f)
                curveTo(8.46693f, 3.74902f, 9.25098f, 4.53307f, 9.25098f, 5.5f)
                curveTo(9.25098f, 6.46693f, 8.46693f, 7.25098f, 7.5f, 7.25098f)
                curveTo(6.53307f, 7.25098f, 5.74902f, 6.46693f, 5.74902f, 5.5f)
                curveTo(5.74902f, 4.53307f, 6.53307f, 3.74902f, 7.5f, 3.74902f)
                close()
                moveTo(7.5f, 4.64941f)
                curveTo(7.03013f, 4.64941f, 6.64941f, 5.03013f, 6.64941f, 5.5f)
                curveTo(6.64941f, 5.96987f, 7.03013f, 6.35059f, 7.5f, 6.35059f)
                curveTo(7.96987f, 6.35059f, 8.35059f, 5.96987f, 8.35059f, 5.5f)
                curveTo(8.35059f, 5.03013f, 7.96987f, 4.64941f, 7.5f, 4.64941f)
                close()
            }
        }.build()
        
        return _Image!!
    }

private var _Image: ImageVector? = null

