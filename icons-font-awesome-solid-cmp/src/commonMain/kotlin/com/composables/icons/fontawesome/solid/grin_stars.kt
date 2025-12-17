package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.GrinStars: ImageVector
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
                moveTo(94.6f, 168.9f)
                lineToRelative(34.9f, -5f)
                lineToRelative(15.5f, -31.6f)
                curveToRelative(2.9f, -5.8f, 11f, -5.8f, 13.9f, 0f)
                lineToRelative(15.5f, 31.6f)
                lineToRelative(34.9f, 5f)
                curveToRelative(6.2f, 1f, 8.9f, 8.6f, 4.3f, 13.2f)
                lineToRelative(-25.4f, 24.6f)
                lineToRelative(6f, 34.9f)
                curveToRelative(1f, 6.2f, -5.3f, 11f, -11f, 7.9f)
                lineTo(152f, 233.3f)
                lineToRelative(-31.3f, 16.3f)
                curveToRelative(-5.7f, 3.1f, -12f, -1.7f, -11f, -7.9f)
                lineToRelative(6f, -34.9f)
                lineToRelative(-25.4f, -24.6f)
                curveToRelative(-4.6f, -4.7f, -1.9f, -12.3f, 4.3f, -13.3f)
                close()
                moveTo(248f, 432f)
                curveToRelative(-60.6f, 0f, -134.5f, -38.3f, -143.8f, -93.3f)
                curveToRelative(-2f, -11.8f, 9.3f, -21.5f, 20.7f, -17.9f)
                curveTo(155.1f, 330.5f, 200f, 336f, 248f, 336f)
                reflectiveCurveToRelative(92.9f, -5.5f, 123.1f, -15.2f)
                curveToRelative(11.5f, -3.7f, 22.6f, 6.1f, 20.7f, 17.9f)
                curveToRelative(-9.3f, 55f, -83.2f, 93.3f, -143.8f, 93.3f)
                close()
                moveToRelative(157.7f, -249.9f)
                lineToRelative(-25.4f, 24.6f)
                lineToRelative(6f, 34.9f)
                curveToRelative(1f, 6.2f, -5.3f, 11f, -11f, 7.9f)
                lineTo(344f, 233.3f)
                lineToRelative(-31.3f, 16.3f)
                curveToRelative(-5.7f, 3.1f, -12f, -1.7f, -11f, -7.9f)
                lineToRelative(6f, -34.9f)
                lineToRelative(-25.4f, -24.6f)
                curveToRelative(-4.5f, -4.6f, -1.9f, -12.2f, 4.3f, -13.2f)
                lineToRelative(34.9f, -5f)
                lineToRelative(15.5f, -31.6f)
                curveToRelative(2.9f, -5.8f, 11f, -5.8f, 13.9f, 0f)
                lineToRelative(15.5f, 31.6f)
                lineToRelative(34.9f, 5f)
                curveToRelative(6.3f, 0.9f, 9f, 8.5f, 4.4f, 13.1f)
                close()
            }
        }.build()
        
        return _GrinStars!!
    }

private var _GrinStars: ImageVector? = null

