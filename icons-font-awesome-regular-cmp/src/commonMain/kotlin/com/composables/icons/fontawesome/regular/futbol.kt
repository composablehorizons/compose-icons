package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Futbol: ImageVector
    get() {
        if (_Futbol != null) return _Futbol!!
        
        _Futbol = ImageVector.Builder(
            name = "futbol",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(483.8f, 179.4f)
                curveTo(449.8f, 74.6f, 352.6f, 8f, 248.1f, 8f)
                curveToRelative(-25.4f, 0f, -51.2f, 3.9f, -76.7f, 12.2f)
                curveTo(41.2f, 62.5f, -30.1f, 202.4f, 12.2f, 332.6f)
                curveTo(46.2f, 437.4f, 143.4f, 504f, 247.9f, 504f)
                curveToRelative(25.4f, 0f, 51.2f, -3.9f, 76.7f, -12.2f)
                curveToRelative(130.2f, -42.3f, 201.5f, -182.2f, 159.2f, -312.4f)
                close()
                moveToRelative(-74.5f, 193.7f)
                lineToRelative(-52.2f, 6.4f)
                lineToRelative(-43.7f, -60.9f)
                lineToRelative(24.4f, -75.2f)
                lineToRelative(71.1f, -22.1f)
                lineToRelative(38.9f, 36.4f)
                curveToRelative(-0.2f, 30.7f, -7.4f, 61.1f, -21.7f, 89.2f)
                curveToRelative(-4.7f, 9.3f, -10.7f, 17.8f, -16.8f, 26.2f)
                close()
                moveToRelative(0f, -235.4f)
                lineToRelative(-10.4f, 53.1f)
                lineToRelative(-70.7f, 22f)
                lineToRelative(-64.2f, -46.5f)
                verticalLineTo(92.5f)
                lineToRelative(47.4f, -26.2f)
                curveToRelative(39.2f, 13f, 73.4f, 38f, 97.9f, 71.4f)
                close()
                moveTo(184.9f, 66.4f)
                lineTo(232f, 92.5f)
                verticalLineToRelative(73.8f)
                lineToRelative(-64.2f, 46.5f)
                lineToRelative(-70.6f, -22f)
                lineToRelative(-10.1f, -52.5f)
                curveToRelative(24.3f, -33.4f, 57.9f, -58.6f, 97.8f, -71.9f)
                close()
                moveTo(139f, 379.5f)
                lineTo(85.9f, 373f)
                curveToRelative(-14.4f, -20.1f, -37.3f, -59.6f, -37.8f, -115.3f)
                lineToRelative(39f, -36.4f)
                lineToRelative(71.1f, 22.2f)
                lineToRelative(24.3f, 74.3f)
                lineToRelative(-43.5f, 61.7f)
                close()
                moveToRelative(48.2f, 67f)
                lineToRelative(-22.4f, -48.1f)
                lineToRelative(43.6f, -61.7f)
                horizontalLineTo(287f)
                lineToRelative(44.3f, 61.7f)
                lineToRelative(-22.4f, 48.1f)
                curveToRelative(-6.2f, 1.8f, -57.6f, 20.4f, -121.7f, 0f)
                close()
            }
        }.build()
        
        return _Futbol!!
    }

private var _Futbol: ImageVector? = null

