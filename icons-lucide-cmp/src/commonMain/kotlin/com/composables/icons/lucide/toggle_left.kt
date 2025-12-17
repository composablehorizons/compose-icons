package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ToggleLeft: ImageVector
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
                moveTo(12f, 12f)
                arcTo(3f, 3f, 0f, false, true, 9f, 15f)
                arcTo(3f, 3f, 0f, false, true, 6f, 12f)
                arcTo(3f, 3f, 0f, false, true, 12f, 12f)
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
        
        return _ToggleLeft!!
    }

private var _ToggleLeft: ImageVector? = null

