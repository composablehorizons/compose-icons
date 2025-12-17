package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Picture_in_picture_alt: ImageVector
    get() {
        if (_Picture_in_picture_alt != null) return _Picture_in_picture_alt!!
        
        _Picture_in_picture_alt = ImageVector.Builder(
            name = "picture_in_picture_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(360f, -120f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-240f)
                horizontalLineTo(440f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(160f, -120f)
                close()
            }
        }.build()
        
        return _Picture_in_picture_alt!!
    }

private var _Picture_in_picture_alt: ImageVector? = null

