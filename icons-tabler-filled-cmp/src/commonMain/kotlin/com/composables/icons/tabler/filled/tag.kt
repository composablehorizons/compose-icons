package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Tag: ImageVector
    get() {
        if (_Tag != null) return _Tag!!
        
        _Tag = ImageVector.Builder(
            name = "tag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.172f, 2f)
                arcToRelative(3f, 3f, 0f, false, true, 2.121f, 0.879f)
                lineToRelative(7.71f, 7.71f)
                arcToRelative(3.41f, 3.41f, 0f, false, true, 0f, 4.822f)
                lineToRelative(-5.592f, 5.592f)
                arcToRelative(3.41f, 3.41f, 0f, false, true, -4.822f, 0f)
                lineToRelative(-7.71f, -7.71f)
                arcToRelative(3f, 3f, 0f, false, true, -0.879f, -2.121f)
                verticalLineToRelative(-5.172f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                close()
                moveToRelative(-3.672f, 3.5f)
                arcToRelative(2f, 2f, 0f, false, false, -1.995f, 1.85f)
                lineToRelative(-0.005f, 0.15f)
                arcToRelative(2f, 2f, 0f, true, false, 2f, -2f)
            }
        }.build()
        
        return _Tag!!
    }

private var _Tag: ImageVector? = null

