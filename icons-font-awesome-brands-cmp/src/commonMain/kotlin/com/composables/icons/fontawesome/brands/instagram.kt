package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Instagram: ImageVector
    get() {
        if (_Instagram != null) return _Instagram!!
        
        _Instagram = ImageVector.Builder(
            name = "instagram",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224.1f, 141f)
                curveToRelative(-63.6f, 0f, -114.9f, 51.3f, -114.9f, 114.9f)
                reflectiveCurveToRelative(51.3f, 114.9f, 114.9f, 114.9f)
                reflectiveCurveTo(339f, 319.5f, 339f, 255.9f)
                reflectiveCurveTo(287.7f, 141f, 224.1f, 141f)
                close()
                moveToRelative(0f, 189.6f)
                curveToRelative(-41.1f, 0f, -74.7f, -33.5f, -74.7f, -74.7f)
                reflectiveCurveToRelative(33.5f, -74.7f, 74.7f, -74.7f)
                reflectiveCurveToRelative(74.7f, 33.5f, 74.7f, 74.7f)
                reflectiveCurveToRelative(-33.6f, 74.7f, -74.7f, 74.7f)
                close()
                moveToRelative(146.4f, -194.3f)
                curveToRelative(0f, 14.9f, -12f, 26.8f, -26.8f, 26.8f)
                curveToRelative(-14.9f, 0f, -26.8f, -12f, -26.8f, -26.8f)
                reflectiveCurveToRelative(12f, -26.8f, 26.8f, -26.8f)
                reflectiveCurveToRelative(26.8f, 12f, 26.8f, 26.8f)
                close()
                moveToRelative(76.1f, 27.2f)
                curveToRelative(-1.7f, -35.9f, -9.9f, -67.7f, -36.2f, -93.9f)
                curveToRelative(-26.2f, -26.2f, -58f, -34.4f, -93.9f, -36.2f)
                curveToRelative(-37f, -2.1f, -147.9f, -2.1f, -184.9f, 0f)
                curveToRelative(-35.8f, 1.7f, -67.6f, 9.9f, -93.9f, 36.1f)
                reflectiveCurveToRelative(-34.4f, 58f, -36.2f, 93.9f)
                curveToRelative(-2.1f, 37f, -2.1f, 147.9f, 0f, 184.9f)
                curveToRelative(1.7f, 35.9f, 9.9f, 67.7f, 36.2f, 93.9f)
                reflectiveCurveToRelative(58f, 34.4f, 93.9f, 36.2f)
                curveToRelative(37f, 2.1f, 147.9f, 2.1f, 184.9f, 0f)
                curveToRelative(35.9f, -1.7f, 67.7f, -9.9f, 93.9f, -36.2f)
                curveToRelative(26.2f, -26.2f, 34.4f, -58f, 36.2f, -93.9f)
                curveToRelative(2.1f, -37f, 2.1f, -147.8f, 0f, -184.8f)
                close()
                moveTo(398.8f, 388f)
                curveToRelative(-7.8f, 19.6f, -22.9f, 34.7f, -42.6f, 42.6f)
                curveToRelative(-29.5f, 11.7f, -99.5f, 9f, -132.1f, 9f)
                reflectiveCurveToRelative(-102.7f, 2.6f, -132.1f, -9f)
                curveToRelative(-19.6f, -7.8f, -34.7f, -22.9f, -42.6f, -42.6f)
                curveToRelative(-11.7f, -29.5f, -9f, -99.5f, -9f, -132.1f)
                reflectiveCurveToRelative(-2.6f, -102.7f, 9f, -132.1f)
                curveToRelative(7.8f, -19.6f, 22.9f, -34.7f, 42.6f, -42.6f)
                curveToRelative(29.5f, -11.7f, 99.5f, -9f, 132.1f, -9f)
                reflectiveCurveToRelative(102.7f, -2.6f, 132.1f, 9f)
                curveToRelative(19.6f, 7.8f, 34.7f, 22.9f, 42.6f, 42.6f)
                curveToRelative(11.7f, 29.5f, 9f, 99.5f, 9f, 132.1f)
                reflectiveCurveToRelative(2.7f, 102.7f, -9f, 132.1f)
                close()
            }
        }.build()
        
        return _Instagram!!
    }

private var _Instagram: ImageVector? = null

