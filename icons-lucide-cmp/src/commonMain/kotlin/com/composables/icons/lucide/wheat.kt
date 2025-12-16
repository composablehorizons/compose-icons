package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Wheat: ImageVector
    get() {
        if (_Wheat != null) return _Wheat!!
        
        _Wheat = ImageVector.Builder(
            name = "wheat",
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
                moveTo(2f, 22f)
                lineTo(16f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.47f, 12.53f)
                lineTo(5f, 11f)
                lineToRelative(1.53f, 1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, 4.94f)
                lineTo(5f, 19f)
                lineToRelative(-1.53f, -1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, -4.94f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.47f, 8.53f)
                lineTo(9f, 7f)
                lineToRelative(1.53f, 1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, 4.94f)
                lineTo(9f, 15f)
                lineToRelative(-1.53f, -1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, -4.94f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.47f, 4.53f)
                lineTo(13f, 3f)
                lineToRelative(1.53f, 1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, 4.94f)
                lineTo(13f, 11f)
                lineToRelative(-1.53f, -1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, -4.94f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineTo(6f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.47f, 17.47f)
                lineTo(13f, 19f)
                lineToRelative(-1.53f, 1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -4.94f, 0f)
                lineTo(5f, 19f)
                lineToRelative(1.53f, -1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 4.94f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.47f, 13.47f)
                lineTo(17f, 15f)
                lineToRelative(-1.53f, 1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -4.94f, 0f)
                lineTo(9f, 15f)
                lineToRelative(1.53f, -1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 4.94f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.47f, 9.47f)
                lineTo(21f, 11f)
                lineToRelative(-1.53f, 1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -4.94f, 0f)
                lineTo(13f, 11f)
                lineToRelative(1.53f, -1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 4.94f, 0f)
                close()
            }
        }.build()
        
        return _Wheat!!
    }

private var _Wheat: ImageVector? = null

