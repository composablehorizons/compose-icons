package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ChartBar: ImageVector
    get() {
        if (_ChartBar != null) return _ChartBar!!
        
        _ChartBar = ImageVector.Builder(
            name = "chart-bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.5f, 2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 14f, 3.5f)
                verticalLineToRelative(13f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(1f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-13f)
                arcTo(1.5f, 1.5f, 0f, false, false, 16.5f, 2f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(9.5f, 6f)
                arcTo(1.5f, 1.5f, 0f, false, false, 8f, 7.5f)
                verticalLineToRelative(9f)
                arcTo(1.5f, 1.5f, 0f, false, false, 9.5f, 18f)
                horizontalLineToRelative(1f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-9f)
                arcTo(1.5f, 1.5f, 0f, false, false, 10.5f, 6f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(3.5f, 10f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 11.5f)
                verticalLineToRelative(5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 18f)
                horizontalLineToRelative(1f)
                arcTo(1.5f, 1.5f, 0f, false, false, 6f, 16.5f)
                verticalLineToRelative(-5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4.5f, 10f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.build()
        
        return _ChartBar!!
    }

private var _ChartBar: ImageVector? = null

