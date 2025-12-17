package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SmileBeam: ImageVector
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
                moveTo(112f, 223.4f)
                curveToRelative(3.3f, -42.1f, 32.2f, -71.4f, 56f, -71.4f)
                reflectiveCurveToRelative(52.7f, 29.3f, 56f, 71.4f)
                curveToRelative(0.7f, 8.6f, -10.8f, 11.9f, -14.9f, 4.5f)
                lineToRelative(-9.5f, -17f)
                curveToRelative(-7.7f, -13.7f, -19.2f, -21.6f, -31.5f, -21.6f)
                reflectiveCurveToRelative(-23.8f, 7.9f, -31.5f, 21.6f)
                lineToRelative(-9.5f, 17f)
                curveToRelative(-4.3f, 7.4f, -15.8f, 4f, -15.1f, -4.5f)
                close()
                moveToRelative(250.8f, 122.8f)
                curveTo(334.3f, 380.4f, 292.5f, 400f, 248f, 400f)
                reflectiveCurveToRelative(-86.3f, -19.6f, -114.8f, -53.8f)
                curveToRelative(-13.5f, -16.3f, 11f, -36.7f, 24.6f, -20.5f)
                curveToRelative(22.4f, 26.9f, 55.2f, 42.2f, 90.2f, 42.2f)
                reflectiveCurveToRelative(67.8f, -15.4f, 90.2f, -42.2f)
                curveToRelative(13.6f, -16.2f, 38.1f, 4.3f, 24.6f, 20.5f)
                close()
                moveToRelative(6.2f, -118.3f)
                lineToRelative(-9.5f, -17f)
                curveToRelative(-7.7f, -13.7f, -19.2f, -21.6f, -31.5f, -21.6f)
                reflectiveCurveToRelative(-23.8f, 7.9f, -31.5f, 21.6f)
                lineToRelative(-9.5f, 17f)
                curveToRelative(-4.1f, 7.3f, -15.6f, 4f, -14.9f, -4.5f)
                curveToRelative(3.3f, -42.1f, 32.2f, -71.4f, 56f, -71.4f)
                reflectiveCurveToRelative(52.7f, 29.3f, 56f, 71.4f)
                curveToRelative(0.6f, 8.6f, -11f, 11.9f, -15.1f, 4.5f)
                close()
            }
        }.build()
        
        return _SmileBeam!!
    }

private var _SmileBeam: ImageVector? = null

