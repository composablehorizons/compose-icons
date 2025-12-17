package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.CanadianMapleLeaf: ImageVector
    get() {
        if (_CanadianMapleLeaf != null) return _CanadianMapleLeaf!!
        
        _CanadianMapleLeaf = ImageVector.Builder(
            name = "canadian-maple-leaf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(383.8f, 351.7f)
                curveToRelative(2.5f, -2.5f, 105.2f, -92.4f, 105.2f, -92.4f)
                lineToRelative(-17.5f, -7.5f)
                curveToRelative(-10f, -4.9f, -7.4f, -11.5f, -5f, -17.4f)
                curveToRelative(2.4f, -7.6f, 20.1f, -67.3f, 20.1f, -67.3f)
                reflectiveCurveToRelative(-47.7f, 10f, -57.7f, 12.5f)
                curveToRelative(-7.5f, 2.4f, -10f, -2.5f, -12.5f, -7.5f)
                reflectiveCurveToRelative(-15f, -32.4f, -15f, -32.4f)
                reflectiveCurveToRelative(-52.6f, 59.9f, -55.1f, 62.3f)
                curveToRelative(-10f, 7.5f, -20.1f, 0f, -17.6f, -10f)
                curveToRelative(0f, -10f, 27.6f, -129.6f, 27.6f, -129.6f)
                reflectiveCurveToRelative(-30.1f, 17.4f, -40.1f, 22.4f)
                curveToRelative(-7.5f, 5f, -12.6f, 5f, -17.6f, -5f)
                curveTo(293.5f, 72.3f, 255.9f, 0f, 255.9f, 0f)
                reflectiveCurveToRelative(-37.5f, 72.3f, -42.5f, 79.8f)
                curveToRelative(-5f, 10f, -10f, 10f, -17.6f, 5f)
                curveToRelative(-10f, -5f, -40.1f, -22.4f, -40.1f, -22.4f)
                reflectiveCurveTo(183.3f, 182f, 183.3f, 192f)
                curveToRelative(2.5f, 10f, -7.5f, 17.5f, -17.6f, 10f)
                curveToRelative(-2.5f, -2.5f, -55.1f, -62.3f, -55.1f, -62.3f)
                reflectiveCurveTo(98.1f, 167f, 95.6f, 172f)
                reflectiveCurveToRelative(-5f, 9.9f, -12.5f, 7.5f)
                curveTo(73f, 177f, 25.4f, 167f, 25.4f, 167f)
                reflectiveCurveToRelative(17.6f, 59.7f, 20.1f, 67.3f)
                curveToRelative(2.4f, 6f, 5f, 12.5f, -5f, 17.4f)
                lineTo(23f, 259.3f)
                reflectiveCurveToRelative(102.6f, 89.9f, 105.2f, 92.4f)
                curveToRelative(5.1f, 5f, 10f, 7.5f, 5.1f, 22.5f)
                curveToRelative(-5.1f, 15f, -10.1f, 35.1f, -10.1f, 35.1f)
                reflectiveCurveToRelative(95.2f, -20.1f, 105.3f, -22.6f)
                curveToRelative(8.7f, -0.9f, 18.3f, 2.5f, 18.3f, 12.5f)
                reflectiveCurveTo(241f, 512f, 241f, 512f)
                horizontalLineToRelative(30f)
                reflectiveCurveToRelative(-5.8f, -102.7f, -5.8f, -112.8f)
                reflectiveCurveToRelative(9.5f, -13.4f, 18.4f, -12.5f)
                curveToRelative(10f, 2.5f, 105.2f, 22.6f, 105.2f, 22.6f)
                reflectiveCurveToRelative(-5f, -20.1f, -10f, -35.1f)
                reflectiveCurveToRelative(0f, -17.5f, 5f, -22.5f)
                close()
            }
        }.build()
        
        return _CanadianMapleLeaf!!
    }

private var _CanadianMapleLeaf: ImageVector? = null

