package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Cuttlefish: ImageVector
    get() {
        if (_Cuttlefish != null) return _Cuttlefish!!
        
        _Cuttlefish = ImageVector.Builder(
            name = "cuttlefish",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 440f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(344f, 305.5f)
                curveToRelative(-17.5f, 31.6f, -57.4f, 54.5f, -96f, 54.5f)
                curveToRelative(-56.6f, 0f, -104f, -47.4f, -104f, -104f)
                reflectiveCurveToRelative(47.4f, -104f, 104f, -104f)
                curveToRelative(38.6f, 0f, 78.5f, 22.9f, 96f, 54.5f)
                curveToRelative(13.7f, -50.9f, 41.7f, -93.3f, 87f, -117.8f)
                curveTo(385.7f, 39.1f, 320.5f, 8f, 248f, 8f)
                curveTo(111f, 8f, 0f, 119f, 0f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                curveToRelative(72.5f, 0f, 137.7f, -31.1f, 183f, -80.7f)
                curveToRelative(-45.3f, -24.5f, -73.3f, -66.9f, -87f, -117.8f)
                close()
            }
        }.build()
        
        return _Cuttlefish!!
    }

private var _Cuttlefish: ImageVector? = null

