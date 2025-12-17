package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Unsplash: ImageVector
    get() {
        if (_Unsplash != null) return _Unsplash!!
        
        _Unsplash = ImageVector.Builder(
            name = "unsplash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 230.17f)
                verticalLineTo(480f)
                horizontalLineTo(0f)
                verticalLineTo(230.17f)
                horizontalLineTo(141.13f)
                verticalLineTo(355.09f)
                horizontalLineTo(306.87f)
                verticalLineTo(230.17f)
                close()
                moveTo(306.87f, 32f)
                horizontalLineTo(141.13f)
                verticalLineTo(156.91f)
                horizontalLineTo(306.87f)
                close()
            }
        }.build()
        
        return _Unsplash!!
    }

private var _Unsplash: ImageVector? = null

