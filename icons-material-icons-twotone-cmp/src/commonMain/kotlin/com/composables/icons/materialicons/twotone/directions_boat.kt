package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Directions_boat: ImageVector
    get() {
        if (_Directions_boat != null) return _Directions_boat!!
        
        _Directions_boat = ImageVector.Builder(
            name = "directions_boat",
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
                moveTo(6.49f, 15.68f)
                lineTo(8f, 13.96f)
                lineToRelative(1.51f, 1.72f)
                curveToRelative(0.34f, 0.4f, 1.28f, 1.32f, 2.49f, 1.32f)
                curveToRelative(1.21f, 0f, 2.15f, -0.92f, 2.49f, -1.32f)
                lineTo(16f, 13.96f)
                lineToRelative(1.51f, 1.72f)
                curveToRelative(0.2f, 0.23f, 0.6f, 0.64f, 1.14f, 0.94f)
                lineToRelative(1.12f, -3.97f)
                lineToRelative(-2.39f, -0.78f)
                lineTo(12f, 10.11f)
                lineToRelative(-5.38f, 1.77f)
                lineToRelative(-2.4f, 0.79f)
                lineToRelative(1.13f, 3.96f)
                curveToRelative(0.55f, -0.31f, 0.94f, -0.72f, 1.14f, -0.95f)
                close()
                moveTo(11f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.95f, 19f)
                horizontalLineTo(4f)
                curveToRelative(1.6f, 0f, 3.02f, -0.88f, 4f, -2f)
                curveToRelative(0.98f, 1.12f, 2.4f, 2f, 4f, 2f)
                reflectiveCurveToRelative(3.02f, -0.88f, 4f, -2f)
                curveToRelative(0.98f, 1.12f, 2.4f, 2f, 4f, 2f)
                horizontalLineToRelative(0.05f)
                lineToRelative(1.89f, -6.68f)
                curveToRelative(0.08f, -0.26f, 0.06f, -0.54f, -0.06f, -0.78f)
                reflectiveCurveToRelative(-0.34f, -0.42f, -0.6f, -0.5f)
                lineTo(20f, 10.62f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3f)
                verticalLineTo(1f)
                horizontalLineTo(9f)
                verticalLineToRelative(3f)
                horizontalLineTo(6f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(4.62f)
                lineToRelative(-1.29f, 0.42f)
                curveToRelative(-0.26f, 0.08f, -0.48f, 0.26f, -0.6f, 0.5f)
                reflectiveCurveToRelative(-0.15f, 0.52f, -0.06f, 0.78f)
                lineTo(3.95f, 19f)
                close()
                moveTo(11f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineTo(3f)
                close()
                moveTo(6f, 6f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3.97f)
                lineTo(12f, 8f)
                lineTo(6f, 9.97f)
                verticalLineTo(6f)
                close()
                moveToRelative(0.62f, 5.87f)
                lineTo(12f, 10.11f)
                lineToRelative(5.38f, 1.77f)
                lineToRelative(2.39f, 0.78f)
                lineToRelative(-1.12f, 3.97f)
                curveToRelative(-0.54f, -0.3f, -0.94f, -0.71f, -1.14f, -0.94f)
                lineTo(16f, 13.96f)
                lineToRelative(-1.51f, 1.72f)
                curveToRelative(-0.34f, 0.4f, -1.28f, 1.32f, -2.49f, 1.32f)
                curveToRelative(-1.21f, 0f, -2.15f, -0.92f, -2.49f, -1.32f)
                lineTo(8f, 13.96f)
                lineToRelative(-1.51f, 1.72f)
                curveToRelative(-0.2f, 0.23f, -0.6f, 0.63f, -1.14f, 0.93f)
                lineToRelative(-1.13f, -3.96f)
                lineToRelative(2.4f, -0.78f)
                close()
                moveTo(8f, 22.01f)
                curveToRelative(1.26f, 0.64f, 2.63f, 0.97f, 4f, 0.97f)
                reflectiveCurveToRelative(2.74f, -0.32f, 4f, -0.97f)
                curveToRelative(1.26f, 0.65f, 2.62f, 0.99f, 4f, 0.99f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.39f, 0f, -2.78f, -0.47f, -4f, -1.32f)
                curveToRelative(-1.22f, 0.85f, -2.61f, 1.28f, -4f, 1.28f)
                reflectiveCurveToRelative(-2.78f, -0.43f, -4f, -1.28f)
                curveTo(6.78f, 20.53f, 5.39f, 21f, 4f, 21f)
                horizontalLineTo(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.38f, 0f, 2.74f, -0.35f, 4f, -0.99f)
                close()
            }
        }.build()
        
        return _Directions_boat!!
    }

private var _Directions_boat: ImageVector? = null

