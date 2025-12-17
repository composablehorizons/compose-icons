package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Angry: ImageVector
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
                moveTo(136f, 240f)
                curveToRelative(0f, -9.3f, 4.1f, -17.5f, 10.5f, -23.4f)
                lineToRelative(-31f, -9.3f)
                curveToRelative(-8.5f, -2.5f, -13.3f, -11.5f, -10.7f, -19.9f)
                curveToRelative(2.5f, -8.5f, 11.4f, -13.2f, 19.9f, -10.7f)
                lineToRelative(80f, 24f)
                curveToRelative(8.5f, 2.5f, 13.3f, 11.5f, 10.7f, 19.9f)
                curveToRelative(-2.1f, 6.9f, -8.4f, 11.4f, -15.3f, 11.4f)
                curveToRelative(-0.5f, 0f, -1.1f, -0.2f, -1.7f, -0.2f)
                curveToRelative(0.7f, 2.7f, 1.7f, 5.3f, 1.7f, 8.2f)
                curveToRelative(0f, 17.7f, -14.3f, 32f, -32f, 32f)
                reflectiveCurveTo(136f, 257.7f, 136f, 240f)
                close()
                moveToRelative(168f, 154.2f)
                curveToRelative(-27.8f, -33.4f, -84.2f, -33.4f, -112.1f, 0f)
                curveToRelative(-13.5f, 16.3f, -38.2f, -4.2f, -24.6f, -20.5f)
                curveToRelative(20f, -24f, 49.4f, -37.8f, 80.6f, -37.8f)
                reflectiveCurveToRelative(60.6f, 13.8f, 80.6f, 37.8f)
                curveToRelative(13.8f, 16.5f, -11.1f, 36.6f, -24.5f, 20.5f)
                close()
                moveToRelative(76.6f, -186.9f)
                lineToRelative(-31f, 9.3f)
                curveToRelative(6.3f, 5.8f, 10.5f, 14.1f, 10.5f, 23.4f)
                curveToRelative(0f, 17.7f, -14.3f, 32f, -32f, 32f)
                reflectiveCurveToRelative(-32f, -14.3f, -32f, -32f)
                curveToRelative(0f, -2.9f, 0.9f, -5.6f, 1.7f, -8.2f)
                curveToRelative(-0.6f, 0.1f, -1.1f, 0.2f, -1.7f, 0.2f)
                curveToRelative(-6.9f, 0f, -13.2f, -4.5f, -15.3f, -11.4f)
                curveToRelative(-2.5f, -8.5f, 2.3f, -17.4f, 10.7f, -19.9f)
                lineToRelative(80f, -24f)
                curveToRelative(8.4f, -2.5f, 17.4f, 2.3f, 19.9f, 10.7f)
                curveToRelative(2.5f, 8.5f, -2.3f, 17.4f, -10.8f, 19.9f)
                close()
            }
        }.build()
        
        return _Angry!!
    }

private var _Angry: ImageVector? = null

