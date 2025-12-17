package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Rockrms: ImageVector
    get() {
        if (_Rockrms != null) return _Rockrms!!
        
        _Rockrms = ImageVector.Builder(
            name = "rockrms",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(248f, 8f)
                curveTo(111f, 8f, 0f, 119f, 0f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                reflectiveCurveTo(385f, 8f, 248f, 8f)
                close()
                moveToRelative(157.4f, 419.5f)
                horizontalLineToRelative(-90f)
                lineToRelative(-112f, -131.3f)
                curveToRelative(-17.9f, -20.4f, -3.9f, -56.1f, 26.6f, -56.1f)
                horizontalLineToRelative(75.3f)
                lineToRelative(-84.6f, -99.3f)
                lineToRelative(-84.3f, 98.9f)
                horizontalLineToRelative(-90f)
                lineTo(193.5f, 67.2f)
                curveToRelative(14.4f, -18.4f, 41.3f, -17.3f, 54.5f, 0f)
                lineToRelative(157.7f, 185.1f)
                curveToRelative(19f, 22.8f, 2f, 57.2f, -27.6f, 56.1f)
                curveToRelative(-0.6f, 0f, -74.2f, 0.2f, -74.2f, 0.2f)
                lineToRelative(101.5f, 118.9f)
                close()
            }
        }.build()
        
        return _Rockrms!!
    }

private var _Rockrms: ImageVector? = null

