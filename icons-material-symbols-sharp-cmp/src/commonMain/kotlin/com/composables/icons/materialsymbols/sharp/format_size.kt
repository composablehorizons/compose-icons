package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Format_size: ImageVector
    get() {
        if (_Format_size != null) return _Format_size!!
        
        _Format_size = ImageVector.Builder(
            name = "format_size",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 800f)
                verticalLineToRelative(-520f)
                horizontalLineTo(360f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(120f)
                horizontalLineTo(680f)
                verticalLineToRelative(520f)
                horizontalLineTo(560f)
                close()
                moveToRelative(-360f, 0f)
                verticalLineToRelative(-320f)
                horizontalLineTo(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(120f)
                horizontalLineTo(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Format_size!!
    }

private var _Format_size: ImageVector? = null

