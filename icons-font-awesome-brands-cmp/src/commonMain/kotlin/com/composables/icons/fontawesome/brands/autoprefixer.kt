package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Autoprefixer: ImageVector
    get() {
        if (_Autoprefixer != null) return _Autoprefixer!!
        
        _Autoprefixer = ImageVector.Builder(
            name = "autoprefixer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(318.4f, 16f)
                lineToRelative(-161f, 480f)
                horizontalLineToRelative(77.5f)
                lineToRelative(25.4f, -81.4f)
                horizontalLineToRelative(119.5f)
                lineTo(405f, 496f)
                horizontalLineToRelative(77.5f)
                lineTo(318.4f, 16f)
                close()
                moveToRelative(-40.3f, 341.9f)
                lineToRelative(41.2f, -130.4f)
                horizontalLineToRelative(1.5f)
                lineToRelative(40.9f, 130.4f)
                horizontalLineToRelative(-83.6f)
                close()
                moveTo(640f, 405f)
                lineToRelative(-10f, -31.4f)
                lineTo(462.1f, 358f)
                lineToRelative(19.4f, 56.5f)
                lineTo(640f, 405f)
                close()
                moveToRelative(-462.1f, -47f)
                lineTo(10f, 373.7f)
                lineTo(0f, 405f)
                lineToRelative(158.5f, 9.4f)
                lineToRelative(19.4f, -56.4f)
                close()
            }
        }.build()
        
        return _Autoprefixer!!
    }

private var _Autoprefixer: ImageVector? = null

