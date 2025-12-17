package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Puzzle: ImageVector
    get() {
        if (_Puzzle != null) return _Puzzle!!
        
        _Puzzle = ImageVector.Builder(
            name = "puzzle",
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
                moveTo(15.39f, 4.39f)
                arcToRelative(1f, 1f, 0f, false, false, 1.68f, -0.474f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, 3.014f, 3.015f)
                arcToRelative(1f, 1f, 0f, false, false, -0.474f, 1.68f)
                lineToRelative(1.683f, 1.682f)
                arcToRelative(2.414f, 2.414f, 0f, false, true, 0f, 3.414f)
                lineTo(19.61f, 15.39f)
                arcToRelative(1f, 1f, 0f, false, true, -1.68f, -0.474f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -3.014f, 3.015f)
                arcToRelative(1f, 1f, 0f, false, true, 0.474f, 1.68f)
                lineToRelative(-1.683f, 1.682f)
                arcToRelative(2.414f, 2.414f, 0f, false, true, -3.414f, 0f)
                lineTo(8.61f, 19.61f)
                arcToRelative(1f, 1f, 0f, false, false, -1.68f, 0.474f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, -3.014f, -3.015f)
                arcToRelative(1f, 1f, 0f, false, false, 0.474f, -1.68f)
                lineToRelative(-1.683f, -1.682f)
                arcToRelative(2.414f, 2.414f, 0f, false, true, 0f, -3.414f)
                lineTo(4.39f, 8.61f)
                arcToRelative(1f, 1f, 0f, false, true, 1.68f, 0.474f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 3.014f, -3.015f)
                arcToRelative(1f, 1f, 0f, false, true, -0.474f, -1.68f)
                lineToRelative(1.683f, -1.682f)
                arcToRelative(2.414f, 2.414f, 0f, false, true, 3.414f, 0f)
                close()
            }
        }.build()
        
        return _Puzzle!!
    }

private var _Puzzle: ImageVector? = null

