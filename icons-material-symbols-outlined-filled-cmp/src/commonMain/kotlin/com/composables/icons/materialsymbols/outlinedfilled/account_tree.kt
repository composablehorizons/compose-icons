package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Account_tree: ImageVector
    get() {
        if (_Account_tree != null) return _Account_tree!!
        
        _Account_tree = ImageVector.Builder(
            name = "account_tree",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 840f)
                verticalLineToRelative(-120f)
                horizontalLineTo(440f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                horizontalLineTo(80f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(320f)
                horizontalLineTo(600f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(320f)
                horizontalLineTo(600f)
                close()
            }
        }.build()
        
        return _Account_tree!!
    }

private var _Account_tree: ImageVector? = null

