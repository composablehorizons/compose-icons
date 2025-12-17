package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Weekend: ImageVector
    get() {
        if (_Weekend != null) return _Weekend!!
        
        _Weekend = ImageVector.Builder(
            name = "weekend",
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
                    moveTo(21f, 10f)
                    curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(-3f)
                    curveToRelative(0f, -1.1f, -0.89f, -2f, -2f, -2f)
                    reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                    verticalLineToRelative(5f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(18f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineToRelative(-5f)
                    curveTo(23f, 10.9f, 22.1f, 10f, 21f, 10f)
                    close()
                    moveTo(18f, 5f)
                    horizontalLineTo(6f)
                    curveTo(4.9f, 5f, 4f, 5.9f, 4f, 7f)
                    verticalLineToRelative(2.15f)
                    curveToRelative(1.16f, 0.41f, 2f, 1.52f, 2f, 2.81f)
                    verticalLineTo(14f)
                    horizontalLineToRelative(12f)
                    verticalLineToRelative(-2.03f)
                    curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.81f)
                    verticalLineTo(7f)
                    curveTo(20f, 5.9f, 19.1f, 5f, 18f, 5f)
                    close()
                }
            }
        }.build()
        
        return _Weekend!!
    }

private var _Weekend: ImageVector? = null

