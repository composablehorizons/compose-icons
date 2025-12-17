package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Genderless: ImageVector
    get() {
        if (_Genderless != null) return _Genderless!!
        
        _Genderless = ImageVector.Builder(
            name = "genderless",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 288f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(144f, 176f)
                curveToRelative(44.1f, 0f, 80f, 35.9f, 80f, 80f)
                reflectiveCurveToRelative(-35.9f, 80f, -80f, 80f)
                reflectiveCurveToRelative(-80f, -35.9f, -80f, -80f)
                reflectiveCurveToRelative(35.9f, -80f, 80f, -80f)
                moveToRelative(0f, -64f)
                curveTo(64.5f, 112f, 0f, 176.5f, 0f, 256f)
                reflectiveCurveToRelative(64.5f, 144f, 144f, 144f)
                reflectiveCurveToRelative(144f, -64.5f, 144f, -144f)
                reflectiveCurveToRelative(-64.5f, -144f, -144f, -144f)
                close()
            }
        }.build()
        
        return _Genderless!!
    }

private var _Genderless: ImageVector? = null

