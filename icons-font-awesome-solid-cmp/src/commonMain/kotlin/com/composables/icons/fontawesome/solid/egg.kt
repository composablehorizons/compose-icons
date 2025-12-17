package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Egg: ImageVector
    get() {
        if (_Egg != null) return _Egg!!
        
        _Egg = ImageVector.Builder(
            name = "egg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(192f, 0f)
                curveTo(86f, 0f, 0f, 214f, 0f, 320f)
                reflectiveCurveToRelative(86f, 192f, 192f, 192f)
                reflectiveCurveToRelative(192f, -86f, 192f, -192f)
                reflectiveCurveTo(298f, 0f, 192f, 0f)
                close()
            }
        }.build()
        
        return _Egg!!
    }

private var _Egg: ImageVector? = null

