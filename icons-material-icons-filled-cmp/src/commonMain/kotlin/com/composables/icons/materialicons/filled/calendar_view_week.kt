package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Calendar_view_week: ImageVector
    get() {
        if (_Calendar_view_week != null) return _Calendar_view_week!!
        
        _Calendar_view_week = ImageVector.Builder(
            name = "calendar_view_week",
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
                    moveTo(20f, 4f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                    verticalLineToRelative(12f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(16f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(6f)
                    curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                    close()
                    moveTo(13f, 6f)
                    horizontalLineToRelative(2.5f)
                    verticalLineToRelative(12f)
                    horizontalLineTo(13f)
                    verticalLineTo(6f)
                    close()
                    moveTo(11f, 18f)
                    horizontalLineTo(8.5f)
                    verticalLineTo(6f)
                    horizontalLineTo(11f)
                    verticalLineTo(18f)
                    close()
                    moveTo(4f, 6f)
                    horizontalLineToRelative(2.5f)
                    verticalLineToRelative(12f)
                    horizontalLineTo(4f)
                    verticalLineTo(6f)
                    close()
                    moveTo(20f, 18f)
                    horizontalLineToRelative(-2.5f)
                    verticalLineTo(6f)
                    horizontalLineTo(20f)
                    verticalLineTo(18f)
                    close()
                }
            }
        }.build()
        
        return _Calendar_view_week!!
    }

private var _Calendar_view_week: ImageVector? = null

