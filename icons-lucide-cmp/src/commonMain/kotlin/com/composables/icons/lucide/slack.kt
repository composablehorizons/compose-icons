package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Slack: ImageVector
    get() {
        if (_Slack != null) return _Slack!!
        
        _Slack = ImageVector.Builder(
            name = "slack",
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
                moveTo(14.5f, 2f)
                horizontalLineTo(14.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16f, 3.5f)
                verticalLineTo(8.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14.5f, 10f)
                horizontalLineTo(14.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 13f, 8.5f)
                verticalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14.5f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 8.5f)
                verticalLineTo(10f)
                horizontalLineToRelative(1.5f)
                arcTo(1.5f, 1.5f, 0f, true, false, 19f, 8.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 14f)
                horizontalLineTo(9.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 11f, 15.5f)
                verticalLineTo(20.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9.5f, 22f)
                horizontalLineTo(9.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 8f, 20.5f)
                verticalLineTo(15.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9.5f, 14f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 15.5f)
                verticalLineTo(14f)
                horizontalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0f, true, false, 5f, 15.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.5f, 13f)
                horizontalLineTo(20.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 22f, 14.5f)
                verticalLineTo(14.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 20.5f, 16f)
                horizontalLineTo(15.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14f, 14.5f)
                verticalLineTo(14.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 15.5f, 13f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.5f, 19f)
                horizontalLineTo(14f)
                verticalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 1.5f, -1.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.5f, 8f)
                horizontalLineTo(8.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10f, 9.5f)
                verticalLineTo(9.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 8.5f, 11f)
                horizontalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2f, 9.5f)
                verticalLineTo(9.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3.5f, 8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 5f)
                horizontalLineTo(10f)
                verticalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0f, true, false, 8.5f, 5f)
            }
        }.build()
        
        return _Slack!!
    }

private var _Slack: ImageVector? = null

