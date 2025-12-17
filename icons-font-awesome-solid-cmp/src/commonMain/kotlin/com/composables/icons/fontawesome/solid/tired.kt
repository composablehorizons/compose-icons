package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Tired: ImageVector
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
                moveTo(248f, 288f)
                curveToRelative(51.9f, 0f, 115.3f, 43.8f, 123.2f, 106.7f)
                curveToRelative(1.7f, 13.6f, -8f, 24.6f, -17.7f, 20.4f)
                curveToRelative(-25.9f, -11.1f, -64.4f, -17.4f, -105.5f, -17.4f)
                reflectiveCurveToRelative(-79.6f, 6.3f, -105.5f, 17.4f)
                curveToRelative(-9.8f, 4.2f, -19.4f, -7f, -17.7f, -20.4f)
                curveTo(132.7f, 331.8f, 196.1f, 288f, 248f, 288f)
                close()
            }
        }.build()
        
        return _Tired!!
    }

private var _Tired: ImageVector? = null

