package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.PresentationChartBar: ImageVector
    get() {
        if (_PresentationChartBar != null) return _PresentationChartBar!!
        
        _PresentationChartBar = ImageVector.Builder(
            name = "presentation-chart-bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineTo(3f)
                verticalLineToRelative(10.5f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                horizontalLineToRelative(1.21f)
                lineToRelative(-1.172f, 3.513f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.424f, 0.474f)
                lineToRelative(0.329f, -0.987f)
                horizontalLineToRelative(8.418f)
                lineToRelative(0.33f, 0.987f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.422f, -0.474f)
                lineToRelative(-1.17f, -3.513f)
                horizontalLineTo(18f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineTo(3.75f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(2.25f)
                close()
                moveToRelative(6.04f, 16.5f)
                lineToRelative(0.5f, -1.5f)
                horizontalLineToRelative(6.42f)
                lineToRelative(0.5f, 1.5f)
                horizontalLineTo(8.29f)
                close()
                moveToRelative(7.46f, -12f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(6f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-6f)
                close()
                moveToRelative(-3f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(9f)
                close()
                moveToRelative(-3f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-1.5f)
                close()
            }
        }.build()
        
        return _PresentationChartBar!!
    }

private var _PresentationChartBar: ImageVector? = null

