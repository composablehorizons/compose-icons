package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TvMinimalPlay: ImageVector
    get() {
        if (_TvMinimalPlay != null) return _TvMinimalPlay!!
        
        _TvMinimalPlay = ImageVector.Builder(
            name = "tv-minimal-play",
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
                moveTo(15.033f, 9.44f)
                arcToRelative(0.647f, 0.647f, 0f, false, true, 0f, 1.12f)
                lineToRelative(-4.065f, 2.352f)
                arcToRelative(0.645f, 0.645f, 0f, false, true, -0.968f, -0.56f)
                verticalLineTo(7.648f)
                arcToRelative(0.645f, 0.645f, 0f, false, true, 0.967f, -0.56f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 21f)
                horizontalLineToRelative(10f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 3f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 22f, 5f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, false, true, 20f, 17f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 2f, 15f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, false, true, 4f, 3f)
                close()
            }
        }.build()
        
        return _TvMinimalPlay!!
    }

private var _TvMinimalPlay: ImageVector? = null

