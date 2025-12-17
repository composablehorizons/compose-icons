package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.PieChart: ImageVector
    get() {
        if (_PieChart != null) return _PieChart!!
        
        _PieChart = ImageVector.Builder(
            name = "pie-chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.985f, 8.5f)
                horizontalLineTo(8.207f)
                lineToRelative(-5.5f, 5.5f)
                arcToRelative(8f, 8f, 0f, false, false, 13.277f, -5.5f)
                close()
                moveTo(2f, 13.292f)
                arcTo(8f, 8f, 0f, false, true, 7.5f, 0.015f)
                verticalLineToRelative(7.778f)
                close()
                moveTo(8.5f, 0.015f)
                verticalLineTo(7.5f)
                horizontalLineToRelative(7.485f)
                arcTo(8f, 8f, 0f, false, false, 8.5f, 0.015f)
            }
        }.build()
        
        return _PieChart!!
    }

private var _PieChart: ImageVector? = null

