package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Odnoklassniki: ImageVector
    get() {
        if (_Odnoklassniki != null) return _Odnoklassniki!!
        
        _Odnoklassniki = ImageVector.Builder(
            name = "odnoklassniki",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(275.1f, 334f)
                curveToRelative(-27.4f, 17.4f, -65.1f, 24.3f, -90f, 26.9f)
                lineToRelative(20.9f, 20.6f)
                lineToRelative(76.3f, 76.3f)
                curveToRelative(27.9f, 28.6f, -17.5f, 73.3f, -45.7f, 45.7f)
                curveToRelative(-19.1f, -19.4f, -47.1f, -47.4f, -76.3f, -76.6f)
                lineTo(84f, 503.4f)
                curveToRelative(-28.2f, 27.5f, -73.6f, -17.6f, -45.4f, -45.7f)
                curveToRelative(19.4f, -19.4f, 47.1f, -47.4f, 76.3f, -76.3f)
                lineToRelative(20.6f, -20.6f)
                curveToRelative(-24.6f, -2.6f, -62.9f, -9.1f, -90.6f, -26.9f)
                curveToRelative(-32.6f, -21f, -46.9f, -33.3f, -34.3f, -59f)
                curveToRelative(7.4f, -14.6f, 27.7f, -26.9f, 54.6f, -5.7f)
                curveToRelative(0f, 0f, 36.3f, 28.9f, 94.9f, 28.9f)
                reflectiveCurveToRelative(94.9f, -28.9f, 94.9f, -28.9f)
                curveToRelative(26.9f, -21.1f, 47.1f, -8.9f, 54.6f, 5.7f)
                curveToRelative(12.4f, 25.7f, -1.9f, 38f, -34.5f, 59.1f)
                close()
                moveTo(30.3f, 129.7f)
                curveTo(30.3f, 58f, 88.6f, 0f, 160f, 0f)
                reflectiveCurveToRelative(129.7f, 58f, 129.7f, 129.7f)
                curveToRelative(0f, 71.4f, -58.3f, 129.4f, -129.7f, 129.4f)
                reflectiveCurveToRelative(-129.7f, -58f, -129.7f, -129.4f)
                close()
                moveToRelative(66f, 0f)
                curveToRelative(0f, 35.1f, 28.6f, 63.7f, 63.7f, 63.7f)
                reflectiveCurveToRelative(63.7f, -28.6f, 63.7f, -63.7f)
                curveToRelative(0f, -35.4f, -28.6f, -64f, -63.7f, -64f)
                reflectiveCurveToRelative(-63.7f, 28.6f, -63.7f, 64f)
                close()
            }
        }.build()
        
        return _Odnoklassniki!!
    }

private var _Odnoklassniki: ImageVector? = null

