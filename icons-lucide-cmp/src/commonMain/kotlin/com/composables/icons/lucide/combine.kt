package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Combine: ImageVector
    get() {
        if (_Combine != null) return _Combine!!
        
        _Combine = ImageVector.Builder(
            name = "combine",
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
                moveTo(14f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 15f)
                lineToRelative(3f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 21f)
                lineToRelative(3f, -3f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 14f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, false, true, 21f, 15f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, false, true, 20f, 21f)
                horizontalLineTo(15f)
                arcTo(1f, 1f, 0f, false, true, 14f, 20f)
                verticalLineTo(15f)
                arcTo(1f, 1f, 0f, false, true, 15f, 14f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 3f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, false, true, 10f, 4f)
                verticalLineTo(9f)
                arcTo(1f, 1f, 0f, false, true, 9f, 10f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, false, true, 3f, 9f)
                verticalLineTo(4f)
                arcTo(1f, 1f, 0f, false, true, 4f, 3f)
                close()
            }
        }.build()
        
        return _Combine!!
    }

private var _Combine: ImageVector? = null

