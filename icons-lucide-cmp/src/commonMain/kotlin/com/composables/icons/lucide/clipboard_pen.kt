package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ClipboardPen: ImageVector
    get() {
        if (_ClipboardPen != null) return _ClipboardPen!!
        
        _ClipboardPen = ImageVector.Builder(
            name = "clipboard-pen",
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
                moveTo(9f, 2f)
                horizontalLineTo(15f)
                arcTo(1f, 1f, 0f, false, true, 16f, 3f)
                verticalLineTo(5f)
                arcTo(1f, 1f, 0f, false, true, 15f, 6f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, false, true, 8f, 5f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, false, true, 9f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 4f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-5.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 13.5f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.378f, 15.626f)
                arcToRelative(1f, 1f, 0f, true, false, -3.004f, -3.004f)
                lineToRelative(-5.01f, 5.012f)
                arcToRelative(2f, 2f, 0f, false, false, -0.506f, 0.854f)
                lineToRelative(-0.837f, 2.87f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.62f, 0.62f)
                lineToRelative(2.87f, -0.837f)
                arcToRelative(2f, 2f, 0f, false, false, 0.854f, -0.506f)
                close()
            }
        }.build()
        
        return _ClipboardPen!!
    }

private var _ClipboardPen: ImageVector? = null

