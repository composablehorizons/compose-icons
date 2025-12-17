package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.GrinStars: ImageVector
    get() {
        if (_GrinStars != null) return _GrinStars!!
        
        _GrinStars = ImageVector.Builder(
            name = "grin-stars",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(248f, 8f)
                curveTo(111f, 8f, 0f, 119f, 0f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                reflectiveCurveTo(385f, 8f, 248f, 8f)
                close()
                moveToRelative(0f, 448f)
                curveToRelative(-110.3f, 0f, -200f, -89.7f, -200f, -200f)
                reflectiveCurveTo(137.7f, 56f, 248f, 56f)
                reflectiveCurveToRelative(200f, 89.7f, 200f, 200f)
                reflectiveCurveToRelative(-89.7f, 200f, -200f, 200f)
                close()
                moveToRelative(105.6f, -151.4f)
                curveToRelative(-25.9f, 8.3f, -64.4f, 13.1f, -105.6f, 13.1f)
                reflectiveCurveToRelative(-79.6f, -4.8f, -105.6f, -13.1f)
                curveToRelative(-9.8f, -3.1f, -19.4f, 5.3f, -17.7f, 15.3f)
                curveToRelative(7.9f, 47.2f, 71.3f, 80f, 123.3f, 80f)
                reflectiveCurveToRelative(115.3f, -32.9f, 123.3f, -80f)
                curveToRelative(1.6f, -9.8f, -7.7f, -18.4f, -17.7f, -15.3f)
                close()
                moveToRelative(-227.9f, -57.5f)
                curveToRelative(-1f, 6.2f, 5.4f, 11f, 11f, 7.9f)
                lineToRelative(31.3f, -16.3f)
                lineToRelative(31.3f, 16.3f)
                curveToRelative(5.6f, 3.1f, 12f, -1.7f, 11f, -7.9f)
                lineToRelative(-6f, -34.9f)
                lineToRelative(25.4f, -24.6f)
                curveToRelative(4.5f, -4.5f, 1.9f, -12.2f, -4.3f, -13.2f)
                lineToRelative(-34.9f, -5f)
                lineToRelative(-15.5f, -31.6f)
                curveToRelative(-2.9f, -5.8f, -11f, -5.8f, -13.9f, 0f)
                lineToRelative(-15.5f, 31.6f)
                lineToRelative(-34.9f, 5f)
                curveToRelative(-6.2f, 0.9f, -8.9f, 8.6f, -4.3f, 13.2f)
                lineToRelative(25.4f, 24.6f)
                lineToRelative(-6.1f, 34.9f)
                close()
                moveToRelative(259.7f, -72.7f)
                lineToRelative(-34.9f, -5f)
                lineToRelative(-15.5f, -31.6f)
                curveToRelative(-2.9f, -5.8f, -11f, -5.8f, -13.9f, 0f)
                lineToRelative(-15.5f, 31.6f)
                lineToRelative(-34.9f, 5f)
                curveToRelative(-6.2f, 0.9f, -8.9f, 8.6f, -4.3f, 13.2f)
                lineToRelative(25.4f, 24.6f)
                lineToRelative(-6f, 34.9f)
                curveToRelative(-1f, 6.2f, 5.4f, 11f, 11f, 7.9f)
                lineToRelative(31.3f, -16.3f)
                lineToRelative(31.3f, 16.3f)
                curveToRelative(5.6f, 3.1f, 12f, -1.7f, 11f, -7.9f)
                lineToRelative(-6f, -34.9f)
                lineToRelative(25.4f, -24.6f)
                curveToRelative(4.5f, -4.6f, 1.8f, -12.2f, -4.4f, -13.2f)
                close()
            }
        }.build()
        
        return _GrinStars!!
    }

private var _GrinStars: ImageVector? = null

