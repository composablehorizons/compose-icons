package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Html: ImageVector
    get() {
        if (_Html != null) return _Html!!
        
        _Html = ImageVector.Builder(
            name = "html",
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
                    moveTo(3.5f, 9f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(6f)
                    horizontalLineTo(3.5f)
                    verticalLineToRelative(-2.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(15f)
                    horizontalLineTo(0f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(9f)
                    close()
                    moveTo(17.5f, 9f)
                    horizontalLineTo(13f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(-4.5f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(14f)
                    horizontalLineTo(16f)
                    verticalLineToRelative(-3.51f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(15f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(-5f)
                    curveTo(18.5f, 9.45f, 18.05f, 9f, 17.5f, 9f)
                    close()
                    moveTo(11f, 9f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(1.5f)
                    horizontalLineToRelative(1.75f)
                    verticalLineTo(15f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(-4.5f)
                    horizontalLineTo(11f)
                    verticalLineTo(9f)
                    close()
                    moveTo(24f, 15f)
                    verticalLineToRelative(-1.5f)
                    horizontalLineToRelative(-2.5f)
                    verticalLineTo(9f)
                    horizontalLineTo(20f)
                    verticalLineToRelative(6f)
                    horizontalLineTo(24f)
                    close()
                }
            }
        }.build()
        
        return _Html!!
    }

private var _Html: ImageVector? = null

