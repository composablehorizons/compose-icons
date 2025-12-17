package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.LaughBeam: ImageVector
    get() {
        if (_LaughBeam != null) return _LaughBeam!!
        
        _LaughBeam = ImageVector.Builder(
            name = "laugh-beam",
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
                moveToRelative(141.4f, 389.4f)
                curveToRelative(-37.8f, 37.8f, -88f, 58.6f, -141.4f, 58.6f)
                reflectiveCurveToRelative(-103.6f, -20.8f, -141.4f, -58.6f)
                reflectiveCurveTo(48f, 309.4f, 48f, 256f)
                reflectiveCurveToRelative(20.8f, -103.6f, 58.6f, -141.4f)
                reflectiveCurveTo(194.6f, 56f, 248f, 56f)
                reflectiveCurveToRelative(103.6f, 20.8f, 141.4f, 58.6f)
                reflectiveCurveTo(448f, 202.6f, 448f, 256f)
                reflectiveCurveToRelative(-20.8f, 103.6f, -58.6f, 141.4f)
                close()
                moveTo(328f, 152f)
                curveToRelative(-23.8f, 0f, -52.7f, 29.3f, -56f, 71.4f)
                curveToRelative(-0.7f, 8.6f, 10.8f, 11.9f, 14.9f, 4.5f)
                lineToRelative(9.5f, -17f)
                curveToRelative(7.7f, -13.7f, 19.2f, -21.6f, 31.5f, -21.6f)
                reflectiveCurveToRelative(23.8f, 7.9f, 31.5f, 21.6f)
                lineToRelative(9.5f, 17f)
                curveToRelative(4.1f, 7.4f, 15.6f, 4f, 14.9f, -4.5f)
                curveToRelative(-3.1f, -42.1f, -32f, -71.4f, -55.8f, -71.4f)
                close()
                moveToRelative(-201f, 75.9f)
                lineToRelative(9.5f, -17f)
                curveToRelative(7.7f, -13.7f, 19.2f, -21.6f, 31.5f, -21.6f)
                reflectiveCurveToRelative(23.8f, 7.9f, 31.5f, 21.6f)
                lineToRelative(9.5f, 17f)
                curveToRelative(4.1f, 7.4f, 15.6f, 4f, 14.9f, -4.5f)
                curveToRelative(-3.3f, -42.1f, -32.2f, -71.4f, -56f, -71.4f)
                reflectiveCurveToRelative(-52.7f, 29.3f, -56f, 71.4f)
                curveToRelative(-0.6f, 8.5f, 10.9f, 11.9f, 15.1f, 4.5f)
                close()
                moveTo(362.4f, 288f)
                horizontalLineTo(133.6f)
                curveToRelative(-8.2f, 0f, -14.5f, 7f, -13.5f, 15f)
                curveToRelative(7.5f, 59.2f, 58.9f, 105f, 121.1f, 105f)
                horizontalLineToRelative(13.6f)
                curveToRelative(62.2f, 0f, 113.6f, -45.8f, 121.1f, -105f)
                curveToRelative(1f, -8f, -5.3f, -15f, -13.5f, -15f)
                close()
            }
        }.build()
        
        return _LaughBeam!!
    }

private var _LaughBeam: ImageVector? = null

