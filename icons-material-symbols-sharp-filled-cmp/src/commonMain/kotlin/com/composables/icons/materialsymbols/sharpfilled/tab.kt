package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Tab: ImageVector
    get() {
        if (_Tab != null) return _Tab!!
        
        _Tab = ImageVector.Builder(
            name = "tab",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(440f, -400f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-160f)
                horizontalLineTo(520f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Tab!!
    }

private var _Tab: ImageVector? = null

