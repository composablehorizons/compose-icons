package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Calendar_month: ImageVector
    get() {
        if (_Calendar_month != null) return _Calendar_month!!
        
        _Calendar_month = ImageVector.Builder(
            name = "calendar_month",
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
                    moveTo(5f, 6f)
                    horizontalLineTo(19f)
                    verticalLineTo(8f)
                    horizontalLineTo(5f)
                    verticalLineTo(6f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19f, 4f)
                    horizontalLineToRelative(-1f)
                    verticalLineTo(2f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(8f)
                    verticalLineTo(2f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(5f)
                    curveTo(3.89f, 4f, 3.01f, 4.9f, 3.01f, 6f)
                    lineTo(3f, 20f)
                    curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                    horizontalLineToRelative(14f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(6f)
                    curveTo(21f, 4.9f, 20.1f, 4f, 19f, 4f)
                    close()
                    moveTo(19f, 20f)
                    horizontalLineTo(5f)
                    verticalLineTo(10f)
                    horizontalLineToRelative(14f)
                    verticalLineTo(20f)
                    close()
                    moveTo(19f, 8f)
                    horizontalLineTo(5f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(14f)
                    verticalLineTo(8f)
                    close()
                    moveTo(9f, 14f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(14f)
                    close()
                    moveTo(13f, 14f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(14f)
                    close()
                    moveTo(17f, 14f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(14f)
                    close()
                    moveTo(9f, 18f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(18f)
                    close()
                    moveTo(13f, 18f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(18f)
                    close()
                    moveTo(17f, 18f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(18f)
                    close()
                }
            }
        }.build()
        
        return _Calendar_month!!
    }

private var _Calendar_month: ImageVector? = null

