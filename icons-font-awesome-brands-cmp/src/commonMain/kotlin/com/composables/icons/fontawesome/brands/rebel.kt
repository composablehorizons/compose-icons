package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Rebel: ImageVector
    get() {
        if (_Rebel != null) return _Rebel!!
        
        _Rebel = ImageVector.Builder(
            name = "rebel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256.5f, 504f)
                curveTo(117.2f, 504f, 9f, 387.8f, 13.2f, 249.9f)
                curveTo(16f, 170.7f, 56.4f, 97.7f, 129.7f, 49.5f)
                curveToRelative(0.3f, 0f, 1.9f, -0.6f, 1.1f, 0.8f)
                curveToRelative(-5.8f, 5.5f, -111.3f, 129.8f, -14.1f, 226.4f)
                curveToRelative(49.8f, 49.5f, 90f, 2.5f, 90f, 2.5f)
                curveToRelative(38.5f, -50.1f, -0.6f, -125.9f, -0.6f, -125.9f)
                curveToRelative(-10f, -24.9f, -45.7f, -40.1f, -45.7f, -40.1f)
                lineToRelative(28.8f, -31.8f)
                curveToRelative(24.4f, 10.5f, 43.2f, 38.7f, 43.2f, 38.7f)
                curveToRelative(0.8f, -29.6f, -21.9f, -61.4f, -21.9f, -61.4f)
                lineTo(255.1f, 8f)
                lineToRelative(44.3f, 50.1f)
                curveToRelative(-20.5f, 28.8f, -21.9f, 62.6f, -21.9f, 62.6f)
                curveToRelative(13.8f, -23f, 43.5f, -39.3f, 43.5f, -39.3f)
                lineToRelative(28.5f, 31.8f)
                curveToRelative(-27.4f, 8.9f, -45.4f, 39.9f, -45.4f, 39.9f)
                curveToRelative(-15.8f, 28.5f, -27.1f, 89.4f, 0.6f, 127.3f)
                curveToRelative(32.4f, 44.6f, 87.7f, -2.8f, 87.7f, -2.8f)
                curveToRelative(102.7f, -91.9f, -10.5f, -225f, -10.5f, -225f)
                curveToRelative(-6.1f, -5.5f, 0.8f, -2.8f, 0.8f, -2.8f)
                curveToRelative(50.1f, 36.5f, 114.6f, 84.4f, 116.2f, 204.8f)
                curveTo(500.9f, 400.2f, 399f, 504f, 256.5f, 504f)
                close()
            }
        }.build()
        
        return _Rebel!!
    }

private var _Rebel: ImageVector? = null

