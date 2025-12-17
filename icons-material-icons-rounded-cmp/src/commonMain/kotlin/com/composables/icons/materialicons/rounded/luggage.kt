package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Luggage: ImageVector
    get() {
        if (_Luggage != null) return _Luggage!!
        
        _Luggage = ImageVector.Builder(
            name = "luggage",
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
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(17f, 6f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(3f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-4f)
                    curveTo(9.45f, 2f, 9f, 2.45f, 9f, 3f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(7f)
                    curveTo(5.9f, 6f, 5f, 6.9f, 5f, 8f)
                    verticalLineToRelative(11f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    horizontalLineToRelative(6f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(8f)
                    curveTo(19f, 6.9f, 18.1f, 6f, 17f, 6f)
                    close()
                    moveTo(8.75f, 18f)
                    lineTo(8.75f, 18f)
                    curveTo(8.34f, 18f, 8f, 17.66f, 8f, 17.25f)
                    verticalLineToRelative(-7.5f)
                    curveTo(8f, 9.34f, 8.34f, 9f, 8.75f, 9f)
                    horizontalLineToRelative(0f)
                    curveTo(9.16f, 9f, 9.5f, 9.34f, 9.5f, 9.75f)
                    verticalLineToRelative(7.5f)
                    curveTo(9.5f, 17.66f, 9.16f, 18f, 8.75f, 18f)
                    close()
                    moveTo(12f, 18f)
                    lineTo(12f, 18f)
                    curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                    verticalLineToRelative(-7.5f)
                    curveTo(11.25f, 9.34f, 11.59f, 9f, 12f, 9f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                    verticalLineToRelative(7.5f)
                    curveTo(12.75f, 17.66f, 12.41f, 18f, 12f, 18f)
                    close()
                    moveTo(13.5f, 6f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(3.5f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(6f)
                    close()
                    moveTo(15.25f, 18f)
                    lineTo(15.25f, 18f)
                    curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                    verticalLineToRelative(-7.5f)
                    curveTo(14.5f, 9.34f, 14.84f, 9f, 15.25f, 9f)
                    horizontalLineToRelative(0f)
                    curveTo(15.66f, 9f, 16f, 9.34f, 16f, 9.75f)
                    verticalLineToRelative(7.5f)
                    curveTo(16f, 17.66f, 15.66f, 18f, 15.25f, 18f)
                    close()
                }
            }
        }.build()
        
        return _Luggage!!
    }

private var _Luggage: ImageVector? = null

