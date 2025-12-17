package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Request_quote: ImageVector
    get() {
        if (_Request_quote != null) return _Request_quote!!
        
        _Request_quote = ImageVector.Builder(
            name = "request_quote",
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
                    moveTo(14f, 2f)
                    horizontalLineTo(6f)
                    curveTo(4.9f, 2f, 4.01f, 2.9f, 4.01f, 4f)
                    lineTo(4f, 20f)
                    curveToRelative(0f, 1.1f, 0.89f, 2f, 1.99f, 2f)
                    horizontalLineTo(18f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(8f)
                    lineTo(14f, 2f)
                    close()
                    moveTo(15f, 12f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(3f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(3f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(-1f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(-3f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-3f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(12f)
                    close()
                    moveTo(13f, 8f)
                    verticalLineTo(3.5f)
                    lineTo(17.5f, 8f)
                    horizontalLineTo(13f)
                    close()
                }
            }
        }.build()
        
        return _Request_quote!!
    }

private var _Request_quote: ImageVector? = null

