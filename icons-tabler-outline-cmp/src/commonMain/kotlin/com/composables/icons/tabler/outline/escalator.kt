package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Escalator: ImageVector
    get() {
        if (_Escalator != null) return _Escalator!!
        
        _Escalator = ImageVector.Builder(
            name = "escalator",
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
                moveTo(19.5f, 5f)
                horizontalLineToRelative(-2.672f)
                arcToRelative(2f, 2f, 0f, false, false, -1.414f, 0.586f)
                lineToRelative(-8.414f, 8.414f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 0f, 5f)
                horizontalLineToRelative(3.672f)
                arcToRelative(2f, 2f, 0f, false, false, 1.414f, -0.586f)
                lineToRelative(8.414f, -8.414f)
                horizontalLineToRelative(1.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, -5f)
                close()
            }
        }.build()
        
        return _Escalator!!
    }

private var _Escalator: ImageVector? = null

