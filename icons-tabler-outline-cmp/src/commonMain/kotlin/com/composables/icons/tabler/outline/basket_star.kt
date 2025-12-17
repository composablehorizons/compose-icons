package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BasketStar: ImageVector
    get() {
        if (_BasketStar != null) return _BasketStar!!
        
        _BasketStar = ImageVector.Builder(
            name = "basket-star",
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
                moveTo(17f, 10f)
                lineToRelative(-2f, -6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 10f)
                lineToRelative(2f, -6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 20f)
                horizontalLineToRelative(-3.256f)
                arcToRelative(3f, 3f, 0f, false, true, -2.965f, -2.544f)
                lineToRelative(-1.255f, -7.152f)
                arcToRelative(2f, 2f, 0f, false, true, 1.977f, -2.304f)
                horizontalLineToRelative(13.999f)
                arcToRelative(2f, 2f, 0f, false, true, 1.977f, 2.304f)
                lineToRelative(-0.133f, 0.757f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.596f, 12.794f)
                arcToRelative(2f, 2f, 0f, false, false, -3.377f, 2.116f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.8f, 20.817f)
                lineToRelative(-2.172f, 1.138f)
                arcToRelative(0.392f, 0.392f, 0f, false, true, -0.568f, -0.41f)
                lineToRelative(0.415f, -2.411f)
                lineToRelative(-1.757f, -1.707f)
                arcToRelative(0.389f, 0.389f, 0f, false, true, 0.217f, -0.665f)
                lineToRelative(2.428f, -0.352f)
                lineToRelative(1.086f, -2.193f)
                arcToRelative(0.392f, 0.392f, 0f, false, true, 0.702f, 0f)
                lineToRelative(1.086f, 2.193f)
                lineToRelative(2.428f, 0.352f)
                arcToRelative(0.39f, 0.39f, 0f, false, true, 0.217f, 0.665f)
                lineToRelative(-1.757f, 1.707f)
                lineToRelative(0.414f, 2.41f)
                arcToRelative(0.39f, 0.39f, 0f, false, true, -0.567f, 0.411f)
                lineToRelative(-2.172f, -1.138f)
                close()
            }
        }.build()
        
        return _BasketStar!!
    }

private var _BasketStar: ImageVector? = null

