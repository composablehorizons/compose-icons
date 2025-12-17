package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Align_horizontal_left: ImageVector
    get() {
        if (_Align_horizontal_left != null) return _Align_horizontal_left!!
        
        _Align_horizontal_left = ImageVector.Builder(
            name = "align_horizontal_left",
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
                moveToRelative(160f, -200f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(120f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, -280f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(120f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Align_horizontal_left!!
    }

private var _Align_horizontal_left: ImageVector? = null

