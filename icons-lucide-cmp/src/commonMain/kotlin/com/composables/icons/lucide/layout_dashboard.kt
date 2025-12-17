package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LayoutDashboard: ImageVector
    get() {
        if (_LayoutDashboard != null) return _LayoutDashboard!!
        
        _LayoutDashboard = ImageVector.Builder(
            name = "layout-dashboard",
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
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, false, true, 10f, 4f)
                verticalLineTo(11f)
                arcTo(1f, 1f, 0f, false, true, 9f, 12f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, false, true, 3f, 11f)
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
                moveTo(15f, 3f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, false, true, 21f, 4f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, false, true, 20f, 8f)
                horizontalLineTo(15f)
                arcTo(1f, 1f, 0f, false, true, 14f, 7f)
                verticalLineTo(4f)
                arcTo(1f, 1f, 0f, false, true, 15f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 12f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, false, true, 21f, 13f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, false, true, 20f, 21f)
                horizontalLineTo(15f)
                arcTo(1f, 1f, 0f, false, true, 14f, 20f)
                verticalLineTo(13f)
                arcTo(1f, 1f, 0f, false, true, 15f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 16f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, false, true, 10f, 17f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, false, true, 9f, 21f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, false, true, 3f, 20f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, false, true, 4f, 16f)
                close()
            }
        }.build()
        
        return _LayoutDashboard!!
    }

private var _LayoutDashboard: ImageVector? = null

