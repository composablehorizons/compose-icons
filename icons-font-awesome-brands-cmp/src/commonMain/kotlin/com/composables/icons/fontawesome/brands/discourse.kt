package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Discourse: ImageVector
    get() {
        if (_Discourse != null) return _Discourse!!
        
        _Discourse = ImageVector.Builder(
            name = "discourse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(225.9f, 32f)
                curveTo(103.3f, 32f, 0f, 130.5f, 0f, 252.1f)
                curveTo(0f, 256f, 0.1f, 480f, 0.1f, 480f)
                lineToRelative(225.8f, -0.2f)
                curveToRelative(122.7f, 0f, 222.1f, -102.3f, 222.1f, -223.9f)
                curveTo(448f, 134.3f, 348.6f, 32f, 225.9f, 32f)
                close()
                moveTo(224f, 384f)
                curveToRelative(-19.4f, 0f, -37.9f, -4.3f, -54.4f, -12.1f)
                lineTo(88.5f, 392f)
                lineToRelative(22.9f, -75f)
                curveToRelative(-9.8f, -18.1f, -15.4f, -38.9f, -15.4f, -61f)
                curveToRelative(0f, -70.7f, 57.3f, -128f, 128f, -128f)
                reflectiveCurveToRelative(128f, 57.3f, 128f, 128f)
                reflectiveCurveToRelative(-57.3f, 128f, -128f, 128f)
                close()
            }
        }.build()
        
        return _Discourse!!
    }

private var _Discourse: ImageVector? = null

