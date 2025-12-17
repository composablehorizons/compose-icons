package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Select_window_2: ImageVector
    get() {
        if (_Select_window_2 != null) return _Select_window_2!!
        
        _Select_window_2 = ImageVector.Builder(
            name = "select_window_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-360f)
                horizontalLineTo(160f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(560f, -200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-360f)
                horizontalLineTo(320f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(520f)
                horizontalLineTo(720f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(520f)
                horizontalLineTo(80f)
                close()
                moveToRelative(480f, -603f)
                close()
                moveTo(400f, 620f)
                close()
            }
        }.build()
        
        return _Select_window_2!!
    }

private var _Select_window_2: ImageVector? = null

