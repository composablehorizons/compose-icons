package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Ups: ImageVector
    get() {
        if (_Ups != null) return _Ups!!
        
        _Ups = ImageVector.Builder(
            name = "ups",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(103.2f, 303f)
                curveToRelative(-5.2f, 3.6f, -32.6f, 13.1f, -32.6f, -19f)
                verticalLineTo(180f)
                horizontalLineTo(37.9f)
                verticalLineToRelative(102.6f)
                curveToRelative(0f, 74.9f, 80.2f, 51.1f, 97.9f, 39f)
                verticalLineTo(180f)
                horizontalLineToRelative(-32.6f)
                close()
                moveTo(4f, 74.82f)
                verticalLineToRelative(220.9f)
                curveToRelative(0f, 103.7f, 74.9f, 135.2f, 187.7f, 184.1f)
                curveToRelative(112.4f, -48.9f, 187.7f, -80.2f, 187.7f, -184.1f)
                verticalLineTo(74.82f)
                curveToRelative(-116.3f, -61.6f, -281.8f, -49.6f, -375.4f, 0f)
                close()
                moveToRelative(358.1f, 220.9f)
                curveToRelative(0f, 86.6f, -53.2f, 113.6f, -170.4f, 165.3f)
                curveToRelative(-117.5f, -51.8f, -170.5f, -78.7f, -170.5f, -165.3f)
                verticalLineToRelative(-126.4f)
                curveToRelative(102.3f, -93.8f, 231.6f, -100f, 340.9f, -89.8f)
                close()
                moveToRelative(-209.6f, -107.4f)
                verticalLineToRelative(212.8f)
                horizontalLineToRelative(32.7f)
                verticalLineToRelative(-68.7f)
                curveToRelative(24.4f, 7.3f, 71.7f, -2.6f, 71.7f, -78.5f)
                curveToRelative(0f, -97.4f, -80.7f, -80.92f, -104.4f, -65.6f)
                close()
                moveToRelative(32.7f, 117.3f)
                verticalLineToRelative(-100.3f)
                curveToRelative(8.4f, -4.2f, 38.4f, -12.7f, 38.4f, 49.3f)
                curveToRelative(0f, 67.9f, -36.4f, 51.8f, -38.4f, 51f)
                close()
                moveToRelative(79.1f, -86.4f)
                curveToRelative(0.1f, 47.3f, 51.6f, 42.5f, 52.2f, 70.4f)
                curveToRelative(0.6f, 23.5f, -30.4f, 23f, -50.8f, 4.9f)
                verticalLineToRelative(30.1f)
                curveToRelative(36.2f, 21.5f, 81.9f, 8.1f, 83.2f, -33.5f)
                curveToRelative(1.7f, -51.5f, -54.1f, -46.6f, -53.4f, -73.2f)
                curveToRelative(0.6f, -20.3f, 30.6f, -20.5f, 48.5f, -2.2f)
                verticalLineToRelative(-28.4f)
                curveToRelative(-28.5f, -22f, -79.9f, -9.2f, -79.7f, 31.9f)
                close()
            }
        }.build()
        
        return _Ups!!
    }

private var _Ups: ImageVector? = null

