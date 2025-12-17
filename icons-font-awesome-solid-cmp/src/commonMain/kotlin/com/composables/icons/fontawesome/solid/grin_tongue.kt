package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.GrinTongue: ImageVector
    get() {
        if (_GrinTongue != null) return _GrinTongue!!
        
        _GrinTongue = ImageVector.Builder(
            name = "grin-tongue",
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
                curveToRelative(0f, 106.3f, 67f, 196.7f, 161f, 232f)
                curveToRelative(-5.6f, -12.2f, -9f, -25.7f, -9f, -40f)
                verticalLineToRelative(-45.5f)
                curveToRelative(-24.7f, -16.2f, -43.5f, -38.1f, -47.8f, -63.8f)
                curveToRelative(-2f, -11.8f, 9.3f, -21.5f, 20.7f, -17.9f)
                curveTo(155.1f, 330.5f, 200f, 336f, 248f, 336f)
                reflectiveCurveToRelative(92.9f, -5.5f, 123.1f, -15.2f)
                curveToRelative(11.4f, -3.6f, 22.6f, 6.1f, 20.7f, 17.9f)
                curveToRelative(-4.3f, 25.7f, -23.1f, 47.6f, -47.8f, 63.8f)
                verticalLineTo(448f)
                curveToRelative(0f, 14.3f, -3.4f, 27.8f, -9f, 40f)
                curveToRelative(94f, -35.3f, 161f, -125.7f, 161f, -232f)
                curveTo(496f, 119f, 385f, 8f, 248f, 8f)
                close()
                moveToRelative(-80f, 232f)
                curveToRelative(-17.7f, 0f, -32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                close()
                moveToRelative(160f, 0f)
                curveToRelative(-17.7f, 0f, -32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                close()
                moveToRelative(-34.9f, 134.6f)
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
        
        return _GrinTongue!!
    }

private var _GrinTongue: ImageVector? = null

