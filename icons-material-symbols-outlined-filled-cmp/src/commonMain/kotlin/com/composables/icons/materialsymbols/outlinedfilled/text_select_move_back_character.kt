package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Text_select_move_back_character: ImageVector
    get() {
        if (_Text_select_move_back_character != null) return _Text_select_move_back_character!!
        
        _Text_select_move_back_character = ImageVector.Builder(
            name = "text_select_move_back_character",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, 640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(280f, 200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, 640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(120f, 200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, 640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(480f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(600f)
                close()
                moveTo(280f, 640f)
                lineTo(120f, 480f)
                lineToRelative(160f, -160f)
                lineToRelative(56f, 56f)
                lineToRelative(-63f, 64f)
                horizontalLineToRelative(287f)
                verticalLineToRelative(80f)
                horizontalLineTo(273f)
                lineToRelative(63f, 64f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Text_select_move_back_character!!
    }

private var _Text_select_move_back_character: ImageVector? = null

