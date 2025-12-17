package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.VimeoSquare: ImageVector
    get() {
        if (_VimeoSquare != null) return _VimeoSquare!!
        
        _VimeoSquare = ImageVector.Builder(
            name = "vimeo-square",
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
                moveToRelative(-16.2f, 149.6f)
                curveToRelative(-1.4f, 31.1f, -23.2f, 73.8f, -65.3f, 127.9f)
                curveToRelative(-43.5f, 56.5f, -80.3f, 84.8f, -110.4f, 84.8f)
                curveToRelative(-18.7f, 0f, -34.4f, -17.2f, -47.3f, -51.6f)
                curveToRelative(-25.2f, -92.3f, -35.9f, -146.4f, -56.7f, -146.4f)
                curveToRelative(-2.4f, 0f, -10.8f, 5f, -25.1f, 15.1f)
                lineTo(64f, 192f)
                curveToRelative(36.9f, -32.4f, 72.1f, -68.4f, 94.1f, -70.4f)
                curveToRelative(24.9f, -2.4f, 40.2f, 14.6f, 46f, 51.1f)
                curveToRelative(20.5f, 129.6f, 29.6f, 149.2f, 66.8f, 90.5f)
                curveToRelative(13.4f, -21.2f, 20.6f, -37.2f, 21.5f, -48.3f)
                curveToRelative(3.4f, -32.8f, -25.6f, -30.6f, -45.2f, -22.2f)
                curveToRelative(15.7f, -51.5f, 45.8f, -76.5f, 90.1f, -75.1f)
                curveToRelative(32.9f, 1f, 48.4f, 22.4f, 46.5f, 64f)
                close()
            }
        }.build()
        
        return _VimeoSquare!!
    }

private var _VimeoSquare: ImageVector? = null

