package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.PresentationChartLine: ImageVector
    get() {
        if (_PresentationChartLine != null) return _PresentationChartLine!!
        
        _PresentationChartLine = ImageVector.Builder(
            name = "presentation-chart-line",
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
                moveToRelative(6.54f, 15f)
                horizontalLineToRelative(6.42f)
                lineToRelative(0.5f, 1.5f)
                horizontalLineTo(8.29f)
                lineToRelative(0.5f, -1.5f)
                close()
                moveToRelative(8.085f, -8.995f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -0.75f, -1.299f)
                arcToRelative(12.81f, 12.81f, 0f, false, false, -3.558f, 3.05f)
                lineTo(11.03f, 8.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 0f)
                lineToRelative(-3f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, 1.06f)
                lineToRelative(2.47f, -2.47f)
                lineToRelative(1.617f, 1.618f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.146f, -0.102f)
                arcToRelative(11.312f, 11.312f, 0f, false, true, 3.612f, -3.321f)
                close()
            }
        }.build()
        
        return _PresentationChartLine!!
    }

private var _PresentationChartLine: ImageVector? = null

