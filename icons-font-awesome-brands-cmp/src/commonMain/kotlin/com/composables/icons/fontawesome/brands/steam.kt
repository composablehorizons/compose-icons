package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Steam: ImageVector
    get() {
        if (_Steam != null) return _Steam!!
        
        _Steam = ImageVector.Builder(
            name = "steam",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(496f, 256f)
                curveToRelative(0f, 137f, -111.2f, 248f, -248.4f, 248f)
                curveToRelative(-113.8f, 0f, -209.6f, -76.3f, -239f, -180.4f)
                lineToRelative(95.2f, 39.3f)
                curveToRelative(6.4f, 32.1f, 34.9f, 56.4f, 68.9f, 56.4f)
                curveToRelative(39.2f, 0f, 71.9f, -32.4f, 70.2f, -73.5f)
                lineToRelative(84.5f, -60.2f)
                curveToRelative(52.1f, 1.3f, 95.8f, -40.9f, 95.8f, -93.5f)
                curveToRelative(0f, -51.6f, -42f, -93.5f, -93.7f, -93.5f)
                reflectiveCurveToRelative(-93.7f, 42f, -93.7f, 93.5f)
                verticalLineToRelative(1.2f)
                lineTo(176.6f, 279f)
                curveToRelative(-15.5f, -0.9f, -30.7f, 3.4f, -43.5f, 12.1f)
                lineTo(0f, 236.1f)
                curveTo(10.2f, 108.4f, 117.1f, 8f, 247.6f, 8f)
                curveTo(384.8f, 8f, 496f, 119f, 496f, 256f)
                close()
                moveTo(155.7f, 384.3f)
                lineToRelative(-30.5f, -12.6f)
                arcToRelative(52.79f, 52.79f, 0f, false, false, 27.2f, 25.8f)
                curveToRelative(26.9f, 11.2f, 57.8f, -1.6f, 69f, -28.4f)
                curveToRelative(5.4f, -13f, 5.5f, -27.3f, 0.1f, -40.3f)
                curveToRelative(-5.4f, -13f, -15.5f, -23.2f, -28.5f, -28.6f)
                curveToRelative(-12.9f, -5.4f, -26.7f, -5.2f, -38.9f, -0.6f)
                lineToRelative(31.5f, 13f)
                curveToRelative(19.8f, 8.2f, 29.2f, 30.9f, 20.9f, 50.7f)
                curveToRelative(-8.3f, 19.9f, -31f, 29.2f, -50.8f, 21f)
                close()
                moveToRelative(173.8f, -129.9f)
                curveToRelative(-34.4f, 0f, -62.4f, -28f, -62.4f, -62.3f)
                reflectiveCurveToRelative(28f, -62.3f, 62.4f, -62.3f)
                reflectiveCurveToRelative(62.4f, 28f, 62.4f, 62.3f)
                reflectiveCurveToRelative(-27.9f, 62.3f, -62.4f, 62.3f)
                close()
                moveToRelative(0.1f, -15.6f)
                curveToRelative(25.9f, 0f, 46.9f, -21f, 46.9f, -46.8f)
                curveToRelative(0f, -25.9f, -21f, -46.8f, -46.9f, -46.8f)
                reflectiveCurveToRelative(-46.9f, 21f, -46.9f, 46.8f)
                curveToRelative(0.1f, 25.8f, 21.1f, 46.8f, 46.9f, 46.8f)
                close()
            }
        }.build()
        
        return _Steam!!
    }

private var _Steam: ImageVector? = null

