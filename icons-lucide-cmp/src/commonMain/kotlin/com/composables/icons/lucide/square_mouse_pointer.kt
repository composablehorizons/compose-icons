package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SquareMousePointer: ImageVector
    get() {
        if (_SquareMousePointer != null) return _SquareMousePointer!!
        
        _SquareMousePointer = ImageVector.Builder(
            name = "square-mouse-pointer",
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
                moveTo(12.034f, 12.681f)
                arcToRelative(0.498f, 0.498f, 0f, false, true, 0.647f, -0.647f)
                lineToRelative(9f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.033f, 0.943f)
                lineToRelative(-3.444f, 1.068f)
                arcToRelative(1f, 1f, 0f, false, false, -0.66f, 0.66f)
                lineToRelative(-1.067f, 3.443f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.943f, 0.033f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 11f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(6f)
            }
        }.build()
        
        return _SquareMousePointer!!
    }

private var _SquareMousePointer: ImageVector? = null

