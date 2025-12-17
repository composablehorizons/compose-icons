package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Wpforms: ImageVector
    get() {
        if (_Wpforms != null) return _Wpforms!!
        
        _Wpforms = ImageVector.Builder(
            name = "wpforms",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 75.2f)
                verticalLineToRelative(361.7f)
                curveToRelative(0f, 24.3f, -19f, 43.2f, -43.2f, 43.2f)
                horizontalLineTo(43.2f)
                curveTo(19.3f, 480f, 0f, 461.4f, 0f, 436.8f)
                verticalLineTo(75.2f)
                curveTo(0f, 51.1f, 18.8f, 32f, 43.2f, 32f)
                horizontalLineToRelative(361.7f)
                curveToRelative(24f, 0f, 43.1f, 18.8f, 43.1f, 43.2f)
                close()
                moveToRelative(-37.3f, 361.6f)
                verticalLineTo(75.2f)
                curveToRelative(0f, -3f, -2.6f, -5.8f, -5.8f, -5.8f)
                horizontalLineToRelative(-9.3f)
                lineTo(285.3f, 144f)
                lineTo(224f, 94.1f)
                lineTo(162.8f, 144f)
                lineTo(52.5f, 69.3f)
                horizontalLineToRelative(-9.3f)
                curveToRelative(-3.2f, 0f, -5.8f, 2.8f, -5.8f, 5.8f)
                verticalLineToRelative(361.7f)
                curveToRelative(0f, 3f, 2.6f, 5.8f, 5.8f, 5.8f)
                horizontalLineToRelative(361.7f)
                curveToRelative(3.2f, 0.1f, 5.8f, -2.7f, 5.8f, -5.8f)
                close()
                moveTo(150.2f, 186f)
                verticalLineToRelative(37f)
                horizontalLineTo(76.7f)
                verticalLineToRelative(-37f)
                horizontalLineToRelative(73.5f)
                close()
                moveToRelative(0f, 74.4f)
                verticalLineToRelative(37.3f)
                horizontalLineTo(76.7f)
                verticalLineToRelative(-37.3f)
                horizontalLineToRelative(73.5f)
                close()
                moveToRelative(11.1f, -147.3f)
                lineToRelative(54f, -43.7f)
                horizontalLineTo(96.8f)
                lineToRelative(64.5f, 43.7f)
                close()
                moveToRelative(210f, 72.9f)
                verticalLineToRelative(37f)
                horizontalLineToRelative(-196f)
                verticalLineToRelative(-37f)
                horizontalLineToRelative(196f)
                close()
                moveToRelative(0f, 74.4f)
                verticalLineToRelative(37.3f)
                horizontalLineToRelative(-196f)
                verticalLineToRelative(-37.3f)
                horizontalLineToRelative(196f)
                close()
                moveToRelative(-84.6f, -147.3f)
                lineToRelative(64.5f, -43.7f)
                horizontalLineTo(232.8f)
                lineToRelative(53.9f, 43.7f)
                close()
                moveTo(371.3f, 335f)
                verticalLineToRelative(37.3f)
                horizontalLineToRelative(-99.4f)
                verticalLineTo(335f)
                horizontalLineToRelative(99.4f)
                close()
            }
        }.build()
        
        return _Wpforms!!
    }

private var _Wpforms: ImageVector? = null

