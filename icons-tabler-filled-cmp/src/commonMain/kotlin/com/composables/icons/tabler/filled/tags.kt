package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Tags: ImageVector
    get() {
        if (_Tags != null) return _Tags!!
        
        _Tags = ImageVector.Builder(
            name = "tags",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.172f, 5f)
                arcToRelative(3f, 3f, 0f, false, true, 2.121f, 0.879f)
                lineToRelative(5.71f, 5.71f)
                arcToRelative(3.41f, 3.41f, 0f, false, true, 0f, 4.822f)
                lineToRelative(-3.592f, 3.592f)
                arcToRelative(3.41f, 3.41f, 0f, false, true, -4.822f, 0f)
                lineToRelative(-5.71f, -5.71f)
                arcToRelative(3f, 3f, 0f, false, true, -0.879f, -2.121f)
                verticalLineToRelative(-4.172f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
                moveToRelative(-2.172f, 4f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, true, false, 0.01f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.293f, 5.293f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                lineToRelative(4.593f, 4.592f)
                arcToRelative(5.82f, 5.82f, 0f, false, true, 0f, 8.23f)
                lineToRelative(-1.592f, 1.592f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, -1.414f)
                lineToRelative(1.592f, -1.592f)
                arcToRelative(3.82f, 3.82f, 0f, false, false, 0f, -5.402f)
                lineToRelative(-4.592f, -4.592f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.414f)
            }
        }.build()
        
        return _Tags!!
    }

private var _Tags: ImageVector? = null

