package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Gratipay: ImageVector
    get() {
        if (_Gratipay != null) return _Gratipay!!
        
        _Gratipay = ImageVector.Builder(
            name = "gratipay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(248f, 8f)
                curveTo(111.1f, 8f, 0f, 119.1f, 0f, 256f)
                reflectiveCurveToRelative(111.1f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111.1f, 248f, -248f)
                reflectiveCurveTo(384.9f, 8f, 248f, 8f)
                close()
                moveToRelative(114.6f, 226.4f)
                lineToRelative(-113f, 152.7f)
                lineToRelative(-112.7f, -152.7f)
                curveToRelative(-8.7f, -11.9f, -19.1f, -50.4f, 13.6f, -72f)
                curveToRelative(28.1f, -18.1f, 54.6f, -4.2f, 68.5f, 11.9f)
                curveToRelative(15.9f, 17.9f, 46.6f, 16.9f, 61.7f, 0f)
                curveToRelative(13.9f, -16.1f, 40.4f, -30f, 68.1f, -11.9f)
                curveToRelative(32.9f, 21.6f, 22.6f, 60f, 13.8f, 72f)
                close()
            }
        }.build()
        
        return _Gratipay!!
    }

private var _Gratipay: ImageVector? = null

