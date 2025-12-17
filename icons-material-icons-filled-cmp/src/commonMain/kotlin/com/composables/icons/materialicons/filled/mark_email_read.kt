package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Mark_email_read: ImageVector
    get() {
        if (_Mark_email_read != null) return _Mark_email_read!!
        
        _Mark_email_read = ImageVector.Builder(
            name = "mark_email_read",
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
                    moveTo(12f, 19f)
                    curveToRelative(0f, -3.87f, 3.13f, -7f, 7f, -7f)
                    curveToRelative(1.08f, 0f, 2.09f, 0.25f, 3f, 0.68f)
                    verticalLineTo(6f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                    verticalLineToRelative(12f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(8.08f)
                    curveTo(12.03f, 19.67f, 12f, 19.34f, 12f, 19f)
                    close()
                    moveTo(4f, 6f)
                    lineToRelative(8f, 5f)
                    lineToRelative(8f, -5f)
                    verticalLineToRelative(2f)
                    lineToRelative(-8f, 5f)
                    lineTo(4f, 8f)
                    verticalLineTo(6f)
                    close()
                    moveTo(17.34f, 22f)
                    lineToRelative(-3.54f, -3.54f)
                    lineToRelative(1.41f, -1.41f)
                    lineToRelative(2.12f, 2.12f)
                    lineToRelative(4.24f, -4.24f)
                    lineTo(23f, 16.34f)
                    lineTo(17.34f, 22f)
                    close()
                }
            }
        }.build()
        
        return _Mark_email_read!!
    }

private var _Mark_email_read: ImageVector? = null

