package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.PresentationChartBar: ImageVector
    get() {
        if (_PresentationChartBar != null) return _PresentationChartBar!!
        
        _PresentationChartBar = ImageVector.Builder(
            name = "presentation-chart-bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 2.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 1.75f, 2f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(18f)
                verticalLineToRelative(8.75f)
                arcTo(2.75f, 2.75f, 0f, false, true, 15.25f, 15f)
                horizontalLineToRelative(-1.072f)
                lineToRelative(0.798f, 3.06f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.452f, 0.38f)
                lineTo(13.41f, 18f)
                horizontalLineTo(6.59f)
                lineToRelative(-0.114f, 0.44f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.452f, -0.38f)
                lineTo(5.823f, 15f)
                horizontalLineTo(4.75f)
                arcTo(2.75f, 2.75f, 0f, false, true, 2f, 12.25f)
                verticalLineTo(3.5f)
                horizontalLineToRelative(-0.25f)
                arcTo(0.75f, 0.75f, 0f, false, true, 1f, 2.75f)
                close()
                moveTo(7.373f, 15f)
                lineToRelative(-0.391f, 1.5f)
                horizontalLineToRelative(6.037f)
                lineToRelative(-0.392f, -1.5f)
                horizontalLineTo(7.373f)
                close()
                moveTo(13.25f, 5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
                moveToRelative(-6.5f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-1.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 6.75f, 9f)
                close()
                moveToRelative(4f, -1.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-3.5f)
                close()
            }
        }.build()
        
        return _PresentationChartBar!!
    }

private var _PresentationChartBar: ImageVector? = null

