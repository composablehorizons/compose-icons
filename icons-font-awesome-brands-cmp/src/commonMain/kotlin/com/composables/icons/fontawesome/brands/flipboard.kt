package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Flipboard: ImageVector
    get() {
        if (_Flipboard != null) return _Flipboard!!
        
        _Flipboard = ImageVector.Builder(
            name = "flipboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 32f)
                verticalLineToRelative(448f)
                horizontalLineToRelative(448f)
                verticalLineTo(32f)
                horizontalLineTo(0f)
                close()
                moveToRelative(358.4f, 179.2f)
                horizontalLineToRelative(-89.6f)
                verticalLineToRelative(89.6f)
                horizontalLineToRelative(-89.6f)
                verticalLineToRelative(89.6f)
                horizontalLineTo(89.6f)
                verticalLineTo(121.6f)
                horizontalLineToRelative(268.8f)
                verticalLineToRelative(89.6f)
                close()
            }
        }.build()
        
        return _Flipboard!!
    }

private var _Flipboard: ImageVector? = null

