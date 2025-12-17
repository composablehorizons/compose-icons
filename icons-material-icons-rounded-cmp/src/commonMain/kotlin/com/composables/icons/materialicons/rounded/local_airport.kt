package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Local_airport: ImageVector
    get() {
        if (_Local_airport != null) return _Local_airport!!
        
        _Local_airport = ImageVector.Builder(
            name = "local_airport",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(21.48f, 13.7f)
                    lineTo(13.5f, 9f)
                    verticalLineTo(3.5f)
                    curveTo(13.5f, 2.67f, 12.83f, 2f, 12f, 2f)
                    curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                    verticalLineTo(9f)
                    lineToRelative(-7.98f, 4.7f)
                    curveTo(2.2f, 13.88f, 2f, 14.23f, 2f, 14.6f)
                    curveToRelative(0f, 0.7f, 0.67f, 1.2f, 1.34f, 1.01f)
                    lineToRelative(7.16f, -2.1f)
                    verticalLineTo(19f)
                    lineToRelative(-2.26f, 1.35f)
                    curveTo(8.09f, 20.44f, 8f, 20.61f, 8f, 20.78f)
                    lineToRelative(0f, 0.5f)
                    horizontalLineToRelative(0f)
                    verticalLineToRelative(0.08f)
                    curveToRelative(0f, 0.33f, 0.31f, 0.57f, 0.62f, 0.49f)
                    lineToRelative(2.92f, -0.73f)
                    lineTo(12f, 21f)
                    lineToRelative(0.38f, 0.09f)
                    curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                    lineToRelative(0.42f, 0.11f)
                    lineToRelative(1.9f, 0.48f)
                    lineToRelative(0f, 0f)
                    lineToRelative(0.67f, 0.17f)
                    curveToRelative(0.32f, 0.08f, 0.62f, -0.16f, 0.62f, -0.49f)
                    verticalLineToRelative(-0.37f)
                    curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                    verticalLineToRelative(-0.21f)
                    curveToRelative(0f, -0.18f, -0.09f, -0.34f, -0.24f, -0.43f)
                    lineTo(13.5f, 19f)
                    verticalLineToRelative(-5.5f)
                    lineToRelative(7.16f, 2.1f)
                    curveTo(21.33f, 15.8f, 22f, 15.3f, 22f, 14.6f)
                    curveTo(22f, 14.23f, 21.8f, 13.88f, 21.48f, 13.7f)
                    close()
                }
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
            }
        }.build()
        
        return _Local_airport!!
    }

private var _Local_airport: ImageVector? = null

