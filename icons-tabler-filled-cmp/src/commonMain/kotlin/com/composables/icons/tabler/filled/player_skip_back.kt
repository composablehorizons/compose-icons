package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.PlayerSkipBack: ImageVector
    get() {
        if (_PlayerSkipBack != null) return _PlayerSkipBack!!
        
        _PlayerSkipBack = ImageVector.Builder(
            name = "player-skip-back",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.496f, 4.136f)
                lineToRelative(-12f, 7f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.728f)
                lineToRelative(12f, 7f)
                arcToRelative(1f, 1f, 0f, false, false, 1.504f, -0.864f)
                verticalLineToRelative(-14f)
                arcToRelative(1f, 1f, 0f, false, false, -1.504f, -0.864f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 4f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-14f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
        }.build()
        
        return _PlayerSkipBack!!
    }

private var _PlayerSkipBack: ImageVector? = null

