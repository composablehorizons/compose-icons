package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Target: ImageVector
    get() {
        if (_Target != null) return _Target!!
        
        _Target = ImageVector.Builder(
            name = "target",
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
                moveTo(22f, 12f)
                arcTo(10f, 10f, 0f, false, true, 12f, 22f)
                arcTo(10f, 10f, 0f, false, true, 2f, 12f)
                arcTo(10f, 10f, 0f, false, true, 22f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 12f)
                arcTo(6f, 6f, 0f, false, true, 12f, 18f)
                arcTo(6f, 6f, 0f, false, true, 6f, 12f)
                arcTo(6f, 6f, 0f, false, true, 18f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 12f)
                arcTo(2f, 2f, 0f, false, true, 12f, 14f)
                arcTo(2f, 2f, 0f, false, true, 10f, 12f)
                arcTo(2f, 2f, 0f, false, true, 14f, 12f)
                close()
            }
        }.build()
        
        return _Target!!
    }

private var _Target: ImageVector? = null

