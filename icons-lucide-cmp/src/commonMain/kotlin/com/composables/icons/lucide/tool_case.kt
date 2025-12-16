package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ToolCase: ImageVector
    get() {
        if (_ToolCase != null) return _ToolCase!!
        
        _ToolCase = ImageVector.Builder(
            name = "tool-case",
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
                moveTo(10f, 15f)
                horizontalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.817f, 10.995f)
                lineToRelative(-0.971f, -1.45f)
                lineToRelative(1.034f, -1.232f)
                arcToRelative(2f, 2f, 0f, false, false, -2.025f, -3.238f)
                lineToRelative(-1.82f, 0.364f)
                lineTo(9.91f, 3.885f)
                arcToRelative(2f, 2f, 0f, false, false, -3.625f, 0.748f)
                lineTo(6.141f, 6.55f)
                lineToRelative(-1.725f, 0.426f)
                arcToRelative(2f, 2f, 0f, false, false, -0.19f, 3.756f)
                lineToRelative(0.657f, 0.27f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.822f, 10.995f)
                lineToRelative(2.26f, -5.38f)
                arcToRelative(1f, 1f, 0f, false, false, -0.557f, -1.318f)
                lineTo(16.954f, 2.9f)
                arcToRelative(1f, 1f, 0f, false, false, -1.281f, 0.533f)
                lineToRelative(-0.924f, 2.122f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 12.006f)
                arcTo(1f, 1f, 0f, false, true, 4.994f, 11f)
                horizontalLineTo(19f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
            }
        }.build()
        
        return _ToolCase!!
    }

private var _ToolCase: ImageVector? = null

