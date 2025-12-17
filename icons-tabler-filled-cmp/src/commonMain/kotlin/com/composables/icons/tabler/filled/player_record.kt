package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.PlayerRecord: ImageVector
    get() {
        if (_PlayerRecord != null) return _PlayerRecord!!
        
        _PlayerRecord = ImageVector.Builder(
            name = "player-record",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 5.072f)
                arcToRelative(8f, 8f, 0f, true, true, -3.995f, 7.213f)
                lineToRelative(-0.005f, -0.285f)
                lineToRelative(0.005f, -0.285f)
                arcToRelative(8f, 8f, 0f, false, true, 3.995f, -6.643f)
                close()
            }
        }.build()
        
        return _PlayerRecord!!
    }

private var _PlayerRecord: ImageVector? = null

