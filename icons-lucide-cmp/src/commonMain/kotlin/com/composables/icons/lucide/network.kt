package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Network: ImageVector
    get() {
        if (_Network != null) return _Network!!
        
        _Network = ImageVector.Builder(
            name = "network",
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
                moveTo(17f, 16f)
                horizontalLineTo(21f)
                arcTo(1f, 1f, 0f, false, true, 22f, 17f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, false, true, 21f, 22f)
                horizontalLineTo(17f)
                arcTo(1f, 1f, 0f, false, true, 16f, 21f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, false, true, 17f, 16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 16f)
                horizontalLineTo(7f)
                arcTo(1f, 1f, 0f, false, true, 8f, 17f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, false, true, 7f, 22f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, false, true, 2f, 21f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, false, true, 3f, 16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 2f)
                horizontalLineTo(14f)
                arcTo(1f, 1f, 0f, false, true, 15f, 3f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, false, true, 14f, 8f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, false, true, 9f, 7f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, false, true, 10f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 16f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                verticalLineTo(8f)
            }
        }.build()
        
        return _Network!!
    }

private var _Network: ImageVector? = null

