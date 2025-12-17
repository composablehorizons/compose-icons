package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Align_justify_flex_start: ImageVector
    get() {
        if (_Align_justify_flex_start != null) return _Align_justify_flex_start!!
        
        _Align_justify_flex_start = ImageVector.Builder(
            name = "align_justify_flex_start",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(800f)
                horizontalLineTo(80f)
                close()
                moveToRelative(440f, -200f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(400f)
                horizontalLineTo(520f)
                close()
                moveToRelative(-240f, 0f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(400f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Align_justify_flex_start!!
    }

private var _Align_justify_flex_start: ImageVector? = null

