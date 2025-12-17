package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Gripfire: ImageVector
    get() {
        if (_Gripfire != null) return _Gripfire!!
        
        _Gripfire = ImageVector.Builder(
            name = "gripfire",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(112.5f, 301.4f)
                curveToRelative(0f, -73.8f, 105.1f, -122.5f, 105.1f, -203f)
                curveToRelative(0f, -47.1f, -34f, -88f, -39.1f, -90.4f)
                curveToRelative(0.4f, 3.3f, 0.6f, 6.7f, 0.6f, 10f)
                curveTo(179.1f, 110.1f, 32f, 171.9f, 32f, 286.6f)
                curveToRelative(0f, 49.8f, 32.2f, 79.2f, 66.5f, 108.3f)
                curveToRelative(65.1f, 46.7f, 78.1f, 71.4f, 78.1f, 86.6f)
                curveToRelative(0f, 10.1f, -4.8f, 17f, -4.8f, 22.3f)
                curveToRelative(13.1f, -16.7f, 17.4f, -31.9f, 17.5f, -46.4f)
                curveToRelative(0f, -29.6f, -21.7f, -56.3f, -44.2f, -86.5f)
                curveToRelative(-16f, -22.3f, -32.6f, -42.6f, -32.6f, -69.5f)
                close()
                moveToRelative(205.3f, -39f)
                curveToRelative(-12.1f, -66.8f, -78f, -124.4f, -94.7f, -130.9f)
                lineToRelative(4f, 7.2f)
                curveToRelative(2.4f, 5.1f, 3.4f, 10.9f, 3.4f, 17.1f)
                curveToRelative(0f, 44.7f, -54.2f, 111.2f, -56.6f, 116.7f)
                curveToRelative(-2.2f, 5.1f, -3.2f, 10.5f, -3.2f, 15.8f)
                curveToRelative(0f, 20.1f, 15.2f, 42.1f, 17.9f, 42.1f)
                curveToRelative(2.4f, 0f, 56.6f, -55.4f, 58.1f, -87.7f)
                curveToRelative(6.4f, 11.7f, 9.1f, 22.6f, 9.1f, 33.4f)
                curveToRelative(0f, 41.2f, -41.8f, 96.9f, -41.8f, 96.9f)
                curveToRelative(0f, 11.6f, 31.9f, 53.2f, 35.5f, 53.2f)
                curveToRelative(1f, 0f, 2.2f, -1.4f, 3.2f, -2.4f)
                curveToRelative(37.9f, -39.3f, 67.3f, -85f, 67.3f, -136.8f)
                curveToRelative(0f, -8f, -0.7f, -16.2f, -2.2f, -24.6f)
                close()
            }
        }.build()
        
        return _Gripfire!!
    }

private var _Gripfire: ImageVector? = null

