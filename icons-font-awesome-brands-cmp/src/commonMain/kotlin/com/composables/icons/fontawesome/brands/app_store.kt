package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.AppStore: ImageVector
    get() {
        if (_AppStore != null) return _AppStore!!
        
        _AppStore = ImageVector.Builder(
            name = "app-store",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(255.9f, 120.9f)
                lineToRelative(9.1f, -15.7f)
                curveToRelative(5.6f, -9.8f, 18.1f, -13.1f, 27.9f, -7.5f)
                curveToRelative(9.8f, 5.6f, 13.1f, 18.1f, 7.5f, 27.9f)
                lineToRelative(-87.5f, 151.5f)
                horizontalLineToRelative(63.3f)
                curveToRelative(20.5f, 0f, 32f, 24.1f, 23.1f, 40.8f)
                horizontalLineTo(113.8f)
                curveToRelative(-11.3f, 0f, -20.4f, -9.1f, -20.4f, -20.4f)
                curveToRelative(0f, -11.3f, 9.1f, -20.4f, 20.4f, -20.4f)
                horizontalLineToRelative(52f)
                lineToRelative(66.6f, -115.4f)
                lineToRelative(-20.8f, -36.1f)
                curveToRelative(-5.6f, -9.8f, -2.3f, -22.2f, 7.5f, -27.9f)
                curveToRelative(9.8f, -5.6f, 22.2f, -2.3f, 27.9f, 7.5f)
                lineToRelative(8.9f, 15.7f)
                close()
                moveToRelative(-78.7f, 218f)
                lineToRelative(-19.6f, 34f)
                curveToRelative(-5.6f, 9.8f, -18.1f, 13.1f, -27.9f, 7.5f)
                curveToRelative(-9.8f, -5.6f, -13.1f, -18.1f, -7.5f, -27.9f)
                lineToRelative(14.6f, -25.2f)
                curveToRelative(16.4f, -5.1f, 29.8f, -1.2f, 40.4f, 11.6f)
                close()
                moveToRelative(168.9f, -61.7f)
                horizontalLineToRelative(53.1f)
                curveToRelative(11.3f, 0f, 20.4f, 9.1f, 20.4f, 20.4f)
                curveToRelative(0f, 11.3f, -9.1f, 20.4f, -20.4f, 20.4f)
                horizontalLineToRelative(-29.5f)
                lineToRelative(19.9f, 34.5f)
                curveToRelative(5.6f, 9.8f, 2.3f, 22.2f, -7.5f, 27.9f)
                curveToRelative(-9.8f, 5.6f, -22.2f, 2.3f, -27.9f, -7.5f)
                curveToRelative(-33.5f, -58.1f, -58.7f, -101.6f, -75.4f, -130.6f)
                curveToRelative(-17.1f, -29.5f, -4.9f, -59.1f, 7.2f, -69.1f)
                curveToRelative(13.4f, 23f, 33.4f, 57.7f, 60.1f, 104f)
                close()
                moveTo(256f, 8f)
                curveTo(119f, 8f, 8f, 119f, 8f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                reflectiveCurveTo(393f, 8f, 256f, 8f)
                close()
                moveToRelative(216f, 248f)
                curveToRelative(0f, 118.7f, -96.1f, 216f, -216f, 216f)
                curveToRelative(-118.7f, 0f, -216f, -96.1f, -216f, -216f)
                curveToRelative(0f, -118.7f, 96.1f, -216f, 216f, -216f)
                curveToRelative(118.7f, 0f, 216f, 96.1f, 216f, 216f)
                close()
            }
        }.build()
        
        return _AppStore!!
    }

private var _AppStore: ImageVector? = null

