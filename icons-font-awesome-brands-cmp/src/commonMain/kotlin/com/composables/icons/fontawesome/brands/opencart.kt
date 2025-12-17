package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Opencart: ImageVector
    get() {
        if (_Opencart != null) return _Opencart!!
        
        _Opencart = ImageVector.Builder(
            name = "opencart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(423.3f, 440.7f)
                curveToRelative(0f, 25.3f, -20.3f, 45.6f, -45.6f, 45.6f)
                reflectiveCurveToRelative(-45.8f, -20.3f, -45.8f, -45.6f)
                reflectiveCurveToRelative(20.6f, -45.8f, 45.8f, -45.8f)
                curveToRelative(25.4f, 0f, 45.6f, 20.5f, 45.6f, 45.8f)
                close()
                moveToRelative(-253.9f, -45.8f)
                curveToRelative(-25.3f, 0f, -45.6f, 20.6f, -45.6f, 45.8f)
                reflectiveCurveToRelative(20.3f, 45.6f, 45.6f, 45.6f)
                reflectiveCurveToRelative(45.8f, -20.3f, 45.8f, -45.6f)
                reflectiveCurveToRelative(-20.5f, -45.8f, -45.8f, -45.8f)
                close()
                moveToRelative(291.7f, -270f)
                curveTo(158.9f, 124.9f, 81.9f, 112.1f, 0f, 25.7f)
                curveToRelative(34.4f, 51.7f, 53.3f, 148.9f, 373.1f, 144.2f)
                curveToRelative(333.3f, -5f, 130f, 86.1f, 70.8f, 188.9f)
                curveToRelative(186.7f, -166.7f, 319.4f, -233.9f, 17.2f, -233.9f)
                close()
            }
        }.build()
        
        return _Opencart!!
    }

private var _Opencart: ImageVector? = null

