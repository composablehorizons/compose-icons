package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.DigitalOcean: ImageVector
    get() {
        if (_DigitalOcean != null) return _DigitalOcean!!
        
        _DigitalOcean = ImageVector.Builder(
            name = "digital-ocean",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(87f, 481.8f)
                horizontalLineToRelative(73.7f)
                verticalLineToRelative(-73.6f)
                horizontalLineTo(87f)
                close()
                moveTo(25.4f, 346.6f)
                verticalLineToRelative(61.6f)
                horizontalLineTo(87f)
                verticalLineToRelative(-61.6f)
                close()
                moveToRelative(466.2f, -169.7f)
                curveToRelative(-23f, -74.2f, -82.4f, -133.3f, -156.6f, -156.6f)
                curveTo(164.9f, -32.8f, 8f, 93.7f, 8f, 255.9f)
                horizontalLineToRelative(95.8f)
                curveToRelative(0f, -101.8f, 101f, -180.5f, 208.1f, -141.7f)
                curveToRelative(39.7f, 14.3f, 71.5f, 46.1f, 85.8f, 85.7f)
                curveToRelative(39.1f, 107f, -39.7f, 207.8f, -141.4f, 208f)
                verticalLineToRelative(0.3f)
                horizontalLineToRelative(-0.3f)
                verticalLineTo(504f)
                curveToRelative(162.6f, 0f, 288.8f, -156.8f, 235.6f, -327.1f)
                close()
                moveToRelative(-235.3f, 231f)
                verticalLineToRelative(-95.3f)
                horizontalLineToRelative(-95.6f)
                verticalLineToRelative(95.6f)
                horizontalLineTo(256f)
                verticalLineToRelative(-0.3f)
                close()
            }
        }.build()
        
        return _DigitalOcean!!
    }

private var _DigitalOcean: ImageVector? = null

