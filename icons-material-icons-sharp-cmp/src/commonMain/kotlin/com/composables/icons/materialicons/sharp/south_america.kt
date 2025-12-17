package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.South_america: ImageVector
    get() {
        if (_South_america != null) return _South_america!!
        
        _South_america = ImageVector.Builder(
            name = "south_america",
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
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(4f, 12f)
                curveToRelative(0f, -1.95f, 0.7f, -3.74f, 1.87f, -5.13f)
                lineTo(9f, 10f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                verticalLineToRelative(5.59f)
                curveToRelative(0f, 0.27f, 0.11f, 0.52f, 0.29f, 0.71f)
                lineTo(12f, 20f)
                curveTo(7.58f, 20f, 4f, 16.42f, 4f, 12f)
                close()
                moveTo(13f, 19.94f)
                verticalLineTo(18f)
                lineToRelative(3.75f, -5.62f)
                curveToRelative(0.16f, -0.25f, 0.25f, -0.54f, 0.25f, -0.83f)
                verticalLineTo(10.5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(-1.4f, -1.75f)
                curveTo(12.72f, 7.28f, 12.15f, 7f, 11.54f, 7f)
                horizontalLineTo(8f)
                verticalLineTo(5.07f)
                curveTo(9.18f, 4.39f, 10.54f, 4f, 12f, 4f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                curveTo(20f, 16.07f, 16.94f, 19.44f, 13f, 19.94f)
                close()
            }
        }.build()
        
        return _South_america!!
    }

private var _South_america: ImageVector? = null

