package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.OdnoklassnikiSquare: ImageVector
    get() {
        if (_OdnoklassnikiSquare != null) return _OdnoklassnikiSquare!!
        
        _OdnoklassnikiSquare = ImageVector.Builder(
            name = "odnoklassniki-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(184.2f, 177.1f)
                curveToRelative(0f, -22.1f, 17.9f, -40f, 39.8f, -40f)
                reflectiveCurveToRelative(39.8f, 17.9f, 39.8f, 40f)
                curveToRelative(0f, 22f, -17.9f, 39.8f, -39.8f, 39.8f)
                reflectiveCurveToRelative(-39.8f, -17.9f, -39.8f, -39.8f)
                close()
                moveTo(448f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, -21.5f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.5f, 0f, -48f, -21.5f, -48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, 21.5f, -48f, 48f, -48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, 21.5f, 48f, 48f)
                close()
                moveToRelative(-305.1f, 97.1f)
                curveToRelative(0f, 44.6f, 36.4f, 80.9f, 81.1f, 80.9f)
                reflectiveCurveToRelative(81.1f, -36.2f, 81.1f, -80.9f)
                curveToRelative(0f, -44.8f, -36.4f, -81.1f, -81.1f, -81.1f)
                reflectiveCurveToRelative(-81.1f, 36.2f, -81.1f, 81.1f)
                close()
                moveToRelative(174.5f, 90.7f)
                curveToRelative(-4.6f, -9.1f, -17.3f, -16.8f, -34.1f, -3.6f)
                curveToRelative(0f, 0f, -22.7f, 18f, -59.3f, 18f)
                reflectiveCurveToRelative(-59.3f, -18f, -59.3f, -18f)
                curveToRelative(-16.8f, -13.2f, -29.5f, -5.5f, -34.1f, 3.6f)
                curveToRelative(-7.9f, 16.1f, 1.1f, 23.7f, 21.4f, 37f)
                curveToRelative(17.3f, 11.1f, 41.2f, 15.2f, 56.6f, 16.8f)
                lineToRelative(-12.9f, 12.9f)
                curveToRelative(-18.2f, 18f, -35.5f, 35.5f, -47.7f, 47.7f)
                curveToRelative(-17.6f, 17.6f, 10.7f, 45.8f, 28.4f, 28.6f)
                lineToRelative(47.7f, -47.9f)
                curveToRelative(18.2f, 18.2f, 35.7f, 35.7f, 47.7f, 47.9f)
                curveToRelative(17.6f, 17.2f, 46f, -10.7f, 28.6f, -28.6f)
                lineToRelative(-47.7f, -47.7f)
                lineToRelative(-13f, -12.9f)
                curveToRelative(15.5f, -1.6f, 39.1f, -5.9f, 56.2f, -16.8f)
                curveToRelative(20.4f, -13.3f, 29.3f, -21f, 21.5f, -37f)
                close()
            }
        }.build()
        
        return _OdnoklassnikiSquare!!
    }

private var _OdnoklassnikiSquare: ImageVector? = null

