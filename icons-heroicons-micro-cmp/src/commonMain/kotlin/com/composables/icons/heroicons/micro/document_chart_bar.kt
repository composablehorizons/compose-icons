package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.DocumentChartBar: ImageVector
    get() {
        if (_DocumentChartBar != null) return _DocumentChartBar!!
        
        _DocumentChartBar = ImageVector.Builder(
            name = "document-chart-bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 2f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(9f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4f, 14f)
                horizontalLineToRelative(8f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(6.621f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.44f, -1.06f)
                lineTo(9.94f, 2.439f)
                arcTo(1.5f, 1.5f, 0f, false, false, 8.878f, 2f)
                horizontalLineTo(4f)
                close()
                moveToRelative(6f, 5.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-3.5f)
                close()
                moveToRelative(-2.75f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(-2f, 0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _DocumentChartBar!!
    }

private var _DocumentChartBar: ImageVector? = null

