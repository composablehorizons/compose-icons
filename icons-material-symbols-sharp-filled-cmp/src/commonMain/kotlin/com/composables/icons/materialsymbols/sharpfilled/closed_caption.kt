package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Closed_caption: ImageVector
    get() {
        if (_Closed_caption != null) return _Closed_caption!!
        
        _Closed_caption = ImageVector.Builder(
            name = "closed_caption",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(640f)
                horizontalLineTo(120f)
                close()
                moveToRelative(120f, -200f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(280f, 0f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                verticalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Closed_caption!!
    }

private var _Closed_caption: ImageVector? = null

