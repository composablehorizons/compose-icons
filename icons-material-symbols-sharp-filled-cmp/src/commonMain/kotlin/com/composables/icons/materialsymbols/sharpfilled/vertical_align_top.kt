package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Vertical_align_top: ImageVector
    get() {
        if (_Vertical_align_top != null) return _Vertical_align_top!!
        
        _Vertical_align_top = ImageVector.Builder(
            name = "vertical_align_top",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(280f, 640f)
                verticalLineToRelative(-408f)
                lineTo(336f, 536f)
                lineToRelative(-56f, -56f)
                lineToRelative(200f, -200f)
                lineToRelative(200f, 200f)
                lineToRelative(-56f, 56f)
                lineToRelative(-104f, -104f)
                verticalLineToRelative(408f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Vertical_align_top!!
    }

private var _Vertical_align_top: ImageVector? = null

