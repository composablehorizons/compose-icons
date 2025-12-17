package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.GooglePlus: ImageVector
    get() {
        if (_GooglePlus != null) return _GooglePlus!!
        
        _GooglePlus = ImageVector.Builder(
            name = "google-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 8f)
                curveTo(119.1f, 8f, 8f, 119.1f, 8f, 256f)
                reflectiveCurveTo(119.1f, 504f, 256f, 504f)
                reflectiveCurveTo(504f, 392.9f, 504f, 256f)
                reflectiveCurveTo(392.9f, 8f, 256f, 8f)
                close()
                moveTo(185.3f, 380f)
                arcToRelative(124f, 124f, 0f, false, true, 0f, -248f)
                curveToRelative(31.3f, 0f, 60.1f, 11f, 83f, 32.3f)
                lineToRelative(-33.6f, 32.6f)
                curveToRelative(-13.2f, -12.9f, -31.3f, -19.1f, -49.4f, -19.1f)
                curveToRelative(-42.9f, 0f, -77.2f, 35.5f, -77.2f, 78.1f)
                reflectiveCurveTo(142.3f, 334f, 185.3f, 334f)
                curveToRelative(32.6f, 0f, 64.9f, -19.1f, 70.1f, -53.3f)
                horizontalLineTo(185.3f)
                verticalLineTo(238.1f)
                horizontalLineTo(302.2f)
                arcToRelative(109.2f, 109.2f, 0f, false, true, 1.9f, 20.7f)
                curveToRelative(0f, 70.8f, -47.5f, 121.2f, -118.8f, 121.2f)
                close()
                moveTo(415.5f, 273.8f)
                verticalLineToRelative(35.5f)
                horizontalLineTo(380f)
                verticalLineTo(273.8f)
                horizontalLineTo(344.5f)
                verticalLineTo(238.3f)
                horizontalLineTo(380f)
                verticalLineTo(202.8f)
                horizontalLineToRelative(35.5f)
                verticalLineToRelative(35.5f)
                horizontalLineToRelative(35.2f)
                verticalLineToRelative(35.5f)
                close()
            }
        }.build()
        
        return _GooglePlus!!
    }

private var _GooglePlus: ImageVector? = null

