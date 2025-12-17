package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.GrinAlt: ImageVector
    get() {
        if (_GrinAlt != null) return _GrinAlt!!
        
        _GrinAlt = ImageVector.Builder(
            name = "grin-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200.3f, 248f)
                curveToRelative(12.4f, -18.7f, 15.1f, -37.3f, 15.7f, -56f)
                curveToRelative(-0.5f, -18.7f, -3.3f, -37.3f, -15.7f, -56f)
                curveToRelative(-8f, -12f, -25.1f, -11.4f, -32.7f, 0f)
                curveToRelative(-12.4f, 18.7f, -15.1f, 37.3f, -15.7f, 56f)
                curveToRelative(0.5f, 18.7f, 3.3f, 37.3f, 15.7f, 56f)
                curveToRelative(8.1f, 12f, 25.2f, 11.4f, 32.7f, 0f)
                close()
                moveToRelative(128f, 0f)
                curveToRelative(12.4f, -18.7f, 15.1f, -37.3f, 15.7f, -56f)
                curveToRelative(-0.5f, -18.7f, -3.3f, -37.3f, -15.7f, -56f)
                curveToRelative(-8f, -12f, -25.1f, -11.4f, -32.7f, 0f)
                curveToRelative(-12.4f, 18.7f, -15.1f, 37.3f, -15.7f, 56f)
                curveToRelative(0.5f, 18.7f, 3.3f, 37.3f, 15.7f, 56f)
                curveToRelative(8.1f, 12f, 25.2f, 11.4f, 32.7f, 0f)
                close()
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
                curveToRelative(-9.9f, -3.1f, -19.4f, 5.3f, -17.7f, 15.3f)
                curveToRelative(7.9f, 47.2f, 71.3f, 80f, 123.3f, 80f)
                reflectiveCurveToRelative(115.3f, -32.9f, 123.3f, -80f)
                curveToRelative(1.6f, -9.8f, -7.7f, -18.4f, -17.7f, -15.3f)
                close()
            }
        }.build()
        
        return _GrinAlt!!
    }

private var _GrinAlt: ImageVector? = null

