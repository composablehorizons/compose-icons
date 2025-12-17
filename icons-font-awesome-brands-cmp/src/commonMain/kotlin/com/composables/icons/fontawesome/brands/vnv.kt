package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Vnv: ImageVector
    get() {
        if (_Vnv != null) return _Vnv!!
        
        _Vnv = ImageVector.Builder(
            name = "vnv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(104.9f, 352f)
                curveToRelative(-34.1f, 0f, -46.4f, -30.4f, -46.4f, -30.4f)
                lineTo(2.6f, 210.1f)
                reflectiveCurveTo(-7.8f, 192f, 13f, 192f)
                horizontalLineToRelative(32.8f)
                curveToRelative(10.4f, 0f, 13.2f, 8.7f, 18.8f, 18.1f)
                lineToRelative(36.7f, 74.5f)
                reflectiveCurveToRelative(5.2f, 13.1f, 21.1f, 13.1f)
                reflectiveCurveToRelative(21.1f, -13.1f, 21.1f, -13.1f)
                lineToRelative(36.7f, -74.5f)
                curveToRelative(5.6f, -9.5f, 8.4f, -18.1f, 18.8f, -18.1f)
                horizontalLineToRelative(32.8f)
                curveToRelative(20.8f, 0f, 10.4f, 18.1f, 10.4f, 18.1f)
                lineToRelative(-55.8f, 111.5f)
                reflectiveCurveTo(174.2f, 352f, 140f, 352f)
                horizontalLineToRelative(-35.1f)
                close()
                moveToRelative(395f, 0f)
                curveToRelative(-34.1f, 0f, -46.4f, -30.4f, -46.4f, -30.4f)
                lineToRelative(-55.9f, -111.5f)
                reflectiveCurveTo(387.2f, 192f, 408f, 192f)
                horizontalLineToRelative(32.8f)
                curveToRelative(10.4f, 0f, 13.2f, 8.7f, 18.8f, 18.1f)
                lineToRelative(36.7f, 74.5f)
                reflectiveCurveToRelative(5.2f, 13.1f, 21.1f, 13.1f)
                reflectiveCurveToRelative(21.1f, -13.1f, 21.1f, -13.1f)
                lineToRelative(36.8f, -74.5f)
                curveToRelative(5.6f, -9.5f, 8.4f, -18.1f, 18.8f, -18.1f)
                horizontalLineTo(627f)
                curveToRelative(20.8f, 0f, 10.4f, 18.1f, 10.4f, 18.1f)
                lineToRelative(-55.9f, 111.5f)
                reflectiveCurveTo(569.3f, 352f, 535.1f, 352f)
                horizontalLineToRelative(-35.2f)
                close()
                moveTo(337.6f, 192f)
                curveToRelative(34.1f, 0f, 46.4f, 30.4f, 46.4f, 30.4f)
                lineToRelative(55.9f, 111.5f)
                reflectiveCurveToRelative(10.4f, 18.1f, -10.4f, 18.1f)
                horizontalLineToRelative(-32.8f)
                curveToRelative(-10.4f, 0f, -13.2f, -8.7f, -18.8f, -18.1f)
                lineToRelative(-36.7f, -74.5f)
                reflectiveCurveToRelative(-5.2f, -13.1f, -21.1f, -13.1f)
                curveToRelative(-15.9f, 0f, -21.1f, 13.1f, -21.1f, 13.1f)
                lineToRelative(-36.7f, 74.5f)
                curveToRelative(-5.6f, 9.4f, -8.4f, 18.1f, -18.8f, 18.1f)
                horizontalLineToRelative(-32.9f)
                curveToRelative(-20.8f, 0f, -10.4f, -18.1f, -10.4f, -18.1f)
                lineToRelative(55.9f, -111.5f)
                reflectiveCurveToRelative(12.2f, -30.4f, 46.4f, -30.4f)
                horizontalLineToRelative(35.1f)
                close()
            }
        }.build()
        
        return _Vnv!!
    }

private var _Vnv: ImageVector? = null

