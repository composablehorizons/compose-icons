package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Text_rotate_up: ImageVector
    get() {
        if (_Text_rotate_up != null) return _Text_rotate_up!!
        
        _Text_rotate_up = ImageVector.Builder(
            name = "text_rotate_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 800f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-528f)
                lineToRelative(-42f, 42f)
                lineToRelative(-56f, -56f)
                lineToRelative(138f, -138f)
                lineToRelative(140f, 138f)
                lineToRelative(-58f, 56f)
                lineToRelative(-42f, -42f)
                verticalLineToRelative(528f)
                close()
                moveTo(560f, 684f)
                lineTo(120f, 520f)
                verticalLineToRelative(-80f)
                lineToRelative(440f, -164f)
                verticalLineToRelative(76f)
                lineToRelative(-112f, 38f)
                verticalLineToRelative(178f)
                lineToRelative(112f, 40f)
                verticalLineToRelative(76f)
                close()
                moveTo(384f, 546f)
                verticalLineToRelative(-132f)
                lineToRelative(-182f, 64f)
                verticalLineToRelative(4f)
                lineToRelative(182f, 64f)
                close()
            }
        }.build()
        
        return _Text_rotate_up!!
    }

private var _Text_rotate_up: ImageVector? = null

