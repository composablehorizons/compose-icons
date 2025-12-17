package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Centercode: ImageVector
    get() {
        if (_Centercode != null) return _Centercode!!
        
        _Centercode = ImageVector.Builder(
            name = "centercode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(329.2f, 268.6f)
                curveToRelative(-3.8f, 35.2f, -35.4f, 60.6f, -70.6f, 56.8f)
                curveToRelative(-35.2f, -3.8f, -60.6f, -35.4f, -56.8f, -70.6f)
                curveToRelative(3.8f, -35.2f, 35.4f, -60.6f, 70.6f, -56.8f)
                curveToRelative(35.1f, 3.8f, 60.6f, 35.4f, 56.8f, 70.6f)
                close()
                moveToRelative(-85.8f, 235.1f)
                curveTo(96.7f, 496f, -8.2f, 365.5f, 10.1f, 224.3f)
                curveToRelative(11.2f, -86.6f, 65.8f, -156.9f, 139.1f, -192f)
                curveToRelative(161f, -77.1f, 349.7f, 37.4f, 354.7f, 216.6f)
                curveToRelative(4.1f, 147f, -118.4f, 262.2f, -260.5f, 254.8f)
                close()
                moveToRelative(179.9f, -180f)
                curveToRelative(27.9f, -118f, -160.5f, -205.9f, -237.2f, -234.2f)
                curveToRelative(-57.5f, 56.3f, -69.1f, 188.6f, -33.8f, 344.4f)
                curveToRelative(68.8f, 15.8f, 169.1f, -26.4f, 271f, -110.2f)
                close()
            }
        }.build()
        
        return _Centercode!!
    }

private var _Centercode: ImageVector? = null

