package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Dice5: ImageVector
    get() {
        if (_Dice5 != null) return _Dice5!!
        
        _Dice5 = ImageVector.Builder(
            name = "dice-5",
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
                moveTo(9f, 8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 9f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 8.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15.5f, 9f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15f, 8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 16f, 8.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 15.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15.5f, 16f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15f, 15.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 16f, 15.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 15.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 16f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 15.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 15.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.5f, 12f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12f, 12.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 11.5f, 12f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12.5f, 12f)
                close()
            }
        }.build()
        
        return _Dice5!!
    }

private var _Dice5: ImageVector? = null

