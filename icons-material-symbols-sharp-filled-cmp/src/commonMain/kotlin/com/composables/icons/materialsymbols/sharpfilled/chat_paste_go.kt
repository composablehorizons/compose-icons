package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Chat_paste_go: ImageVector
    get() {
        if (_Chat_paste_go != null) return _Chat_paste_go!!
        
        _Chat_paste_go = ImageVector.Builder(
            name = "chat_paste_go",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 840f)
                lineToRelative(-56f, -56f)
                lineToRelative(63f, -64f)
                horizontalLineTo(560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(167f)
                lineToRelative(-63f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                close()
                moveTo(280f, 400f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-680f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(283f)
                quadToRelative(-10f, -2f, -20f, -2.5f)
                reflectiveQuadToRelative(-20f, -0.5f)
                quadToRelative(-101f, 0f, -170.5f, 70f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, 10f, 0.5f, 20f)
                reflectiveQuadToRelative(2.5f, 20f)
                horizontalLineTo(240f)
                lineTo(120f, 840f)
                close()
            }
        }.build()
        
        return _Chat_paste_go!!
    }

private var _Chat_paste_go: ImageVector? = null

