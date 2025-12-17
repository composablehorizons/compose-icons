package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.GrinAlt: ImageVector
    get() {
        if (_GrinAlt != null) return _GrinAlt!!
        
        _GrinAlt = ImageVector.Builder(
            name = "grin-alt",
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
                moveToRelative(63.7f, 128.7f)
                curveToRelative(7.6f, -11.4f, 24.7f, -11.7f, 32.7f, 0f)
                curveToRelative(12.4f, 18.4f, 15.1f, 36.9f, 15.7f, 55.3f)
                curveToRelative(-0.5f, 18.4f, -3.3f, 36.9f, -15.7f, 55.3f)
                curveToRelative(-7.6f, 11.4f, -24.7f, 11.7f, -32.7f, 0f)
                curveToRelative(-12.4f, -18.4f, -15.1f, -36.9f, -15.7f, -55.3f)
                curveToRelative(0.5f, -18.4f, 3.3f, -36.9f, 15.7f, -55.3f)
                close()
                moveToRelative(-160f, 0f)
                curveToRelative(7.6f, -11.4f, 24.7f, -11.7f, 32.7f, 0f)
                curveToRelative(12.4f, 18.4f, 15.1f, 36.9f, 15.7f, 55.3f)
                curveToRelative(-0.5f, 18.4f, -3.3f, 36.9f, -15.7f, 55.3f)
                curveToRelative(-7.6f, 11.4f, -24.7f, 11.7f, -32.7f, 0f)
                curveToRelative(-12.4f, -18.4f, -15.1f, -36.9f, -15.7f, -55.3f)
                curveToRelative(0.5f, -18.4f, 3.3f, -36.9f, 15.7f, -55.3f)
                close()
                moveTo(248f, 432f)
                curveToRelative(-60.6f, 0f, -134.5f, -38.3f, -143.8f, -93.3f)
                curveToRelative(-2f, -11.8f, 9.3f, -21.6f, 20.7f, -17.9f)
                curveTo(155.1f, 330.5f, 200f, 336f, 248f, 336f)
                reflectiveCurveToRelative(92.9f, -5.5f, 123.1f, -15.2f)
                curveToRelative(11.4f, -3.7f, 22.6f, 6.1f, 20.7f, 17.9f)
                curveToRelative(-9.3f, 55f, -83.2f, 93.3f, -143.8f, 93.3f)
                close()
            }
        }.build()
        
        return _GrinAlt!!
    }

private var _GrinAlt: ImageVector? = null

