package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.GrinTongueWink: ImageVector
    get() {
        if (_GrinTongueWink != null) return _GrinTongueWink!!
        
        _GrinTongueWink = ImageVector.Builder(
            name = "grin-tongue-wink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(344f, 184f)
                curveToRelative(-13.3f, 0f, -24f, 10.7f, -24f, 24f)
                reflectiveCurveToRelative(10.7f, 24f, 24f, 24f)
                reflectiveCurveToRelative(24f, -10.7f, 24f, -24f)
                reflectiveCurveToRelative(-10.7f, -24f, -24f, -24f)
                close()
                moveTo(248f, 8f)
                curveTo(111f, 8f, 0f, 119f, 0f, 256f)
                curveToRelative(0f, 106.3f, 67f, 196.7f, 161f, 232f)
                curveToRelative(-5.6f, -12.2f, -9f, -25.7f, -9f, -40f)
                verticalLineToRelative(-45.5f)
                curveToRelative(-24.7f, -16.2f, -43.5f, -38.1f, -47.8f, -63.8f)
                curveToRelative(-2f, -11.8f, 9.3f, -21.5f, 20.7f, -17.9f)
                curveTo(155.1f, 330.5f, 200f, 336f, 248f, 336f)
                reflectiveCurveToRelative(92.9f, -5.5f, 123.1f, -15.2f)
                curveToRelative(11.5f, -3.7f, 22.6f, 6.1f, 20.7f, 17.9f)
                curveToRelative(-4.3f, 25.7f, -23.1f, 47.6f, -47.8f, 63.8f)
                verticalLineTo(448f)
                curveToRelative(0f, 14.3f, -3.4f, 27.8f, -9f, 40f)
                curveToRelative(94f, -35.3f, 161f, -125.7f, 161f, -232f)
                curveTo(496f, 119f, 385f, 8f, 248f, 8f)
                close()
                moveToRelative(-56f, 225f)
                lineToRelative(-9.5f, -8.5f)
                curveToRelative(-14.8f, -13.2f, -46.2f, -13.2f, -61f, 0f)
                lineTo(112f, 233f)
                curveToRelative(-8.5f, 7.4f, -21.6f, 0.3f, -19.8f, -10.8f)
                curveToRelative(4f, -25.2f, 34.2f, -42.1f, 59.9f, -42.1f)
                reflectiveCurveTo(208f, 197f, 212f, 222.2f)
                curveToRelative(1.6f, 11.1f, -11.6f, 18.2f, -20f, 10.8f)
                close()
                moveToRelative(152f, 39f)
                curveToRelative(-35.3f, 0f, -64f, -28.7f, -64f, -64f)
                reflectiveCurveToRelative(28.7f, -64f, 64f, -64f)
                reflectiveCurveToRelative(64f, 28.7f, 64f, 64f)
                reflectiveCurveToRelative(-28.7f, 64f, -64f, 64f)
                close()
                moveToRelative(-50.9f, 102.6f)
                curveToRelative(-14.4f, -6.5f, -31.1f, 2.2f, -34.6f, 17.6f)
                lineToRelative(-1.8f, 7.8f)
                curveToRelative(-2.1f, 9.2f, -15.2f, 9.2f, -17.3f, 0f)
                lineToRelative(-1.8f, -7.8f)
                curveToRelative(-3.5f, -15.4f, -20.2f, -24.1f, -34.6f, -17.6f)
                curveToRelative(-0.9f, 0.4f, 0.3f, -0.2f, -18.9f, 9.4f)
                verticalLineToRelative(63f)
                curveToRelative(0f, 35.2f, 28f, 64.5f, 63.1f, 64.9f)
                curveToRelative(35.7f, 0.5f, 64.9f, -28.4f, 64.9f, -64f)
                verticalLineToRelative(-64f)
                curveToRelative(-19.5f, -9.6f, -18.2f, -8.9f, -19f, -9.3f)
                close()
            }
        }.build()
        
        return _GrinTongueWink!!
    }

private var _GrinTongueWink: ImageVector? = null

