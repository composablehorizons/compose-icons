package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Drive_eta: ImageVector
    get() {
        if (_Drive_eta != null) return _Drive_eta!!
        
        _Drive_eta = ImageVector.Builder(
            name = "drive_eta",
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
                moveTo(18.92f, 5.01f)
                curveTo(18.72f, 4.42f, 18.16f, 4f, 17.5f, 4f)
                horizontalLineToRelative(-11f)
                curveToRelative(-0.66f, 0f, -1.21f, 0.42f, -1.42f, 1.01f)
                lineToRelative(-1.97f, 5.67f)
                curveToRelative(-0.07f, 0.21f, -0.11f, 0.43f, -0.11f, 0.66f)
                verticalLineToRelative(7.16f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveTo(6f, 19.33f, 6f, 18.5f)
                verticalLineTo(18f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.82f, 0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.82f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-7.16f)
                curveToRelative(0f, -0.22f, -0.04f, -0.45f, -0.11f, -0.66f)
                lineToRelative(-1.97f, -5.67f)
                close()
                moveTo(6.5f, 15f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(5.67f, 12f, 6.5f, 12f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(7.33f, 15f, 6.5f, 15f)
                close()
                moveToRelative(11f, 0f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(5f, 10f)
                lineToRelative(1.27f, -3.82f)
                curveToRelative(0.14f, -0.4f, 0.52f, -0.68f, 0.95f, -0.68f)
                horizontalLineToRelative(9.56f)
                curveToRelative(0.43f, 0f, 0.81f, 0.28f, 0.95f, 0.68f)
                lineTo(19f, 10f)
                horizontalLineTo(5f)
                close()
            }
        }.build()
        
        return _Drive_eta!!
    }

private var _Drive_eta: ImageVector? = null

