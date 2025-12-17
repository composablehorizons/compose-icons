package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Align_flex_start: ImageVector
    get() {
        if (_Align_flex_start != null) return _Align_flex_start!!
        
        _Align_flex_start = ImageVector.Builder(
            name = "align_flex_start",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(340f, 640f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(560f)
                horizontalLineTo(420f)
                close()
            }
        }.build()
        
        return _Align_flex_start!!
    }

private var _Align_flex_start: ImageVector? = null

