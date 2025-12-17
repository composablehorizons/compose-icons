package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Renren: ImageVector
    get() {
        if (_Renren != null) return _Renren!!
        
        _Renren = ImageVector.Builder(
            name = "renren",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(214f, 169.1f)
                curveToRelative(0f, 110.4f, -61f, 205.4f, -147.6f, 247.4f)
                curveTo(30f, 373.2f, 8f, 317.7f, 8f, 256.6f)
                curveTo(8f, 133.9f, 97.1f, 32.2f, 214f, 12.5f)
                verticalLineToRelative(156.6f)
                close()
                moveTo(255f, 504f)
                curveToRelative(-42.9f, 0f, -83.3f, -11f, -118.5f, -30.4f)
                curveTo(193.7f, 437.5f, 239.9f, 382.9f, 255f, 319f)
                curveToRelative(15.5f, 63.9f, 61.7f, 118.5f, 118.8f, 154.7f)
                curveTo(338.7f, 493f, 298.3f, 504f, 255f, 504f)
                close()
                moveToRelative(190.6f, -87.5f)
                curveTo(359f, 374.5f, 298f, 279.6f, 298f, 169.1f)
                verticalLineTo(12.5f)
                curveToRelative(116.9f, 19.7f, 206f, 121.4f, 206f, 244.1f)
                curveToRelative(0f, 61.1f, -22f, 116.6f, -58.4f, 159.9f)
                close()
            }
        }.build()
        
        return _Renren!!
    }

private var _Renren: ImageVector? = null

