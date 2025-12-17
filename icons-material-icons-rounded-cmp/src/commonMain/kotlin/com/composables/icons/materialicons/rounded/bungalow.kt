package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Bungalow: ImageVector
    get() {
        if (_Bungalow != null) return _Bungalow!!
        
        _Bungalow = ImageVector.Builder(
            name = "bungalow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 16f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5.21f)
                lineToRelative(0.57f, 0.92f)
                curveToRelative(0.29f, 0.47f, 0.91f, 0.61f, 1.38f, 0.32f)
                curveToRelative(0.47f, -0.29f, 0.61f, -0.91f, 0.32f, -1.38f)
                lineTo(12.85f, 4.36f)
                curveToRelative(-0.39f, -0.63f, -1.31f, -0.63f, -1.7f, 0f)
                lineTo(4.73f, 14.65f)
                curveToRelative(-0.29f, 0.47f, -0.15f, 1.09f, 0.32f, 1.38f)
                curveToRelative(0.47f, 0.29f, 1.08f, 0.15f, 1.38f, -0.32f)
                lineTo(7f, 14.8f)
                verticalLineTo(20f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                curveTo(11f, 16.45f, 11.45f, 16f, 12f, 16f)
                close()
                moveTo(13f, 13f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveTo(13f, 12.45f, 13f, 13f)
                close()
            }
        }.build()
        
        return _Bungalow!!
    }

private var _Bungalow: ImageVector? = null

