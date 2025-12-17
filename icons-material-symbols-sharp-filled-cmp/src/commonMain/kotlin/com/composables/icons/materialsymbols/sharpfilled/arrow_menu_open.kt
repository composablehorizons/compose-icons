package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Arrow_menu_open: ImageVector
    get() {
        if (_Arrow_menu_open != null) return _Arrow_menu_open!!
        
        _Arrow_menu_open = ImageVector.Builder(
            name = "arrow_menu_open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(720f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, -160f)
                verticalLineToRelative(-400f)
                lineToRelative(200f, 200f)
                lineToRelative(-200f, 200f)
                close()
            }
        }.build()
        
        return _Arrow_menu_open!!
    }

private var _Arrow_menu_open: ImageVector? = null

