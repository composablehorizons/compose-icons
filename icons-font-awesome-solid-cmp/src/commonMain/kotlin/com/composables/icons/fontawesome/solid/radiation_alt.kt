package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.RadiationAlt: ImageVector
    get() {
        if (_RadiationAlt != null) return _RadiationAlt!!
        
        _RadiationAlt = ImageVector.Builder(
            name = "radiation-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(312f, 256f)
                horizontalLineToRelative(79.1f)
                curveToRelative(9.2f, 0f, 16.9f, -7.7f, 16f, -16.8f)
                curveToRelative(-4.6f, -43.6f, -27f, -81.8f, -59.5f, -107.8f)
                curveToRelative(-7.6f, -6.1f, -18.8f, -4.5f, -24f, 3.8f)
                lineTo(281.9f, 202f)
                curveToRelative(18f, 11.2f, 30.1f, 31.2f, 30.1f, 54f)
                close()
                moveToRelative(-97.8f, 54.1f)
                lineTo(172.4f, 377f)
                curveToRelative(-4.9f, 7.8f, -2.4f, 18.4f, 5.8f, 22.5f)
                curveToRelative(21.1f, 10.4f, 44.7f, 16.5f, 69.8f, 16.5f)
                reflectiveCurveToRelative(48.7f, -6.1f, 69.9f, -16.5f)
                curveToRelative(8.2f, -4.1f, 10.6f, -14.7f, 5.8f, -22.5f)
                lineToRelative(-41.8f, -66.9f)
                curveToRelative(-9.8f, 6.2f, -21.4f, 9.9f, -33.8f, 9.9f)
                reflectiveCurveToRelative(-24.1f, -3.7f, -33.9f, -9.9f)
                close()
                moveTo(104.9f, 256f)
                horizontalLineTo(184f)
                curveToRelative(0f, -22.8f, 12.1f, -42.8f, 30.2f, -54.1f)
                lineToRelative(-41.7f, -66.8f)
                curveToRelative(-5.2f, -8.3f, -16.4f, -9.9f, -24f, -3.8f)
                curveToRelative(-32.6f, 26f, -54.9f, 64.2f, -59.5f, 107.8f)
                curveToRelative(-1.1f, 9.2f, 6.7f, 16.9f, 15.9f, 16.9f)
                close()
                moveTo(248f, 504f)
                curveToRelative(137f, 0f, 248f, -111f, 248f, -248f)
                reflectiveCurveTo(385f, 8f, 248f, 8f)
                reflectiveCurveTo(0f, 119f, 0f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                close()
                moveToRelative(0f, -432f)
                curveToRelative(101.5f, 0f, 184f, 82.5f, 184f, 184f)
                reflectiveCurveToRelative(-82.5f, 184f, -184f, 184f)
                reflectiveCurveTo(64f, 357.5f, 64f, 256f)
                reflectiveCurveTo(146.5f, 72f, 248f, 72f)
                close()
                moveToRelative(0f, 216f)
                curveToRelative(17.7f, 0f, 32f, -14.3f, 32f, -32f)
                reflectiveCurveToRelative(-14.3f, -32f, -32f, -32f)
                reflectiveCurveToRelative(-32f, 14.3f, -32f, 32f)
                reflectiveCurveToRelative(14.3f, 32f, 32f, 32f)
                close()
            }
        }.build()
        
        return _RadiationAlt!!
    }

private var _RadiationAlt: ImageVector? = null

