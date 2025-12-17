package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Align_vertical_bottom: ImageVector
    get() {
        if (_Align_vertical_bottom != null) return _Align_vertical_bottom!!
        
        _Align_vertical_bottom = ImageVector.Builder(
            name = "align_vertical_bottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(200f, -160f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(640f)
                horizontalLineTo(280f)
                close()
                moveToRelative(280f, 0f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(400f)
                horizontalLineTo(560f)
                close()
            }
        }.build()
        
        return _Align_vertical_bottom!!
    }

private var _Align_vertical_bottom: ImageVector? = null

