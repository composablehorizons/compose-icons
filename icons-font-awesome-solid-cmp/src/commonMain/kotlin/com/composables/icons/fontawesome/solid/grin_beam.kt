package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.GrinBeam: ImageVector
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
                moveToRelative(80f, 144f)
                curveToRelative(23.8f, 0f, 52.7f, 29.3f, 56f, 71.4f)
                curveToRelative(0.7f, 8.6f, -10.8f, 11.9f, -14.9f, 4.5f)
                lineToRelative(-9.5f, -17f)
                curveToRelative(-7.7f, -13.7f, -19.2f, -21.6f, -31.5f, -21.6f)
                reflectiveCurveToRelative(-23.8f, 7.9f, -31.5f, 21.6f)
                lineToRelative(-9.5f, 17f)
                curveToRelative(-4.1f, 7.3f, -15.6f, 4f, -14.9f, -4.5f)
                curveToRelative(3.1f, -42.1f, 32f, -71.4f, 55.8f, -71.4f)
                close()
                moveToRelative(-160f, 0f)
                curveToRelative(23.8f, 0f, 52.7f, 29.3f, 56f, 71.4f)
                curveToRelative(0.7f, 8.6f, -10.8f, 11.9f, -14.9f, 4.5f)
                lineToRelative(-9.5f, -17f)
                curveToRelative(-7.7f, -13.7f, -19.2f, -21.6f, -31.5f, -21.6f)
                reflectiveCurveToRelative(-23.8f, 7.9f, -31.5f, 21.6f)
                lineToRelative(-9.5f, 17f)
                curveToRelative(-4.2f, 7.4f, -15.6f, 4f, -14.9f, -4.5f)
                curveToRelative(3.1f, -42.1f, 32f, -71.4f, 55.8f, -71.4f)
                close()
                moveToRelative(80f, 280f)
                curveToRelative(-60.6f, 0f, -134.5f, -38.3f, -143.8f, -93.3f)
                curveToRelative(-2f, -11.9f, 9.4f, -21.6f, 20.7f, -17.9f)
                curveTo(155.1f, 330.5f, 200f, 336f, 248f, 336f)
                reflectiveCurveToRelative(92.9f, -5.5f, 123.1f, -15.2f)
                curveToRelative(11.4f, -3.7f, 22.6f, 6.1f, 20.7f, 17.9f)
                curveToRelative(-9.3f, 55f, -83.2f, 93.3f, -143.8f, 93.3f)
                close()
            }
        }.build()
        
        return _GrinBeam!!
    }

private var _GrinBeam: ImageVector? = null

