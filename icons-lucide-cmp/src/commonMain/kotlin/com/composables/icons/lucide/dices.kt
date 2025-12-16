package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Dices: ImageVector
    get() {
        if (_Dices != null) return _Dices!!
        
        _Dices = ImageVector.Builder(
            name = "dices",
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
                moveTo(4f, 10f)
                horizontalLineTo(12f)
                arcTo(2f, 2f, 0f, false, true, 14f, 12f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 12f, 22f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 2f, 20f)
                verticalLineTo(12f)
                arcTo(2f, 2f, 0f, false, true, 4f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.92f, 14f)
                lineToRelative(3.5f, -3.5f)
                arcToRelative(2.24f, 2.24f, 0f, false, false, 0f, -3f)
                lineToRelative(-5f, -4.92f)
                arcToRelative(2.24f, 2.24f, 0f, false, false, -3f, 0f)
                lineTo(10f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 18f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 14f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 6f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 9f)
                horizontalLineToRelative(0.01f)
            }
        }.build()
        
        return _Dices!!
    }

private var _Dices: ImageVector? = null

