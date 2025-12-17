package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Weibo: ImageVector
    get() {
        if (_Weibo != null) return _Weibo!!
        
        _Weibo = ImageVector.Builder(
            name = "weibo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(407f, 177.6f)
                curveToRelative(7.6f, -24f, -13.4f, -46.8f, -37.4f, -41.7f)
                curveToRelative(-22f, 4.8f, -28.8f, -28.1f, -7.1f, -32.8f)
                curveToRelative(50.1f, -10.9f, 92.3f, 37.1f, 76.5f, 84.8f)
                curveToRelative(-6.8f, 21.2f, -38.8f, 10.8f, -32f, -10.3f)
                close()
                moveTo(214.8f, 446.7f)
                curveTo(108.5f, 446.7f, 0f, 395.3f, 0f, 310.4f)
                curveToRelative(0f, -44.3f, 28f, -95.4f, 76.3f, -143.7f)
                curveTo(176f, 67f, 279.5f, 65.8f, 249.9f, 161f)
                curveToRelative(-4f, 13.1f, 12.3f, 5.7f, 12.3f, 6f)
                curveToRelative(79.5f, -33.6f, 140.5f, -16.8f, 114f, 51.4f)
                curveToRelative(-3.7f, 9.4f, 1.1f, 10.9f, 8.3f, 13.1f)
                curveToRelative(135.7f, 42.3f, 34.8f, 215.2f, -169.7f, 215.2f)
                close()
                moveToRelative(143.7f, -146.3f)
                curveToRelative(-5.4f, -55.7f, -78.5f, -94f, -163.4f, -85.7f)
                curveToRelative(-84.8f, 8.6f, -148.8f, 60.3f, -143.4f, 116f)
                reflectiveCurveToRelative(78.5f, 94f, 163.4f, 85.7f)
                curveToRelative(84.8f, -8.6f, 148.8f, -60.3f, 143.4f, -116f)
                close()
                moveTo(347.9f, 35.1f)
                curveToRelative(-25.9f, 5.6f, -16.8f, 43.7f, 8.3f, 38.3f)
                curveToRelative(72.3f, -15.2f, 134.8f, 52.8f, 111.7f, 124f)
                curveToRelative(-7.4f, 24.2f, 29.1f, 37f, 37.4f, 12f)
                curveToRelative(31.9f, -99.8f, -55.1f, -195.9f, -157.4f, -174.3f)
                close()
                moveToRelative(-78.5f, 311f)
                curveToRelative(-17.1f, 38.8f, -66.8f, 60f, -109.1f, 46.3f)
                curveToRelative(-40.8f, -13.1f, -58f, -53.4f, -40.3f, -89.7f)
                curveToRelative(17.7f, -35.4f, 63.1f, -55.4f, 103.4f, -45.1f)
                curveToRelative(42f, 10.8f, 63.1f, 50.2f, 46f, 88.5f)
                close()
                moveToRelative(-86.3f, -30f)
                curveToRelative(-12.9f, -5.4f, -30f, 0.3f, -38f, 12.9f)
                curveToRelative(-8.3f, 12.9f, -4.3f, 28f, 8.6f, 34f)
                curveToRelative(13.1f, 6f, 30.8f, 0.3f, 39.1f, -12.9f)
                curveToRelative(8f, -13.1f, 3.7f, -28.3f, -9.7f, -34f)
                close()
                moveToRelative(32.6f, -13.4f)
                curveToRelative(-5.1f, -1.7f, -11.4f, 0.6f, -14.3f, 5.4f)
                curveToRelative(-2.9f, 5.1f, -1.4f, 10.6f, 3.7f, 12.9f)
                curveToRelative(5.1f, 2f, 11.7f, -0.3f, 14.6f, -5.4f)
                curveToRelative(2.8f, -5.2f, 1.1f, -10.9f, -4f, -12.9f)
                close()
            }
        }.build()
        
        return _Weibo!!
    }

private var _Weibo: ImageVector? = null

