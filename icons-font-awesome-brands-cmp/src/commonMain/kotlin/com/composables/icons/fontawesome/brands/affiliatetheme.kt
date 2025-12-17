package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Affiliatetheme: ImageVector
    get() {
        if (_Affiliatetheme != null) return _Affiliatetheme!!
        
        _Affiliatetheme = ImageVector.Builder(
            name = "affiliatetheme",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(159.7f, 237.4f)
                curveTo(108.4f, 308.3f, 43.1f, 348.2f, 14f, 326.6f)
                curveTo(-15.2f, 304.9f, 2.8f, 230f, 54.2f, 159.1f)
                curveToRelative(51.3f, -70.9f, 116.6f, -110.8f, 145.7f, -89.2f)
                curveToRelative(29.1f, 21.6f, 11.1f, 96.6f, -40.2f, 167.5f)
                close()
                moveToRelative(351.2f, -57.3f)
                curveTo(437.1f, 303.5f, 319f, 367.8f, 246.4f, 323.7f)
                curveToRelative(-25f, -15.2f, -41.3f, -41.2f, -49f, -73.8f)
                curveToRelative(-33.6f, 64.8f, -92.8f, 113.8f, -164.1f, 133.2f)
                curveToRelative(49.8f, 59.3f, 124.1f, 96.9f, 207f, 96.9f)
                curveToRelative(150f, 0f, 271.6f, -123.1f, 271.6f, -274.9f)
                curveToRelative(0.1f, -8.5f, -0.3f, -16.8f, -1f, -25f)
                close()
            }
        }.build()
        
        return _Affiliatetheme!!
    }

private var _Affiliatetheme: ImageVector? = null

