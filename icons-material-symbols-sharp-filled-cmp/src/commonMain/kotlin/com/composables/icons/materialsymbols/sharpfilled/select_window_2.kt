package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Select_window_2: ImageVector
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
                moveTo(800f, 600f)
                verticalLineToRelative(-320f)
                horizontalLineTo(240f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(520f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(520f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Select_window_2!!
    }

private var _Select_window_2: ImageVector? = null

