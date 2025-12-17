package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Spotify: ImageVector
    get() {
        if (_Spotify != null) return _Spotify!!
        
        _Spotify = ImageVector.Builder(
            name = "spotify",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(248f, 8f)
                curveTo(111.1f, 8f, 0f, 119.1f, 0f, 256f)
                reflectiveCurveToRelative(111.1f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111.1f, 248f, -248f)
                reflectiveCurveTo(384.9f, 8f, 248f, 8f)
                close()
                moveToRelative(100.7f, 364.9f)
                curveToRelative(-4.2f, 0f, -6.8f, -1.3f, -10.7f, -3.6f)
                curveToRelative(-62.4f, -37.6f, -135f, -39.2f, -206.7f, -24.5f)
                curveToRelative(-3.9f, 1f, -9f, 2.6f, -11.9f, 2.6f)
                curveToRelative(-9.7f, 0f, -15.8f, -7.7f, -15.8f, -15.8f)
                curveToRelative(0f, -10.3f, 6.1f, -15.2f, 13.6f, -16.8f)
                curveToRelative(81.9f, -18.1f, 165.6f, -16.5f, 237f, 26.2f)
                curveToRelative(6.1f, 3.9f, 9.7f, 7.4f, 9.7f, 16.5f)
                reflectiveCurveToRelative(-7.1f, 15.4f, -15.2f, 15.4f)
                close()
                moveToRelative(26.9f, -65.6f)
                curveToRelative(-5.2f, 0f, -8.7f, -2.3f, -12.3f, -4.2f)
                curveToRelative(-62.5f, -37f, -155.7f, -51.9f, -238.6f, -29.4f)
                curveToRelative(-4.8f, 1.3f, -7.4f, 2.6f, -11.9f, 2.6f)
                curveToRelative(-10.7f, 0f, -19.4f, -8.7f, -19.4f, -19.4f)
                reflectiveCurveToRelative(5.2f, -17.8f, 15.5f, -20.7f)
                curveToRelative(27.8f, -7.8f, 56.2f, -13.6f, 97.8f, -13.6f)
                curveToRelative(64.9f, 0f, 127.6f, 16.1f, 177f, 45.5f)
                curveToRelative(8.1f, 4.8f, 11.3f, 11f, 11.3f, 19.7f)
                curveToRelative(-0.1f, 10.8f, -8.5f, 19.5f, -19.4f, 19.5f)
                close()
                moveToRelative(31f, -76.2f)
                curveToRelative(-5.2f, 0f, -8.4f, -1.3f, -12.9f, -3.9f)
                curveToRelative(-71.2f, -42.5f, -198.5f, -52.7f, -280.9f, -29.7f)
                curveToRelative(-3.6f, 1f, -8.1f, 2.6f, -12.9f, 2.6f)
                curveToRelative(-13.2f, 0f, -23.3f, -10.3f, -23.3f, -23.6f)
                curveToRelative(0f, -13.6f, 8.4f, -21.3f, 17.4f, -23.9f)
                curveToRelative(35.2f, -10.3f, 74.6f, -15.2f, 117.5f, -15.2f)
                curveToRelative(73f, 0f, 149.5f, 15.2f, 205.4f, 47.8f)
                curveToRelative(7.8f, 4.5f, 12.9f, 10.7f, 12.9f, 22.6f)
                curveToRelative(0f, 13.6f, -11f, 23.3f, -23.2f, 23.3f)
                close()
            }
        }.build()
        
        return _Spotify!!
    }

private var _Spotify: ImageVector? = null

