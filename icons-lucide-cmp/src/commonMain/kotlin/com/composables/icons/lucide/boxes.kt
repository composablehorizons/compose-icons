package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Boxes: ImageVector
    get() {
        if (_Boxes != null) return _Boxes!!
        
        _Boxes = ImageVector.Builder(
            name = "boxes",
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
                moveTo(2.97f, 12.92f)
                arcTo(2f, 2f, 0f, false, false, 2f, 14.63f)
                verticalLineToRelative(3.24f)
                arcToRelative(2f, 2f, 0f, false, false, 0.97f, 1.71f)
                lineToRelative(3f, 1.8f)
                arcToRelative(2f, 2f, 0f, false, false, 2.06f, 0f)
                lineTo(12f, 19f)
                verticalLineToRelative(-5.5f)
                lineToRelative(-5f, -3f)
                lineToRelative(-4.03f, 2.42f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 16.5f)
                lineToRelative(-4.74f, -2.85f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 16.5f)
                lineToRelative(5f, -3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 16.5f)
                verticalLineToRelative(5.17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 13.5f)
                verticalLineTo(19f)
                lineToRelative(3.97f, 2.38f)
                arcToRelative(2f, 2f, 0f, false, false, 2.06f, 0f)
                lineToRelative(3f, -1.8f)
                arcToRelative(2f, 2f, 0f, false, false, 0.97f, -1.71f)
                verticalLineToRelative(-3.24f)
                arcToRelative(2f, 2f, 0f, false, false, -0.97f, -1.71f)
                lineTo(17f, 10.5f)
                lineToRelative(-5f, 3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 16.5f)
                lineToRelative(-5f, -3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 16.5f)
                lineToRelative(4.74f, -2.85f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 16.5f)
                verticalLineToRelative(5.17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.97f, 4.42f)
                arcTo(2f, 2f, 0f, false, false, 7f, 6.13f)
                verticalLineToRelative(4.37f)
                lineToRelative(5f, 3f)
                lineToRelative(5f, -3f)
                verticalLineTo(6.13f)
                arcToRelative(2f, 2f, 0f, false, false, -0.97f, -1.71f)
                lineToRelative(-3f, -1.8f)
                arcToRelative(2f, 2f, 0f, false, false, -2.06f, 0f)
                lineToRelative(-3f, 1.8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 8f)
                lineTo(7.26f, 5.15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 8f)
                lineToRelative(4.74f, -2.85f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 13.5f)
                verticalLineTo(8f)
            }
        }.build()
        
        return _Boxes!!
    }

private var _Boxes: ImageVector? = null

