package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Monetization_on: ImageVector
    get() {
        if (_Monetization_on != null) return _Monetization_on!!
        
        _Monetization_on = ImageVector.Builder(
            name = "monetization_on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                close()
                moveToRelative(1.41f, 16.09f)
                verticalLineTo(20f)
                horizontalLineToRelative(-2.67f)
                verticalLineToRelative(-1.93f)
                curveToRelative(-1.71f, -0.36f, -3.16f, -1.46f, -3.27f, -3.4f)
                horizontalLineToRelative(1.96f)
                curveToRelative(0.1f, 1.05f, 0.82f, 1.87f, 2.65f, 1.87f)
                curveToRelative(1.96f, 0f, 2.4f, -0.98f, 2.4f, -1.59f)
                curveToRelative(0f, -0.83f, -0.44f, -1.61f, -2.67f, -2.14f)
                curveToRelative(-2.48f, -0.6f, -4.18f, -1.62f, -4.18f, -3.67f)
                curveToRelative(0f, -1.72f, 1.39f, -2.84f, 3.11f, -3.21f)
                verticalLineTo(4f)
                horizontalLineToRelative(2.67f)
                verticalLineToRelative(1.95f)
                curveToRelative(1.86f, 0.45f, 2.79f, 1.86f, 2.85f, 3.39f)
                horizontalLineTo(14.3f)
                curveToRelative(-0.05f, -1.11f, -0.64f, -1.87f, -2.22f, -1.87f)
                curveToRelative(-1.5f, 0f, -2.4f, 0.68f, -2.4f, 1.64f)
                curveToRelative(0f, 0.84f, 0.65f, 1.39f, 2.67f, 1.91f)
                reflectiveCurveToRelative(4.18f, 1.39f, 4.18f, 3.91f)
                curveToRelative(-0.01f, 1.83f, -1.38f, 2.83f, -3.12f, 3.16f)
                close()
            }
        }.build()
        
        return _Monetization_on!!
    }

private var _Monetization_on: ImageVector? = null

