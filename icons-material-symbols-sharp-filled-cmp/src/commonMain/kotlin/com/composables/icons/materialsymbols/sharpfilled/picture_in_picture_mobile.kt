package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Picture_in_picture_mobile: ImageVector
    get() {
        if (_Picture_in_picture_mobile != null) return _Picture_in_picture_mobile!!
        
        _Picture_in_picture_mobile = ImageVector.Builder(
            name = "picture_in_picture_mobile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 880f)
                horizontalLineTo(160f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(800f)
                close()
                moveTo(680f, 520f)
                verticalLineToRelative(-320f)
                horizontalLineTo(440f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Picture_in_picture_mobile!!
    }

private var _Picture_in_picture_mobile: ImageVector? = null

