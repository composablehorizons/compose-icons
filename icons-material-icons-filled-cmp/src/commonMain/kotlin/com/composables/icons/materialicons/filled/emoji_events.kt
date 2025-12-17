package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Emoji_events: ImageVector
    get() {
        if (_Emoji_events != null) return _Emoji_events!!
        
        _Emoji_events = ImageVector.Builder(
            name = "emoji_events",
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
                moveTo(19f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                curveTo(3.9f, 5f, 3f, 5.9f, 3f, 7f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.55f, 1.92f, 4.63f, 4.39f, 4.94f)
                curveToRelative(0.63f, 1.5f, 1.98f, 2.63f, 3.61f, 2.96f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3.1f)
                curveToRelative(1.63f, -0.33f, 2.98f, -1.46f, 3.61f, -2.96f)
                curveTo(19.08f, 12.63f, 21f, 10.55f, 21f, 8f)
                verticalLineTo(7f)
                curveTo(21f, 5.9f, 20.1f, 5f, 19f, 5f)
                close()
                moveTo(5f, 8f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.82f)
                curveTo(5.84f, 10.4f, 5f, 9.3f, 5f, 8f)
                close()
                moveTo(19f, 8f)
                curveToRelative(0f, 1.3f, -0.84f, 2.4f, -2f, 2.82f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                verticalLineTo(8f)
                close()
            }
        }.build()
        
        return _Emoji_events!!
    }

private var _Emoji_events: ImageVector? = null

