package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Move_to_inbox: ImageVector
    get() {
        if (_Move_to_inbox != null) return _Move_to_inbox!!
        
        _Move_to_inbox = ImageVector.Builder(
            name = "move_to_inbox",
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19f, 3f)
                    horizontalLineTo(5f)
                    curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                    verticalLineToRelative(14f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(14f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(5f)
                    curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                    close()
                    moveTo(19f, 14f)
                    horizontalLineToRelative(-3.56f)
                    curveToRelative(-0.36f, 0f, -0.68f, 0.19f, -0.86f, 0.5f)
                    curveTo(14.06f, 15.4f, 13.11f, 16f, 12f, 16f)
                    reflectiveCurveToRelative(-2.06f, -0.6f, -2.58f, -1.5f)
                    curveTo(9.24f, 14.19f, 8.91f, 14f, 8.56f, 14f)
                    horizontalLineTo(5f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(14f)
                    verticalLineTo(14f)
                    close()
                    moveTo(14.79f, 10f)
                    horizontalLineTo(13f)
                    verticalLineTo(7f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(9.21f)
                    curveToRelative(-0.45f, 0f, -0.67f, 0.54f, -0.35f, 0.85f)
                    lineToRelative(2.79f, 2.79f)
                    curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                    lineToRelative(2.79f, -2.79f)
                    curveTo(15.46f, 10.54f, 15.24f, 10f, 14.79f, 10f)
                    close()
                }
            }
        }.build()
        
        return _Move_to_inbox!!
    }

private var _Move_to_inbox: ImageVector? = null

