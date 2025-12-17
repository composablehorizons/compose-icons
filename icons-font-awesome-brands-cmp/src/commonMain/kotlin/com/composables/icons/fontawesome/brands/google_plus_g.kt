package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.GooglePlusG: ImageVector
    get() {
        if (_GooglePlusG != null) return _GooglePlusG!!
        
        _GooglePlusG = ImageVector.Builder(
            name = "google-plus-g",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(386.061f, 228.496f)
                curveToRelative(1.834f, 9.692f, 3.143f, 19.384f, 3.143f, 31.956f)
                curveTo(389.204f, 370.205f, 315.599f, 448f, 204.8f, 448f)
                curveToRelative(-106.084f, 0f, -192f, -85.915f, -192f, -192f)
                reflectiveCurveToRelative(85.916f, -192f, 192f, -192f)
                curveToRelative(51.864f, 0f, 95.083f, 18.859f, 128.611f, 50.292f)
                lineToRelative(-52.126f, 50.03f)
                curveToRelative(-14.145f, -13.621f, -39.028f, -29.599f, -76.485f, -29.599f)
                curveToRelative(-65.484f, 0f, -118.92f, 54.221f, -118.92f, 121.277f)
                curveToRelative(0f, 67.056f, 53.436f, 121.277f, 118.92f, 121.277f)
                curveToRelative(75.961f, 0f, 104.513f, -54.745f, 108.965f, -82.773f)
                horizontalLineTo(204.8f)
                verticalLineToRelative(-66.009f)
                horizontalLineToRelative(181.261f)
                close()
                moveToRelative(185.406f, 6.437f)
                verticalLineTo(179.2f)
                horizontalLineToRelative(-56.001f)
                verticalLineToRelative(55.733f)
                horizontalLineToRelative(-55.733f)
                verticalLineToRelative(56.001f)
                horizontalLineToRelative(55.733f)
                verticalLineToRelative(55.733f)
                horizontalLineToRelative(56.001f)
                verticalLineToRelative(-55.733f)
                horizontalLineTo(627.2f)
                verticalLineToRelative(-56.001f)
                horizontalLineToRelative(-55.733f)
                close()
            }
        }.build()
        
        return _GooglePlusG!!
    }

private var _GooglePlusG: ImageVector? = null

