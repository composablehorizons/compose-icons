package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Elderly: ImageVector
    get() {
        if (_Elderly != null) return _Elderly!!
        
        _Elderly = ImageVector.Builder(
            name = "elderly",
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
                moveTo(11.5f, 3.5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveTo(11.5f, 4.6f, 11.5f, 3.5f)
                close()
                moveTo(18.53f, 11f)
                curveToRelative(-1.57f, 0.01f, -2.94f, -0.9f, -3.6f, -2.21f)
                lineToRelative(-0.79f, -1.67f)
                lineToRelative(0f, 0f)
                curveToRelative(-0.17f, -0.35f, -0.44f, -0.65f, -0.8f, -0.85f)
                curveToRelative(-0.62f, -0.36f, -1.35f, -0.34f, -1.94f, -0.03f)
                lineToRelative(0f, -0.01f)
                lineTo(7.01f, 8.73f)
                curveTo(6.39f, 9.08f, 6f, 9.74f, 6f, 10.46f)
                verticalLineTo(13f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.54f)
                lineToRelative(1.5f, -0.85f)
                curveTo(9.18f, 10.71f, 9f, 11.85f, 9f, 13f)
                verticalLineToRelative(5.33f)
                lineTo(7f, 21f)
                curveToRelative(-0.33f, 0.44f, -0.24f, 1.07f, 0.2f, 1.4f)
                curveToRelative(0.44f, 0.33f, 1.07f, 0.24f, 1.4f, -0.2f)
                lineToRelative(2.04f, -2.72f)
                curveToRelative(0.23f, -0.31f, 0.37f, -0.69f, 0.4f, -1.08f)
                lineToRelative(0.18f, -2.94f)
                lineTo(13f, 18f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4.87f)
                curveToRelative(0f, -0.41f, -0.13f, -0.81f, -0.36f, -1.15f)
                lineToRelative(-1.6f, -2.29f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, -0.01f)
                curveToRelative(-0.11f, -1.16f, 0.07f, -2.32f, 0.46f, -3.4f)
                curveToRelative(0.81f, 1.23f, 2.05f, 2.14f, 3.51f, 2.52f)
                verticalLineToRelative(0.03f)
                verticalLineTo(13f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveTo(18f, 13.28f, 18f, 13f)
                verticalLineToRelative(-0.16f)
                verticalLineTo(12.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-10f)
                curveTo(20f, 11.68f, 19.34f, 10.99f, 18.53f, 11f)
                close()
            }
        }.build()
        
        return _Elderly!!
    }

private var _Elderly: ImageVector? = null

