package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.EmojiSunglasses: ImageVector
    get() {
        if (_EmojiSunglasses != null) return _EmojiSunglasses!!
        
        _EmojiSunglasses = ImageVector.Builder(
            name = "emoji-sunglasses",
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
                moveTo(2.31f, 5.243f)
                arcTo(1f, 1f, 0f, false, true, 3.28f, 4f)
                horizontalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(0.116f)
                arcTo(4.2f, 4.2f, 0f, false, true, 8f, 5f)
                curveToRelative(0.35f, 0f, 0.69f, 0.04f, 1f, 0.116f)
                verticalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(2.72f)
                arcToRelative(1f, 1f, 0f, false, true, 0.97f, 1.243f)
                lineToRelative(-0.311f, 1.242f)
                arcTo(2f, 2f, 0f, false, true, 11.439f, 8f)
                horizontalLineTo(11f)
                arcToRelative(2f, 2f, 0f, false, true, -1.994f, -1.839f)
                arcTo(3f, 3f, 0f, false, false, 8f, 6f)
                curveToRelative(-0.393f, 0f, -0.74f, 0.064f, -1.006f, 0.161f)
                arcTo(2f, 2f, 0f, false, true, 5f, 8f)
                horizontalLineToRelative(-0.438f)
                arcToRelative(2f, 2f, 0f, false, true, -1.94f, -1.515f)
                close()
                moveTo(4.969f, 9.75f)
                arcTo(3.5f, 3.5f, 0f, false, false, 8f, 11.5f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 3.032f, -1.75f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.866f, 0.5f)
                arcTo(4.5f, 4.5f, 0f, false, true, 8f, 12.5f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -3.898f, -2.25f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.866f, -0.5f)
                close()
            }
        }.build()
        
        return _EmojiSunglasses!!
    }

private var _EmojiSunglasses: ImageVector? = null

