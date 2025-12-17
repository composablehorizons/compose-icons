package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.SteamSymbol: ImageVector
    get() {
        if (_SteamSymbol != null) return _SteamSymbol!!
        
        _SteamSymbol = ImageVector.Builder(
            name = "steam-symbol",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(395.5f, 177.5f)
                curveToRelative(0f, 33.8f, -27.5f, 61f, -61f, 61f)
                curveToRelative(-33.8f, 0f, -61f, -27.3f, -61f, -61f)
                reflectiveCurveToRelative(27.3f, -61f, 61f, -61f)
                curveToRelative(33.5f, 0f, 61f, 27.2f, 61f, 61f)
                close()
                moveToRelative(52.5f, 0.2f)
                curveToRelative(0f, 63f, -51f, 113.8f, -113.7f, 113.8f)
                lineTo(225f, 371.3f)
                curveToRelative(-4f, 43f, -40.5f, 76.8f, -84.5f, 76.8f)
                curveToRelative(-40.5f, 0f, -74.7f, -28.8f, -83f, -67f)
                lineTo(0f, 358f)
                verticalLineTo(250.7f)
                lineTo(97.2f, 290f)
                curveToRelative(15.1f, -9.2f, 32.2f, -13.3f, 52f, -11.5f)
                lineToRelative(71f, -101.7f)
                curveToRelative(0.5f, -62.3f, 51.5f, -112.8f, 114f, -112.8f)
                curveTo(397f, 64f, 448f, 115f, 448f, 177.7f)
                close()
                moveTo(203f, 363f)
                curveToRelative(0f, -34.7f, -27.8f, -62.5f, -62.5f, -62.5f)
                curveToRelative(-4.5f, 0f, -9f, 0.5f, -13.5f, 1.5f)
                lineToRelative(26f, 10.5f)
                curveToRelative(25.5f, 10.2f, 38f, 39f, 27.7f, 64.5f)
                curveToRelative(-10.2f, 25.5f, -39.2f, 38f, -64.7f, 27.5f)
                curveToRelative(-10.2f, -4f, -20.5f, -8.3f, -30.7f, -12.2f)
                curveToRelative(10.5f, 19.7f, 31.2f, 33.2f, 55.2f, 33.2f)
                curveToRelative(34.7f, 0f, 62.5f, -27.8f, 62.5f, -62.5f)
                close()
                moveToRelative(207.5f, -185.3f)
                curveToRelative(0f, -42f, -34.3f, -76.2f, -76.2f, -76.2f)
                curveToRelative(-42.3f, 0f, -76.5f, 34.2f, -76.5f, 76.2f)
                curveToRelative(0f, 42.2f, 34.3f, 76.2f, 76.5f, 76.2f)
                curveToRelative(41.9f, 0.1f, 76.2f, -33.9f, 76.2f, -76.2f)
                close()
            }
        }.build()
        
        return _SteamSymbol!!
    }

private var _SteamSymbol: ImageVector? = null

