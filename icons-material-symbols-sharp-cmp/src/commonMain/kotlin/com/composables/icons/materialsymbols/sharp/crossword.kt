package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Crossword: ImageVector
    get() {
        if (_Crossword != null) return _Crossword!!
        
        _Crossword = ImageVector.Builder(
            name = "crossword",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 800f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(400f)
                verticalLineToRelative(160f)
                close()
                moveTo(160f, 560f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(160f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(400f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(640f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, -240f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(640f)
                verticalLineToRelative(160f)
                close()
                moveTo(320f, 880f)
                verticalLineToRelative(-240f)
                horizontalLineTo(80f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(560f)
                horizontalLineTo(640f)
                verticalLineToRelative(240f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Crossword!!
    }

private var _Crossword: ImageVector? = null

