package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Gavel: ImageVector
    get() {
        if (_Gavel != null) return _Gavel!!
        
        _Gavel = ImageVector.Builder(
            name = "gavel",
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
                moveTo(13f, 10f)
                lineToRelative(7.383f, 7.418f)
                curveToRelative(0.823f, 0.82f, 0.823f, 2.148f, 0f, 2.967f)
                arcToRelative(2.11f, 2.11f, 0f, false, true, -2.976f, 0f)
                lineToRelative(-7.407f, -7.385f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 9f)
                lineToRelative(4f, 4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 10f)
                lineToRelative(-4f, -4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 21f)
                horizontalLineToRelative(7f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.793f, 15.793f)
                lineToRelative(-3.586f, -3.586f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.414f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(0.5f, 0.5f)
                lineToRelative(3f, -3f)
                lineToRelative(-0.5f, -0.5f)
                lineToRelative(2.293f, -2.293f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                lineToRelative(3.586f, 3.586f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.414f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(-0.5f, -0.5f)
                lineToRelative(-3f, 3f)
                lineToRelative(0.5f, 0.5f)
                lineToRelative(-2.293f, 2.293f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, 0f)
                close()
            }
        }.build()
        
        return _Gavel!!
    }

private var _Gavel: ImageVector? = null

