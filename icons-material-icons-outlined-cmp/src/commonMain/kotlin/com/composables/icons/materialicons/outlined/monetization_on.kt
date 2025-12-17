package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Monetization_on: ImageVector
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
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                close()
                moveToRelative(0f, 18f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                reflectiveCurveToRelative(3.59f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                close()
                moveToRelative(0.31f, -8.86f)
                curveToRelative(-1.77f, -0.45f, -2.34f, -0.94f, -2.34f, -1.67f)
                curveToRelative(0f, -0.84f, 0.79f, -1.43f, 2.1f, -1.43f)
                curveToRelative(1.38f, 0f, 1.9f, 0.66f, 1.94f, 1.64f)
                horizontalLineToRelative(1.71f)
                curveToRelative(-0.05f, -1.34f, -0.87f, -2.57f, -2.49f, -2.97f)
                verticalLineTo(5f)
                horizontalLineTo(10.9f)
                verticalLineToRelative(1.69f)
                curveToRelative(-1.51f, 0.32f, -2.72f, 1.3f, -2.72f, 2.81f)
                curveToRelative(0f, 1.79f, 1.49f, 2.69f, 3.66f, 3.21f)
                curveToRelative(1.95f, 0.46f, 2.34f, 1.15f, 2.34f, 1.87f)
                curveToRelative(0f, 0.53f, -0.39f, 1.39f, -2.1f, 1.39f)
                curveToRelative(-1.6f, 0f, -2.23f, -0.72f, -2.32f, -1.64f)
                horizontalLineTo(8.04f)
                curveToRelative(0.1f, 1.7f, 1.36f, 2.66f, 2.86f, 2.97f)
                verticalLineTo(19f)
                horizontalLineToRelative(2.34f)
                verticalLineToRelative(-1.67f)
                curveToRelative(1.52f, -0.29f, 2.72f, -1.16f, 2.73f, -2.77f)
                curveToRelative(-0.01f, -2.2f, -1.9f, -2.96f, -3.66f, -3.42f)
                close()
            }
        }.build()
        
        return _Monetization_on!!
    }

private var _Monetization_on: ImageVector? = null

