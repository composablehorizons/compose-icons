package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Flare: ImageVector
    get() {
        if (_Flare != null) return _Flare!!
        
        _Flare = ImageVector.Builder(
            name = "flare",
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
                moveTo(12f, 3f)
                lineToRelative(3f, 6f)
                lineToRelative(6f, 3f)
                lineToRelative(-6f, 3f)
                lineToRelative(-3f, 6f)
                lineToRelative(-3f, -6f)
                lineToRelative(-6f, -3f)
                lineToRelative(6f, -3f)
                close()
            }
        }.build()
        
        return _Flare!!
    }

private var _Flare: ImageVector? = null

