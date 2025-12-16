package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Hamburger: ImageVector
    get() {
        if (_Hamburger != null) return _Hamburger!!
        
        _Hamburger = ImageVector.Builder(
            name = "hamburger",
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
                moveTo(12f, 16f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, -4f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, 4f)
                horizontalLineToRelative(-4.25f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                arcToRelative(9f, 7f, 0f, false, true, 18f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 16f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                horizontalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                quadToRelative(0f, 0f, 0f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.67f, 12f)
                lineToRelative(6.13f, 4.6f)
                arcToRelative(2f, 2f, 0f, false, false, 2.8f, -0.4f)
                lineToRelative(3.15f, -4.2f)
            }
        }.build()
        
        return _Hamburger!!
    }

private var _Hamburger: ImageVector? = null

