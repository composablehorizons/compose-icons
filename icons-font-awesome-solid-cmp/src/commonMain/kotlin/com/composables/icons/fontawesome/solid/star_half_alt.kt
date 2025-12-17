package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.StarHalfAlt: ImageVector
    get() {
        if (_StarHalfAlt != null) return _StarHalfAlt!!
        
        _StarHalfAlt = ImageVector.Builder(
            name = "star-half-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 536f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(508.55f, 171.51f)
                lineTo(362.18f, 150.2f)
                lineTo(296.77f, 17.81f)
                curveTo(290.89f, 5.98f, 279.42f, 0f, 267.95f, 0f)
                curveToRelative(-11.4f, 0f, -22.79f, 5.9f, -28.69f, 17.81f)
                lineToRelative(-65.43f, 132.38f)
                lineToRelative(-146.38f, 21.29f)
                curveToRelative(-26.25f, 3.8f, -36.77f, 36.09f, -17.74f, 54.59f)
                lineToRelative(105.89f, 103f)
                lineToRelative(-25.06f, 145.48f)
                curveTo(86.98f, 495.33f, 103.57f, 512f, 122.15f, 512f)
                curveToRelative(4.93f, 0f, 10f, -1.17f, 14.87f, -3.75f)
                lineToRelative(130.95f, -68.68f)
                lineToRelative(130.94f, 68.7f)
                curveToRelative(4.86f, 2.55f, 9.92f, 3.71f, 14.83f, 3.71f)
                curveToRelative(18.6f, 0f, 35.22f, -16.61f, 31.66f, -37.4f)
                lineToRelative(-25.03f, -145.49f)
                lineToRelative(105.91f, -102.98f)
                curveToRelative(19.04f, -18.5f, 8.52f, -50.8f, -17.73f, -54.6f)
                close()
                moveToRelative(-121.74f, 123.2f)
                lineToRelative(-18.12f, 17.62f)
                lineToRelative(4.28f, 24.88f)
                lineToRelative(19.52f, 113.45f)
                lineToRelative(-102.13f, -53.59f)
                lineToRelative(-22.38f, -11.74f)
                lineToRelative(0.03f, -317.19f)
                lineToRelative(51.03f, 103.29f)
                lineToRelative(11.18f, 22.63f)
                lineToRelative(25.01f, 3.64f)
                lineToRelative(114.23f, 16.63f)
                lineToRelative(-82.65f, 80.38f)
                close()
            }
        }.build()
        
        return _StarHalfAlt!!
    }

private var _StarHalfAlt: ImageVector? = null

