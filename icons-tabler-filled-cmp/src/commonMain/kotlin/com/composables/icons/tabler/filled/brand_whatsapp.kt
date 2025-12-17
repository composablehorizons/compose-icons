package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BrandWhatsapp: ImageVector
    get() {
        if (_BrandWhatsapp != null) return _BrandWhatsapp!!
        
        _BrandWhatsapp = ImageVector.Builder(
            name = "brand-whatsapp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.497f, 4.409f)
                arcToRelative(10f, 10f, 0f, false, true, -10.36f, 16.828f)
                lineToRelative(-0.223f, -0.098f)
                lineToRelative(-4.759f, 0.849f)
                lineToRelative(-0.11f, 0.011f)
                arcToRelative(1f, 1f, 0f, false, true, -0.11f, 0f)
                lineToRelative(-0.102f, -0.013f)
                lineToRelative(-0.108f, -0.024f)
                lineToRelative(-0.105f, -0.037f)
                lineToRelative(-0.099f, -0.047f)
                lineToRelative(-0.093f, -0.058f)
                lineToRelative(-0.014f, -0.011f)
                lineToRelative(-0.012f, -0.007f)
                lineToRelative(-0.086f, -0.073f)
                lineToRelative(-0.077f, -0.08f)
                lineToRelative(-0.067f, -0.088f)
                lineToRelative(-0.056f, -0.094f)
                lineToRelative(-0.034f, -0.07f)
                lineToRelative(-0.04f, -0.108f)
                lineToRelative(-0.028f, -0.128f)
                lineToRelative(-0.012f, -0.102f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -0.125f)
                lineToRelative(0.012f, -0.1f)
                lineToRelative(0.024f, -0.11f)
                lineToRelative(0.045f, -0.122f)
                lineToRelative(1.433f, -3.304f)
                lineToRelative(-0.009f, -0.014f)
                arcToRelative(10f, 10f, 0f, false, true, 1.549f, -12.454f)
                lineToRelative(0.215f, -0.203f)
                arcToRelative(10f, 10f, 0f, false, true, 13.226f, -0.217f)
                moveToRelative(-8.997f, 3.09f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(1f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, 6f)
                horizontalLineToRelative(1f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, -3f)
                horizontalLineToRelative(-1f)
                lineToRelative(-0.144f, 0.007f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.128f, 0.697f)
                lineToRelative(-0.042f, 0.074f)
                lineToRelative(-0.022f, -0.007f)
                arcToRelative(4.01f, 4.01f, 0f, false, true, -2.435f, -2.435f)
                lineToRelative(-0.008f, -0.023f)
                lineToRelative(0.075f, -0.041f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0.704f, -1.272f)
                verticalLineToRelative(-1f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.5f, -1.5f)
            }
        }.build()
        
        return _BrandWhatsapp!!
    }

private var _BrandWhatsapp: ImageVector? = null

