package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Amphora: ImageVector
    get() {
        if (_Amphora != null) return _Amphora!!
        
        _Amphora = ImageVector.Builder(
            name = "amphora",
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
                moveTo(10f, 2f)
                verticalLineToRelative(5.632f)
                curveToRelative(0f, 0.424f, -0.272f, 0.795f, -0.653f, 0.982f)
                arcTo(6f, 6f, 0f, false, false, 6f, 14f)
                curveToRelative(0.006f, 4f, 3f, 7f, 5f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 5f)
                horizontalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                horizontalLineToRelative(0.68f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 2f)
                verticalLineToRelative(5.632f)
                curveToRelative(0f, 0.424f, 0.272f, 0.795f, 0.652f, 0.982f)
                arcTo(6f, 6f, 0f, false, true, 18f, 14f)
                curveToRelative(0f, 4f, -3f, 7f, -5f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 5f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 4f)
                horizontalLineToRelative(-0.68f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 22f)
                horizontalLineTo(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 2f)
                horizontalLineToRelative(6f)
            }
        }.build()
        
        return _Amphora!!
    }

private var _Amphora: ImageVector? = null

