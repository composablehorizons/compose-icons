package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Houzz: ImageVector
    get() {
        if (_Houzz != null) return _Houzz!!
        
        _Houzz = ImageVector.Builder(
            name = "houzz",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(275.9f, 330.7f)
                horizontalLineTo(171.3f)
                verticalLineTo(480f)
                horizontalLineTo(17f)
                verticalLineTo(32f)
                horizontalLineToRelative(109.5f)
                verticalLineToRelative(104.5f)
                lineToRelative(305.1f, 85.6f)
                verticalLineTo(480f)
                horizontalLineTo(275.9f)
                close()
            }
        }.build()
        
        return _Houzz!!
    }

private var _Houzz: ImageVector? = null

