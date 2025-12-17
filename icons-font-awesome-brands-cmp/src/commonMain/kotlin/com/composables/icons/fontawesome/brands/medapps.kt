package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Medapps: ImageVector
    get() {
        if (_Medapps != null) return _Medapps!!
        
        _Medapps = ImageVector.Builder(
            name = "medapps",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(118.3f, 238.4f)
                curveToRelative(3.5f, -12.5f, 6.9f, -33.6f, 13.2f, -33.6f)
                curveToRelative(8.3f, 1.8f, 9.6f, 23.4f, 18.6f, 36.6f)
                curveToRelative(4.6f, -23.5f, 5.3f, -85.1f, 14.1f, -86.7f)
                curveToRelative(9f, -0.7f, 19.7f, 66.5f, 22f, 77.5f)
                curveToRelative(9.9f, 4.1f, 48.9f, 6.6f, 48.9f, 6.6f)
                curveToRelative(1.9f, 7.3f, -24f, 7.6f, -40f, 7.8f)
                curveToRelative(-4.6f, 14.8f, -5.4f, 27.7f, -11.4f, 28f)
                curveToRelative(-4.7f, 0.2f, -8.2f, -28.8f, -17.5f, -49.6f)
                lineToRelative(-9.4f, 65.5f)
                curveToRelative(-4.4f, 13f, -15.5f, -22.5f, -21.9f, -39.3f)
                curveToRelative(-3.3f, -0.1f, -62.4f, -1.6f, -47.6f, -7.8f)
                lineToRelative(31f, -5f)
                close()
                moveTo(228f, 448f)
                curveToRelative(21.2f, 0f, 21.2f, -32f, 0f, -32f)
                horizontalLineTo(92f)
                curveToRelative(-21.2f, 0f, -21.2f, 32f, 0f, 32f)
                horizontalLineToRelative(136f)
                close()
                moveToRelative(-24f, 64f)
                curveToRelative(21.2f, 0f, 21.2f, -32f, 0f, -32f)
                horizontalLineToRelative(-88f)
                curveToRelative(-21.2f, 0f, -21.2f, 32f, 0f, 32f)
                horizontalLineToRelative(88f)
                close()
                moveToRelative(34.2f, -141.5f)
                curveToRelative(3.2f, -18.9f, 5.2f, -36.4f, 11.9f, -48.8f)
                curveToRelative(7.9f, -14.7f, 16.1f, -28.1f, 24f, -41f)
                curveToRelative(24.6f, -40.4f, 45.9f, -75.2f, 45.9f, -125.5f)
                curveTo(320f, 69.6f, 248.2f, 0f, 160f, 0f)
                reflectiveCurveTo(0f, 69.6f, 0f, 155.2f)
                curveToRelative(0f, 50.2f, 21.3f, 85.1f, 45.9f, 125.5f)
                curveToRelative(7.9f, 12.9f, 16f, 26.3f, 24f, 41f)
                curveToRelative(6.7f, 12.5f, 8.7f, 29.8f, 11.9f, 48.9f)
                curveToRelative(3.5f, 21f, 36.1f, 15.7f, 32.6f, -5.1f)
                curveToRelative(-3.6f, -21.7f, -5.6f, -40.7f, -15.3f, -58.6f)
                curveTo(66.5f, 246.5f, 33f, 211.3f, 33f, 155.2f)
                curveTo(33f, 87.3f, 90f, 32f, 160f, 32f)
                reflectiveCurveToRelative(127f, 55.3f, 127f, 123.2f)
                curveToRelative(0f, 56.1f, -33.5f, 91.3f, -66.1f, 151.6f)
                curveToRelative(-9.7f, 18f, -11.7f, 37.4f, -15.3f, 58.6f)
                curveToRelative(-3.4f, 20.6f, 29f, 26.4f, 32.6f, 5.1f)
                close()
            }
        }.build()
        
        return _Medapps!!
    }

private var _Medapps: ImageVector? = null

