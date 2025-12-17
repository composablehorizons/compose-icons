package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Picture_in_picture_large: ImageVector
    get() {
        if (_Picture_in_picture_large != null) return _Picture_in_picture_large!!
        
        _Picture_in_picture_large = ImageVector.Builder(
            name = "picture_in_picture_large",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 640f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(400f)
                horizontalLineTo(240f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Picture_in_picture_large!!
    }

private var _Picture_in_picture_large: ImageVector? = null

