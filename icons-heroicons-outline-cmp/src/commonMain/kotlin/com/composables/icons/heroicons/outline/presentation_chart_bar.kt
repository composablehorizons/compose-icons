package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.PresentationChartBar: ImageVector
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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(3.75f, 3f)
                verticalLineToRelative(11.25f)
                arcTo(2.25f, 2.25f, 0f, false, false, 6f, 16.5f)
                horizontalLineToRelative(2.25f)
                moveTo(3.75f, 3f)
                horizontalLineToRelative(-1.5f)
                moveToRelative(1.5f, 0f)
                horizontalLineToRelative(16.5f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(1.5f)
                moveToRelative(-1.5f, 0f)
                verticalLineToRelative(11.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 18f, 16.5f)
                horizontalLineToRelative(-2.25f)
                moveToRelative(-7.5f, 0f)
                horizontalLineToRelative(7.5f)
                moveToRelative(-7.5f, 0f)
                lineToRelative(-1f, 3f)
                moveToRelative(8.5f, -3f)
                lineToRelative(1f, 3f)
                moveToRelative(0f, 0f)
                lineToRelative(0.5f, 1.5f)
                moveToRelative(-0.5f, -1.5f)
                horizontalLineToRelative(-9.5f)
                moveToRelative(0f, 0f)
                lineToRelative(-0.5f, 1.5f)
                moveTo(9f, 11.25f)
                verticalLineToRelative(1.5f)
                moveTo(12f, 9f)
                verticalLineToRelative(3.75f)
                moveToRelative(3f, -6f)
                verticalLineToRelative(6f)
            }
        }.build()
        
        return _PresentationChartBar!!
    }

private var _PresentationChartBar: ImageVector? = null

