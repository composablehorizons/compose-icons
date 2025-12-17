package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Exposure_zero: ImageVector
    get() {
        if (_Exposure_zero != null) return _Exposure_zero!!
        
        _Exposure_zero = ImageVector.Builder(
            name = "exposure_zero",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.14f, 12.5f)
                curveToRelative(0f, 1f, -0.1f, 1.85f, -0.3f, 2.55f)
                reflectiveCurveToRelative(-0.48f, 1.27f, -0.83f, 1.7f)
                curveToRelative(-0.36f, 0.44f, -0.79f, 0.75f, -1.3f, 0.95f)
                reflectiveCurveToRelative(-1.07f, 0.3f, -1.7f, 0.3f)
                curveToRelative(-0.62f, 0f, -1.18f, -0.1f, -1.69f, -0.3f)
                curveToRelative(-0.51f, -0.2f, -0.95f, -0.51f, -1.31f, -0.95f)
                reflectiveCurveToRelative(-0.65f, -1.01f, -0.85f, -1.7f)
                curveToRelative(-0.2f, -0.7f, -0.3f, -1.55f, -0.3f, -2.55f)
                verticalLineToRelative(-2.04f)
                curveToRelative(0f, -1f, 0.1f, -1.85f, 0.3f, -2.55f)
                curveToRelative(0.2f, -0.7f, 0.48f, -1.26f, 0.84f, -1.69f)
                curveToRelative(0.36f, -0.43f, 0.8f, -0.74f, 1.31f, -0.93f)
                curveTo(10.81f, 5.1f, 11.38f, 5f, 12f, 5f)
                curveToRelative(0.63f, 0f, 1.19f, 0.1f, 1.7f, 0.29f)
                curveToRelative(0.51f, 0.19f, 0.95f, 0.5f, 1.31f, 0.93f)
                curveToRelative(0.36f, 0.43f, 0.64f, 0.99f, 0.84f, 1.69f)
                curveToRelative(0.2f, 0.7f, 0.3f, 1.54f, 0.3f, 2.55f)
                verticalLineToRelative(2.04f)
                horizontalLineToRelative(-0.01f)
                close()
                moveToRelative(-2.11f, -2.36f)
                curveToRelative(0f, -0.64f, -0.05f, -1.18f, -0.13f, -1.62f)
                curveToRelative(-0.09f, -0.44f, -0.22f, -0.79f, -0.4f, -1.06f)
                curveToRelative(-0.17f, -0.27f, -0.39f, -0.46f, -0.64f, -0.58f)
                curveToRelative(-0.25f, -0.13f, -0.54f, -0.19f, -0.86f, -0.19f)
                reflectiveCurveToRelative(-0.61f, 0.06f, -0.86f, 0.18f)
                reflectiveCurveToRelative(-0.47f, 0.31f, -0.64f, 0.58f)
                reflectiveCurveToRelative(-0.31f, 0.62f, -0.4f, 1.06f)
                reflectiveCurveToRelative(-0.13f, 0.98f, -0.13f, 1.62f)
                verticalLineToRelative(2.67f)
                curveToRelative(0f, 0.64f, 0.05f, 1.18f, 0.14f, 1.62f)
                curveToRelative(0.09f, 0.45f, 0.23f, 0.81f, 0.4f, 1.09f)
                reflectiveCurveToRelative(0.39f, 0.48f, 0.64f, 0.61f)
                reflectiveCurveToRelative(0.54f, 0.19f, 0.87f, 0.19f)
                reflectiveCurveToRelative(0.62f, -0.06f, 0.87f, -0.19f)
                reflectiveCurveToRelative(0.46f, -0.33f, 0.63f, -0.61f)
                reflectiveCurveToRelative(0.3f, -0.64f, 0.39f, -1.09f)
                reflectiveCurveToRelative(0.13f, -0.99f, 0.13f, -1.62f)
                verticalLineToRelative(-2.66f)
                horizontalLineToRelative(-0.01f)
                close()
            }
        }.build()
        
        return _Exposure_zero!!
    }

private var _Exposure_zero: ImageVector? = null

