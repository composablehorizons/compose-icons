package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Bomb: ImageVector
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
                moveTo(20f, 13f)
                arcTo(9f, 9f, 0f, false, true, 11f, 22f)
                arcTo(9f, 9f, 0f, false, true, 2f, 13f)
                arcTo(9f, 9f, 0f, false, true, 20f, 13f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.35f, 4.65f)
                lineTo(16.3f, 2.7f)
                arcToRelative(2.41f, 2.41f, 0f, false, true, 3.4f, 0f)
                lineToRelative(1.6f, 1.6f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 0f, 3.4f)
                lineToRelative(-1.95f, 1.95f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 2f)
                lineToRelative(-1.5f, 1.5f)
            }
        }.build()
        
        return _Bomb!!
    }

private var _Bomb: ImageVector? = null

