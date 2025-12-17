package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.GrinSquint: ImageVector
    get() {
        if (_GrinSquint != null) return _GrinSquint!!
        
        _GrinSquint = ImageVector.Builder(
            name = "grin-squint",
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
                moveToRelative(33.8f, 189.7f)
                lineToRelative(80f, -48f)
                curveToRelative(11.6f, -6.9f, 24f, 7.7f, 15.4f, 18f)
                lineTo(343.6f, 208f)
                lineToRelative(33.6f, 40.3f)
                curveToRelative(8.7f, 10.4f, -3.9f, 24.8f, -15.4f, 18f)
                lineToRelative(-80f, -48f)
                curveToRelative(-7.7f, -4.7f, -7.7f, -15.9f, 0f, -20.6f)
                close()
                moveToRelative(-163f, -30f)
                curveToRelative(-8.6f, -10.3f, 3.8f, -24.9f, 15.4f, -18f)
                lineToRelative(80f, 48f)
                curveToRelative(7.8f, 4.7f, 7.8f, 15.9f, 0f, 20.6f)
                lineToRelative(-80f, 48f)
                curveToRelative(-11.5f, 6.8f, -24f, -7.6f, -15.4f, -18f)
                lineToRelative(33.6f, -40.3f)
                lineToRelative(-33.6f, -40.3f)
                close()
                moveTo(248f, 432f)
                curveToRelative(-60.6f, 0f, -134.5f, -38.3f, -143.8f, -93.3f)
                curveToRelative(-2f, -11.9f, 9.4f, -21.6f, 20.7f, -17.9f)
                curveTo(155.1f, 330.5f, 200f, 336f, 248f, 336f)
                reflectiveCurveToRelative(92.9f, -5.5f, 123.1f, -15.2f)
                curveToRelative(11.5f, -3.7f, 22.6f, 6.2f, 20.7f, 17.9f)
                curveToRelative(-9.3f, 55f, -83.2f, 93.3f, -143.8f, 93.3f)
                close()
            }
        }.build()
        
        return _GrinSquint!!
    }

private var _GrinSquint: ImageVector? = null

