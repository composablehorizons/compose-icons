package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Hexagon: ImageVector
    get() {
        if (_Hexagon != null) return _Hexagon!!
        
        _Hexagon = ImageVector.Builder(
            name = "hexagon",
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
                moveTo(21f, 16f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, false, -1f, -1.73f)
                lineToRelative(-7f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 0f)
                lineToRelative(-7f, 4f)
                arcTo(2f, 2f, 0f, false, false, 3f, 8f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 1f, 1.73f)
                lineToRelative(7f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 0f)
                lineToRelative(7f, -4f)
                arcTo(2f, 2f, 0f, false, false, 21f, 16f)
                close()
            }
        }.build()
        
        return _Hexagon!!
    }

private var _Hexagon: ImageVector? = null

