package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.PenTool: ImageVector
    get() {
        if (_PenTool != null) return _PenTool!!
        
        _PenTool = ImageVector.Builder(
            name = "pen-tool",
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
                moveTo(12f, 19f)
                lineToRelative(7f, -7f)
                lineToRelative(3f, 3f)
                lineToRelative(-7f, 7f)
                lineToRelative(-3f, -3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 13f)
                lineToRelative(-1.5f, -7.5f)
                lineTo(2f, 2f)
                lineToRelative(3.5f, 14.5f)
                lineTo(13f, 18f)
                lineToRelative(5f, -5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                lineToRelative(7.586f, 7.586f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 11f)
                arcTo(2f, 2f, 0f, false, true, 11f, 13f)
                arcTo(2f, 2f, 0f, false, true, 9f, 11f)
                arcTo(2f, 2f, 0f, false, true, 13f, 11f)
                close()
            }
        }.build()
        
        return _PenTool!!
    }

private var _PenTool: ImageVector? = null

