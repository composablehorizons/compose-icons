package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Html5: ImageVector
    get() {
        if (_Html5 != null) return _Html5!!
        
        _Html5 = ImageVector.Builder(
            name = "html5",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 32f)
                lineToRelative(34.9f, 395.8f)
                lineTo(191.5f, 480f)
                lineToRelative(157.6f, -52.2f)
                lineTo(384f, 32f)
                horizontalLineTo(0f)
                close()
                moveToRelative(308.2f, 127.9f)
                horizontalLineTo(124.4f)
                lineToRelative(4.1f, 49.4f)
                horizontalLineToRelative(175.6f)
                lineToRelative(-13.6f, 148.4f)
                lineToRelative(-97.9f, 27f)
                verticalLineToRelative(0.3f)
                horizontalLineToRelative(-1.1f)
                lineToRelative(-98.7f, -27.3f)
                lineToRelative(-6f, -75.8f)
                horizontalLineToRelative(47.7f)
                lineTo(138f, 320f)
                lineToRelative(53.5f, 14.5f)
                lineToRelative(53.7f, -14.5f)
                lineToRelative(6f, -62.2f)
                horizontalLineTo(84.3f)
                lineTo(71.5f, 112.2f)
                horizontalLineToRelative(241.1f)
                lineToRelative(-4.4f, 47.7f)
                close()
            }
        }.build()
        
        return _Html5!!
    }

private var _Html5: ImageVector? = null

