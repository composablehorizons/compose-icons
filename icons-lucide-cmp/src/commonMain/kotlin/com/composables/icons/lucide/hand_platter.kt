package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.HandPlatter: ImageVector
    get() {
        if (_HandPlatter != null) return _HandPlatter!!
        
        _HandPlatter = ImageVector.Builder(
            name = "hand-platter",
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
                moveTo(12f, 3f)
                verticalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.4f, 17.4f)
                lineToRelative(3.2f, -2.8f)
                arcToRelative(2f, 2f, 0f, true, true, 2.8f, 2.9f)
                lineToRelative(-3.6f, 3.3f)
                curveToRelative(-0.7f, 0.8f, -1.7f, 1.2f, -2.8f, 1.2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2.1f, -0.4f, -2.8f, -1.2f)
                lineToRelative(-1.302f, -1.464f)
                arcTo(1f, 1f, 0f, false, false, 6.151f, 19f)
                horizontalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 14f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 4f)
                horizontalLineToRelative(-2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 10f)
                horizontalLineToRelative(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 10f)
                arcToRelative(7f, 7f, 0f, false, true, 14f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 14f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(2f)
            }
        }.build()
        
        return _HandPlatter!!
    }

private var _HandPlatter: ImageVector? = null

