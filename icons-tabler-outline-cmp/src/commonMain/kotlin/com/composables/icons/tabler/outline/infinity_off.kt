package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.InfinityOff: ImageVector
    get() {
        if (_InfinityOff != null) return _InfinityOff!!
        
        _InfinityOff = ImageVector.Builder(
            name = "infinity-off",
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
                moveTo(8.165f, 8.174f)
                arcToRelative(4f, 4f, 0f, false, false, -5.166f, 3.826f)
                arcToRelative(4f, 4f, 0f, false, false, 6.829f, 2.828f)
                arcToRelative(10f, 10f, 0f, false, false, 2.172f, -2.828f)
                moveToRelative(1.677f, -2.347f)
                arcToRelative(10f, 10f, 0f, false, true, 0.495f, -0.481f)
                arcToRelative(4f, 4f, 0f, true, true, 5.129f, 6.1f)
                moveToRelative(-3.521f, 0.537f)
                arcToRelative(4f, 4f, 0f, false, true, -1.608f, -0.981f)
                arcToRelative(10f, 10f, 0f, false, true, -2.172f, -2.828f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _InfinityOff!!
    }

private var _InfinityOff: ImageVector? = null

