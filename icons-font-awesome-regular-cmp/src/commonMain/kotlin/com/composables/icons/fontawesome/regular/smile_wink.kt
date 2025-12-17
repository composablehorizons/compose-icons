package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.SmileWink: ImageVector
    get() {
        if (_SmileWink != null) return _SmileWink!!
        
        _SmileWink = ImageVector.Builder(
            name = "smile-wink",
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
                moveToRelative(117.8f, -146.4f)
                curveToRelative(-10.2f, -8.5f, -25.3f, -7.1f, -33.8f, 3.1f)
                curveToRelative(-20.8f, 25f, -51.5f, 39.4f, -84f, 39.4f)
                reflectiveCurveToRelative(-63.2f, -14.3f, -84f, -39.4f)
                curveToRelative(-8.5f, -10.2f, -23.7f, -11.5f, -33.8f, -3.1f)
                curveToRelative(-10.2f, 8.5f, -11.5f, 23.6f, -3.1f, 33.8f)
                curveToRelative(30f, 36f, 74.1f, 56.6f, 120.9f, 56.6f)
                reflectiveCurveToRelative(90.9f, -20.6f, 120.9f, -56.6f)
                curveToRelative(8.5f, -10.2f, 7.1f, -25.3f, -3.1f, -33.8f)
                close()
                moveTo(168f, 240f)
                curveToRelative(17.7f, 0f, 32f, -14.3f, 32f, -32f)
                reflectiveCurveToRelative(-14.3f, -32f, -32f, -32f)
                reflectiveCurveToRelative(-32f, 14.3f, -32f, 32f)
                reflectiveCurveToRelative(14.3f, 32f, 32f, 32f)
                close()
                moveToRelative(160f, -60f)
                curveToRelative(-25.7f, 0f, -55.9f, 16.9f, -59.9f, 42.1f)
                curveToRelative(-1.7f, 11.2f, 11.5f, 18.2f, 19.8f, 10.8f)
                lineToRelative(9.5f, -8.5f)
                curveToRelative(14.8f, -13.2f, 46.2f, -13.2f, 61f, 0f)
                lineToRelative(9.5f, 8.5f)
                curveToRelative(8.5f, 7.4f, 21.6f, 0.3f, 19.8f, -10.8f)
                curveToRelative(-3.8f, -25.2f, -34f, -42.1f, -59.7f, -42.1f)
                close()
            }
        }.build()
        
        return _SmileWink!!
    }

private var _SmileWink: ImageVector? = null

