package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Align_justify_flex_end: ImageVector
    get() {
        if (_Align_justify_flex_end != null) return _Align_justify_flex_end!!
        
        _Align_justify_flex_end = ImageVector.Builder(
            name = "align_justify_flex_end",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(800f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(560f, 680f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(400f)
                horizontalLineTo(560f)
                close()
                moveToRelative(-240f, 0f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(400f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Align_justify_flex_end!!
    }

private var _Align_justify_flex_end: ImageVector? = null

