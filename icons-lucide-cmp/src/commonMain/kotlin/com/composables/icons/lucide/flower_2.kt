package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Flower2: ImageVector
    get() {
        if (_Flower2 != null) return _Flower2!!
        
        _Flower2 = ImageVector.Builder(
            name = "flower-2",
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
                moveTo(12f, 5f)
                arcToRelative(3f, 3f, 0f, true, true, 3f, 3f)
                moveToRelative(-3f, -3f)
                arcToRelative(3f, 3f, 0f, true, false, -3f, 3f)
                moveToRelative(3f, -3f)
                verticalLineToRelative(1f)
                moveTo(9f, 8f)
                arcToRelative(3f, 3f, 0f, true, false, 3f, 3f)
                moveTo(9f, 8f)
                horizontalLineToRelative(1f)
                moveToRelative(5f, 0f)
                arcToRelative(3f, 3f, 0f, true, true, -3f, 3f)
                moveToRelative(3f, -3f)
                horizontalLineToRelative(-1f)
                moveToRelative(-2f, 3f)
                verticalLineToRelative(-1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 8f)
                arcTo(2f, 2f, 0f, false, true, 12f, 10f)
                arcTo(2f, 2f, 0f, false, true, 10f, 8f)
                arcTo(2f, 2f, 0f, false, true, 14f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 10f)
                verticalLineToRelative(12f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                curveToRelative(4.2f, 0f, 7f, -1.667f, 7f, -5f)
                curveToRelative(-4.2f, 0f, -7f, 1.667f, -7f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                curveToRelative(-4.2f, 0f, -7f, -1.667f, -7f, -5f)
                curveToRelative(4.2f, 0f, 7f, 1.667f, 7f, 5f)
                close()
            }
        }.build()
        
        return _Flower2!!
    }

private var _Flower2: ImageVector? = null

