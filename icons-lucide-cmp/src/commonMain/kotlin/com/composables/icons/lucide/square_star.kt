package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SquareStar: ImageVector
    get() {
        if (_SquareStar != null) return _SquareStar!!
        
        _SquareStar = ImageVector.Builder(
            name = "square-star",
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
                moveTo(11.035f, 7.69f)
                arcToRelative(1f, 1f, 0f, false, true, 1.909f, 0.024f)
                lineToRelative(0.737f, 1.452f)
                arcToRelative(1f, 1f, 0f, false, false, 0.737f, 0.535f)
                lineToRelative(1.634f, 0.256f)
                arcToRelative(1f, 1f, 0f, false, true, 0.588f, 1.806f)
                lineToRelative(-1.172f, 1.168f)
                arcToRelative(1f, 1f, 0f, false, false, -0.282f, 0.866f)
                lineToRelative(0.259f, 1.613f)
                arcToRelative(1f, 1f, 0f, false, true, -1.541f, 1.134f)
                lineToRelative(-1.465f, -0.75f)
                arcToRelative(1f, 1f, 0f, false, false, -0.912f, 0f)
                lineToRelative(-1.465f, 0.75f)
                arcToRelative(1f, 1f, 0f, false, true, -1.539f, -1.133f)
                lineToRelative(0.258f, -1.613f)
                arcToRelative(1f, 1f, 0f, false, false, -0.282f, -0.866f)
                lineToRelative(-1.156f, -1.153f)
                arcToRelative(1f, 1f, 0f, false, true, 0.572f, -1.822f)
                lineToRelative(1.633f, -0.256f)
                arcToRelative(1f, 1f, 0f, false, false, 0.737f, -0.535f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, false, true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, false, true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, false, true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, false, true, 5f, 3f)
                close()
            }
        }.build()
        
        return _SquareStar!!
    }

private var _SquareStar: ImageVector? = null

