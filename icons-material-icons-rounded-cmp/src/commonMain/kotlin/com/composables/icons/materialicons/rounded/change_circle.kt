package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Change_circle: ImageVector
    get() {
        if (_Change_circle != null) return _Change_circle!!
        
        _Change_circle = ImageVector.Builder(
            name = "change_circle",
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
                moveTo(12.91f, 18.15f)
                curveToRelative(-0.31f, 0.31f, -0.85f, 0.09f, -0.85f, -0.35f)
                verticalLineToRelative(-0.8f)
                curveToRelative(-0.02f, 0f, -0.04f, 0f, -0.06f, 0f)
                curveToRelative(-1.28f, 0f, -2.56f, -0.49f, -3.54f, -1.46f)
                curveToRelative(-1.43f, -1.43f, -1.81f, -3.52f, -1.14f, -5.3f)
                curveToRelative(0.19f, -0.51f, 0.86f, -0.64f, 1.24f, -0.25f)
                lineToRelative(0f, 0f)
                curveToRelative(0.22f, 0.22f, 0.27f, 0.54f, 0.17f, 0.82f)
                curveToRelative(-0.46f, 1.24f, -0.2f, 2.68f, 0.8f, 3.68f)
                curveToRelative(0.7f, 0.7f, 1.62f, 1.03f, 2.54f, 1.01f)
                verticalLineToRelative(-0.94f)
                curveToRelative(0f, -0.45f, 0.54f, -0.67f, 0.85f, -0.35f)
                lineToRelative(1.62f, 1.62f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                lineTo(12.91f, 18.15f)
                close()
                moveTo(15.44f, 14.02f)
                lineTo(15.44f, 14.02f)
                curveToRelative(-0.22f, -0.22f, -0.27f, -0.54f, -0.17f, -0.82f)
                curveToRelative(0.46f, -1.24f, 0.2f, -2.68f, -0.8f, -3.68f)
                curveToRelative(-0.7f, -0.7f, -1.62f, -1.04f, -2.53f, -1.02f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                verticalLineToRelative(0.94f)
                curveToRelative(0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.35f)
                lineTo(9.46f, 8.18f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(1.62f, -1.62f)
                curveToRelative(0.31f, -0.31f, 0.85f, -0.09f, 0.85f, 0.35f)
                verticalLineToRelative(0.81f)
                curveToRelative(1.3f, -0.02f, 2.61f, 0.45f, 3.6f, 1.45f)
                curveToRelative(1.43f, 1.43f, 1.81f, 3.52f, 1.14f, 5.3f)
                curveTo(16.48f, 14.28f, 15.82f, 14.41f, 15.44f, 14.02f)
                close()
            }
        }.build()
        
        return _Change_circle!!
    }

private var _Change_circle: ImageVector? = null

