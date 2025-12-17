package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.ToggleLeft: ImageVector
    get() {
        if (_ToggleLeft != null) return _ToggleLeft!!
        
        _ToggleLeft = ImageVector.Builder(
            name = "toggle-left",
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
                moveTo(11f, 12f)
                arcTo(3f, 3f, 0f, false, true, 8f, 15f)
                arcTo(3f, 3f, 0f, false, true, 5f, 12f)
                arcTo(3f, 3f, 0f, false, true, 11f, 12f)
                close()
            }
        }.build()
        
        return _ToggleLeft!!
    }

private var _ToggleLeft: ImageVector? = null

