package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Move_selection_right: ImageVector
    get() {
        if (_Move_selection_right != null) return _Move_selection_right!!
        
        _Move_selection_right = ImageVector.Builder(
            name = "move_selection_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 720f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(480f)
                horizontalLineTo(400f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-320f)
                horizontalLineTo(480f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(-240f, 80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, -400f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(80f, 720f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, -200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, -200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(560f, 160f)
                close()
            }
        }.build()
        
        return _Move_selection_right!!
    }

private var _Move_selection_right: ImageVector? = null

