package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.GitGraph: ImageVector
    get() {
        if (_GitGraph != null) return _GitGraph!!
        
        _GitGraph = ImageVector.Builder(
            name = "git-graph",
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
                moveTo(8f, 6f)
                arcTo(3f, 3f, 0f, false, true, 5f, 9f)
                arcTo(3f, 3f, 0f, false, true, 2f, 6f)
                arcTo(3f, 3f, 0f, false, true, 8f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 9f)
                verticalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 18f)
                arcTo(3f, 3f, 0f, false, true, 5f, 21f)
                arcTo(3f, 3f, 0f, false, true, 2f, 18f)
                arcTo(3f, 3f, 0f, false, true, 8f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                verticalLineToRelative(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 6f)
                arcTo(3f, 3f, 0f, false, true, 19f, 9f)
                arcTo(3f, 3f, 0f, false, true, 16f, 6f)
                arcTo(3f, 3f, 0f, false, true, 22f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 15.7f)
                arcTo(9f, 9f, 0f, false, false, 19f, 9f)
            }
        }.build()
        
        return _GitGraph!!
    }

private var _GitGraph: ImageVector? = null

