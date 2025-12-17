package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Stack_group: ImageVector
    get() {
        if (_Stack_group != null) return _Stack_group!!
        
        _Stack_group = ImageVector.Builder(
            name = "stack_group",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 880f)
                verticalLineToRelative(-240f)
                horizontalLineTo(80f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(560f)
                horizontalLineTo(320f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-400f)
                horizontalLineTo(560f)
                verticalLineToRelative(-240f)
                horizontalLineTo(160f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(80f, -320f)
                close()
            }
        }.build()
        
        return _Stack_group!!
    }

private var _Stack_group: ImageVector? = null

