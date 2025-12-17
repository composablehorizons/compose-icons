package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.TumblrSquare: ImageVector
    get() {
        if (_TumblrSquare != null) return _TumblrSquare!!
        
        _TumblrSquare = ImageVector.Builder(
            name = "tumblr-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 32f)
                horizontalLineTo(48f)
                curveTo(21.5f, 32f, 0f, 53.5f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveToRelative(-82.3f, 364.2f)
                curveToRelative(-8.5f, 9.1f, -31.2f, 19.8f, -60.9f, 19.8f)
                curveToRelative(-75.5f, 0f, -91.9f, -55.5f, -91.9f, -87.9f)
                verticalLineToRelative(-90f)
                horizontalLineToRelative(-29.7f)
                curveToRelative(-3.4f, 0f, -6.2f, -2.8f, -6.2f, -6.2f)
                verticalLineToRelative(-42.5f)
                curveToRelative(0f, -4.5f, 2.8f, -8.5f, 7.1f, -10f)
                curveToRelative(38.8f, -13.7f, 50.9f, -47.5f, 52.7f, -73.2f)
                curveToRelative(0.5f, -6.9f, 4.1f, -10.2f, 10f, -10.2f)
                horizontalLineToRelative(44.3f)
                curveToRelative(3.4f, 0f, 6.2f, 2.8f, 6.2f, 6.2f)
                verticalLineToRelative(72f)
                horizontalLineToRelative(51.9f)
                curveToRelative(3.4f, 0f, 6.2f, 2.8f, 6.2f, 6.2f)
                verticalLineToRelative(51.1f)
                curveToRelative(0f, 3.4f, -2.8f, 6.2f, -6.2f, 6.2f)
                horizontalLineToRelative(-52.1f)
                verticalLineTo(321f)
                curveToRelative(0f, 21.4f, 14.8f, 33.5f, 42.5f, 22.4f)
                curveToRelative(3f, -1.2f, 5.6f, -2f, 8f, -1.4f)
                curveToRelative(2.2f, 0.5f, 3.6f, 2.1f, 4.6f, 4.9f)
                lineToRelative(13.8f, 40.2f)
                curveToRelative(1f, 3.2f, 2f, 6.7f, -0.3f, 9.1f)
                close()
            }
        }.build()
        
        return _TumblrSquare!!
    }

private var _TumblrSquare: ImageVector? = null

