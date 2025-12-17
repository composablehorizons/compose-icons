package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Calendar_view_month: ImageVector
    get() {
        if (_Calendar_view_month != null) return _Calendar_view_month!!
        
        _Calendar_view_month = ImageVector.Builder(
            name = "calendar_view_month",
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
                    moveTo(22f, 4f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(4f)
                    close()
                    moveTo(8f, 11f)
                    horizontalLineTo(4f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(4f)
                    verticalLineTo(11f)
                    close()
                    moveTo(14f, 11f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(4f)
                    verticalLineTo(11f)
                    close()
                    moveTo(20f, 11f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(4f)
                    verticalLineTo(11f)
                    close()
                    moveTo(8f, 18f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(-5f)
                    horizontalLineToRelative(4f)
                    verticalLineTo(18f)
                    close()
                    moveTo(14f, 18f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(-5f)
                    horizontalLineToRelative(4f)
                    verticalLineTo(18f)
                    close()
                    moveTo(20f, 18f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(-5f)
                    horizontalLineToRelative(4f)
                    verticalLineTo(18f)
                    close()
                }
            }
        }.build()
        
        return _Calendar_view_month!!
    }

private var _Calendar_view_month: ImageVector? = null

