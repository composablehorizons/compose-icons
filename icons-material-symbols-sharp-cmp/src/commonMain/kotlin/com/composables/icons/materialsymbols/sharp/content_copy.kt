package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Content_copy: ImageVector
    get() {
        if (_Content_copy != null) return _Content_copy!!
        
        _Content_copy = ImageVector.Builder(
            name = "content_copy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 720f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(640f)
                horizontalLineTo(280f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-480f)
                horizontalLineTo(360f)
                verticalLineToRelative(480f)
                close()
                moveTo(120f, 880f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(240f, -240f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Content_copy!!
    }

private var _Content_copy: ImageVector? = null

