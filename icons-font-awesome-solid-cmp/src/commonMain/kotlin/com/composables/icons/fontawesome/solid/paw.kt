package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Paw: ImageVector
    get() {
        if (_Paw != null) return _Paw!!
        
        _Paw = ImageVector.Builder(
            name = "paw",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 224f)
                curveToRelative(-79.41f, 0f, -192f, 122.76f, -192f, 200.25f)
                curveToRelative(0f, 34.9f, 26.81f, 55.75f, 71.74f, 55.75f)
                curveToRelative(48.84f, 0f, 81.09f, -25.08f, 120.26f, -25.08f)
                curveToRelative(39.51f, 0f, 71.85f, 25.08f, 120.26f, 25.08f)
                curveToRelative(44.93f, 0f, 71.74f, -20.85f, 71.74f, -55.75f)
                curveTo(448f, 346.76f, 335.41f, 224f, 256f, 224f)
                close()
                moveToRelative(-147.28f, -12.61f)
                curveToRelative(-10.4f, -34.65f, -42.44f, -57.09f, -71.56f, -50.13f)
                curveToRelative(-29.12f, 6.96f, -44.29f, 40.69f, -33.89f, 75.34f)
                curveToRelative(10.4f, 34.65f, 42.44f, 57.09f, 71.56f, 50.13f)
                curveToRelative(29.12f, -6.96f, 44.29f, -40.69f, 33.89f, -75.34f)
                close()
                moveToRelative(84.72f, -20.78f)
                curveToRelative(30.94f, -8.14f, 46.42f, -49.94f, 34.58f, -93.36f)
                reflectiveCurveToRelative(-46.52f, -72.01f, -77.46f, -63.87f)
                reflectiveCurveToRelative(-46.42f, 49.94f, -34.58f, 93.36f)
                curveToRelative(11.84f, 43.42f, 46.53f, 72.02f, 77.46f, 63.87f)
                close()
                moveToRelative(281.39f, -29.34f)
                curveToRelative(-29.12f, -6.96f, -61.15f, 15.48f, -71.56f, 50.13f)
                curveToRelative(-10.4f, 34.65f, 4.77f, 68.38f, 33.89f, 75.34f)
                curveToRelative(29.12f, 6.96f, 61.15f, -15.48f, 71.56f, -50.13f)
                curveToRelative(10.4f, -34.65f, -4.77f, -68.38f, -33.89f, -75.34f)
                close()
                moveToRelative(-156.27f, 29.34f)
                curveToRelative(30.94f, 8.14f, 65.62f, -20.45f, 77.46f, -63.87f)
                curveToRelative(11.84f, -43.42f, -3.64f, -85.21f, -34.58f, -93.36f)
                reflectiveCurveToRelative(-65.62f, 20.45f, -77.46f, 63.87f)
                curveToRelative(-11.84f, 43.42f, 3.64f, 85.22f, 34.58f, 93.36f)
                close()
            }
        }.build()
        
        return _Paw!!
    }

private var _Paw: ImageVector? = null

