package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Bomb: ImageVector
    get() {
        if (_Bomb != null) return _Bomb!!
        
        _Bomb = ImageVector.Builder(
            name = "bomb",
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
                moveTo(15.349f, 5.349f)
                lineToRelative(3.301f, 3.301f)
                arcToRelative(1.2f, 1.2f, 0f, false, true, 0f, 1.698f)
                lineToRelative(-0.972f, 0.972f)
                arcToRelative(7.5f, 7.5f, 0f, true, true, -5f, -5f)
                lineToRelative(0.972f, -0.972f)
                arcToRelative(1.2f, 1.2f, 0f, false, true, 1.698f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 7f)
                lineToRelative(1.293f, -1.293f)
                arcToRelative(2.414f, 2.414f, 0f, false, false, 0.707f, -1.707f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 13f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
            }
        }.build()
        
        return _Bomb!!
    }

private var _Bomb: ImageVector? = null

