package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Move_to_inbox: ImageVector
    get() {
        if (_Move_to_inbox != null) return _Move_to_inbox!!
        
        _Move_to_inbox = ImageVector.Builder(
            name = "move_to_inbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 560f)
                lineTo(320f, 400f)
                lineToRelative(56f, -58f)
                lineToRelative(64f, 64f)
                verticalLineToRelative(-166f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(166f)
                lineToRelative(64f, -64f)
                lineToRelative(56f, 58f)
                lineToRelative(-160f, 160f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(360f, -200f)
                quadToRelative(38f, 0f, 69f, -22f)
                reflectiveQuadToRelative(43f, -58f)
                horizontalLineToRelative(168f)
                verticalLineToRelative(-360f)
                horizontalLineTo(200f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(168f)
                quadToRelative(12f, 36f, 43f, 58f)
                reflectiveQuadToRelative(69f, 22f)
                close()
            }
        }.build()
        
        return _Move_to_inbox!!
    }

private var _Move_to_inbox: ImageVector? = null

