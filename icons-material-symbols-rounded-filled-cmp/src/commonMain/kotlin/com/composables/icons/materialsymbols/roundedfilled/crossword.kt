package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Crossword: ImageVector
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
                moveTo(360f, 700f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(420f, 880f)
                horizontalLineToRelative(120f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(600f, 820f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(540f, 640f)
                horizontalLineTo(420f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(360f, 700f)
                close()
                moveToRelative(-40f, -160f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(260f, 360f)
                horizontalLineTo(140f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(80f, 420f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(140f, 600f)
                horizontalLineToRelative(120f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(320f, 540f)
                close()
                moveToRelative(100f, 60f)
                horizontalLineToRelative(120f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(600f, 540f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(540f, 360f)
                horizontalLineTo(420f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(360f, 420f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(420f, 600f)
                close()
                moveToRelative(280f, 0f)
                horizontalLineToRelative(120f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(880f, 540f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(820f, 360f)
                horizontalLineTo(700f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(640f, 420f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(700f, 600f)
                close()
                moveToRelative(0f, -280f)
                horizontalLineToRelative(120f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(880f, 260f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(820f, 80f)
                horizontalLineTo(700f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(640f, 140f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(700f, 320f)
                close()
            }
        }.build()
        
        return _Crossword!!
    }

private var _Crossword: ImageVector? = null

