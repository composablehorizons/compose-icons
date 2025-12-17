package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Chair_alt: ImageVector
    get() {
        if (_Chair_alt != null) return _Chair_alt!!
        
        _Chair_alt = ImageVector.Builder(
            name = "chair_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(280f)
                horizontalLineTo(640f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-120f)
                horizontalLineTo(280f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(200f, -360f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(400f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Chair_alt!!
    }

private var _Chair_alt: ImageVector? = null

