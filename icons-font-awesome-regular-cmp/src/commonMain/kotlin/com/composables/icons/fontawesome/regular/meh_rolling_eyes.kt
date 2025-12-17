package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.MehRollingEyes: ImageVector
    get() {
        if (_MehRollingEyes != null) return _MehRollingEyes!!
        
        _MehRollingEyes = ImageVector.Builder(
            name = "meh-rolling-eyes",
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
                moveToRelative(88f, -304f)
                curveToRelative(-39.8f, 0f, -72f, 32.2f, -72f, 72f)
                reflectiveCurveToRelative(32.2f, 72f, 72f, 72f)
                reflectiveCurveToRelative(72f, -32.2f, 72f, -72f)
                reflectiveCurveToRelative(-32.2f, -72f, -72f, -72f)
                close()
                moveToRelative(0f, 112f)
                curveToRelative(-22.1f, 0f, -40f, -17.9f, -40f, -40f)
                curveToRelative(0f, -13.6f, 7.3f, -25.1f, 17.7f, -32.3f)
                curveToRelative(-1f, 2.6f, -1.7f, 5.3f, -1.7f, 8.3f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                reflectiveCurveToRelative(24f, -10.7f, 24f, -24f)
                curveToRelative(0f, -2.9f, -0.7f, -5.7f, -1.7f, -8.3f)
                curveToRelative(10.4f, 7.2f, 17.7f, 18.7f, 17.7f, 32.3f)
                curveToRelative(0f, 22.1f, -17.9f, 40f, -40f, 40f)
                close()
                moveToRelative(-104f, -40f)
                curveToRelative(0f, -39.8f, -32.2f, -72f, -72f, -72f)
                reflectiveCurveToRelative(-72f, 32.2f, -72f, 72f)
                reflectiveCurveToRelative(32.2f, 72f, 72f, 72f)
                reflectiveCurveToRelative(72f, -32.2f, 72f, -72f)
                close()
                moveToRelative(-112f, 0f)
                curveToRelative(0f, -13.6f, 7.3f, -25.1f, 17.7f, -32.3f)
                curveToRelative(-1f, 2.6f, -1.7f, 5.3f, -1.7f, 8.3f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                reflectiveCurveToRelative(24f, -10.7f, 24f, -24f)
                curveToRelative(0f, -2.9f, -0.7f, -5.7f, -1.7f, -8.3f)
                curveToRelative(10.4f, 7.2f, 17.7f, 18.7f, 17.7f, 32.3f)
                curveToRelative(0f, 22.1f, -17.9f, 40f, -40f, 40f)
                reflectiveCurveToRelative(-40f, -17.9f, -40f, -40f)
                close()
                moveToRelative(192f, 128f)
                horizontalLineTo(184f)
                curveToRelative(-13.2f, 0f, -24f, 10.8f, -24f, 24f)
                reflectiveCurveToRelative(10.8f, 24f, 24f, 24f)
                horizontalLineToRelative(128f)
                curveToRelative(13.2f, 0f, 24f, -10.8f, 24f, -24f)
                reflectiveCurveToRelative(-10.8f, -24f, -24f, -24f)
                close()
            }
        }.build()
        
        return _MehRollingEyes!!
    }

private var _MehRollingEyes: ImageVector? = null

