package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TextCursor: ImageVector
    get() {
        if (_TextCursor != null) return _TextCursor!!
        
        _TextCursor = ImageVector.Builder(
            name = "text-cursor",
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
                moveTo(17f, 22f)
                horizontalLineToRelative(-1f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, -4f)
                verticalLineTo(6f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                horizontalLineToRelative(1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 22f)
                horizontalLineToRelative(1f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, -4f)
                verticalLineToRelative(-1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 2f)
                horizontalLineToRelative(1f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                verticalLineToRelative(1f)
            }
        }.build()
        
        return _TextCursor!!
    }

private var _TextCursor: ImageVector? = null

