package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PartyPopper: ImageVector
    get() {
        if (_PartyPopper != null) return _PartyPopper!!
        
        _PartyPopper = ImageVector.Builder(
            name = "party-popper",
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
                moveTo(5.8f, 11.3f)
                lineTo(2f, 22f)
                lineToRelative(10.7f, -3.79f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 3f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 8f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 2f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 20f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 2f)
                lineToRelative(-2.24f, 0.75f)
                arcToRelative(2.9f, 2.9f, 0f, false, false, -1.96f, 3.12f)
                curveToRelative(0.1f, 0.86f, -0.57f, 1.63f, -1.45f, 1.63f)
                horizontalLineToRelative(-0.38f)
                curveToRelative(-0.86f, 0f, -1.6f, 0.6f, -1.76f, 1.44f)
                lineTo(14f, 10f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 13f)
                lineToRelative(-0.82f, -0.33f)
                curveToRelative(-0.86f, -0.34f, -1.82f, 0.2f, -1.98f, 1.11f)
                curveToRelative(-0.11f, 0.7f, -0.72f, 1.22f, -1.43f, 1.22f)
                horizontalLineTo(17f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 2f)
                lineToRelative(0.33f, 0.82f)
                curveToRelative(0.34f, 0.86f, -0.2f, 1.82f, -1.11f, 1.98f)
                curveTo(9.52f, 4.9f, 9f, 5.52f, 9f, 6.23f)
                verticalLineTo(7f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 13f)
                curveToRelative(1.93f, 1.93f, 2.83f, 4.17f, 2f, 5f)
                curveToRelative(-0.83f, 0.83f, -3.07f, -0.07f, -5f, -2f)
                curveToRelative(-1.93f, -1.93f, -2.83f, -4.17f, -2f, -5f)
                curveToRelative(0.83f, -0.83f, 3.07f, 0.07f, 5f, 2f)
                close()
            }
        }.build()
        
        return _PartyPopper!!
    }

private var _PartyPopper: ImageVector? = null

