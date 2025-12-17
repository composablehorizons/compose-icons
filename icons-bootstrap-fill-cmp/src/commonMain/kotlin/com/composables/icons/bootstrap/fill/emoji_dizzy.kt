package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.EmojiDizzy: ImageVector
    get() {
        if (_EmojiDizzy != null) return _EmojiDizzy!!
        
        _EmojiDizzy = ImageVector.Builder(
            name = "emoji-dizzy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 16f)
                arcTo(8f, 8f, 0f, true, false, 8f, 0f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 16f)
                moveTo(4.146f, 5.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineToRelative(0.646f, 0.647f)
                lineToRelative(0.646f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, 0.708f)
                lineToRelative(-0.647f, 0.646f)
                lineToRelative(0.647f, 0.646f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, 0.708f)
                lineTo(5.5f, 7.207f)
                lineToRelative(-0.646f, 0.647f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, -0.708f)
                lineToRelative(0.647f, -0.646f)
                lineToRelative(-0.647f, -0.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.708f)
                moveToRelative(5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineToRelative(0.646f, 0.647f)
                lineToRelative(0.646f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0.708f)
                lineToRelative(-0.647f, 0.646f)
                lineToRelative(0.647f, 0.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineToRelative(-0.646f, -0.647f)
                lineToRelative(-0.646f, 0.647f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, -0.708f)
                lineToRelative(0.647f, -0.646f)
                lineToRelative(-0.647f, -0.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.708f)
                moveTo(8f, 13f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 4f)
            }
        }.build()
        
        return _EmojiDizzy!!
    }

private var _EmojiDizzy: ImageVector? = null

