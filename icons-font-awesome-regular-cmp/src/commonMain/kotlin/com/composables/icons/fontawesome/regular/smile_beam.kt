package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.SmileBeam: ImageVector
    get() {
        if (_SmileBeam != null) return _SmileBeam!!
        
        _SmileBeam = ImageVector.Builder(
            name = "smile-beam",
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
                moveToRelative(84f, -143.4f)
                curveToRelative(-20.8f, 25f, -51.5f, 39.4f, -84f, 39.4f)
                reflectiveCurveToRelative(-63.2f, -14.3f, -84f, -39.4f)
                curveToRelative(-8.5f, -10.2f, -23.6f, -11.5f, -33.8f, -3.1f)
                curveToRelative(-10.2f, 8.5f, -11.5f, 23.6f, -3.1f, 33.8f)
                curveToRelative(30f, 36f, 74.1f, 56.6f, 120.9f, 56.6f)
                reflectiveCurveToRelative(90.9f, -20.6f, 120.9f, -56.6f)
                curveToRelative(8.5f, -10.2f, 7.1f, -25.3f, -3.1f, -33.8f)
                curveToRelative(-10.2f, -8.4f, -25.3f, -7.1f, -33.8f, 3.1f)
                close()
                moveTo(136.5f, 211f)
                curveToRelative(7.7f, -13.7f, 19.2f, -21.6f, 31.5f, -21.6f)
                reflectiveCurveToRelative(23.8f, 7.9f, 31.5f, 21.6f)
                lineToRelative(9.5f, 17f)
                curveToRelative(2.1f, 3.7f, 6.2f, 4.7f, 9.3f, 3.7f)
                curveToRelative(3.6f, -1.1f, 6f, -4.5f, 5.7f, -8.3f)
                curveToRelative(-3.3f, -42.1f, -32.2f, -71.4f, -56f, -71.4f)
                reflectiveCurveToRelative(-52.7f, 29.3f, -56f, 71.4f)
                curveToRelative(-0.3f, 3.7f, 2.1f, 7.2f, 5.7f, 8.3f)
                curveToRelative(3.4f, 1.1f, 7.4f, -0.5f, 9.3f, -3.7f)
                lineToRelative(9.5f, -17f)
                close()
                moveTo(328f, 152f)
                curveToRelative(-23.8f, 0f, -52.7f, 29.3f, -56f, 71.4f)
                curveToRelative(-0.3f, 3.7f, 2.1f, 7.2f, 5.7f, 8.3f)
                curveToRelative(3.5f, 1.1f, 7.4f, -0.5f, 9.3f, -3.7f)
                lineToRelative(9.5f, -17f)
                curveToRelative(7.7f, -13.7f, 19.2f, -21.6f, 31.5f, -21.6f)
                reflectiveCurveToRelative(23.8f, 7.9f, 31.5f, 21.6f)
                lineToRelative(9.5f, 17f)
                curveToRelative(2.1f, 3.7f, 6.2f, 4.7f, 9.3f, 3.7f)
                curveToRelative(3.6f, -1.1f, 6f, -4.5f, 5.7f, -8.3f)
                curveToRelative(-3.3f, -42.1f, -32.2f, -71.4f, -56f, -71.4f)
                close()
            }
        }.build()
        
        return _SmileBeam!!
    }

private var _SmileBeam: ImageVector? = null

