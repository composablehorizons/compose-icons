package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ChessKnight: ImageVector
    get() {
        if (_ChessKnight != null) return _ChessKnight!!
        
        _ChessKnight = ImageVector.Builder(
            name = "chess-knight",
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
                moveTo(8f, 16f)
                lineToRelative(-1.447f, 0.724f)
                arcToRelative(1f, 1f, 0f, false, false, -0.553f, 0.894f)
                verticalLineToRelative(2.382f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2.382f)
                arcToRelative(1f, 1f, 0f, false, false, -0.553f, -0.894f)
                lineToRelative(-1.447f, -0.724f)
                horizontalLineToRelative(-8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 3f)
                lineToRelative(1f, 3f)
                lineToRelative(-3.491f, 2.148f)
                arcToRelative(1f, 1f, 0f, false, false, 0.524f, 1.852f)
                horizontalLineToRelative(2.967f)
                lineToRelative(-2.073f, 6f)
                horizontalLineToRelative(7.961f)
                lineToRelative(0.112f, -5f)
                curveToRelative(0f, -3f, -1.09f, -5.983f, -4f, -7f)
                curveToRelative(-1.94f, -0.678f, -2.94f, -1.011f, -3f, -1f)
                close()
            }
        }.build()
        
        return _ChessKnight!!
    }

private var _ChessKnight: ImageVector? = null

