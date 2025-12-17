package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Pagelines: ImageVector
    get() {
        if (_Pagelines != null) return _Pagelines!!
        
        _Pagelines = ImageVector.Builder(
            name = "pagelines",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(384f, 312.7f)
                curveToRelative(-55.1f, 136.7f, -187.1f, 54f, -187.1f, 54f)
                curveToRelative(-40.5f, 81.8f, -107.4f, 134.4f, -184.6f, 134.7f)
                curveToRelative(-16.1f, 0f, -16.6f, -24.4f, 0f, -24.4f)
                curveToRelative(64.4f, -0.3f, 120.5f, -42.7f, 157.2f, -110.1f)
                curveToRelative(-41.1f, 15.9f, -118.6f, 27.9f, -161.6f, -82.2f)
                curveToRelative(109f, -44.9f, 159.1f, 11.2f, 178.3f, 45.5f)
                curveToRelative(9.9f, -24.4f, 17f, -50.9f, 21.6f, -79.7f)
                curveToRelative(0f, 0f, -139.7f, 21.9f, -149.5f, -98.1f)
                curveToRelative(119.1f, -47.9f, 152.6f, 76.7f, 152.6f, 76.7f)
                curveToRelative(1.6f, -16.7f, 3.3f, -52.6f, 3.3f, -53.4f)
                curveToRelative(0f, 0f, -106.3f, -73.7f, -38.1f, -165.2f)
                curveToRelative(124.6f, 43f, 61.4f, 162.4f, 61.4f, 162.4f)
                curveToRelative(0.5f, 1.6f, 0.5f, 23.8f, 0f, 33.4f)
                curveToRelative(0f, 0f, 45.2f, -89f, 136.4f, -57.5f)
                curveToRelative(-4.2f, 134f, -141.9f, 106.4f, -141.9f, 106.4f)
                curveToRelative(-4.4f, 27.4f, -11.2f, 53.4f, -20f, 77.5f)
                curveToRelative(0f, 0f, 83f, -91.8f, 172f, -20f)
                close()
            }
        }.build()
        
        return _Pagelines!!
    }

private var _Pagelines: ImageVector? = null

