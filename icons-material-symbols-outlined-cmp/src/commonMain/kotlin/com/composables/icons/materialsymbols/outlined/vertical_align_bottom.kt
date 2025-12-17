package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Vertical_align_bottom: ImageVector
    get() {
        if (_Vertical_align_bottom != null) return _Vertical_align_bottom!!
        
        _Vertical_align_bottom = ImageVector.Builder(
            name = "vertical_align_bottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -160f)
                lineTo(280f, 480f)
                lineToRelative(56f, -56f)
                lineToRelative(104f, 104f)
                verticalLineToRelative(-408f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(408f)
                lineToRelative(104f, -104f)
                lineToRelative(56f, 56f)
                lineToRelative(-200f, 200f)
                close()
            }
        }.build()
        
        return _Vertical_align_bottom!!
    }

private var _Vertical_align_bottom: ImageVector? = null

