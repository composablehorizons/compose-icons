package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.GlideG: ImageVector
    get() {
        if (_GlideG != null) return _GlideG!!
        
        _GlideG = ImageVector.Builder(
            name = "glide-g",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(407.1f, 211.2f)
                curveToRelative(-3.5f, -1.4f, -11.6f, -3.8f, -15.4f, -3.8f)
                curveToRelative(-37.1f, 0f, -62.2f, 16.8f, -93.5f, 34.5f)
                lineToRelative(-0.9f, -0.9f)
                curveToRelative(7f, -47.3f, 23.5f, -91.9f, 23.5f, -140.4f)
                curveTo(320.8f, 29.1f, 282.6f, 0f, 212.4f, 0f)
                curveTo(97.3f, 0f, 39f, 113.7f, 39f, 198.4f)
                curveTo(39f, 286.3f, 90.3f, 335f, 177.6f, 335f)
                curveToRelative(12f, 0f, 11f, -1f, 11f, 3.8f)
                curveToRelative(-16.9f, 128.9f, -90.8f, 133.1f, -90.8f, 94.6f)
                curveToRelative(0f, -39.2f, 45f, -58.6f, 45.5f, -61f)
                curveToRelative(-0.3f, -12.2f, -47f, -27.6f, -58.9f, -27.6f)
                curveToRelative(-33.9f, 0.1f, -52.4f, 51.2f, -52.4f, 79.3f)
                curveTo(32f, 476f, 64.8f, 512f, 117.5f, 512f)
                curveToRelative(77.4f, 0f, 134f, -77.8f, 151.4f, -145.4f)
                curveToRelative(15.1f, -60.5f, 11.2f, -63.3f, 19.7f, -67.6f)
                curveToRelative(32.2f, -16.2f, 57.5f, -27f, 93.8f, -27f)
                curveToRelative(17.8f, 0f, 30.5f, 3.7f, 58.9f, 8.4f)
                curveToRelative(2.9f, 0f, 6.7f, -2.9f, 6.7f, -5.8f)
                curveToRelative(0f, -8f, -33.4f, -60.5f, -40.9f, -63.4f)
                close()
                moveToRelative(-175.3f, -84.4f)
                curveToRelative(-9.3f, 44.7f, -18.6f, 89.6f, -27.8f, 134.3f)
                curveToRelative(-2.3f, 10.2f, -13.3f, 7.8f, -22f, 7.8f)
                curveToRelative(-38.3f, 0f, -49f, -41.8f, -49f, -73.1f)
                curveToRelative(0f, -47f, 18f, -109.3f, 61.8f, -133.4f)
                curveToRelative(7f, -4.1f, 14.8f, -6.7f, 22.6f, -6.7f)
                curveToRelative(18.6f, 0f, 20f, 13.3f, 20f, 28.7f)
                curveToRelative(-0.1f, 14.3f, -2.7f, 28.5f, -5.6f, 42.4f)
                close()
            }
        }.build()
        
        return _GlideG!!
    }

private var _GlideG: ImageVector? = null

