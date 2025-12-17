package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PenTool: ImageVector
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
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.707f, 21.293f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, 0f)
                lineToRelative(-1.586f, -1.586f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.414f)
                lineToRelative(5.586f, -5.586f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                lineToRelative(1.586f, 1.586f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.414f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 13f)
                lineToRelative(-1.375f, -6.874f)
                arcToRelative(1f, 1f, 0f, false, false, -0.746f, -0.776f)
                lineTo(3.235f, 2.028f)
                arcToRelative(1f, 1f, 0f, false, false, -1.207f, 1.207f)
                lineTo(5.35f, 15.879f)
                arcToRelative(1f, 1f, 0f, false, false, 0.776f, 0.746f)
                lineTo(13f, 18f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.3f, 2.3f)
                lineToRelative(7.286f, 7.286f)
            }
            path(
                fill = SolidColor(Color.Transparent),
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

