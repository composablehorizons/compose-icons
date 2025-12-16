package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Unlink: ImageVector
    get() {
        if (_Unlink != null) return _Unlink!!
        
        _Unlink = ImageVector.Builder(
            name = "unlink",
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
                moveTo(18.84f, 12.25f)
                lineToRelative(1.72f, -1.71f)
                horizontalLineToRelative(-0.02f)
                arcToRelative(5.004f, 5.004f, 0f, false, false, -0.12f, -7.07f)
                arcToRelative(5.006f, 5.006f, 0f, false, false, -6.95f, 0f)
                lineToRelative(-1.72f, 1.71f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.17f, 11.75f)
                lineToRelative(-1.71f, 1.71f)
                arcToRelative(5.004f, 5.004f, 0f, false, false, 0.12f, 7.07f)
                arcToRelative(5.006f, 5.006f, 0f, false, false, 6.95f, 0f)
                lineToRelative(1.71f, -1.71f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 2f)
                lineTo(8f, 5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 8f)
                lineTo(5f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 19f)
                lineTo(16f, 22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 16f)
                lineTo(22f, 16f)
            }
        }.build()
        
        return _Unlink!!
    }

private var _Unlink: ImageVector? = null

