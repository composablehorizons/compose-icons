package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Usps: ImageVector
    get() {
        if (_Usps != null) return _Usps!!
        
        _Usps = ImageVector.Builder(
            name = "usps",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(460.3f, 241.7f)
                curveToRelative(25.8f, -41.3f, 15.2f, -48.8f, -11.7f, -48.8f)
                horizontalLineToRelative(-27f)
                curveToRelative(-0.1f, 0f, -1.5f, -1.4f, -10.9f, 8f)
                curveToRelative(-11.2f, 5.6f, -37.9f, 6.3f, -37.9f, 8.7f)
                curveToRelative(0f, 4.5f, 70.3f, -3.1f, 88.1f, 0f)
                curveToRelative(9.5f, 1.5f, -1.5f, 20.4f, -4.4f, 32f)
                curveToRelative(-0.5f, 4.5f, 2.4f, 2.3f, 3.8f, 0.1f)
                close()
                moveToRelative(-112.1f, 22.6f)
                curveToRelative(64f, -21.3f, 97.3f, -23.9f, 102f, -26.2f)
                curveToRelative(4.4f, -2.9f, -4.4f, -6.6f, -26.2f, -5.8f)
                curveToRelative(-51.7f, 2.2f, -137.6f, 37.1f, -172.6f, 53.9f)
                lineToRelative(-30.7f, -93.3f)
                horizontalLineToRelative(196.6f)
                curveToRelative(-2.7f, -28.2f, -152.9f, -22.6f, -337.9f, -22.6f)
                lineTo(27f, 415.8f)
                curveToRelative(196.4f, -97.3f, 258.9f, -130.3f, 321.2f, -151.5f)
                close()
                moveTo(94.7f, 96f)
                curveToRelative(253.3f, 53.7f, 330f, 65.7f, 332.1f, 85.2f)
                curveToRelative(36.4f, 0f, 45.9f, 0f, 52.4f, 6.6f)
                curveToRelative(21.1f, 19.7f, -14.6f, 67.7f, -14.6f, 67.7f)
                curveToRelative(-4.4f, 2.9f, -406.4f, 160.2f, -406.4f, 160.2f)
                horizontalLineToRelative(423.1f)
                lineTo(549f, 96f)
                close()
            }
        }.build()
        
        return _Usps!!
    }

private var _Usps: ImageVector? = null

