package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Wordpress: ImageVector
    get() {
        if (_Wordpress != null) return _Wordpress!!
        
        _Wordpress = ImageVector.Builder(
            name = "wordpress",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(61.7f, 169.4f)
                lineToRelative(101.5f, 278f)
                curveTo(92.2f, 413f, 43.3f, 340.2f, 43.3f, 256f)
                curveToRelative(0f, -30.9f, 6.6f, -60.1f, 18.4f, -86.6f)
                close()
                moveToRelative(337.9f, 75.9f)
                curveToRelative(0f, -26.3f, -9.4f, -44.5f, -17.5f, -58.7f)
                curveToRelative(-10.8f, -17.5f, -20.9f, -32.4f, -20.9f, -49.9f)
                curveToRelative(0f, -19.6f, 14.8f, -37.8f, 35.7f, -37.8f)
                curveToRelative(0.9f, 0f, 1.8f, 0.1f, 2.8f, 0.2f)
                curveToRelative(-37.9f, -34.7f, -88.3f, -55.9f, -143.7f, -55.9f)
                curveToRelative(-74.3f, 0f, -139.7f, 38.1f, -177.8f, 95.9f)
                curveToRelative(5f, 0.2f, 9.7f, 0.3f, 13.7f, 0.3f)
                curveToRelative(22.2f, 0f, 56.7f, -2.7f, 56.7f, -2.7f)
                curveToRelative(11.5f, -0.7f, 12.8f, 16.2f, 1.4f, 17.5f)
                curveToRelative(0f, 0f, -11.5f, 1.3f, -24.3f, 2f)
                lineToRelative(77.5f, 230.4f)
                lineTo(249.8f, 247f)
                lineToRelative(-33.1f, -90.8f)
                curveToRelative(-11.5f, -0.7f, -22.3f, -2f, -22.3f, -2f)
                curveToRelative(-11.5f, -0.7f, -10.1f, -18.2f, 1.3f, -17.5f)
                curveToRelative(0f, 0f, 35.1f, 2.7f, 56f, 2.7f)
                curveToRelative(22.2f, 0f, 56.7f, -2.7f, 56.7f, -2.7f)
                curveToRelative(11.5f, -0.7f, 12.8f, 16.2f, 1.4f, 17.5f)
                curveToRelative(0f, 0f, -11.5f, 1.3f, -24.3f, 2f)
                lineToRelative(76.9f, 228.7f)
                lineToRelative(21.2f, -70.9f)
                curveToRelative(9f, -29.4f, 16f, -50.5f, 16f, -68.7f)
                close()
                moveToRelative(-139.9f, 29.3f)
                lineToRelative(-63.8f, 185.5f)
                curveToRelative(19.1f, 5.6f, 39.2f, 8.7f, 60.1f, 8.7f)
                curveToRelative(24.8f, 0f, 48.5f, -4.3f, 70.6f, -12.1f)
                curveToRelative(-0.6f, -0.9f, -1.1f, -1.9f, -1.5f, -2.9f)
                lineToRelative(-65.4f, -179.2f)
                close()
                moveToRelative(183f, -120.7f)
                curveToRelative(0.9f, 6.8f, 1.4f, 14f, 1.4f, 21.9f)
                curveToRelative(0f, 21.6f, -4f, 45.8f, -16.2f, 76.2f)
                lineToRelative(-65f, 187.9f)
                curveTo(426.2f, 403f, 468.7f, 334.5f, 468.7f, 256f)
                curveToRelative(0f, -37f, -9.4f, -71.8f, -26f, -102.1f)
                close()
                moveTo(504f, 256f)
                curveToRelative(0f, 136.8f, -111.3f, 248f, -248f, 248f)
                curveTo(119.2f, 504f, 8f, 392.7f, 8f, 256f)
                curveTo(8f, 119.2f, 119.2f, 8f, 256f, 8f)
                curveToRelative(136.7f, 0f, 248f, 111.2f, 248f, 248f)
                close()
                moveToRelative(-11.4f, 0f)
                curveToRelative(0f, -130.5f, -106.2f, -236.6f, -236.6f, -236.6f)
                curveTo(125.5f, 19.4f, 19.4f, 125.5f, 19.4f, 256f)
                reflectiveCurveTo(125.6f, 492.6f, 256f, 492.6f)
                curveToRelative(130.5f, 0f, 236.6f, -106.1f, 236.6f, -236.6f)
                close()
            }
        }.build()
        
        return _Wordpress!!
    }

private var _Wordpress: ImageVector? = null

