package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Elderly: ImageVector
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
                moveTo(13.5f, 5.5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveTo(12.4f, 5.5f, 13.5f, 5.5f)
                close()
                moveTo(20f, 12.5f)
                verticalLineTo(23f)
                horizontalLineToRelative(-1f)
                verticalLineTo(12.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveTo(18f, 12.22f, 18f, 12.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-0.69f)
                curveToRelative(-1.46f, -0.38f, -2.7f, -1.29f, -3.51f, -2.52f)
                curveTo(13.18f, 11.16f, 13f, 12.07f, 13f, 13f)
                curveToRelative(0f, 0.23f, 0.02f, 0.46f, 0.03f, 0.69f)
                lineTo(15f, 16.5f)
                verticalLineTo(23f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                lineToRelative(-1.78f, -2.54f)
                lineTo(11f, 19f)
                lineToRelative(-3f, 4f)
                lineToRelative(-1.6f, -1.2f)
                lineTo(9f, 18.33f)
                verticalLineTo(13f)
                curveToRelative(0f, -1.15f, 0.18f, -2.29f, 0.5f, -3.39f)
                lineTo(8f, 10.46f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(9.3f)
                lineToRelative(5.4f, -3.07f)
                lineToRelative(0f, 0.01f)
                curveToRelative(0.59f, -0.31f, 1.32f, -0.33f, 1.94f, 0.03f)
                curveToRelative(0.36f, 0.21f, 0.63f, 0.51f, 0.8f, 0.85f)
                lineToRelative(0f, 0f)
                lineToRelative(0.79f, 1.67f)
                curveTo(15.58f, 10.1f, 16.94f, 11f, 18.5f, 11f)
                curveTo(19.33f, 11f, 20f, 11.67f, 20f, 12.5f)
                close()
            }
        }.build()
        
        return _Elderly!!
    }

private var _Elderly: ImageVector? = null

