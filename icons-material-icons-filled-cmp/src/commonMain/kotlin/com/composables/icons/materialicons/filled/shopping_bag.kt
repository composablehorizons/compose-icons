package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Shopping_bag: ImageVector
    get() {
        if (_Shopping_bag != null) return _Shopping_bag!!
        
        _Shopping_bag = ImageVector.Builder(
            name = "shopping_bag",
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
                    moveTo(18f, 6f)
                    horizontalLineToRelative(-2f)
                    curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                    reflectiveCurveTo(8f, 3.79f, 8f, 6f)
                    horizontalLineTo(6f)
                    curveTo(4.9f, 6f, 4f, 6.9f, 4f, 8f)
                    verticalLineToRelative(12f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(12f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(8f)
                    curveTo(20f, 6.9f, 19.1f, 6f, 18f, 6f)
                    close()
                    moveTo(10f, 10f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    verticalLineTo(8f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(10f)
                    close()
                    moveTo(12f, 4f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    horizontalLineToRelative(-4f)
                    curveTo(10f, 4.9f, 10.9f, 4f, 12f, 4f)
                    close()
                    moveTo(16f, 10f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    verticalLineTo(8f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(10f)
                    close()
                }
            }
        }.build()
        
        return _Shopping_bag!!
    }

private var _Shopping_bag: ImageVector? = null

