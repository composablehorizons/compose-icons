package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Luggage: ImageVector
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
                    moveTo(9.5f, 18f)
                    horizontalLineTo(8f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(1.5f)
                    verticalLineTo(18f)
                    close()
                    moveTo(12.75f, 18f)
                    horizontalLineToRelative(-1.5f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(1.5f)
                    verticalLineTo(18f)
                    close()
                    moveTo(13.5f, 6f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(3.5f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(6f)
                    close()
                    moveTo(16f, 18f)
                    horizontalLineToRelative(-1.5f)
                    verticalLineTo(9f)
                    horizontalLineTo(16f)
                    verticalLineTo(18f)
                    close()
                }
            }
        }.build()
        
        return _Luggage!!
    }

private var _Luggage: ImageVector? = null

