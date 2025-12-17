package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Youtube: ImageVector
    get() {
        if (_Youtube != null) return _Youtube!!
        
        _Youtube = ImageVector.Builder(
            name = "youtube",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(549.655f, 124.083f)
                curveToRelative(-6.281f, -23.65f, -24.787f, -42.276f, -48.284f, -48.597f)
                curveTo(458.781f, 64f, 288f, 64f, 288f, 64f)
                reflectiveCurveTo(117.22f, 64f, 74.629f, 75.486f)
                curveToRelative(-23.497f, 6.322f, -42.003f, 24.947f, -48.284f, 48.597f)
                curveToRelative(-11.412f, 42.867f, -11.412f, 132.305f, -11.412f, 132.305f)
                reflectiveCurveToRelative(0f, 89.438f, 11.412f, 132.305f)
                curveToRelative(6.281f, 23.65f, 24.787f, 41.5f, 48.284f, 47.821f)
                curveTo(117.22f, 448f, 288f, 448f, 288f, 448f)
                reflectiveCurveToRelative(170.78f, 0f, 213.371f, -11.486f)
                curveToRelative(23.497f, -6.321f, 42.003f, -24.171f, 48.284f, -47.821f)
                curveToRelative(11.412f, -42.867f, 11.412f, -132.305f, 11.412f, -132.305f)
                reflectiveCurveToRelative(0f, -89.438f, -11.412f, -132.305f)
                close()
                moveToRelative(-317.51f, 213.508f)
                verticalLineTo(175.185f)
                lineToRelative(142.739f, 81.205f)
                lineToRelative(-142.739f, 81.201f)
                close()
            }
        }.build()
        
        return _Youtube!!
    }

private var _Youtube: ImageVector? = null

