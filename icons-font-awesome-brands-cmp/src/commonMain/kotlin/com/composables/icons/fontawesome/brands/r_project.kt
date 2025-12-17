package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.RProject: ImageVector
    get() {
        if (_RProject != null) return _RProject!!
        
        _RProject = ImageVector.Builder(
            name = "r-project",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 581f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(581f, 226.6f)
                curveTo(581f, 119.1f, 450.9f, 32f, 290.5f, 32f)
                reflectiveCurveTo(0f, 119.1f, 0f, 226.6f)
                curveTo(0f, 322.4f, 103.3f, 402f, 239.4f, 418.1f)
                verticalLineTo(480f)
                horizontalLineToRelative(99.1f)
                verticalLineToRelative(-61.5f)
                curveToRelative(24.3f, -2.7f, 47.6f, -7.4f, 69.4f, -13.9f)
                lineTo(448f, 480f)
                horizontalLineToRelative(112f)
                lineToRelative(-67.4f, -113.7f)
                curveToRelative(54.5f, -35.4f, 88.4f, -84.9f, 88.4f, -139.7f)
                close()
                moveToRelative(-466.8f, 14.5f)
                curveToRelative(0f, -73.5f, 98.9f, -133f, 220.8f, -133f)
                reflectiveCurveToRelative(211.9f, 40.7f, 211.9f, 133f)
                curveToRelative(0f, 50.1f, -26.5f, 85f, -70.3f, 106.4f)
                curveToRelative(-2.4f, -1.6f, -4.7f, -2.9f, -6.4f, -3.7f)
                curveToRelative(-10.2f, -5.2f, -27.8f, -10.5f, -27.8f, -10.5f)
                reflectiveCurveToRelative(86.6f, -6.4f, 86.6f, -92.7f)
                reflectiveCurveToRelative(-90.6f, -87.9f, -90.6f, -87.9f)
                horizontalLineToRelative(-199f)
                verticalLineTo(361f)
                curveToRelative(-74.1f, -21.5f, -125.2f, -67.1f, -125.2f, -119.9f)
                close()
                moveToRelative(225.1f, 38.3f)
                verticalLineToRelative(-55.6f)
                curveToRelative(57.8f, 0f, 87.8f, -6.8f, 87.8f, 27.3f)
                curveToRelative(0f, 36.5f, -38.2f, 28.3f, -87.8f, 28.3f)
                close()
                moveToRelative(-0.9f, 72.5f)
                horizontalLineTo(365f)
                curveToRelative(10.8f, 0f, 18.9f, 11.7f, 24f, 19.2f)
                curveToRelative(-16.1f, 1.9f, -33f, 2.8f, -50.6f, 2.9f)
                verticalLineToRelative(-22.1f)
                close()
            }
        }.build()
        
        return _RProject!!
    }

private var _RProject: ImageVector? = null

