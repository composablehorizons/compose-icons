package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Whatsapp: ImageVector
    get() {
        if (_Whatsapp != null) return _Whatsapp!!
        
        _Whatsapp = ImageVector.Builder(
            name = "whatsapp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380.9f, 97.1f)
                curveTo(339f, 55.1f, 283.2f, 32f, 223.9f, 32f)
                curveToRelative(-122.4f, 0f, -222f, 99.6f, -222f, 222f)
                curveToRelative(0f, 39.1f, 10.2f, 77.3f, 29.6f, 111f)
                lineTo(0f, 480f)
                lineToRelative(117.7f, -30.9f)
                curveToRelative(32.4f, 17.7f, 68.9f, 27f, 106.1f, 27f)
                horizontalLineToRelative(0.1f)
                curveToRelative(122.3f, 0f, 224.1f, -99.6f, 224.1f, -222f)
                curveToRelative(0f, -59.3f, -25.2f, -115f, -67.1f, -157f)
                close()
                moveToRelative(-157f, 341.6f)
                curveToRelative(-33.2f, 0f, -65.7f, -8.9f, -94f, -25.7f)
                lineToRelative(-6.7f, -4f)
                lineToRelative(-69.8f, 18.3f)
                lineTo(72f, 359.2f)
                lineToRelative(-4.4f, -7f)
                curveToRelative(-18.5f, -29.4f, -28.2f, -63.3f, -28.2f, -98.2f)
                curveToRelative(0f, -101.7f, 82.8f, -184.5f, 184.6f, -184.5f)
                curveToRelative(49.3f, 0f, 95.6f, 19.2f, 130.4f, 54.1f)
                curveToRelative(34.8f, 34.9f, 56.2f, 81.2f, 56.1f, 130.5f)
                curveToRelative(0f, 101.8f, -84.9f, 184.6f, -186.6f, 184.6f)
                close()
                moveToRelative(101.2f, -138.2f)
                curveToRelative(-5.5f, -2.8f, -32.8f, -16.2f, -37.9f, -18f)
                curveToRelative(-5.1f, -1.9f, -8.8f, -2.8f, -12.5f, 2.8f)
                curveToRelative(-3.7f, 5.6f, -14.3f, 18f, -17.6f, 21.8f)
                curveToRelative(-3.2f, 3.7f, -6.5f, 4.2f, -12f, 1.4f)
                curveToRelative(-32.6f, -16.3f, -54f, -29.1f, -75.5f, -66f)
                curveToRelative(-5.7f, -9.8f, 5.7f, -9.1f, 16.3f, -30.3f)
                curveToRelative(1.8f, -3.7f, 0.9f, -6.9f, -0.5f, -9.7f)
                curveToRelative(-1.4f, -2.8f, -12.5f, -30.1f, -17.1f, -41.2f)
                curveToRelative(-4.5f, -10.8f, -9.1f, -9.3f, -12.5f, -9.5f)
                curveToRelative(-3.2f, -0.2f, -6.9f, -0.2f, -10.6f, -0.2f)
                curveToRelative(-3.7f, 0f, -9.7f, 1.4f, -14.8f, 6.9f)
                curveToRelative(-5.1f, 5.6f, -19.4f, 19f, -19.4f, 46.3f)
                curveToRelative(0f, 27.3f, 19.9f, 53.7f, 22.6f, 57.4f)
                curveToRelative(2.8f, 3.7f, 39.1f, 59.7f, 94.8f, 83.8f)
                curveToRelative(35.2f, 15.2f, 49f, 16.5f, 66.6f, 13.9f)
                curveToRelative(10.7f, -1.6f, 32.8f, -13.4f, 37.4f, -26.4f)
                curveToRelative(4.6f, -13f, 4.6f, -24.1f, 3.2f, -26.4f)
                curveToRelative(-1.3f, -2.5f, -5f, -3.9f, -10.5f, -6.6f)
                close()
            }
        }.build()
        
        return _Whatsapp!!
    }

private var _Whatsapp: ImageVector? = null

