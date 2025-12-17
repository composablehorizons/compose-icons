package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Picture_in_picture_small: ImageVector
    get() {
        if (_Picture_in_picture_small != null) return _Picture_in_picture_small!!
        
        _Picture_in_picture_small = ImageVector.Builder(
            name = "picture_in_picture_small",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(320f, -160f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(240f)
                horizontalLineTo(400f)
                close()
            }
        }.build()
        
        return _Picture_in_picture_small!!
    }

private var _Picture_in_picture_small: ImageVector? = null

