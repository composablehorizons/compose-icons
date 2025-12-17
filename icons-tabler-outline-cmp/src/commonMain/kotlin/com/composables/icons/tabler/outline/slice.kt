package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Slice: ImageVector
    get() {
        if (_Slice != null) return _Slice!!
        
        _Slice = ImageVector.Builder(
            name = "slice",
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
                moveTo(3f, 19f)
                lineToRelative(15f, -15f)
                lineToRelative(3f, 3f)
                lineToRelative(-6f, 6f)
                lineToRelative(2f, 2f)
                arcToRelative(14f, 14f, 0f, false, true, -14f, 4f)
            }
        }.build()
        
        return _Slice!!
    }

private var _Slice: ImageVector? = null

