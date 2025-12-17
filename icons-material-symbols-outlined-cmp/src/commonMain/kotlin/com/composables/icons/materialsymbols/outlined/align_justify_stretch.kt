package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Align_justify_stretch: ImageVector
    get() {
        if (_Align_justify_stretch != null) return _Align_justify_stretch!!
        
        _Align_justify_stretch = ImageVector.Builder(
            name = "align_justify_stretch",
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
                moveTo(80f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(800f)
                horizontalLineTo(80f)
                close()
                moveToRelative(440f, -480f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(120f)
                horizontalLineTo(520f)
                close()
                moveToRelative(-280f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(120f)
                horizontalLineTo(240f)
                close()
                moveToRelative(280f, 280f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(120f)
                horizontalLineTo(520f)
                close()
                moveToRelative(-280f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(120f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Align_justify_stretch!!
    }

private var _Align_justify_stretch: ImageVector? = null

