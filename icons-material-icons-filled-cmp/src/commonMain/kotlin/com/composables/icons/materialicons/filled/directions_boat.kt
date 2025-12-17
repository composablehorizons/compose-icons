package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Directions_boat: ImageVector
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 21f)
                curveToRelative(-1.39f, 0f, -2.78f, -0.47f, -4f, -1.32f)
                curveToRelative(-2.44f, 1.71f, -5.56f, 1.71f, -8f, 0f)
                curveTo(6.78f, 20.53f, 5.39f, 21f, 4f, 21f)
                horizontalLineTo(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.38f, 0f, 2.74f, -0.35f, 4f, -0.99f)
                curveToRelative(2.52f, 1.29f, 5.48f, 1.29f, 8f, 0f)
                curveToRelative(1.26f, 0.65f, 2.62f, 0.99f, 4f, 0.99f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                close()
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
                moveTo(6f, 6f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3.97f)
                lineTo(12f, 8f)
                lineTo(6f, 9.97f)
                verticalLineTo(6f)
                close()
            }
        }.build()
        
        return _Directions_boat!!
    }

private var _Directions_boat: ImageVector? = null

