package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Award: ImageVector
    get() {
        if (_Award != null) return _Award!!
        
        _Award = ImageVector.Builder(
            name = "award",
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
                moveTo(15.477f, 12.89f)
                lineToRelative(1.515f, 8.526f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.81f, 0.47f)
                lineToRelative(-3.58f, -2.687f)
                arcToRelative(1f, 1f, 0f, false, false, -1.197f, 0f)
                lineToRelative(-3.586f, 2.686f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.81f, -0.469f)
                lineToRelative(1.514f, -8.526f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 8f)
                arcTo(6f, 6f, 0f, false, true, 12f, 14f)
                arcTo(6f, 6f, 0f, false, true, 6f, 8f)
                arcTo(6f, 6f, 0f, false, true, 18f, 8f)
                close()
            }
        }.build()
        
        return _Award!!
    }

private var _Award: ImageVector? = null

