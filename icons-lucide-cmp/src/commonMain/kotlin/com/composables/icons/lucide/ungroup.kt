package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Ungroup: ImageVector
    get() {
        if (_Ungroup != null) return _Ungroup!!
        
        _Ungroup = ImageVector.Builder(
            name = "ungroup",
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
                moveTo(6f, 4f)
                horizontalLineTo(12f)
                arcTo(1f, 1f, 0f, false, true, 13f, 5f)
                verticalLineTo(9f)
                arcTo(1f, 1f, 0f, false, true, 12f, 10f)
                horizontalLineTo(6f)
                arcTo(1f, 1f, 0f, false, true, 5f, 9f)
                verticalLineTo(5f)
                arcTo(1f, 1f, 0f, false, true, 6f, 4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 14f)
                horizontalLineTo(18f)
                arcTo(1f, 1f, 0f, false, true, 19f, 15f)
                verticalLineTo(19f)
                arcTo(1f, 1f, 0f, false, true, 18f, 20f)
                horizontalLineTo(12f)
                arcTo(1f, 1f, 0f, false, true, 11f, 19f)
                verticalLineTo(15f)
                arcTo(1f, 1f, 0f, false, true, 12f, 14f)
                close()
            }
        }.build()
        
        return _Ungroup!!
    }

private var _Ungroup: ImageVector? = null

