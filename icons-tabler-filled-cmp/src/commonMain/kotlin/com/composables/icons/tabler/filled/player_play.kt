package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.PlayerPlay: ImageVector
    get() {
        if (_PlayerPlay != null) return _PlayerPlay!!
        
        _PlayerPlay = ImageVector.Builder(
            name = "player-play",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 4f)
                verticalLineToRelative(16f)
                arcToRelative(1f, 1f, 0f, false, false, 1.524f, 0.852f)
                lineToRelative(13f, -8f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.704f)
                lineToRelative(-13f, -8f)
                arcToRelative(1f, 1f, 0f, false, false, -1.524f, 0.852f)
                close()
            }
        }.build()
        
        return _PlayerPlay!!
    }

private var _PlayerPlay: ImageVector? = null

