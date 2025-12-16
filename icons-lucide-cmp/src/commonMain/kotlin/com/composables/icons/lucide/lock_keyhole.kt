package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LockKeyhole: ImageVector
    get() {
        if (_LockKeyhole != null) return _LockKeyhole!!
        
        _LockKeyhole = ImageVector.Builder(
            name = "lock-keyhole",
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
                moveTo(13f, 16f)
                arcTo(1f, 1f, 0f, false, true, 12f, 17f)
                arcTo(1f, 1f, 0f, false, true, 11f, 16f)
                arcTo(1f, 1f, 0f, false, true, 13f, 16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 10f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, false, true, 21f, 12f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 19f, 22f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, false, true, 3f, 20f)
                verticalLineTo(12f)
                arcTo(2f, 2f, 0f, false, true, 5f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 10f)
                verticalLineTo(7f)
                arcToRelative(5f, 5f, 0f, false, true, 10f, 0f)
                verticalLineToRelative(3f)
            }
        }.build()
        
        return _LockKeyhole!!
    }

private var _LockKeyhole: ImageVector? = null

