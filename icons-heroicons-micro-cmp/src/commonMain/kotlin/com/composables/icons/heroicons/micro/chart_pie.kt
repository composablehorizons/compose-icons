package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ChartPie: ImageVector
    get() {
        if (_ChartPie != null) return _ChartPie!!
        
        _ChartPie = ImageVector.Builder(
            name = "chart-pie",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.975f, 6.5f)
                curveToRelative(0.028f, 0.276f, -0.199f, 0.5f, -0.475f, 0.5f)
                horizontalLineToRelative(-4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.276f, 0.225f, -0.503f, 0.5f, -0.475f)
                arcTo(5.002f, 5.002f, 0f, false, true, 13.974f, 6.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 4.025f)
                curveToRelative(0.276f, -0.028f, 0.5f, 0.199f, 0.5f, 0.475f)
                verticalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.276f, 0f, 0.503f, 0.225f, 0.475f, 0.5f)
                arcToRelative(5f, 5f, 0f, true, true, -5.474f, -5.475f)
                close()
            }
        }.build()
        
        return _ChartPie!!
    }

private var _ChartPie: ImageVector? = null

