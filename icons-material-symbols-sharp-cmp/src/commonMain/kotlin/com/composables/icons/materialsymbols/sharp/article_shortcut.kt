package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Article_shortcut: ImageVector
    get() {
        if (_Article_shortcut != null) return _Article_shortcut!!
        
        _Article_shortcut = ImageVector.Builder(
            name = "article_shortcut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 480f)
                close()
                moveTo(265f, 880f)
                quadToRelative(-79f, 0f, -134.5f, -55.5f)
                reflectiveQuadTo(75f, 690f)
                quadToRelative(0f, -57f, 29.5f, -102f)
                reflectiveQuadToRelative(77.5f, -68f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-97f)
                quadToRelative(-37f, 8f, -61f, 38f)
                reflectiveQuadToRelative(-24f, 69f)
                quadToRelative(0f, 46f, 32.5f, 78f)
                reflectiveQuadToRelative(77.5f, 32f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(135f, -40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(400f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(400f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-80f)
                horizontalLineTo(400f)
                verticalLineToRelative(80f)
                close()
                moveTo(280f, 360f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Article_shortcut!!
    }

private var _Article_shortcut: ImageVector? = null

