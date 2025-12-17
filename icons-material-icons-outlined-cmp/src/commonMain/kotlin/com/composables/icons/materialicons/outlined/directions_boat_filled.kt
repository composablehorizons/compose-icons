package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Directions_boat_filled: ImageVector
    get() {
        if (_Directions_boat_filled != null) return _Directions_boat_filled!!
        
        _Directions_boat_filled = ImageVector.Builder(
            name = "directions_boat_filled",
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
                moveTo(19.77f, 12.66f)
                lineToRelative(-1.12f, 3.97f)
                curveToRelative(-0.78f, -0.43f, -1.07f, -0.86f, -2.65f, -2.67f)
                curveTo(14.4f, 15.78f, 13.57f, 17f, 12f, 17f)
                curveToRelative(-1.53f, 0f, -2.34f, -1.15f, -4f, -3.04f)
                curveToRelative(-1.6f, 1.82f, -1.87f, 2.21f, -2.65f, 2.65f)
                lineToRelative(-1.13f, -3.96f)
                lineTo(12f, 10.11f)
                lineTo(19.77f, 12.66f)
                close()
                moveTo(15f, 1f)
                horizontalLineTo(9f)
                verticalLineToRelative(3f)
                horizontalLineTo(6f)
                curveTo(4.9f, 4f, 4f, 4.9f, 4f, 6f)
                verticalLineToRelative(4.62f)
                lineToRelative(-1.29f, 0.42f)
                curveToRelative(-0.63f, 0.19f, -0.81f, 0.84f, -0.66f, 1.28f)
                lineTo(3.95f, 19f)
                horizontalLineTo(4f)
                curveToRelative(1.6f, 0f, 3.02f, -0.88f, 4f, -2f)
                curveToRelative(0.98f, 1.12f, 2.4f, 2f, 4f, 2f)
                reflectiveCurveToRelative(3.02f, -0.88f, 4f, -2f)
                curveToRelative(0.98f, 1.12f, 2.4f, 2f, 4f, 2f)
                horizontalLineToRelative(0.05f)
                lineToRelative(1.91f, -6.68f)
                curveToRelative(0.11f, -0.37f, 0.04f, -1.06f, -0.66f, -1.28f)
                lineTo(20f, 10.62f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3f)
                verticalLineTo(1f)
                lineTo(15f, 1f)
                close()
                moveTo(6f, 9.97f)
                verticalLineTo(6f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3.97f)
                lineTo(12f, 8f)
                lineTo(6f, 9.97f)
                lineTo(6f, 9.97f)
                close()
                moveTo(16f, 19.68f)
                curveToRelative(-1.22f, 0.85f, -2.61f, 1.28f, -4f, 1.28f)
                reflectiveCurveToRelative(-2.78f, -0.43f, -4f, -1.28f)
                curveTo(6.78f, 20.53f, 5.39f, 21f, 4f, 21f)
                horizontalLineTo(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.38f, 0f, 2.74f, -0.35f, 4f, -0.99f)
                curveToRelative(1.26f, 0.64f, 2.63f, 0.97f, 4f, 0.97f)
                reflectiveCurveToRelative(2.74f, -0.32f, 4f, -0.97f)
                curveToRelative(1.26f, 0.65f, 2.62f, 0.99f, 4f, 0.99f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                curveTo(18.61f, 21f, 17.22f, 20.53f, 16f, 19.68f)
                lineTo(16f, 19.68f)
                close()
            }
        }.build()
        
        return _Directions_boat_filled!!
    }

private var _Directions_boat_filled: ImageVector? = null

