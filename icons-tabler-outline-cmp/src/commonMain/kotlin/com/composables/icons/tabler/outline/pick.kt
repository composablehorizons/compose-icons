package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Pick: ImageVector
    get() {
        if (_Pick != null) return _Pick!!
        
        _Pick = ImageVector.Builder(
            name = "pick",
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
                moveTo(13f, 8f)
                lineToRelative(-9.383f, 9.418f)
                arcToRelative(2.091f, 2.091f, 0f, false, false, 0f, 2.967f)
                arcToRelative(2.11f, 2.11f, 0f, false, false, 2.976f, 0f)
                lineToRelative(9.407f, -9.385f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 3f)
                horizontalLineToRelative(4.586f)
                arcToRelative(1f, 1f, 0f, false, true, 0.707f, 0.293f)
                lineToRelative(6.414f, 6.414f)
                arcToRelative(1f, 1f, 0f, false, true, 0.293f, 0.707f)
                verticalLineToRelative(4.586f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                verticalLineToRelative(-3f)
                lineToRelative(-5f, -5f)
                horizontalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, -4f)
                close()
            }
        }.build()
        
        return _Pick!!
    }

private var _Pick: ImageVector? = null

