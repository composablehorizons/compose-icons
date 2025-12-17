package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Published_with_changes: ImageVector
    get() {
        if (_Published_with_changes != null) return _Published_with_changes!!
        
        _Published_with_changes = ImageVector.Builder(
            name = "published_with_changes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveTo(18.6f, 19.5f)
                horizontalLineTo(21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.73f)
                curveToRelative(1.83f, -1.47f, 3f, -3.71f, 3f, -6.23f)
                curveToRelative(0f, -4.07f, -3.06f, -7.44f, -7f, -7.93f)
                verticalLineTo(2.05f)
                curveToRelative(5.05f, 0.5f, 9f, 4.76f, 9f, 9.95f)
                curveTo(22f, 14.99f, 20.68f, 17.67f, 18.6f, 19.5f)
                close()
                moveTo(4f, 12f)
                curveToRelative(0f, -2.52f, 1.17f, -4.77f, 3f, -6.23f)
                verticalLineTo(8.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.4f)
                curveTo(3.32f, 6.33f, 2f, 9.01f, 2f, 12f)
                curveToRelative(0f, 5.19f, 3.95f, 9.45f, 9f, 9.95f)
                verticalLineToRelative(-2.02f)
                curveTo(7.06f, 19.44f, 4f, 16.07f, 4f, 12f)
                close()
                moveTo(16.24f, 8.11f)
                lineToRelative(-5.66f, 5.66f)
                lineToRelative(-2.83f, -2.83f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(4.24f, 4.24f)
                lineToRelative(7.07f, -7.07f)
                lineTo(16.24f, 8.11f)
                close()
            }
        }.build()
        
        return _Published_with_changes!!
    }

private var _Published_with_changes: ImageVector? = null

