package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Directions_run: ImageVector
    get() {
        if (_Directions_run != null) return _Directions_run!!
        
        _Directions_run = ImageVector.Builder(
            name = "directions_run",
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
                moveTo(13.49f, 5.48f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveToRelative(-3.17f, 12f)
                lineToRelative(0.57f, -2.5f)
                lineToRelative(2.1f, 2f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5.64f)
                curveToRelative(0f, -0.55f, -0.22f, -1.07f, -0.62f, -1.45f)
                lineToRelative(-1.48f, -1.41f)
                lineToRelative(0.6f, -3f)
                curveToRelative(1.07f, 1.24f, 2.62f, 2.13f, 4.36f, 2.41f)
                curveToRelative(0.6f, 0.09f, 1.14f, -0.39f, 1.14f, -1f)
                curveToRelative(0f, -0.49f, -0.36f, -0.9f, -0.85f, -0.98f)
                curveToRelative(-1.52f, -0.25f, -2.78f, -1.15f, -3.45f, -2.33f)
                lineToRelative(-1f, -1.6f)
                curveToRelative(-0.4f, -0.6f, -1f, -1f, -1.7f, -1f)
                curveToRelative(-0.3f, 0f, -0.5f, 0.1f, -0.8f, 0.1f)
                lineTo(7.21f, 7.76f)
                curveToRelative(-0.74f, 0.32f, -1.22f, 1.04f, -1.22f, 1.85f)
                verticalLineToRelative(2.37f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.4f)
                lineToRelative(1.8f, -0.7f)
                lineToRelative(-1.6f, 8.1f)
                lineToRelative(-3.92f, -0.8f)
                curveToRelative(-0.54f, -0.11f, -1.07f, 0.24f, -1.18f, 0.78f)
                verticalLineTo(17f)
                curveToRelative(-0.11f, 0.54f, 0.24f, 1.07f, 0.78f, 1.18f)
                lineToRelative(4.11f, 0.82f)
                curveToRelative(1.06f, 0.21f, 2.1f, -0.46f, 2.34f, -1.52f)
                close()
            }
        }.build()
        
        return _Directions_run!!
    }

private var _Directions_run: ImageVector? = null

