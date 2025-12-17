package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.PresentationChartBar: ImageVector
    get() {
        if (_PresentationChartBar != null) return _PresentationChartBar!!
        
        _PresentationChartBar = ImageVector.Builder(
            name = "presentation-chart-bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.75f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(0.043f)
                lineToRelative(-1.004f, 3.013f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.423f, 0.474f)
                lineTo(4.624f, 14f)
                horizontalLineToRelative(6.752f)
                lineToRelative(0.163f, 0.487f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.422f, -0.474f)
                lineTo(11.957f, 11f)
                horizontalLineTo(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(3.5f)
                horizontalLineToRelative(0.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(1.75f)
                close()
                moveToRelative(8.626f, 9f)
                lineToRelative(0.5f, 1.5f)
                horizontalLineTo(5.124f)
                lineToRelative(0.5f, -1.5f)
                horizontalLineToRelative(4.752f)
                close()
                moveTo(5.25f, 7f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-0.5f)
                arcTo(0.75f, 0.75f, 0f, false, false, 5.25f, 7f)
                close()
                moveTo(10f, 4.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(8f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-2f)
                arcTo(0.75f, 0.75f, 0f, false, false, 8f, 5.5f)
                close()
            }
        }.build()
        
        return _PresentationChartBar!!
    }

private var _PresentationChartBar: ImageVector? = null

