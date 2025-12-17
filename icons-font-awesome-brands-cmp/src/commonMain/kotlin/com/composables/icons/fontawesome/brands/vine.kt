package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Vine: ImageVector
    get() {
        if (_Vine != null) return _Vine!!
        
        _Vine = ImageVector.Builder(
            name = "vine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(384f, 254.7f)
                verticalLineToRelative(52.1f)
                curveToRelative(-18.4f, 4.2f, -36.9f, 6.1f, -52.1f, 6.1f)
                curveToRelative(-36.9f, 77.4f, -103f, 143.8f, -125.1f, 156.2f)
                curveToRelative(-14f, 7.9f, -27.1f, 8.4f, -42.7f, -0.8f)
                curveTo(137f, 452f, 34.2f, 367.7f, 0f, 102.7f)
                horizontalLineToRelative(74.5f)
                curveTo(93.2f, 261.8f, 139f, 343.4f, 189.3f, 404.5f)
                curveToRelative(27.9f, -27.9f, 54.8f, -65.1f, 75.6f, -106.9f)
                curveToRelative(-49.8f, -25.3f, -80.1f, -80.9f, -80.1f, -145.6f)
                curveToRelative(0f, -65.6f, 37.7f, -115.1f, 102.2f, -115.1f)
                curveToRelative(114.9f, 0f, 106.2f, 127.9f, 81.6f, 181.5f)
                curveToRelative(0f, 0f, -46.4f, 9.2f, -63.5f, -20.5f)
                curveToRelative(3.4f, -11.3f, 8.2f, -30.8f, 8.2f, -48.5f)
                curveToRelative(0f, -31.3f, -11.3f, -46.6f, -28.4f, -46.6f)
                curveToRelative(-18.2f, 0f, -30.8f, 17.1f, -30.8f, 50f)
                curveToRelative(0.1f, 79.2f, 59.4f, 118.7f, 129.9f, 101.9f)
                close()
            }
        }.build()
        
        return _Vine!!
    }

private var _Vine: ImageVector? = null

