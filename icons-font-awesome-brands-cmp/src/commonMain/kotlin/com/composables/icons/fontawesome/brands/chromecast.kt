package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Chromecast: ImageVector
    get() {
        if (_Chromecast != null) return _Chromecast!!
        
        _Chromecast = ImageVector.Builder(
            name = "chromecast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(447.8f, 64f)
                horizontalLineTo(64f)
                curveToRelative(-23.6f, 0f, -42.7f, 19.1f, -42.7f, 42.7f)
                verticalLineToRelative(63.9f)
                horizontalLineTo(64f)
                verticalLineToRelative(-63.9f)
                horizontalLineToRelative(383.8f)
                verticalLineToRelative(298.6f)
                horizontalLineTo(298.6f)
                verticalLineTo(448f)
                horizontalLineTo(448f)
                curveToRelative(23.6f, 0f, 42.7f, -19.1f, 42.7f, -42.7f)
                verticalLineTo(106.7f)
                curveTo(490.7f, 83.1f, 471.4f, 64f, 447.8f, 64f)
                close()
                moveTo(21.3f, 383.6f)
                lineTo(21.3f, 383.6f)
                lineToRelative(0f, 63.9f)
                horizontalLineToRelative(63.9f)
                curveTo(85.2f, 412.2f, 56.6f, 383.6f, 21.3f, 383.6f)
                lineTo(21.3f, 383.6f)
                close()
                moveTo(21.3f, 298.6f)
                verticalLineTo(341f)
                curveToRelative(58.9f, 0f, 106.6f, 48.1f, 106.6f, 107f)
                horizontalLineToRelative(42.7f)
                curveTo(170.7f, 365.6f, 103.7f, 298.7f, 21.3f, 298.6f)
                close()
                moveTo(213.4f, 448f)
                horizontalLineToRelative(42.7f)
                curveToRelative(-0.5f, -129.5f, -105.3f, -234.3f, -234.8f, -234.6f)
                lineToRelative(0f, 42.4f)
                curveTo(127.3f, 255.6f, 213.3f, 342f, 213.4f, 448f)
                close()
            }
        }.build()
        
        return _Chromecast!!
    }

private var _Chromecast: ImageVector? = null

