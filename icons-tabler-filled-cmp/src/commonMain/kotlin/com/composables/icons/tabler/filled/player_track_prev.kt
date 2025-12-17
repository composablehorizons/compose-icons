package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.PlayerTrackPrev: ImageVector
    get() {
        if (_PlayerTrackPrev != null) return _PlayerTrackPrev!!
        
        _PlayerTrackPrev = ImageVector.Builder(
            name = "player-track-prev",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.341f, 4.247f)
                lineToRelative(-8f, 7f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.506f)
                lineToRelative(8f, 7f)
                curveToRelative(0.647f, 0.565f, 1.659f, 0.106f, 1.659f, -0.753f)
                verticalLineToRelative(-14f)
                curveToRelative(0f, -0.86f, -1.012f, -1.318f, -1.659f, -0.753f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.341f, 4.247f)
                lineToRelative(-8f, 7f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.506f)
                lineToRelative(8f, 7f)
                curveToRelative(0.647f, 0.565f, 1.659f, 0.106f, 1.659f, -0.753f)
                verticalLineToRelative(-14f)
                curveToRelative(0f, -0.86f, -1.012f, -1.318f, -1.659f, -0.753f)
                close()
            }
        }.build()
        
        return _PlayerTrackPrev!!
    }

private var _PlayerTrackPrev: ImageVector? = null

