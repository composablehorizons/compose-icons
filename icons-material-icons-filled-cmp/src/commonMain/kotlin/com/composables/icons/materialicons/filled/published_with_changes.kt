package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Published_with_changes: ImageVector
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
                moveTo(17.66f, 9.53f)
                lineToRelative(-7.07f, 7.07f)
                lineToRelative(-4.24f, -4.24f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.83f, 2.83f)
                lineToRelative(5.66f, -5.66f)
                lineTo(17.66f, 9.53f)
                close()
                moveTo(4f, 12f)
                curveToRelative(0f, -2.33f, 1.02f, -4.42f, 2.62f, -5.88f)
                lineTo(9f, 8.5f)
                verticalLineToRelative(-6f)
                horizontalLineTo(3f)
                lineToRelative(2.2f, 2.2f)
                curveTo(3.24f, 6.52f, 2f, 9.11f, 2f, 12f)
                curveToRelative(0f, 5.19f, 3.95f, 9.45f, 9f, 9.95f)
                verticalLineToRelative(-2.02f)
                curveTo(7.06f, 19.44f, 4f, 16.07f, 4f, 12f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, -5.19f, -3.95f, -9.45f, -9f, -9.95f)
                verticalLineToRelative(2.02f)
                curveToRelative(3.94f, 0.49f, 7f, 3.86f, 7f, 7.93f)
                curveToRelative(0f, 2.33f, -1.02f, 4.42f, -2.62f, 5.88f)
                lineTo(15f, 15.5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                lineToRelative(-2.2f, -2.2f)
                curveTo(20.76f, 17.48f, 22f, 14.89f, 22f, 12f)
                close()
            }
        }.build()
        
        return _Published_with_changes!!
    }

private var _Published_with_changes: ImageVector? = null

