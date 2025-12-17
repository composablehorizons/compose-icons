package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ChartPie: ImageVector
    get() {
        if (_ChartPie != null) return _ChartPie!!
        
        _ChartPie = ImageVector.Builder(
            name = "chart-pie",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(10.5f, 6f)
                arcToRelative(7.5f, 7.5f, 0f, true, false, 7.5f, 7.5f)
                horizontalLineToRelative(-7.5f)
                verticalLineTo(6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(13.5f, 10.5f)
                horizontalLineTo(21f)
                arcTo(7.5f, 7.5f, 0f, false, false, 13.5f, 3f)
                verticalLineToRelative(7.5f)
                close()
            }
        }.build()
        
        return _ChartPie!!
    }

private var _ChartPie: ImageVector? = null

