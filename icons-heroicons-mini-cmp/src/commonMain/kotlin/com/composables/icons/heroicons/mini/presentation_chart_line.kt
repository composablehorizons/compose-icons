package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.PresentationChartLine: ImageVector
    get() {
        if (_PresentationChartLine != null) return _PresentationChartLine!!
        
        _PresentationChartLine = ImageVector.Builder(
            name = "presentation-chart-line",
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
                moveToRelative(7.49f, -8.931f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.175f, 1.046f)
                arcToRelative(19.326f, 19.326f, 0f, false, false, -3.398f, 3.098f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.097f, 0.04f)
                lineTo(8.5f, 8.561f)
                lineToRelative(-2.22f, 2.22f)
                arcTo(0.75f, 0.75f, 0f, true, true, 5.22f, 9.72f)
                lineToRelative(2.75f, -2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(1.664f, 1.663f)
                arcToRelative(20.786f, 20.786f, 0f, false, true, 3.122f, -2.74f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.046f, 0.176f)
                close()
            }
        }.build()
        
        return _PresentationChartLine!!
    }

private var _PresentationChartLine: ImageVector? = null

