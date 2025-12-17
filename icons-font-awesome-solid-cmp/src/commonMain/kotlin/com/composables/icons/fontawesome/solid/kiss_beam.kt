package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.KissBeam: ImageVector
    get() {
        if (_KissBeam != null) return _KissBeam!!
        
        _KissBeam = ImageVector.Builder(
            name = "kiss-beam",
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
                moveToRelative(-39f, 219.9f)
                lineToRelative(-9.5f, -17f)
                curveToRelative(-7.7f, -13.7f, -19.2f, -21.6f, -31.5f, -21.6f)
                reflectiveCurveToRelative(-23.8f, 7.9f, -31.5f, 21.6f)
                lineToRelative(-9.5f, 17f)
                curveToRelative(-4.2f, 7.4f, -15.6f, 4f, -14.9f, -4.5f)
                curveToRelative(3.3f, -42.1f, 32.2f, -71.4f, 56f, -71.4f)
                reflectiveCurveToRelative(52.7f, 29.3f, 56f, 71.4f)
                curveToRelative(0.5f, 8.5f, -10.9f, 12f, -15.1f, 4.5f)
                close()
                moveTo(304f, 396f)
                curveToRelative(0f, 19.2f, -28.7f, 41.5f, -71.5f, 44f)
                curveToRelative(-8.5f, 0.8f, -12.1f, -11.8f, -3.6f, -15.4f)
                lineToRelative(17f, -7.2f)
                curveToRelative(13f, -5.5f, 20.8f, -13.5f, 20.8f, -21.5f)
                reflectiveCurveToRelative(-7.8f, -16f, -20.8f, -21.5f)
                lineToRelative(-17f, -7.2f)
                curveToRelative(-6f, -2.5f, -6.1f, -12.2f, 0f, -14.8f)
                lineToRelative(17f, -7.2f)
                curveToRelative(13f, -5.5f, 20.8f, -13.5f, 20.8f, -21.5f)
                reflectiveCurveToRelative(-7.8f, -16f, -20.8f, -21.5f)
                lineToRelative(-17f, -7.2f)
                curveToRelative(-8.6f, -3.6f, -4.8f, -16.5f, 3.6f, -15.4f)
                curveToRelative(42.8f, 2.5f, 71.5f, 24.8f, 71.5f, 44f)
                curveToRelative(0f, 13f, -13.4f, 27.3f, -35.2f, 36f)
                curveTo(290.6f, 368.7f, 304f, 383f, 304f, 396f)
                close()
                moveToRelative(65f, -168.1f)
                lineToRelative(-9.5f, -17f)
                curveToRelative(-7.7f, -13.7f, -19.2f, -21.6f, -31.5f, -21.6f)
                reflectiveCurveToRelative(-23.8f, 7.9f, -31.5f, 21.6f)
                lineToRelative(-9.5f, 17f)
                curveToRelative(-4.1f, 7.3f, -15.6f, 4f, -14.9f, -4.5f)
                curveToRelative(3.3f, -42.1f, 32.2f, -71.4f, 56f, -71.4f)
                reflectiveCurveToRelative(52.7f, 29.3f, 56f, 71.4f)
                curveToRelative(0.5f, 8.5f, -10.9f, 12f, -15.1f, 4.5f)
                close()
            }
        }.build()
        
        return _KissBeam!!
    }

private var _KissBeam: ImageVector? = null

