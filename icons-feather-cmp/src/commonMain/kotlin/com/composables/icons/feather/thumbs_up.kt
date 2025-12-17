package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.ThumbsUp: ImageVector
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
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 9f)
                verticalLineTo(5f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                lineToRelative(-4f, 9f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(11.28f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -1.7f)
                lineToRelative(1.38f, -9f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2.3f)
                close()
                moveTo(7f, 22f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-7f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(3f)
            }
        }.build()
        
        return _ThumbsUp!!
    }

private var _ThumbsUp: ImageVector? = null

