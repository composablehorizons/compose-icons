package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.HandMetal: ImageVector
    get() {
        if (_HandMetal != null) return _HandMetal!!
        
        _HandMetal = ImageVector.Builder(
            name = "hand-metal",
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
                moveTo(18f, 12.5f)
                verticalLineTo(10f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(1.4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 11f)
                verticalLineTo(9f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                verticalLineToRelative(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 10.5f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                verticalLineToRelative(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 15f)
                lineToRelative(-1.76f, -1.76f)
                arcToRelative(2f, 2f, 0f, false, false, -2.83f, 2.82f)
                lineToRelative(3.6f, 3.6f)
                curveTo(7.5f, 21.14f, 9.2f, 22f, 12f, 22f)
                horizontalLineToRelative(2f)
                arcToRelative(8f, 8f, 0f, false, false, 8f, -8f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                verticalLineToRelative(5f)
            }
        }.build()
        
        return _HandMetal!!
    }

private var _HandMetal: ImageVector? = null

