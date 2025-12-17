package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ChartPie: ImageVector
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.25f, 13.5f)
                arcToRelative(8.25f, 8.25f, 0f, false, true, 8.25f, -8.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(6.75f)
                horizontalLineTo(18f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                arcToRelative(8.25f, 8.25f, 0f, false, true, -16.5f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.75f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                arcToRelative(8.25f, 8.25f, 0f, false, true, 8.25f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineTo(3f)
                close()
            }
        }.build()
        
        return _ChartPie!!
    }

private var _ChartPie: ImageVector? = null

