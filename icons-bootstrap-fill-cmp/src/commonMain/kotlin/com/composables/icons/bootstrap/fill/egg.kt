package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Egg: ImageVector
    get() {
        if (_Egg != null) return _Egg!!
        
        _Egg = ImageVector.Builder(
            name = "egg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 10f)
                arcToRelative(6f, 6f, 0f, false, true, -12f, 0f)
                curveTo(2f, 5.686f, 5f, 0f, 8f, 0f)
                reflectiveCurveToRelative(6f, 5.686f, 6f, 10f)
            }
        }.build()
        
        return _Egg!!
    }

private var _Egg: ImageVector? = null

