package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Hotjar: ImageVector
    get() {
        if (_Hotjar != null) return _Hotjar!!
        
        _Hotjar = ImageVector.Builder(
            name = "hotjar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(414.9f, 161.5f)
                curveTo(340.2f, 29f, 121.1f, 0f, 121.1f, 0f)
                reflectiveCurveTo(222.2f, 110.4f, 93f, 197.7f)
                curveTo(11.3f, 252.8f, -21f, 324.4f, 14f, 402.6f)
                curveToRelative(26.8f, 59.9f, 83.5f, 84.3f, 144.6f, 93.4f)
                curveToRelative(-29.2f, -55.1f, -6.6f, -122.4f, -4.1f, -129.6f)
                curveToRelative(57.1f, 86.4f, 165f, 0f, 110.8f, -93.9f)
                curveToRelative(71f, 15.4f, 81.6f, 138.6f, 27.1f, 215.5f)
                curveToRelative(80.5f, -25.3f, 134.1f, -88.9f, 148.8f, -145.6f)
                curveToRelative(15.5f, -59.3f, 3.7f, -127.9f, -26.3f, -180.9f)
                close()
            }
        }.build()
        
        return _Hotjar!!
    }

private var _Hotjar: ImageVector? = null

