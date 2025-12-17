package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Scrollable_header: ImageVector
    get() {
        if (_Scrollable_header != null) return _Scrollable_header!!
        
        _Scrollable_header = ImageVector.Builder(
            name = "scrollable_header",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-200f)
                horizontalLineTo(200f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(0f, -280f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-280f)
                horizontalLineTo(200f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-280f)
                verticalLineToRelative(280f)
                close()
            }
        }.build()
        
        return _Scrollable_header!!
    }

private var _Scrollable_header: ImageVector? = null

