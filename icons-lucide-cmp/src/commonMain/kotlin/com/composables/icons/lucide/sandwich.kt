package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Sandwich: ImageVector
    get() {
        if (_Sandwich != null) return _Sandwich!!
        
        _Sandwich = ImageVector.Builder(
            name = "sandwich",
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
                moveTo(2.37f, 11.223f)
                lineToRelative(8.372f, -6.777f)
                arcToRelative(2f, 2f, 0f, false, true, 2.516f, 0f)
                lineToRelative(8.371f, 6.777f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 15f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-5.25f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 15f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.67f, 15f)
                lineToRelative(6.13f, 4.6f)
                arcToRelative(2f, 2f, 0f, false, false, 2.8f, -0.4f)
                lineToRelative(3.15f, -4.2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 11f)
                horizontalLineTo(21f)
                arcTo(1f, 1f, 0f, false, true, 22f, 12f)
                verticalLineTo(14f)
                arcTo(1f, 1f, 0f, false, true, 21f, 15f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, false, true, 2f, 14f)
                verticalLineTo(12f)
                arcTo(1f, 1f, 0f, false, true, 3f, 11f)
                close()
            }
        }.build()
        
        return _Sandwich!!
    }

private var _Sandwich: ImageVector? = null

