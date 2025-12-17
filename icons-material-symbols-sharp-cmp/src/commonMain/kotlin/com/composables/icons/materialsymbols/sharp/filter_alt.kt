package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Filter_alt: ImageVector
    get() {
        if (_Filter_alt != null) return _Filter_alt!!
        
        _Filter_alt = ImageVector.Builder(
            name = "filter_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 800f)
                verticalLineToRelative(-280f)
                lineTo(118f, 160f)
                horizontalLineToRelative(724f)
                lineTo(560f, 520f)
                verticalLineToRelative(280f)
                horizontalLineTo(400f)
                close()
                moveToRelative(80f, -308f)
                lineToRelative(198f, -252f)
                horizontalLineTo(282f)
                lineToRelative(198f, 252f)
                close()
                moveToRelative(0f, 0f)
                close()
            }
        }.build()
        
        return _Filter_alt!!
    }

private var _Filter_alt: ImageVector? = null

