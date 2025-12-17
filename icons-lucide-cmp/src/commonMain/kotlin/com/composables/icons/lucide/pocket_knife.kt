package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PocketKnife: ImageVector
    get() {
        if (_PocketKnife != null) return _PocketKnife!!
        
        _PocketKnife = ImageVector.Builder(
            name = "pocket-knife",
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
                moveTo(3f, 2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1f, 2f, 1f, 2f, 2f)
                reflectiveCurveTo(3f, 6f, 3f, 7f)
                reflectiveCurveToRelative(2f, 1f, 2f, 2f)
                reflectiveCurveToRelative(-2f, 1f, -2f, 2f)
                reflectiveCurveToRelative(2f, 1f, 2f, 2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 6f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 18f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.83f, 8.83f)
                arcToRelative(4f, 4f, 0f, false, false, -5.66f, -5.66f)
                lineToRelative(-12f, 12f)
                arcToRelative(4f, 4f, 0f, true, false, 5.66f, 5.66f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 11.66f)
                verticalLineTo(22f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, -4f)
                verticalLineTo(6f)
            }
        }.build()
        
        return _PocketKnife!!
    }

private var _PocketKnife: ImageVector? = null

