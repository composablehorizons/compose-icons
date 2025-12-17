package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Mouse: ImageVector
    get() {
        if (_Mouse != null) return _Mouse!!
        
        _Mouse = ImageVector.Builder(
            name = "mouse",
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
                moveTo(12f, 2f)
                horizontalLineTo(12f)
                arcTo(7f, 7f, 0f, false, true, 19f, 9f)
                verticalLineTo(15f)
                arcTo(7f, 7f, 0f, false, true, 12f, 22f)
                horizontalLineTo(12f)
                arcTo(7f, 7f, 0f, false, true, 5f, 15f)
                verticalLineTo(9f)
                arcTo(7f, 7f, 0f, false, true, 12f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 6f)
                verticalLineToRelative(4f)
            }
        }.build()
        
        return _Mouse!!
    }

private var _Mouse: ImageVector? = null

