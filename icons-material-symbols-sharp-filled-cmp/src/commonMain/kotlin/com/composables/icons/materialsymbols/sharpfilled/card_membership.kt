package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Card_membership: ImageVector
    get() {
        if (_Card_membership != null) return _Card_membership!!
        
        _Card_membership = ImageVector.Builder(
            name = "card_membership",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 80f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(600f)
                horizontalLineTo(640f)
                verticalLineToRelative(200f)
                lineToRelative(-160f, -80f)
                lineToRelative(-160f, 80f)
                verticalLineToRelative(-200f)
                horizontalLineTo(80f)
                verticalLineToRelative(-600f)
                close()
                moveToRelative(80f, 440f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Card_membership!!
    }

private var _Card_membership: ImageVector? = null

