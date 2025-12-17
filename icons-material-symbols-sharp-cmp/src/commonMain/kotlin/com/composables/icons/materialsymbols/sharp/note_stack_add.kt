package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Note_stack_add: ImageVector
    get() {
        if (_Note_stack_add != null) return _Note_stack_add!!
        
        _Note_stack_add = ImageVector.Builder(
            name = "note_stack_add",
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
                moveToRelative(80f, -80f)
                horizontalLineToRelative(280f)
                lineToRelative(160f, -160f)
                verticalLineToRelative(-280f)
                horizontalLineTo(360f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(-188f, -37f)
                lineTo(67f, 172f)
                lineToRelative(591f, -105f)
                lineToRelative(24f, 133f)
                horizontalLineToRelative(-82f)
                lineToRelative(-7f, -40f)
                lineToRelative(-433f, 77f)
                lineToRelative(40f, 226f)
                verticalLineToRelative(295f)
                lineToRelative(-28f, 5f)
                close()
                moveToRelative(368f, -23f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(620f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                horizontalLineTo(420f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(40f, -160f)
                close()
            }
        }.build()
        
        return _Note_stack_add!!
    }

private var _Note_stack_add: ImageVector? = null

