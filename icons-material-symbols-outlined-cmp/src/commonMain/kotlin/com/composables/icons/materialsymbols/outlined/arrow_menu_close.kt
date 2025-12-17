package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Arrow_menu_close: ImageVector
    get() {
        if (_Arrow_menu_close != null) return _Arrow_menu_close!!
        
        _Arrow_menu_close = ImageVector.Builder(
            name = "arrow_menu_close",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 680f)
                verticalLineToRelative(-400f)
                lineTo(240f, 480f)
                lineToRelative(200f, 200f)
                close()
                moveToRelative(80f, 160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(720f)
                close()
            }
        }.build()
        
        return _Arrow_menu_close!!
    }

private var _Arrow_menu_close: ImageVector? = null

