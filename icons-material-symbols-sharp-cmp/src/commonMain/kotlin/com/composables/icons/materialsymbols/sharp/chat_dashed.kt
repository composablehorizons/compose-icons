package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Chat_dashed: ImageVector
    get() {
        if (_Chat_dashed != null) return _Chat_dashed!!
        
        _Chat_dashed = ImageVector.Builder(
            name = "chat_dashed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 480f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, 400f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(125f)
                lineToRelative(46f, -45f)
                horizontalLineToRelative(114f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                lineTo(80f, 880f)
                close()
                moveToRelative(320f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(400f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineTo(640f)
                close()
                moveToRelative(160f, -240f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, -239f)
                verticalLineToRelative(-81f)
                horizontalLineTo(640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(161f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-400f, -81f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(400f)
                close()
                moveTo(80f, 241f)
                verticalLineToRelative(-161f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                verticalLineToRelative(81f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Chat_dashed!!
    }

private var _Chat_dashed: ImageVector? = null

