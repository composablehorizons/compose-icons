package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Dice6: ImageVector
    get() {
        if (_Dice6 != null) return _Dice6!!
        
        _Dice6 = ImageVector.Builder(
            name = "dice-6",
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
                moveTo(3f, 3f)
                moveToRelative(0f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 8f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15.5f, 8f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15f, 7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 16f, 7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 12f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 12.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 12f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 12f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15.5f, 12.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15f, 12f)
                arcTo(0.5f, 0.5f, 0f, false, true, 16f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 16.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15.5f, 17f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15f, 16.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 16f, 16.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 16.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 17f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 16.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 16.5f)
                close()
            }
        }.build()
        
        return _Dice6!!
    }

private var _Dice6: ImageVector? = null

