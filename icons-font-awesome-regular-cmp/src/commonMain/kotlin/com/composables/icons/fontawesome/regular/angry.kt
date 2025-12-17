package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Angry: ImageVector
    get() {
        if (_Angry != null) return _Angry!!
        
        _Angry = ImageVector.Builder(
            name = "angry",
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
                moveToRelative(0f, -144f)
                curveToRelative(-33.6f, 0f, -65.2f, 14.8f, -86.8f, 40.6f)
                curveToRelative(-8.5f, 10.2f, -7.1f, 25.3f, 3.1f, 33.8f)
                reflectiveCurveToRelative(25.3f, 7.2f, 33.8f, -3f)
                curveToRelative(24.8f, -29.7f, 75f, -29.7f, 99.8f, 0f)
                curveToRelative(8.1f, 9.7f, 23.2f, 11.9f, 33.8f, 3f)
                curveToRelative(10.2f, -8.5f, 11.5f, -23.6f, 3.1f, -33.8f)
                curveToRelative(-21.6f, -25.8f, -53.2f, -40.6f, -86.8f, -40.6f)
                close()
                moveToRelative(-48f, -72f)
                curveToRelative(10.3f, 0f, 19.9f, -6.7f, 23f, -17.1f)
                curveToRelative(3.8f, -12.7f, -3.4f, -26.1f, -16.1f, -29.9f)
                lineToRelative(-80f, -24f)
                curveToRelative(-12.8f, -3.9f, -26.1f, 3.4f, -29.9f, 16.1f)
                curveToRelative(-3.8f, 12.7f, 3.4f, 26.1f, 16.1f, 29.9f)
                lineToRelative(28.2f, 8.5f)
                curveToRelative(-3.1f, 4.9f, -5.3f, 10.4f, -5.3f, 16.6f)
                curveToRelative(0f, 17.7f, 14.3f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.4f, 32f, -32.1f)
                close()
                moveToRelative(199f, -54.9f)
                curveToRelative(-3.8f, -12.7f, -17.1f, -19.9f, -29.9f, -16.1f)
                lineToRelative(-80f, 24f)
                curveToRelative(-12.7f, 3.8f, -19.9f, 17.2f, -16.1f, 29.9f)
                curveToRelative(3.1f, 10.4f, 12.7f, 17.1f, 23f, 17.1f)
                curveToRelative(0f, 17.7f, 14.3f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.3f, 32f, -32f)
                curveToRelative(0f, -6.2f, -2.2f, -11.7f, -5.3f, -16.6f)
                lineToRelative(28.2f, -8.5f)
                curveToRelative(12.7f, -3.7f, 19.9f, -17.1f, 16.1f, -29.8f)
                close()
            }
        }.build()
        
        return _Angry!!
    }

private var _Angry: ImageVector? = null

