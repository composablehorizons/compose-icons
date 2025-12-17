package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Sun: ImageVector
    get() {
        if (_Sun != null) return _Sun!!
        
        _Sun = ImageVector.Builder(
            name = "sun",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(494.2f, 221.9f)
                lineToRelative(-59.8f, -40.5f)
                lineToRelative(13.7f, -71f)
                curveToRelative(2.6f, -13.2f, -1.6f, -26.8f, -11.1f, -36.4f)
                curveToRelative(-9.6f, -9.5f, -23.2f, -13.7f, -36.2f, -11.1f)
                lineToRelative(-70.9f, 13.7f)
                lineToRelative(-40.4f, -59.9f)
                curveToRelative(-15.1f, -22.3f, -51.9f, -22.3f, -67f, 0f)
                lineToRelative(-40.4f, 59.9f)
                lineToRelative(-70.8f, -13.7f)
                curveTo(98f, 60.4f, 84.5f, 64.5f, 75f, 74.1f)
                curveToRelative(-9.5f, 9.6f, -13.7f, 23.1f, -11.1f, 36.3f)
                lineToRelative(13.7f, 71f)
                lineToRelative(-59.8f, 40.5f)
                curveTo(6.6f, 229.5f, 0f, 242f, 0f, 255.5f)
                reflectiveCurveToRelative(6.7f, 26f, 17.8f, 33.5f)
                lineToRelative(59.8f, 40.5f)
                lineToRelative(-13.7f, 71f)
                curveToRelative(-2.6f, 13.2f, 1.6f, 26.8f, 11.1f, 36.3f)
                curveToRelative(9.5f, 9.5f, 22.9f, 13.7f, 36.3f, 11.1f)
                lineToRelative(70.8f, -13.7f)
                lineToRelative(40.4f, 59.9f)
                curveTo(230f, 505.3f, 242.6f, 512f, 256f, 512f)
                reflectiveCurveToRelative(26f, -6.7f, 33.5f, -17.8f)
                lineToRelative(40.4f, -59.9f)
                lineToRelative(70.9f, 13.7f)
                curveToRelative(13.4f, 2.7f, 26.8f, -1.6f, 36.3f, -11.1f)
                curveToRelative(9.5f, -9.5f, 13.6f, -23.1f, 11.1f, -36.3f)
                lineToRelative(-13.7f, -71f)
                lineToRelative(59.8f, -40.5f)
                curveToRelative(11.1f, -7.5f, 17.8f, -20.1f, 17.8f, -33.5f)
                curveToRelative(-0.1f, -13.6f, -6.7f, -26.1f, -17.9f, -33.7f)
                close()
                moveToRelative(-112.9f, 85.6f)
                lineToRelative(17.6f, 91.2f)
                lineToRelative(-91f, -17.6f)
                lineTo(256f, 458f)
                lineToRelative(-51.9f, -77f)
                lineToRelative(-90.9f, 17.6f)
                lineToRelative(17.6f, -91.2f)
                lineToRelative(-76.8f, -52f)
                lineToRelative(76.8f, -52f)
                lineToRelative(-17.6f, -91.2f)
                lineToRelative(91f, 17.6f)
                lineTo(256f, 53f)
                lineToRelative(51.9f, 76.9f)
                lineToRelative(91f, -17.6f)
                lineToRelative(-17.6f, 91.1f)
                lineToRelative(76.8f, 52f)
                lineToRelative(-76.8f, 52.1f)
                close()
                moveTo(256f, 152f)
                curveToRelative(-57.3f, 0f, -104f, 46.7f, -104f, 104f)
                reflectiveCurveToRelative(46.7f, 104f, 104f, 104f)
                reflectiveCurveToRelative(104f, -46.7f, 104f, -104f)
                reflectiveCurveToRelative(-46.7f, -104f, -104f, -104f)
                close()
                moveToRelative(0f, 160f)
                curveToRelative(-30.9f, 0f, -56f, -25.1f, -56f, -56f)
                reflectiveCurveToRelative(25.1f, -56f, 56f, -56f)
                reflectiveCurveToRelative(56f, 25.1f, 56f, 56f)
                reflectiveCurveToRelative(-25.1f, 56f, -56f, 56f)
                close()
            }
        }.build()
        
        return _Sun!!
    }

private var _Sun: ImageVector? = null

