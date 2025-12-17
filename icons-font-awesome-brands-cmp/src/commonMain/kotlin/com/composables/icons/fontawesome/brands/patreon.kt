package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Patreon: ImageVector
    get() {
        if (_Patreon != null) return _Patreon!!
        
        _Patreon = ImageVector.Builder(
            name = "patreon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(512f, 194.8f)
                curveToRelative(0f, 101.3f, -82.4f, 183.8f, -183.8f, 183.8f)
                curveToRelative(-101.7f, 0f, -184.4f, -82.4f, -184.4f, -183.8f)
                curveToRelative(0f, -101.6f, 82.7f, -184.3f, 184.4f, -184.3f)
                curveTo(429.6f, 10.5f, 512f, 93.2f, 512f, 194.8f)
                close()
                moveTo(0f, 501.5f)
                horizontalLineToRelative(90f)
                verticalLineToRelative(-491f)
                horizontalLineTo(0f)
                verticalLineToRelative(491f)
                close()
            }
        }.build()
        
        return _Patreon!!
    }

private var _Patreon: ImageVector? = null

