package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Itunes: ImageVector
    get() {
        if (_Itunes != null) return _Itunes!!
        
        _Itunes = ImageVector.Builder(
            name = "itunes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(223.6f, 80.3f)
                curveTo(129f, 80.3f, 52.5f, 157f, 52.5f, 251.5f)
                reflectiveCurveTo(129f, 422.8f, 223.6f, 422.8f)
                reflectiveCurveToRelative(171.2f, -76.7f, 171.2f, -171.2f)
                curveToRelative(0f, -94.6f, -76.7f, -171.3f, -171.2f, -171.3f)
                close()
                moveToRelative(79.4f, 240f)
                curveToRelative(-3.2f, 13.6f, -13.5f, 21.2f, -27.3f, 23.8f)
                curveToRelative(-12.1f, 2.2f, -22.2f, 2.8f, -31.9f, -5f)
                curveToRelative(-11.8f, -10f, -12f, -26.4f, -1.4f, -36.8f)
                curveToRelative(8.4f, -8f, 20.3f, -9.6f, 38f, -12.8f)
                curveToRelative(3f, -0.5f, 5.6f, -1.2f, 7.7f, -3.7f)
                curveToRelative(3.2f, -3.6f, 2.2f, -2f, 2.2f, -80.8f)
                curveToRelative(0f, -5.6f, -2.7f, -7.1f, -8.4f, -6.1f)
                curveToRelative(-4f, 0.7f, -91.9f, 17.1f, -91.9f, 17.1f)
                curveToRelative(-5f, 1.1f, -6.7f, 2.6f, -6.7f, 8.3f)
                curveToRelative(0f, 116.1f, 0.5f, 110.8f, -1.2f, 118.5f)
                curveToRelative(-2.1f, 9f, -7.6f, 15.8f, -14.9f, 19.6f)
                curveToRelative(-8.3f, 4.6f, -23.4f, 6.6f, -31.4f, 5.2f)
                curveToRelative(-21.4f, -4f, -28.9f, -28.7f, -14.4f, -42.9f)
                curveToRelative(8.4f, -8f, 20.3f, -9.6f, 38f, -12.8f)
                curveToRelative(3f, -0.5f, 5.6f, -1.2f, 7.7f, -3.7f)
                curveToRelative(5f, -5.7f, 0.9f, -127f, 2.6f, -133.7f)
                curveToRelative(0.4f, -2.6f, 1.5f, -4.8f, 3.5f, -6.4f)
                curveToRelative(2.1f, -1.7f, 5.8f, -2.7f, 6.7f, -2.7f)
                curveToRelative(101f, -19f, 113.3f, -21.4f, 115.1f, -21.4f)
                curveToRelative(5.7f, -0.4f, 9f, 3f, 9f, 8.7f)
                curveToRelative(-0.1f, 170.6f, 0.4f, 161.4f, -1f, 167.6f)
                close()
                moveTo(345.2f, 32f)
                horizontalLineTo(102.8f)
                curveTo(45.9f, 32f, 0f, 77.9f, 0f, 134.8f)
                verticalLineToRelative(242.4f)
                curveTo(0f, 434.1f, 45.9f, 480f, 102.8f, 480f)
                horizontalLineToRelative(242.4f)
                curveToRelative(57f, 0f, 102.8f, -45.9f, 102.8f, -102.8f)
                verticalLineTo(134.8f)
                curveTo(448f, 77.9f, 402.1f, 32f, 345.2f, 32f)
                close()
                moveTo(223.6f, 444f)
                curveToRelative(-106.3f, 0f, -192.5f, -86.2f, -192.5f, -192.5f)
                reflectiveCurveTo(117.3f, 59f, 223.6f, 59f)
                reflectiveCurveToRelative(192.5f, 86.2f, 192.5f, 192.5f)
                reflectiveCurveTo(329.9f, 444f, 223.6f, 444f)
                close()
            }
        }.build()
        
        return _Itunes!!
    }

private var _Itunes: ImageVector? = null

