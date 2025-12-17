package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Escalator: ImageVector
    get() {
        if (_Escalator != null) return _Escalator!!
        
        _Escalator = ImageVector.Builder(
            name = "escalator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
                    moveTo(19f, 5f)
                    lineTo(19f, 5f)
                    lineToRelative(0f, 14f)
                    horizontalLineTo(5f)
                    verticalLineTo(5f)
                    horizontalLineTo(19f)
                    moveTo(19f, 3f)
                    horizontalLineTo(5f)
                    curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                    verticalLineToRelative(14f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(14f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    lineToRelative(0f, -14f)
                    curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                    lineTo(19f, 3f)
                    close()
                    moveTo(17f, 6f)
                    horizontalLineToRelative(-3.3f)
                    lineToRelative(-5f, 9f)
                    horizontalLineTo(7f)
                    curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                    reflectiveCurveTo(6.17f, 18f, 7f, 18f)
                    horizontalLineToRelative(3.3f)
                    lineToRelative(5f, -9f)
                    horizontalLineTo(17f)
                    curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                    reflectiveCurveTo(17.83f, 6f, 17f, 6f)
                    close()
                }
            }
        }.build()
        
        return _Escalator!!
    }

private var _Escalator: ImageVector? = null

