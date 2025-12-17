package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Door_sliding: ImageVector
    get() {
        if (_Door_sliding != null) return _Door_sliding!!
        
        _Door_sliding = ImageVector.Builder(
            name = "door_sliding",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(20f, 19f)
                    verticalLineTo(5f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineToRelative(-5.25f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(-1.5f)
                    verticalLineTo(3f)
                    horizontalLineTo(6f)
                    curveTo(4.9f, 3f, 4f, 3.9f, 4f, 5f)
                    verticalLineToRelative(14f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(16f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    curveTo(21f, 19.45f, 20.55f, 19f, 20f, 19f)
                    close()
                    moveTo(9f, 13f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    curveTo(10f, 12.55f, 9.55f, 13f, 9f, 13f)
                    close()
                    moveTo(15f, 13f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    curveTo(16f, 12.55f, 15.55f, 13f, 15f, 13f)
                    close()
                }
            }
        }.build()
        
        return _Door_sliding!!
    }

private var _Door_sliding: ImageVector? = null

