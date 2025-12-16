package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Forklift: ImageVector
    get() {
        if (_Forklift != null) return _Forklift!!
        
        _Forklift = ImageVector.Builder(
            name = "forklift",
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
                moveTo(12f, 12f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 19f)
                arcTo(2f, 2f, 0f, false, true, 13f, 21f)
                arcTo(2f, 2f, 0f, false, true, 11f, 19f)
                arcTo(2f, 2f, 0f, false, true, 15f, 19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 19f)
                arcTo(2f, 2f, 0f, false, true, 5f, 21f)
                arcTo(2f, 2f, 0f, false, true, 3f, 19f)
                arcTo(2f, 2f, 0f, false, true, 7f, 19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 19f)
                horizontalLineToRelative(3f)
                moveToRelative(5f, -17f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(6f)
                moveTo(6f, 12f)
                verticalLineTo(7f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3f)
                lineToRelative(5f, 5f)
            }
        }.build()
        
        return _Forklift!!
    }

private var _Forklift: ImageVector? = null

