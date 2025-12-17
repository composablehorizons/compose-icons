package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mark_chat_read: ImageVector
    get() {
        if (_Mark_chat_read != null) return _Mark_chat_read!!
        
        _Mark_chat_read = ImageVector.Builder(
            name = "mark_chat_read",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(694f, 800f)
                lineTo(553f, 658f)
                lineToRelative(56f, -56f)
                lineToRelative(85f, 85f)
                lineToRelative(170f, -170f)
                lineToRelative(56f, 57f)
                lineToRelative(-226f, 226f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-280f)
                horizontalLineTo(160f)
                verticalLineToRelative(525f)
                lineToRelative(46f, -45f)
                horizontalLineToRelative(274f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                lineTo(80f, 880f)
                close()
                moveToRelative(80f, -240f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Mark_chat_read!!
    }

private var _Mark_chat_read: ImageVector? = null

