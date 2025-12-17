package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Microsoft: ImageVector
    get() {
        if (_Microsoft != null) return _Microsoft!!
        
        _Microsoft = ImageVector.Builder(
            name = "microsoft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 32f)
                horizontalLineToRelative(214.6f)
                verticalLineToRelative(214.6f)
                horizontalLineTo(0f)
                verticalLineTo(32f)
                close()
                moveToRelative(233.4f, 0f)
                horizontalLineTo(448f)
                verticalLineToRelative(214.6f)
                horizontalLineTo(233.4f)
                verticalLineTo(32f)
                close()
                moveTo(0f, 265.4f)
                horizontalLineToRelative(214.6f)
                verticalLineTo(480f)
                horizontalLineTo(0f)
                verticalLineTo(265.4f)
                close()
                moveToRelative(233.4f, 0f)
                horizontalLineTo(448f)
                verticalLineTo(480f)
                horizontalLineTo(233.4f)
                verticalLineTo(265.4f)
                close()
            }
        }.build()
        
        return _Microsoft!!
    }

private var _Microsoft: ImageVector? = null

