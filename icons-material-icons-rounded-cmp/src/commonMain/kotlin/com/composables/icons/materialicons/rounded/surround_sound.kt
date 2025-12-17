package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Surround_sound: ImageVector
    get() {
        if (_Surround_sound != null) return _Surround_sound!!
        
        _Surround_sound = ImageVector.Builder(
            name = "surround_sound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(7.11f, 16.89f)
                curveToRelative(-0.43f, 0.43f, -1.14f, 0.39f, -1.51f, -0.09f)
                curveTo(4.53f, 15.39f, 4f, 13.69f, 4f, 12f)
                reflectiveCurveToRelative(0.53f, -3.38f, 1.59f, -4.8f)
                curveToRelative(0.37f, -0.48f, 1.08f, -0.53f, 1.51f, -0.1f)
                curveToRelative(0.35f, 0.35f, 0.39f, 0.9f, 0.1f, 1.29f)
                curveTo(6.4f, 9.46f, 6f, 10.73f, 6f, 12f)
                reflectiveCurveToRelative(0.4f, 2.53f, 1.2f, 3.6f)
                curveToRelative(0.3f, 0.39f, 0.26f, 0.94f, -0.09f, 1.29f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveToRelative(4.9f, 0.9f)
                curveToRelative(-0.35f, -0.35f, -0.39f, -0.9f, -0.09f, -1.29f)
                curveTo(17.6f, 14.54f, 18f, 13.27f, 18f, 12f)
                reflectiveCurveToRelative(-0.4f, -2.53f, -1.2f, -3.6f)
                curveToRelative(-0.3f, -0.39f, -0.26f, -0.95f, 0.09f, -1.3f)
                curveToRelative(0.43f, -0.43f, 1.14f, -0.39f, 1.51f, 0.09f)
                curveToRelative(1.07f, 1.41f, 1.6f, 3.1f, 1.6f, 4.8f)
                curveToRelative(0f, 1.69f, -0.53f, 3.38f, -1.59f, 4.8f)
                curveToRelative(-0.37f, 0.49f, -1.08f, 0.54f, -1.51f, 0.11f)
                close()
                moveTo(12f, 10f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
            }
        }.build()
        
        return _Surround_sound!!
    }

private var _Surround_sound: ImageVector? = null

