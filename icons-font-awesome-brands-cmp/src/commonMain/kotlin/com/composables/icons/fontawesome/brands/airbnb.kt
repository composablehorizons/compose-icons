package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Airbnb: ImageVector
    get() {
        if (_Airbnb != null) return _Airbnb!!
        
        _Airbnb = ImageVector.Builder(
            name = "airbnb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224f, 373.12f)
                curveToRelative(-25.24f, -31.67f, -40.08f, -59.43f, -45f, -83.18f)
                curveToRelative(-22.55f, -88f, 112.61f, -88f, 90.06f, 0f)
                curveToRelative(-5.45f, 24.25f, -20.29f, 52f, -45f, 83.18f)
                close()
                moveToRelative(138.15f, 73.23f)
                curveToRelative(-42.06f, 18.31f, -83.67f, -10.88f, -119.3f, -50.47f)
                curveToRelative(103.9f, -130.07f, 46.11f, -200f, -18.85f, -200f)
                curveToRelative(-54.92f, 0f, -85.16f, 46.51f, -73.28f, 100.5f)
                curveToRelative(6.93f, 29.19f, 25.23f, 62.39f, 54.43f, 99.5f)
                curveToRelative(-32.53f, 36.05f, -60.55f, 52.69f, -85.15f, 54.92f)
                curveToRelative(-50f, 7.43f, -89.11f, -41.06f, -71.3f, -91.09f)
                curveToRelative(15.1f, -39.16f, 111.72f, -231.18f, 115.87f, -241.56f)
                curveToRelative(15.75f, -30.07f, 25.56f, -57.4f, 59.38f, -57.4f)
                curveToRelative(32.34f, 0f, 43.4f, 25.94f, 60.37f, 59.87f)
                curveToRelative(36f, 70.62f, 89.35f, 177.48f, 114.84f, 239.09f)
                curveToRelative(13.17f, 33.07f, -1.37f, 71.29f, -37.01f, 86.64f)
                close()
                moveToRelative(47f, -136.12f)
                curveTo(280.27f, 35.93f, 273.13f, 32f, 224f, 32f)
                curveToRelative(-45.52f, 0f, -64.87f, 31.67f, -84.66f, 72.79f)
                curveTo(33.18f, 317.1f, 22.89f, 347.19f, 22f, 349.81f)
                curveTo(-3.22f, 419.14f, 48.74f, 480f, 111.63f, 480f)
                curveToRelative(21.71f, 0f, 60.61f, -6.06f, 112.37f, -62.4f)
                curveToRelative(58.68f, 63.78f, 101.26f, 62.4f, 112.37f, 62.4f)
                curveToRelative(62.89f, 0.05f, 114.85f, -60.86f, 89.61f, -130.19f)
                curveToRelative(0.02f, -3.89f, -16.82f, -38.9f, -16.82f, -39.58f)
                close()
            }
        }.build()
        
        return _Airbnb!!
    }

private var _Airbnb: ImageVector? = null

