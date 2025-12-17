package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.PlayerRecord: ImageVector
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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                moveToRelative(-7f, 0f)
                arcToRelative(7f, 7f, 0f, true, false, 14f, 0f)
                arcToRelative(7f, 7f, 0f, true, false, -14f, 0f)
            }
        }.build()
        
        return _PlayerRecord!!
    }

private var _PlayerRecord: ImageVector? = null

