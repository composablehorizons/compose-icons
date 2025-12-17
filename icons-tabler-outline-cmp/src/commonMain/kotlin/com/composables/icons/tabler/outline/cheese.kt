package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Cheese: ImageVector
    get() {
        if (_Cheese != null) return _Cheese!!
        
        _Cheese = ImageVector.Builder(
            name = "cheese",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.519f, 20.008f)
                lineToRelative(16.481f, -0.008f)
                verticalLineToRelative(-3.5f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, -4f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-16.722f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 9f)
                lineToRelative(-9.385f, -4.992f)
                curveToRelative(-2.512f, 0.12f, -4.758f, 1.42f, -6.327f, 3.425f)
                curveToRelative(-1.423f, 1.82f, -2.288f, 4.221f, -2.288f, 6.854f)
                curveToRelative(0f, 2.117f, 0.56f, 4.085f, 1.519f, 5.721f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 13f)
                verticalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 13f)
                verticalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 16f)
                verticalLineToRelative(0.01f)
            }
        }.build()
        
        return _Cheese!!
    }

private var _Cheese: ImageVector? = null

