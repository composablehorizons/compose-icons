package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Align_vertical_top: ImageVector
    get() {
        if (_Align_vertical_top != null) return _Align_vertical_top!!
        
        _Align_vertical_top = ImageVector.Builder(
            name = "align_vertical_top",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 880f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(640f)
                horizontalLineTo(280f)
                close()
                moveToRelative(280f, -240f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(400f)
                horizontalLineTo(560f)
                close()
                moveTo(80f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Align_vertical_top!!
    }

private var _Align_vertical_top: ImageVector? = null

