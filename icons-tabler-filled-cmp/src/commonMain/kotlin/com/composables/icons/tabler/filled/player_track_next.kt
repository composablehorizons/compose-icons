package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.PlayerTrackNext: ImageVector
    get() {
        if (_PlayerTrackNext != null) return _PlayerTrackNext!!
        
        _PlayerTrackNext = ImageVector.Builder(
            name = "player-track-next",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.86f, 1.012f, 1.318f, 1.659f, 0.753f)
                lineToRelative(8f, -7f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.506f)
                lineToRelative(-8f, -7f)
                curveToRelative(-0.647f, -0.565f, -1.659f, -0.106f, -1.659f, 0.753f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.86f, 1.012f, 1.318f, 1.659f, 0.753f)
                lineToRelative(8f, -7f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.506f)
                lineToRelative(-8f, -7f)
                curveToRelative(-0.647f, -0.565f, -1.659f, -0.106f, -1.659f, 0.753f)
                close()
            }
        }.build()
        
        return _PlayerTrackNext!!
    }

private var _PlayerTrackNext: ImageVector? = null

