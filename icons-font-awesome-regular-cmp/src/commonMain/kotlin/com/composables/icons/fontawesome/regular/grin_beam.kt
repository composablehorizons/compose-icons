package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.GrinBeam: ImageVector
    get() {
        if (_GrinBeam != null) return _GrinBeam!!
        
        _GrinBeam = ImageVector.Builder(
            name = "grin-beam",
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
                curveToRelative(7.9f, 47.1f, 71.3f, 80f, 123.3f, 80f)
                reflectiveCurveToRelative(115.3f, -32.9f, 123.3f, -80f)
                curveToRelative(1.6f, -9.8f, -7.7f, -18.4f, -17.7f, -15.3f)
                close()
                moveToRelative(-235.9f, -72.9f)
                curveToRelative(3.5f, 1.1f, 7.4f, -0.5f, 9.3f, -3.7f)
                lineToRelative(9.5f, -17f)
                curveToRelative(7.7f, -13.7f, 19.2f, -21.6f, 31.5f, -21.6f)
                reflectiveCurveToRelative(23.8f, 7.9f, 31.5f, 21.6f)
                lineToRelative(9.5f, 17f)
                curveToRelative(2.1f, 3.7f, 6.2f, 4.7f, 9.3f, 3.7f)
                curveToRelative(3.6f, -1.1f, 6f, -4.5f, 5.7f, -8.3f)
                curveToRelative(-3.3f, -42.1f, -32.2f, -71.4f, -56f, -71.4f)
                reflectiveCurveToRelative(-52.7f, 29.3f, -56f, 71.4f)
                curveToRelative(-0.3f, 3.7f, 2.1f, 7.2f, 5.7f, 8.3f)
                close()
                moveToRelative(160f, 0f)
                curveToRelative(3.5f, 1.1f, 7.4f, -0.5f, 9.3f, -3.7f)
                lineToRelative(9.5f, -17f)
                curveToRelative(7.7f, -13.7f, 19.2f, -21.6f, 31.5f, -21.6f)
                reflectiveCurveToRelative(23.8f, 7.9f, 31.5f, 21.6f)
                lineToRelative(9.5f, 17f)
                curveToRelative(2.1f, 3.7f, 6.2f, 4.7f, 9.3f, 3.7f)
                curveToRelative(3.6f, -1.1f, 6f, -4.5f, 5.7f, -8.3f)
                curveToRelative(-3.3f, -42.1f, -32.2f, -71.4f, -56f, -71.4f)
                reflectiveCurveToRelative(-52.7f, 29.3f, -56f, 71.4f)
                curveToRelative(-0.3f, 3.7f, 2.1f, 7.2f, 5.7f, 8.3f)
                close()
            }
        }.build()
        
        return _GrinBeam!!
    }

private var _GrinBeam: ImageVector? = null

