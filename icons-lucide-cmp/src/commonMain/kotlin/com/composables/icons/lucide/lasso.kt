package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Lasso: ImageVector
    get() {
        if (_Lasso != null) return _Lasso!!
        
        _Lasso = ImageVector.Builder(
            name = "lasso",
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
                moveTo(3.704f, 14.467f)
                arcTo(10f, 8f, 0f, false, true, 2f, 10f)
                arcToRelative(10f, 8f, 0f, false, true, 20f, 0f)
                arcToRelative(10f, 8f, 0f, false, true, -10f, 8f)
                arcToRelative(10f, 8f, 0f, false, true, -5.181f, -1.158f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 22f)
                arcToRelative(5f, 5f, 0f, false, true, -2f, -3.994f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 16f)
                arcTo(2f, 2f, 0f, false, true, 5f, 18f)
                arcTo(2f, 2f, 0f, false, true, 3f, 16f)
                arcTo(2f, 2f, 0f, false, true, 7f, 16f)
                close()
            }
        }.build()
        
        return _Lasso!!
    }

private var _Lasso: ImageVector? = null

