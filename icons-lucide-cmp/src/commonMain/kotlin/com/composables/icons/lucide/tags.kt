package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Tags: ImageVector
    get() {
        if (_Tags != null) return _Tags!!
        
        _Tags = ImageVector.Builder(
            name = "tags",
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
                moveTo(13.172f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 1.414f, 0.586f)
                lineToRelative(6.71f, 6.71f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 0f, 3.408f)
                lineToRelative(-4.592f, 4.592f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, -3.408f, 0f)
                lineToRelative(-6.71f, -6.71f)
                arcTo(2f, 2f, 0f, false, true, 6f, 9.172f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 7f)
                verticalLineToRelative(6.172f)
                arcToRelative(2f, 2f, 0f, false, false, 0.586f, 1.414f)
                lineToRelative(6.71f, 6.71f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 3.191f, 0.193f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 6.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10.5f, 7f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10f, 6.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 11f, 6.5f)
                close()
            }
        }.build()
        
        return _Tags!!
    }

private var _Tags: ImageVector? = null

