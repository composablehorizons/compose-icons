package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ToggleRight: ImageVector
    get() {
        if (_ToggleRight != null) return _ToggleRight!!
        
        _ToggleRight = ImageVector.Builder(
            name = "toggle-right",
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
                moveTo(18f, 12f)
                arcTo(3f, 3f, 0f, false, true, 15f, 15f)
                arcTo(3f, 3f, 0f, false, true, 12f, 12f)
                arcTo(3f, 3f, 0f, false, true, 18f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 5f)
                horizontalLineTo(15f)
                arcTo(7f, 7f, 0f, false, true, 22f, 12f)
                verticalLineTo(12f)
                arcTo(7f, 7f, 0f, false, true, 15f, 19f)
                horizontalLineTo(9f)
                arcTo(7f, 7f, 0f, false, true, 2f, 12f)
                verticalLineTo(12f)
                arcTo(7f, 7f, 0f, false, true, 9f, 5f)
                close()
            }
        }.build()
        
        return _ToggleRight!!
    }

private var _ToggleRight: ImageVector? = null

