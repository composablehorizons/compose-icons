package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Behance: ImageVector
    get() {
        if (_Behance != null) return _Behance!!
        
        _Behance = ImageVector.Builder(
            name = "behance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(232f, 237.2f)
                curveToRelative(31.8f, -15.2f, 48.4f, -38.2f, 48.4f, -74f)
                curveToRelative(0f, -70.6f, -52.6f, -87.8f, -113.3f, -87.8f)
                horizontalLineTo(0f)
                verticalLineToRelative(354.4f)
                horizontalLineToRelative(171.8f)
                curveToRelative(64.4f, 0f, 124.9f, -30.9f, 124.9f, -102.9f)
                curveToRelative(0f, -44.5f, -21.1f, -77.4f, -64.7f, -89.7f)
                close()
                moveTo(77.9f, 135.9f)
                horizontalLineTo(151f)
                curveToRelative(28.1f, 0f, 53.4f, 7.9f, 53.4f, 40.5f)
                curveToRelative(0f, 30.1f, -19.7f, 42.2f, -47.5f, 42.2f)
                horizontalLineToRelative(-79f)
                verticalLineToRelative(-82.7f)
                close()
                moveToRelative(83.3f, 233.7f)
                horizontalLineTo(77.9f)
                verticalLineTo(272f)
                horizontalLineToRelative(84.9f)
                curveToRelative(34.3f, 0f, 56f, 14.3f, 56f, 50.6f)
                curveToRelative(0f, 35.8f, -25.9f, 47f, -57.6f, 47f)
                close()
                moveToRelative(358.5f, -240.7f)
                horizontalLineTo(376f)
                verticalLineTo(94f)
                horizontalLineToRelative(143.7f)
                verticalLineToRelative(34.9f)
                close()
                moveTo(576f, 305.2f)
                curveToRelative(0f, -75.9f, -44.4f, -139.2f, -124.9f, -139.2f)
                curveToRelative(-78.2f, 0f, -131.3f, 58.8f, -131.3f, 135.8f)
                curveToRelative(0f, 79.9f, 50.3f, 134.7f, 131.3f, 134.7f)
                curveToRelative(61.3f, 0f, 101f, -27.6f, 120.1f, -86.3f)
                horizontalLineTo(509f)
                curveToRelative(-6.7f, 21.9f, -34.3f, 33.5f, -55.7f, 33.5f)
                curveToRelative(-41.3f, 0f, -63f, -24.2f, -63f, -65.3f)
                horizontalLineToRelative(185.1f)
                curveToRelative(0.3f, -4.2f, 0.6f, -8.7f, 0.6f, -13.2f)
                close()
                moveTo(390.4f, 274f)
                curveToRelative(2.3f, -33.7f, 24.7f, -54.8f, 58.5f, -54.8f)
                curveToRelative(35.4f, 0f, 53.2f, 20.8f, 56.2f, 54.8f)
                horizontalLineTo(390.4f)
                close()
            }
        }.build()
        
        return _Behance!!
    }

private var _Behance: ImageVector? = null

