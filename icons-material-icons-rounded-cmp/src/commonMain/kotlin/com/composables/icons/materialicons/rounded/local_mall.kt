package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Local_mall: ImageVector
    get() {
        if (_Local_mall != null) return _Local_mall!!
        
        _Local_mall = ImageVector.Builder(
            name = "local_mall",
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
                moveTo(19f, 6f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveTo(7f, 3.24f, 7f, 6f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-7f, -3f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                horizontalLineTo(9f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                close()
                moveToRelative(0f, 10f)
                curveToRelative(-2.33f, 0f, -4.29f, -1.59f, -4.84f, -3.75f)
                curveToRelative(-0.17f, -0.63f, 0.32f, -1.25f, 0.97f, -1.25f)
                curveToRelative(0.47f, 0f, 0.85f, 0.34f, 0.98f, 0.8f)
                curveToRelative(0.35f, 1.27f, 1.51f, 2.2f, 2.89f, 2.2f)
                reflectiveCurveToRelative(2.54f, -0.93f, 2.89f, -2.2f)
                curveToRelative(0.13f, -0.46f, 0.51f, -0.8f, 0.98f, -0.8f)
                curveToRelative(0.65f, 0f, 1.13f, 0.62f, 0.97f, 1.25f)
                curveTo(16.29f, 11.41f, 14.33f, 13f, 12f, 13f)
                close()
            }
        }.build()
        
        return _Local_mall!!
    }

private var _Local_mall: ImageVector? = null

