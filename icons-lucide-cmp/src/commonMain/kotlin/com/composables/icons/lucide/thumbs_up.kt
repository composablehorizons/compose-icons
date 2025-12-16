package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ThumbsUp: ImageVector
    get() {
        if (_ThumbsUp != null) return _ThumbsUp!!
        
        _ThumbsUp = ImageVector.Builder(
            name = "thumbs-up",
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
                moveTo(15f, 5.88f)
                lineTo(14f, 10f)
                horizontalLineToRelative(5.83f)
                arcToRelative(2f, 2f, 0f, false, true, 1.92f, 2.56f)
                lineToRelative(-2.33f, 8f)
                arcTo(2f, 2f, 0f, false, true, 17.5f, 22f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2.76f)
                arcToRelative(2f, 2f, 0f, false, false, 1.79f, -1.11f)
                lineTo(12f, 2f)
                arcToRelative(3.13f, 3.13f, 0f, false, true, 3f, 3.88f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 10f)
                verticalLineToRelative(12f)
            }
        }.build()
        
        return _ThumbsUp!!
    }

private var _ThumbsUp: ImageVector? = null

