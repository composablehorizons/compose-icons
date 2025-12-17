package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Php: ImageVector
    get() {
        if (_Php != null) return _Php!!
        
        _Php = ImageVector.Builder(
            name = "php",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 104.5f)
                curveToRelative(171.4f, 0f, 303.2f, 72.2f, 303.2f, 151.5f)
                reflectiveCurveTo(491.3f, 407.5f, 320f, 407.5f)
                curveToRelative(-171.4f, 0f, -303.2f, -72.2f, -303.2f, -151.5f)
                reflectiveCurveTo(148.7f, 104.5f, 320f, 104.5f)
                moveToRelative(0f, -16.8f)
                curveTo(143.3f, 87.7f, 0f, 163f, 0f, 256f)
                reflectiveCurveToRelative(143.3f, 168.3f, 320f, 168.3f)
                reflectiveCurveTo(640f, 349f, 640f, 256f)
                reflectiveCurveTo(496.7f, 87.7f, 320f, 87.7f)
                close()
                moveTo(218.2f, 242.5f)
                curveToRelative(-7.9f, 40.5f, -35.8f, 36.3f, -70.1f, 36.3f)
                lineToRelative(13.7f, -70.6f)
                curveToRelative(38f, 0f, 63.8f, -4.1f, 56.4f, 34.3f)
                close()
                moveTo(97.4f, 350.3f)
                horizontalLineToRelative(36.7f)
                lineToRelative(8.7f, -44.8f)
                curveToRelative(41.1f, 0f, 66.6f, 3f, 90.2f, -19.1f)
                curveToRelative(26.1f, -24f, 32.9f, -66.7f, 14.3f, -88.1f)
                curveToRelative(-9.7f, -11.2f, -25.3f, -16.7f, -46.5f, -16.7f)
                horizontalLineToRelative(-70.7f)
                lineTo(97.4f, 350.3f)
                close()
                moveToRelative(185.7f, -213.6f)
                horizontalLineToRelative(36.5f)
                lineToRelative(-8.7f, 44.8f)
                curveToRelative(31.5f, 0f, 60.7f, -2.3f, 74.8f, 10.7f)
                curveToRelative(14.8f, 13.6f, 7.7f, 31f, -8.3f, 113.1f)
                horizontalLineToRelative(-37f)
                curveToRelative(15.4f, -79.4f, 18.3f, -86f, 12.7f, -92f)
                curveToRelative(-5.4f, -5.8f, -17.7f, -4.6f, -47.4f, -4.6f)
                lineToRelative(-18.8f, 96.6f)
                horizontalLineToRelative(-36.5f)
                lineToRelative(32.7f, -168.6f)
                close()
                moveTo(505f, 242.5f)
                curveToRelative(-8f, 41.1f, -36.7f, 36.3f, -70.1f, 36.3f)
                lineToRelative(13.7f, -70.6f)
                curveToRelative(38.2f, 0f, 63.8f, -4.1f, 56.4f, 34.3f)
                close()
                moveTo(384.2f, 350.3f)
                horizontalLineTo(421f)
                lineToRelative(8.7f, -44.8f)
                curveToRelative(43.2f, 0f, 67.1f, 2.5f, 90.2f, -19.1f)
                curveToRelative(26.1f, -24f, 32.9f, -66.7f, 14.3f, -88.1f)
                curveToRelative(-9.7f, -11.2f, -25.3f, -16.7f, -46.5f, -16.7f)
                horizontalLineTo(417f)
                lineToRelative(-32.8f, 168.7f)
                close()
            }
        }.build()
        
        return _Php!!
    }

private var _Php: ImageVector? = null

