package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SmileWink: ImageVector
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
                moveTo(0f, 256f)
                curveToRelative(0f, 137f, 111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                reflectiveCurveTo(385f, 8f, 248f, 8f)
                reflectiveCurveTo(0f, 119f, 0f, 256f)
                close()
                moveToRelative(200f, -48f)
                curveToRelative(0f, 17.7f, -14.3f, 32f, -32f, 32f)
                reflectiveCurveToRelative(-32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.3f, 32f, 32f)
                close()
                moveToRelative(158.5f, 16.5f)
                curveToRelative(-14.8f, -13.2f, -46.2f, -13.2f, -61f, 0f)
                lineTo(288f, 233f)
                curveToRelative(-8.3f, 7.4f, -21.6f, 0.4f, -19.8f, -10.8f)
                curveToRelative(4f, -25.2f, 34.2f, -42.1f, 59.9f, -42.1f)
                reflectiveCurveTo(384f, 197f, 388f, 222.2f)
                curveToRelative(1.7f, 11.1f, -11.4f, 18.3f, -19.8f, 10.8f)
                lineToRelative(-9.7f, -8.5f)
                close()
                moveTo(157.8f, 325.8f)
                curveTo(180.2f, 352.7f, 213f, 368f, 248f, 368f)
                reflectiveCurveToRelative(67.8f, -15.4f, 90.2f, -42.2f)
                curveToRelative(13.6f, -16.2f, 38.1f, 4.2f, 24.6f, 20.5f)
                curveTo(334.3f, 380.4f, 292.5f, 400f, 248f, 400f)
                reflectiveCurveToRelative(-86.3f, -19.6f, -114.8f, -53.8f)
                curveToRelative(-13.5f, -16.3f, 11.2f, -36.7f, 24.6f, -20.4f)
                close()
            }
        }.build()
        
        return _SmileWink!!
    }

private var _SmileWink: ImageVector? = null

