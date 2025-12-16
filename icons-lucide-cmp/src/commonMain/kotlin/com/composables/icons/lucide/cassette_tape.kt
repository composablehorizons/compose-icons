package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CassetteTape: ImageVector
    get() {
        if (_CassetteTape != null) return _CassetteTape!!
        
        _CassetteTape = ImageVector.Builder(
            name = "cassette-tape",
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
                moveTo(4f, 4f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 22f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, false, true, 20f, 20f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 2f, 18f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, false, true, 4f, 4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 10f)
                arcTo(2f, 2f, 0f, false, true, 8f, 12f)
                arcTo(2f, 2f, 0f, false, true, 6f, 10f)
                arcTo(2f, 2f, 0f, false, true, 10f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 12f)
                horizontalLineToRelative(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 10f)
                arcTo(2f, 2f, 0f, false, true, 16f, 12f)
                arcTo(2f, 2f, 0f, false, true, 14f, 10f)
                arcTo(2f, 2f, 0f, false, true, 18f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 20f)
                lineToRelative(0.7f, -2.9f)
                arcTo(1.4f, 1.4f, 0f, false, true, 8.1f, 16f)
                horizontalLineToRelative(7.8f)
                arcToRelative(1.4f, 1.4f, 0f, false, true, 1.4f, 1f)
                lineToRelative(0.7f, 3f)
            }
        }.build()
        
        return _CassetteTape!!
    }

private var _CassetteTape: ImageVector? = null

