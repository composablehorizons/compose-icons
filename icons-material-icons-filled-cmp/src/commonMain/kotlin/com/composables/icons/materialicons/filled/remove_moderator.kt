package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Remove_moderator: ImageVector
    get() {
        if (_Remove_moderator != null) return _Remove_moderator!!
        
        _Remove_moderator = ImageVector.Builder(
            name = "remove_moderator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22.27f, 21.73f)
                lineToRelative(-3.54f, -3.55f)
                lineTo(5.78f, 5.23f)
                lineTo(2.27f, 1.72f)
                lineTo(1f, 2.99f)
                lineTo(3.01f, 5f)
                horizontalLineTo(3f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 5.55f, 3.84f, 10.74f, 9f, 12f)
                curveToRelative(2.16f, -0.53f, 4.08f, -1.76f, 5.6f, -3.41f)
                lineTo(21f, 23f)
                lineToRelative(1.27f, -1.27f)
                close()
                moveTo(13f, 9.92f)
                lineToRelative(6.67f, 6.67f)
                curveTo(20.51f, 14.87f, 21f, 12.96f, 21f, 11f)
                verticalLineTo(5f)
                lineToRelative(-9f, -4f)
                lineToRelative(-5.48f, 2.44f)
                lineTo(11f, 7.92f)
                lineToRelative(2f, 2f)
                close()
            }
        }.build()
        
        return _Remove_moderator!!
    }

private var _Remove_moderator: ImageVector? = null

