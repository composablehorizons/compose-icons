package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.ToggleRight: ImageVector
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
                moveTo(8f, 5f)
                horizontalLineTo(16f)
                arcTo(7f, 7f, 0f, false, true, 23f, 12f)
                verticalLineTo(12f)
                arcTo(7f, 7f, 0f, false, true, 16f, 19f)
                horizontalLineTo(8f)
                arcTo(7f, 7f, 0f, false, true, 1f, 12f)
                verticalLineTo(12f)
                arcTo(7f, 7f, 0f, false, true, 8f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 12f)
                arcTo(3f, 3f, 0f, false, true, 16f, 15f)
                arcTo(3f, 3f, 0f, false, true, 13f, 12f)
                arcTo(3f, 3f, 0f, false, true, 19f, 12f)
                close()
            }
        }.build()
        
        return _ToggleRight!!
    }

private var _ToggleRight: ImageVector? = null

