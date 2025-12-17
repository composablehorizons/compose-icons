package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Forward_to_inbox: ImageVector
    get() {
        if (_Forward_to_inbox != null) return _Forward_to_inbox!!
        
        _Forward_to_inbox = ImageVector.Builder(
            name = "forward_to_inbox",
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
                    moveTo(13f, 18f)
                    horizontalLineTo(4f)
                    verticalLineTo(8f)
                    lineToRelative(8f, 5f)
                    lineToRelative(8f, -5f)
                    verticalLineToRelative(5f)
                    lineToRelative(-2f, 0f)
                    curveTo(15.24f, 13f, 13f, 15.24f, 13f, 18f)
                    lineTo(13f, 18f)
                    close()
                    moveTo(12f, 11f)
                    lineTo(4f, 6f)
                    horizontalLineToRelative(16f)
                    lineTo(12f, 11f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(20f, 4f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                    verticalLineToRelative(12f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(9f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(4f)
                    verticalLineTo(8f)
                    lineToRelative(8f, 5f)
                    lineToRelative(8f, -5f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(6f)
                    curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                    close()
                    moveTo(12f, 11f)
                    lineTo(4f, 6f)
                    horizontalLineToRelative(16f)
                    lineTo(12f, 11f)
                    close()
                    moveTo(19f, 15f)
                    lineToRelative(4f, 4f)
                    lineToRelative(-4f, 4f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(4f)
                    verticalLineTo(15f)
                    close()
                }
            }
        }.build()
        
        return _Forward_to_inbox!!
    }

private var _Forward_to_inbox: ImageVector? = null

