package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Compare: ImageVector
    get() {
        if (_Compare != null) return _Compare!!
        
        _Compare = ImageVector.Builder(
            name = "compare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 920f)
                verticalLineToRelative(-80f)
                horizontalLineTo(120f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(880f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(200f, 720f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-240f)
                lineTo(200f, 720f)
                close()
                moveToRelative(360f, 120f)
                verticalLineToRelative(-360f)
                lineToRelative(200f, 240f)
                verticalLineToRelative(-520f)
                horizontalLineTo(560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(720f)
                horizontalLineTo(560f)
                close()
            }
        }.build()
        
        return _Compare!!
    }

private var _Compare: ImageVector? = null

