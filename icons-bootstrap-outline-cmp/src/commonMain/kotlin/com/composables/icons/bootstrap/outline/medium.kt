package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Medium: ImageVector
    get() {
        if (_Medium != null) return _Medium!!
        
        _Medium = ImageVector.Builder(
            name = "medium",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.025f, 8f)
                curveToRelative(0f, 2.485f, -2.02f, 4.5f, -4.513f, 4.5f)
                arcTo(4.506f, 4.506f, 0f, false, true, 0f, 8f)
                curveToRelative(0f, -2.486f, 2.02f, -4.5f, 4.512f, -4.5f)
                arcTo(4.506f, 4.506f, 0f, false, true, 9.025f, 8f)
                moveToRelative(4.95f, 0f)
                curveToRelative(0f, 2.34f, -1.01f, 4.236f, -2.256f, 4.236f)
                reflectiveCurveTo(9.463f, 10.339f, 9.463f, 8f)
                curveToRelative(0f, -2.34f, 1.01f, -4.236f, 2.256f, -4.236f)
                reflectiveCurveTo(13.975f, 5.661f, 13.975f, 8f)
                moveTo(16f, 8f)
                curveToRelative(0f, 2.096f, -0.355f, 3.795f, -0.794f, 3.795f)
                curveToRelative(-0.438f, 0f, -0.793f, -1.7f, -0.793f, -3.795f)
                curveToRelative(0f, -2.096f, 0.355f, -3.795f, 0.794f, -3.795f)
                curveToRelative(0.438f, 0f, 0.793f, 1.699f, 0.793f, 3.795f)
            }
        }.build()
        
        return _Medium!!
    }

private var _Medium: ImageVector? = null

