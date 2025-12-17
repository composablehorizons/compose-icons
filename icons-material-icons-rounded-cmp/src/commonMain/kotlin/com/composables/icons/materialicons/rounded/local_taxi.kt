package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Local_taxi: ImageVector
    get() {
        if (_Local_taxi != null) return _Local_taxi!!
        
        _Local_taxi = ImageVector.Builder(
            name = "local_taxi",
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
                moveTo(18.92f, 6.01f)
                curveTo(18.72f, 5.42f, 18.16f, 5f, 17.5f, 5f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineTo(6.5f)
                curveToRelative(-0.66f, 0f, -1.21f, 0.42f, -1.42f, 1.01f)
                lineToRelative(-1.97f, 5.67f)
                curveToRelative(-0.07f, 0.21f, -0.11f, 0.43f, -0.11f, 0.66f)
                verticalLineToRelative(7.16f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveTo(6f, 20.33f, 6f, 19.5f)
                verticalLineTo(19f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.82f, 0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.82f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-7.16f)
                curveToRelative(0f, -0.22f, -0.04f, -0.45f, -0.11f, -0.66f)
                lineToRelative(-1.97f, -5.67f)
                close()
                moveTo(6.5f, 16f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(5.67f, 13f, 6.5f, 13f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(7.33f, 16f, 6.5f, 16f)
                close()
                moveToRelative(11f, 0f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(5f, 11f)
                lineToRelative(1.5f, -4.5f)
                horizontalLineToRelative(11f)
                lineTo(19f, 11f)
                horizontalLineTo(5f)
                close()
            }
        }.build()
        
        return _Local_taxi!!
    }

private var _Local_taxi: ImageVector? = null

