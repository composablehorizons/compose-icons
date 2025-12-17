package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ArrowBigDownLines: ImageVector
    get() {
        if (_ArrowBigDownLines != null) return _ArrowBigDownLines!!
        
        _ArrowBigDownLines = ImageVector.Builder(
            name = "arrow-big-down-lines",
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
                moveTo(15f, 12f)
                horizontalLineToRelative(3.586f)
                arcToRelative(1f, 1f, 0f, false, true, 0.707f, 1.707f)
                lineToRelative(-6.586f, 6.586f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, 0f)
                lineToRelative(-6.586f, -6.586f)
                arcToRelative(1f, 1f, 0f, false, true, 0.707f, -1.707f)
                horizontalLineToRelative(3.586f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 3f)
                horizontalLineToRelative(-6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 6f)
                horizontalLineToRelative(-6f)
            }
        }.build()
        
        return _ArrowBigDownLines!!
    }

private var _ArrowBigDownLines: ImageVector? = null

