package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.EyeOpen: ImageVector
    get() {
        if (_EyeOpen != null) return _EyeOpen!!
        
        _EyeOpen = ImageVector.Builder(
            name = "eye-open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.50002f, 3f)
                curveTo(10.6922f, 3f, 13.3435f, 4.70671f, 14.9239f, 7.23535f)
                curveTo(15.0124f, 7.37717f, 15.0235f, 7.55201f, 14.9571f, 7.70215f)
                lineTo(14.9239f, 7.76465f)
                curveTo(13.3435f, 10.2933f, 10.6922f, 12f, 7.50002f, 12f)
                curveTo(4.30788f, 12f, 1.65659f, 10.2933f, 0.0761963f, 7.76465f)
                curveTo(-0.0249881f, 7.6026f, -0.0249956f, 7.3974f, 0.0761963f, 7.23535f)
                lineTo(0.227563f, 7f)
                curveTo(1.82294f, 4.60122f, 4.4078f, 3f, 7.50002f, 3f)
                close()
                moveTo(7.50002f, 4f)
                curveTo(4.80354f, 4f, 2.53299f, 5.37905f, 1.09963f, 7.5f)
                curveTo(2.53299f, 9.62094f, 4.80354f, 11f, 7.50002f, 11f)
                curveTo(10.1963f, 11f, 12.4661f, 9.62068f, 13.8994f, 7.5f)
                curveTo(12.4661f, 5.3793f, 10.1963f, 4f, 7.50002f, 4f)
                close()
                moveTo(7.50002f, 5.5f)
                curveTo(8.60459f, 5.5f, 9.50002f, 6.39543f, 9.50002f, 7.5f)
                curveTo(9.50002f, 8.60457f, 8.60459f, 9.5f, 7.50002f, 9.5f)
                curveTo(6.39545f, 9.5f, 5.50002f, 8.60457f, 5.50002f, 7.5f)
                curveTo(5.50002f, 6.39543f, 6.39545f, 5.5f, 7.50002f, 5.5f)
                close()
            }
        }.build()
        
        return _EyeOpen!!
    }

private var _EyeOpen: ImageVector? = null

