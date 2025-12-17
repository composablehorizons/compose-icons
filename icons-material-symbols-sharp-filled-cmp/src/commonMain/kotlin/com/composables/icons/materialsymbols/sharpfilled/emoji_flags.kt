package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Emoji_flags: ImageVector
    get() {
        if (_Emoji_flags != null) return _Emoji_flags!!
        
        _Emoji_flags = ImageVector.Builder(
            name = "emoji_flags",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                verticalLineToRelative(-680f)
                horizontalLineToRelative(360f)
                lineToRelative(16f, 80f)
                horizontalLineToRelative(224f)
                verticalLineToRelative(400f)
                horizontalLineTo(520f)
                lineToRelative(-16f, -80f)
                horizontalLineTo(280f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Emoji_flags!!
    }

private var _Emoji_flags: ImageVector? = null

