package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Inbox: ImageVector
    get() {
        if (_Inbox != null) return _Inbox!!
        
        _Inbox = ImageVector.Builder(
            name = "inbox",
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
                    moveTo(19f, 5f)
                    verticalLineToRelative(9f)
                    horizontalLineToRelative(-3.56f)
                    curveToRelative(-0.36f, 0f, -0.68f, 0.19f, -0.86f, 0.5f)
                    curveTo(14.06f, 15.4f, 13.11f, 16f, 12f, 16f)
                    reflectiveCurveToRelative(-2.06f, -0.6f, -2.58f, -1.5f)
                    curveTo(9.24f, 14.19f, 8.91f, 14f, 8.56f, 14f)
                    horizontalLineTo(5f)
                    verticalLineTo(5f)
                    horizontalLineTo(19f)
                    close()
                }
            }
        }.build()
        
        return _Inbox!!
    }

private var _Inbox: ImageVector? = null

