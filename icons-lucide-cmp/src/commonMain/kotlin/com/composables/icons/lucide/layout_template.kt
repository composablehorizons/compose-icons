package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LayoutTemplate: ImageVector
    get() {
        if (_LayoutTemplate != null) return _LayoutTemplate!!
        
        _LayoutTemplate = ImageVector.Builder(
            name = "layout-template",
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
                moveTo(4f, 3f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, false, true, 21f, 4f)
                verticalLineTo(9f)
                arcTo(1f, 1f, 0f, false, true, 20f, 10f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, false, true, 3f, 9f)
                verticalLineTo(4f)
                arcTo(1f, 1f, 0f, false, true, 4f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 14f)
                horizontalLineTo(11f)
                arcTo(1f, 1f, 0f, false, true, 12f, 15f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, false, true, 11f, 21f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, false, true, 3f, 20f)
                verticalLineTo(15f)
                arcTo(1f, 1f, 0f, false, true, 4f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 14f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, false, true, 21f, 15f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, false, true, 20f, 21f)
                horizontalLineTo(17f)
                arcTo(1f, 1f, 0f, false, true, 16f, 20f)
                verticalLineTo(15f)
                arcTo(1f, 1f, 0f, false, true, 17f, 14f)
                close()
            }
        }.build()
        
        return _LayoutTemplate!!
    }

private var _LayoutTemplate: ImageVector? = null

