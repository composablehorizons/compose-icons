package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BrandOpera: ImageVector
    get() {
        if (_BrandOpera != null) return _BrandOpera!!
        
        _BrandOpera = ImageVector.Builder(
            name = "brand-opera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, true, true, -15f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, false, true, 14.995f, -8.336f)
                moveToRelative(-5f, 2.66f)
                curveToRelative(-2.285f, 0f, -3.915f, 2.619f, -3.997f, 5.752f)
                lineToRelative(-0.003f, 0.248f)
                curveToRelative(0f, 3.242f, 1.655f, 6f, 4f, 6f)
                reflectiveCurveToRelative(4f, -2.758f, 4f, -6f)
                reflectiveCurveToRelative(-1.655f, -6f, -4f, -6f)
            }
        }.build()
        
        return _BrandOpera!!
    }

private var _BrandOpera: ImageVector? = null

