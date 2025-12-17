package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.WatchmanMonitoring: ImageVector
    get() {
        if (_WatchmanMonitoring != null) return _WatchmanMonitoring!!
        
        _WatchmanMonitoring = ImageVector.Builder(
            name = "watchman-monitoring",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 16f)
                curveTo(123.452f, 16f, 16f, 123.452f, 16f, 256f)
                reflectiveCurveTo(123.452f, 496f, 256f, 496f)
                reflectiveCurveTo(496f, 388.548f, 496f, 256f)
                reflectiveCurveTo(388.548f, 16f, 256f, 16f)
                close()
                moveTo(121.69f, 429.122f)
                curveTo(70.056f, 388.972f, 36.741f, 326.322f, 36.741f, 256f)
                arcToRelative(218.519f, 218.519f, 0f, false, true, 9.587f, -64.122f)
                lineToRelative(102.9f, -17.895f)
                lineToRelative(-0.121f, 10.967f)
                lineToRelative(-13.943f, 2.013f)
                reflectiveCurveToRelative(-0.144f, 12.5f, -0.144f, 19.549f)
                arcToRelative(12.778f, 12.778f, 0f, false, false, 4.887f, 10.349f)
                lineToRelative(9.468f, 7.4f)
                close()
                moveToRelative(105.692f, -283.27f)
                lineToRelative(8.48f, -7.618f)
                reflectiveCurveToRelative(6.934f, -5.38f, -0.143f, -9.344f)
                curveToRelative(-7.188f, -4.024f, -39.53f, -34.5f, -39.53f, -34.5f)
                curveToRelative(-5.348f, -5.477f, -8.257f, -7.347f, -15.46f, 0f)
                curveToRelative(0f, 0f, -32.342f, 30.474f, -39.529f, 34.5f)
                curveToRelative(-7.078f, 3.964f, -0.144f, 9.344f, -0.144f, 9.344f)
                lineToRelative(8.481f, 7.618f)
                lineToRelative(-0.048f, 4.369f)
                lineTo(75.982f, 131.045f)
                curveToRelative(39.644f, -56.938f, 105.532f, -94.3f, 180.018f, -94.3f)
                arcTo(218.754f, 218.754f, 0f, false, true, 420.934f, 111.77f)
                lineToRelative(-193.512f, 37.7f)
                close()
                moveToRelative(34.063f, 329.269f)
                lineToRelative(-33.9f, -250.857f)
                lineToRelative(9.467f, -7.4f)
                arcToRelative(12.778f, 12.778f, 0f, false, false, 4.888f, -10.349f)
                curveToRelative(0f, -7.044f, -0.144f, -19.549f, -0.144f, -19.549f)
                lineToRelative(-13.943f, -2.013f)
                lineToRelative(-0.116f, -10.474f)
                lineToRelative(241.711f, 31.391f)
                arcTo(218.872f, 218.872f, 0f, false, true, 475.259f, 256f)
                curveTo(475.259f, 375.074f, 379.831f, 472.212f, 261.445f, 475.121f)
                close()
            }
        }.build()
        
        return _WatchmanMonitoring!!
    }

private var _WatchmanMonitoring: ImageVector? = null

