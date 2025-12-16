package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Server: ImageVector
    get() {
        if (_Server != null) return _Server!!
        
        _Server = ImageVector.Builder(
            name = "server",
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
                moveTo(4f, 2f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 22f, 4f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, false, true, 20f, 10f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 2f, 8f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 4f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 14f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 22f, 16f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 20f, 22f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 2f, 20f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 4f, 14f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 6f)
                lineTo(6.01f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 18f)
                lineTo(6.01f, 18f)
            }
        }.build()
        
        return _Server!!
    }

private var _Server: ImageVector? = null

