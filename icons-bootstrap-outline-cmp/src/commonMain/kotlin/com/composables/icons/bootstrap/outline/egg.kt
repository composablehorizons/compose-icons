package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Egg: ImageVector
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
                moveTo(8f, 15f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, -5f)
                curveToRelative(0f, -1.956f, 0.69f, -4.286f, 1.742f, -6.12f)
                curveToRelative(0.524f, -0.913f, 1.112f, -1.658f, 1.704f, -2.164f)
                curveTo(7.044f, 1.206f, 7.572f, 1f, 8f, 1f)
                reflectiveCurveToRelative(0.956f, 0.206f, 1.554f, 0.716f)
                curveToRelative(0.592f, 0.506f, 1.18f, 1.251f, 1.704f, 2.164f)
                curveTo(12.31f, 5.714f, 13f, 8.044f, 13f, 10f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, 5f)
                moveToRelative(0f, 1f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, -6f)
                curveToRelative(0f, -4.314f, -3f, -10f, -6f, -10f)
                reflectiveCurveTo(2f, 5.686f, 2f, 10f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, 6f)
            }
        }.build()
        
        return _Egg!!
    }

private var _Egg: ImageVector? = null

