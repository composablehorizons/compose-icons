package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Note_stack: ImageVector
    get() {
        if (_Note_stack != null) return _Note_stack!!
        
        _Note_stack = ImageVector.Builder(
            name = "note_stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 880f)
                verticalLineToRelative(-601f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(401f)
                lineTo(680f, 880f)
                horizontalLineTo(280f)
                close()
                moveToRelative(520f, -240f)
                horizontalLineTo(640f)
                verticalLineToRelative(160f)
                lineToRelative(160f, -160f)
                close()
                moveTo(172f, 763f)
                lineTo(67f, 172f)
                lineToRelative(591f, -105f)
                lineToRelative(24f, 133f)
                horizontalLineTo(200f)
                verticalLineToRelative(558f)
                lineToRelative(-28f, 5f)
                close()
            }
        }.build()
        
        return _Note_stack!!
    }

private var _Note_stack: ImageVector? = null

