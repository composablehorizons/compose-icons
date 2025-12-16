package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.ThumbsDown: ImageVector
    get() {
        if (_ThumbsDown != null) return _ThumbsDown!!
        
        _ThumbsDown = ImageVector.Builder(
            name = "thumbs-down",
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
                verticalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                lineToRelative(4f, -9f)
                verticalLineTo(2f)
                horizontalLineTo(5.72f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 1.7f)
                lineToRelative(-1.38f, 9f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2.3f)
                close()
                moveToRelative(7f, -13f)
                horizontalLineToRelative(2.67f)
                arcTo(2.31f, 2.31f, 0f, false, true, 22f, 4f)
                verticalLineToRelative(7f)
                arcToRelative(2.31f, 2.31f, 0f, false, true, -2.33f, 2f)
                horizontalLineTo(17f)
            }
        }.build()
        
        return _ThumbsDown!!
    }

private var _ThumbsDown: ImageVector? = null

