package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.GlobeLock: ImageVector
    get() {
        if (_GlobeLock != null) return _GlobeLock!!
        
        _GlobeLock = ImageVector.Builder(
            name = "globe-lock",
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
                moveTo(15.686f, 15f)
                arcTo(14.5f, 14.5f, 0f, false, true, 12f, 22f)
                arcToRelative(14.5f, 14.5f, 0f, false, true, 0f, -20f)
                arcToRelative(10f, 10f, 0f, true, false, 9.542f, 13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 12f)
                horizontalLineToRelative(8.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 6f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                verticalLineToRelative(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 6f)
                horizontalLineTo(21f)
                arcTo(1f, 1f, 0f, false, true, 22f, 7f)
                verticalLineTo(10f)
                arcTo(1f, 1f, 0f, false, true, 21f, 11f)
                horizontalLineTo(15f)
                arcTo(1f, 1f, 0f, false, true, 14f, 10f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, false, true, 15f, 6f)
                close()
            }
        }.build()
        
        return _GlobeLock!!
    }

private var _GlobeLock: ImageVector? = null

