package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Splitscreen_portrait: ImageVector
    get() {
        if (_Splitscreen_portrait != null) return _Splitscreen_portrait!!
        
        _Splitscreen_portrait = ImageVector.Builder(
            name = "splitscreen_portrait",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 720f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-200f)
                horizontalLineTo(320f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(0f, -280f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-200f)
                horizontalLineTo(320f)
                verticalLineToRelative(200f)
                close()
                moveTo(160f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(800f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Splitscreen_portrait!!
    }

private var _Splitscreen_portrait: ImageVector? = null

