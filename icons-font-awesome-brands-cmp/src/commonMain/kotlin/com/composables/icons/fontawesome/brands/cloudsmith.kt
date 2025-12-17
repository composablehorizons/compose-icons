package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Cloudsmith: ImageVector
    get() {
        if (_Cloudsmith != null) return _Cloudsmith!!
        
        _Cloudsmith = ImageVector.Builder(
            name = "cloudsmith",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 332f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(332.5f, 419.9f)
                curveToRelative(0f, 46.4f, -37.6f, 84.1f, -84f, 84.1f)
                reflectiveCurveToRelative(-84f, -37.7f, -84f, -84.1f)
                reflectiveCurveToRelative(37.6f, -84f, 84f, -84f)
                reflectiveCurveToRelative(84f, 37.6f, 84f, 84f)
                close()
                moveToRelative(-84f, -243.9f)
                curveToRelative(46.4f, 0f, 80f, -37.6f, 80f, -84f)
                reflectiveCurveToRelative(-33.6f, -84f, -80f, -84f)
                reflectiveCurveToRelative(-88f, 37.6f, -88f, 84f)
                reflectiveCurveToRelative(-29.6f, 76f, -76f, 76f)
                reflectiveCurveToRelative(-84f, 41.6f, -84f, 88f)
                reflectiveCurveToRelative(37.6f, 80f, 84f, 80f)
                reflectiveCurveToRelative(84f, -33.6f, 84f, -80f)
                reflectiveCurveToRelative(33.6f, -80f, 80f, -80f)
                close()
            }
        }.build()
        
        return _Cloudsmith!!
    }

private var _Cloudsmith: ImageVector? = null

