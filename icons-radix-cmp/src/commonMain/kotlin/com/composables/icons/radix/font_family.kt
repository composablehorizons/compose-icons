package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.FontFamily: ImageVector
    get() {
        if (_FontFamily != null) return _FontFamily!!
        
        _FontFamily = ImageVector.Builder(
            name = "font-family",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.499f, 2f)
                curveTo(12.7752f, 2f, 13f, 2.22386f, 13f, 2.5f)
                curveTo(13f, 2.77613f, 12.7761f, 2.99999f, 12.5f, 3f)
                horizontalLineTo(8.69238f)
                lineTo(8.40527f, 3.85449f)
                curveTo(8.18888f, 4.4974f, 7.89414f, 5.37193f, 7.58105f, 6.29785f)
                curveTo(7.50275f, 6.52943f, 7.42349f, 6.76457f, 7.34375f, 7f)
                horizontalLineTo(8.5f)
                curveTo(8.77614f, 7f, 9f, 7.22386f, 9f, 7.5f)
                curveTo(9f, 7.77614f, 8.77614f, 8f, 8.5f, 8f)
                horizontalLineTo(7.00391f)
                curveTo(6.56708f, 9.28541f, 6.16437f, 10.4618f, 5.95801f, 11.0391f)
                curveTo(5.63631f, 11.9388f, 5.20662f, 12.4862f, 4.66699f, 12.7783f)
                curveTo(4.16329f, 13.0508f, 3.6418f, 13.0501f, 3.28418f, 13.0498f)
                horizontalLineTo(3.25f)
                curveTo(2.94625f, 13.0498f, 2.70021f, 12.8037f, 2.7002f, 12.5f)
                curveTo(2.7002f, 12.1962f, 2.94624f, 11.9502f, 3.25f, 11.9502f)
                curveTo(3.64173f, 11.9502f, 3.90336f, 11.9405f, 4.14355f, 11.8105f)
                curveTo(4.36424f, 11.6911f, 4.65502f, 11.4145f, 4.92188f, 10.668f)
                curveTo(5.10667f, 10.151f, 5.45342f, 9.14113f, 5.8418f, 8f)
                horizontalLineTo(4.5f)
                curveTo(4.22386f, 8f, 4f, 7.77614f, 4f, 7.5f)
                curveTo(4f, 7.22386f, 4.22386f, 7f, 4.5f, 7f)
                horizontalLineTo(6.18164f)
                curveTo(6.30105f, 6.64785f, 6.42151f, 6.29295f, 6.53906f, 5.94531f)
                curveTo(6.85186f, 5.02022f, 7.14604f, 4.14644f, 7.3623f, 3.50391f)
                lineTo(7.53223f, 3f)
                horizontalLineTo(5f)
                curveTo(4.15114f, 3f, 3.5f, 3.65114f, 3.5f, 4.5f)
                curveTo(3.5f, 4.77614f, 3.27614f, 5f, 3f, 5f)
                curveTo(2.72386f, 5f, 2.5f, 4.77614f, 2.5f, 4.5f)
                curveTo(2.5f, 3.09886f, 3.59886f, 2f, 5f, 2f)
                horizontalLineTo(12.499f)
                close()
            }
        }.build()
        
        return _FontFamily!!
    }

private var _FontFamily: ImageVector? = null

