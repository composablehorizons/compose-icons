package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Searchengin: ImageVector
    get() {
        if (_Searchengin != null) return _Searchengin!!
        
        _Searchengin = ImageVector.Builder(
            name = "searchengin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 460f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(220.6f, 130.3f)
                lineToRelative(-67.2f, 28.2f)
                verticalLineTo(43.2f)
                lineTo(98.7f, 233.5f)
                lineToRelative(54.7f, -24.2f)
                verticalLineToRelative(130.3f)
                lineToRelative(67.2f, -209.3f)
                close()
                moveToRelative(-83.2f, -96.7f)
                lineToRelative(-1.3f, 4.7f)
                lineToRelative(-15.2f, 52.9f)
                curveTo(80.6f, 106.7f, 52f, 145.8f, 52f, 191.5f)
                curveToRelative(0f, 52.3f, 34.3f, 95.9f, 83.4f, 105.5f)
                verticalLineToRelative(53.6f)
                curveTo(57.5f, 340.1f, 0f, 272.4f, 0f, 191.6f)
                curveToRelative(0f, -80.5f, 59.8f, -147.2f, 137.4f, -158f)
                close()
                moveToRelative(311.4f, 447.2f)
                curveToRelative(-11.2f, 11.2f, -23.1f, 12.3f, -28.6f, 10.5f)
                curveToRelative(-5.4f, -1.8f, -27.1f, -19.9f, -60.4f, -44.4f)
                curveToRelative(-33.3f, -24.6f, -33.6f, -35.7f, -43f, -56.7f)
                curveToRelative(-9.4f, -20.9f, -30.4f, -42.6f, -57.5f, -52.4f)
                lineToRelative(-9.7f, -14.7f)
                curveToRelative(-24.7f, 16.9f, -53f, 26.9f, -81.3f, 28.7f)
                lineToRelative(2.1f, -6.6f)
                lineToRelative(15.9f, -49.5f)
                curveToRelative(46.5f, -11.9f, 80.9f, -54f, 80.9f, -104.2f)
                curveToRelative(0f, -54.5f, -38.4f, -102.1f, -96f, -107.1f)
                verticalLineTo(32.3f)
                curveTo(254.4f, 37.4f, 320f, 106.8f, 320f, 191.6f)
                curveToRelative(0f, 33.6f, -11.2f, 64.7f, -29f, 90.4f)
                lineToRelative(14.6f, 9.6f)
                curveToRelative(9.8f, 27.1f, 31.5f, 48f, 52.4f, 57.4f)
                reflectiveCurveToRelative(32.2f, 9.7f, 56.8f, 43f)
                curveToRelative(24.6f, 33.2f, 42.7f, 54.9f, 44.5f, 60.3f)
                reflectiveCurveToRelative(0.7f, 17.3f, -10.5f, 28.5f)
                close()
                moveToRelative(-9.9f, -17.9f)
                curveToRelative(0f, -4.4f, -3.6f, -8f, -8f, -8f)
                reflectiveCurveToRelative(-8f, 3.6f, -8f, 8f)
                reflectiveCurveToRelative(3.6f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.6f, 8f, -8f)
                close()
            }
        }.build()
        
        return _Searchengin!!
    }

private var _Searchengin: ImageVector? = null

