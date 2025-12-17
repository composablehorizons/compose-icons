package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.PinterestP: ImageVector
    get() {
        if (_PinterestP != null) return _PinterestP!!
        
        _PinterestP = ImageVector.Builder(
            name = "pinterest-p",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(204f, 6.5f)
                curveTo(101.4f, 6.5f, 0f, 74.9f, 0f, 185.6f)
                curveTo(0f, 256f, 39.6f, 296f, 63.6f, 296f)
                curveToRelative(9.9f, 0f, 15.6f, -27.6f, 15.6f, -35.4f)
                curveToRelative(0f, -9.3f, -23.7f, -29.1f, -23.7f, -67.8f)
                curveToRelative(0f, -80.4f, 61.2f, -137.4f, 140.4f, -137.4f)
                curveToRelative(68.1f, 0f, 118.5f, 38.7f, 118.5f, 109.8f)
                curveToRelative(0f, 53.1f, -21.3f, 152.7f, -90.3f, 152.7f)
                curveToRelative(-24.9f, 0f, -46.2f, -18f, -46.2f, -43.8f)
                curveToRelative(0f, -37.8f, 26.4f, -74.4f, 26.4f, -113.4f)
                curveToRelative(0f, -66.2f, -93.9f, -54.2f, -93.9f, 25.8f)
                curveToRelative(0f, 16.8f, 2.1f, 35.4f, 9.6f, 50.7f)
                curveToRelative(-13.8f, 59.4f, -42f, 147.9f, -42f, 209.1f)
                curveToRelative(0f, 18.9f, 2.7f, 37.5f, 4.5f, 56.4f)
                curveToRelative(3.4f, 3.8f, 1.7f, 3.4f, 6.9f, 1.5f)
                curveToRelative(50.4f, -69f, 48.6f, -82.5f, 71.4f, -172.8f)
                curveToRelative(12.3f, 23.4f, 44.1f, 36f, 69.3f, 36f)
                curveToRelative(106.2f, 0f, 153.9f, -103.5f, 153.9f, -196.8f)
                curveTo(384f, 71.3f, 298.2f, 6.5f, 204f, 6.5f)
                close()
            }
        }.build()
        
        return _PinterestP!!
    }

private var _PinterestP: ImageVector? = null

