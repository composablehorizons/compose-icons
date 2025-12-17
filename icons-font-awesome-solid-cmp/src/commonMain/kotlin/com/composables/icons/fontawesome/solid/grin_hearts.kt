package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.GrinHearts: ImageVector
    get() {
        if (_GrinHearts != null) return _GrinHearts!!
        
        _GrinHearts = ImageVector.Builder(
            name = "grin-hearts",
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
                moveTo(90.4f, 183.6f)
                curveToRelative(6.7f, -17.6f, 26.7f, -26.7f, 44.9f, -21.9f)
                lineToRelative(7.1f, 1.9f)
                lineToRelative(2f, -7.1f)
                curveToRelative(5f, -18.1f, 22.8f, -30.9f, 41.5f, -27.9f)
                curveToRelative(21.4f, 3.4f, 34.4f, 24.2f, 28.8f, 44.5f)
                lineTo(195.3f, 243f)
                curveToRelative(-1.2f, 4.5f, -5.9f, 7.2f, -10.5f, 6f)
                lineToRelative(-70.2f, -18.2f)
                curveToRelative(-20.4f, -5.4f, -31.9f, -27f, -24.2f, -47.2f)
                close()
                moveTo(248f, 432f)
                curveToRelative(-60.6f, 0f, -134.5f, -38.3f, -143.8f, -93.3f)
                curveToRelative(-2f, -11.8f, 9.2f, -21.5f, 20.7f, -17.9f)
                curveTo(155.1f, 330.5f, 200f, 336f, 248f, 336f)
                reflectiveCurveToRelative(92.9f, -5.5f, 123.1f, -15.2f)
                curveToRelative(11.4f, -3.6f, 22.6f, 6.1f, 20.7f, 17.9f)
                curveToRelative(-9.3f, 55f, -83.2f, 93.3f, -143.8f, 93.3f)
                close()
                moveToRelative(133.4f, -201.3f)
                lineToRelative(-70.2f, 18.2f)
                curveToRelative(-4.5f, 1.2f, -9.2f, -1.5f, -10.5f, -6f)
                lineTo(281.3f, 173f)
                curveToRelative(-5.6f, -20.3f, 7.4f, -41.1f, 28.8f, -44.5f)
                curveToRelative(18.6f, -3f, 36.4f, 9.8f, 41.5f, 27.9f)
                lineToRelative(2f, 7.1f)
                lineToRelative(7.1f, -1.9f)
                curveToRelative(18.2f, -4.7f, 38.2f, 4.3f, 44.9f, 21.9f)
                curveToRelative(7.7f, 20.3f, -3.8f, 41.9f, -24.2f, 47.2f)
                close()
            }
        }.build()
        
        return _GrinHearts!!
    }

private var _GrinHearts: ImageVector? = null

