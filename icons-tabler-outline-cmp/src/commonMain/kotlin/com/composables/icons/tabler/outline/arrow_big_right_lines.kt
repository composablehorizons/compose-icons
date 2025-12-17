package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ArrowBigRightLines: ImageVector
    get() {
        if (_ArrowBigRightLines != null) return _ArrowBigRightLines!!
        
        _ArrowBigRightLines = ImageVector.Builder(
            name = "arrow-big-right-lines",
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
                moveTo(12f, 9f)
                verticalLineToRelative(-3.586f)
                arcToRelative(1f, 1f, 0f, false, true, 1.707f, -0.707f)
                lineToRelative(6.586f, 6.586f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.414f)
                lineToRelative(-6.586f, 6.586f)
                arcToRelative(1f, 1f, 0f, false, true, -1.707f, -0.707f)
                verticalLineToRelative(-3.586f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 9f)
                verticalLineToRelative(6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 9f)
                verticalLineToRelative(6f)
            }
        }.build()
        
        return _ArrowBigRightLines!!
    }

private var _ArrowBigRightLines: ImageVector? = null

