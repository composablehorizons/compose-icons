package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Wind: ImageVector
    get() {
        if (_Wind != null) return _Wind!!
        
        _Wind = ImageVector.Builder(
            name = "wind",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(156.7f, 256f)
                horizontalLineTo(16f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(142.2f)
                curveToRelative(15.9f, 0f, 30.8f, 10.9f, 33.4f, 26.6f)
                curveToRelative(3.3f, 20f, -12.1f, 37.4f, -31.6f, 37.4f)
                curveToRelative(-14.1f, 0f, -26.1f, -9.2f, -30.4f, -21.9f)
                curveToRelative(-2.1f, -6.3f, -8.6f, -10.1f, -15.2f, -10.1f)
                horizontalLineTo(81.6f)
                curveToRelative(-9.8f, 0f, -17.7f, 8.8f, -15.9f, 18.4f)
                curveToRelative(8.6f, 44.1f, 47.6f, 77.6f, 94.2f, 77.6f)
                curveToRelative(57.1f, 0f, 102.7f, -50.1f, 95.2f, -108.6f)
                curveTo(249f, 291f, 205.4f, 256f, 156.7f, 256f)
                close()
                moveTo(16f, 224f)
                horizontalLineToRelative(336f)
                curveToRelative(59.7f, 0f, 106.8f, -54.8f, 93.8f, -116.7f)
                curveToRelative(-7.6f, -36.2f, -36.9f, -65.5f, -73.1f, -73.1f)
                curveToRelative(-55.4f, -11.6f, -105.1f, 24.9f, -114.9f, 75.5f)
                curveToRelative(-1.9f, 9.6f, 6.1f, 18.3f, 15.8f, 18.3f)
                horizontalLineToRelative(32.8f)
                curveToRelative(6.7f, 0f, 13.1f, -3.8f, 15.2f, -10.1f)
                curveTo(325.9f, 105.2f, 337.9f, 96f, 352f, 96f)
                curveToRelative(19.4f, 0f, 34.9f, 17.4f, 31.6f, 37.4f)
                curveToRelative(-2.6f, 15.7f, -17.4f, 26.6f, -33.4f, 26.6f)
                horizontalLineTo(16f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                close()
                moveToRelative(384f, 32f)
                horizontalLineTo(243.7f)
                curveToRelative(19.3f, 16.6f, 33.2f, 38.8f, 39.8f, 64f)
                horizontalLineTo(400f)
                curveToRelative(26.5f, 0f, 48f, 21.5f, 48f, 48f)
                reflectiveCurveToRelative(-21.5f, 48f, -48f, 48f)
                curveToRelative(-17.9f, 0f, -33.3f, -9.9f, -41.6f, -24.4f)
                curveToRelative(-2.9f, -5f, -8.7f, -7.6f, -14.5f, -7.6f)
                horizontalLineToRelative(-33.8f)
                curveToRelative(-10.9f, 0f, -19f, 10.8f, -15.3f, 21.1f)
                curveToRelative(17.8f, 50.6f, 70.5f, 84.8f, 129.4f, 72.3f)
                curveToRelative(41.2f, -8.7f, 75.1f, -41.6f, 84.7f, -82.7f)
                curveTo(526f, 321.5f, 470.5f, 256f, 400f, 256f)
                close()
            }
        }.build()
        
        return _Wind!!
    }

private var _Wind: ImageVector? = null

