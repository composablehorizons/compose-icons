package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Periscope: ImageVector
    get() {
        if (_Periscope != null) return _Periscope!!
        
        _Periscope = ImageVector.Builder(
            name = "periscope",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(370f, 63.6f)
                curveTo(331.4f, 22.6f, 280.5f, 0f, 226.6f, 0f)
                curveTo(111.9f, 0f, 18.5f, 96.2f, 18.5f, 214.4f)
                curveToRelative(0f, 75.1f, 57.8f, 159.8f, 82.7f, 192.7f)
                curveTo(137.8f, 455.5f, 192.6f, 512f, 226.6f, 512f)
                curveToRelative(41.6f, 0f, 112.9f, -94.2f, 120.9f, -105f)
                curveToRelative(24.6f, -33.1f, 82f, -118.3f, 82f, -192.6f)
                curveToRelative(0f, -56.5f, -21.1f, -110.1f, -59.5f, -150.8f)
                close()
                moveTo(226.6f, 493.9f)
                curveToRelative(-42.5f, 0f, -190f, -167.3f, -190f, -279.4f)
                curveToRelative(0f, -107.4f, 83.9f, -196.3f, 190f, -196.3f)
                curveToRelative(100.8f, 0f, 184.7f, 89f, 184.7f, 196.3f)
                curveToRelative(0.1f, 112.1f, -147.4f, 279.4f, -184.7f, 279.4f)
                close()
                moveTo(338f, 206.8f)
                curveToRelative(0f, 59.1f, -51.1f, 109.7f, -110.8f, 109.7f)
                curveToRelative(-100.6f, 0f, -150.7f, -108.2f, -92.9f, -181.8f)
                verticalLineToRelative(0.4f)
                curveToRelative(0f, 24.5f, 20.1f, 44.4f, 44.8f, 44.4f)
                curveToRelative(24.7f, 0f, 44.8f, -19.9f, 44.8f, -44.4f)
                curveToRelative(0f, -18.2f, -11.1f, -33.8f, -26.9f, -40.7f)
                curveToRelative(76.6f, -19.2f, 141f, 39.3f, 141f, 112.4f)
                close()
            }
        }.build()
        
        return _Periscope!!
    }

private var _Periscope: ImageVector? = null

