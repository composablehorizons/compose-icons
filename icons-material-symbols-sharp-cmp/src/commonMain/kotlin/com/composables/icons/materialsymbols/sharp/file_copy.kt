package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.File_copy: ImageVector
    get() {
        if (_File_copy != null) return _File_copy!!
        
        _File_copy = ImageVector.Builder(
            name = "file_copy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 760f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(360f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(480f)
                horizontalLineTo(240f)
                close()
                moveToRelative(320f, -440f)
                verticalLineToRelative(-200f)
                horizontalLineTo(320f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-360f)
                horizontalLineTo(560f)
                close()
                moveTo(80f, 920f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(240f, -800f)
                verticalLineToRelative(200f)
                verticalLineToRelative(-200f)
                verticalLineToRelative(560f)
                verticalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _File_copy!!
    }

private var _File_copy: ImageVector? = null

