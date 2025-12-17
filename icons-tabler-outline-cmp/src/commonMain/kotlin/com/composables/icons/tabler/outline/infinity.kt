package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Infinity: ImageVector
    get() {
        if (_Infinity != null) return _Infinity!!
        
        _Infinity = ImageVector.Builder(
            name = "infinity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.828f, 9.172f)
                arcToRelative(4f, 4f, 0f, true, false, 0f, 5.656f)
                arcToRelative(10f, 10f, 0f, false, false, 2.172f, -2.828f)
                arcToRelative(10f, 10f, 0f, false, true, 2.172f, -2.828f)
                arcToRelative(4f, 4f, 0f, true, true, 0f, 5.656f)
                arcToRelative(10f, 10f, 0f, false, true, -2.172f, -2.828f)
                arcToRelative(10f, 10f, 0f, false, false, -2.172f, -2.828f)
            }
        }.build()
        
        return _Infinity!!
    }

private var _Infinity: ImageVector? = null

