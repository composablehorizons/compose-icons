package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Splitscreen_landscape: ImageVector
    get() {
        if (_Splitscreen_landscape != null) return _Splitscreen_landscape!!
        
        _Splitscreen_landscape = ImageVector.Builder(
            name = "splitscreen_landscape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 640f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-320f)
                horizontalLineTo(520f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(-280f, 0f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-320f)
                horizontalLineTo(240f)
                verticalLineToRelative(320f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Splitscreen_landscape!!
    }

private var _Splitscreen_landscape: ImageVector? = null

