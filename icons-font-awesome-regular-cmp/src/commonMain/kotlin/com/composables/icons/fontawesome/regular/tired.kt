package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Tired: ImageVector
    get() {
        if (_Tired != null) return _Tired!!
        
        _Tired = ImageVector.Builder(
            name = "tired",
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
                moveToRelative(129.1f, -303.8f)
                curveToRelative(-3.8f, -4.4f, -10.3f, -5.4f, -15.3f, -2.5f)
                lineToRelative(-80f, 48f)
                curveToRelative(-3.6f, 2.2f, -5.8f, 6.1f, -5.8f, 10.3f)
                reflectiveCurveToRelative(2.2f, 8.1f, 5.8f, 10.3f)
                lineToRelative(80f, 48f)
                curveToRelative(5.4f, 3.2f, 11.8f, 1.6f, 15.3f, -2.5f)
                curveToRelative(3.8f, -4.5f, 3.9f, -11f, 0.1f, -15.5f)
                lineTo(343.6f, 208f)
                lineToRelative(33.6f, -40.3f)
                curveToRelative(3.8f, -4.5f, 3.7f, -11.1f, -0.1f, -15.5f)
                close()
                moveTo(220f, 208f)
                curveToRelative(0f, -4.2f, -2.2f, -8.1f, -5.8f, -10.3f)
                lineToRelative(-80f, -48f)
                curveToRelative(-5f, -3f, -11.5f, -1.9f, -15.3f, 2.5f)
                curveToRelative(-3.8f, 4.5f, -3.9f, 11f, -0.1f, 15.5f)
                lineToRelative(33.6f, 40.3f)
                lineToRelative(-33.6f, 40.3f)
                curveToRelative(-3.8f, 4.5f, -3.7f, 11f, 0.1f, 15.5f)
                curveToRelative(3.5f, 4.1f, 9.9f, 5.7f, 15.3f, 2.5f)
                lineToRelative(80f, -48f)
                curveToRelative(3.6f, -2.2f, 5.8f, -6.1f, 5.8f, -10.3f)
                close()
                moveToRelative(28f, 64f)
                curveToRelative(-45.4f, 0f, -100.9f, 38.3f, -107.8f, 93.3f)
                curveToRelative(-1.5f, 11.8f, 6.9f, 21.6f, 15.5f, 17.9f)
                curveTo(178.4f, 373.5f, 212f, 368f, 248f, 368f)
                reflectiveCurveToRelative(69.6f, 5.5f, 92.3f, 15.2f)
                curveToRelative(8.5f, 3.7f, 17f, -6f, 15.5f, -17.9f)
                curveToRelative(-6.9f, -55f, -62.4f, -93.3f, -107.8f, -93.3f)
                close()
            }
        }.build()
        
        return _Tired!!
    }

private var _Tired: ImageVector? = null

