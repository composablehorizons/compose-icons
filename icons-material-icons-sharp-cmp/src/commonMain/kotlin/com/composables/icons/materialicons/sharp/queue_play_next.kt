package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Queue_play_next: ImageVector
    get() {
        if (_Queue_play_next != null) return _Queue_play_next!!
        
        _Queue_play_next = ImageVector.Builder(
            name = "queue_play_next",
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(23f, 3f)
                horizontalLineTo(1f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                close()
                moveToRelative(-10f, 7f)
                verticalLineTo(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineTo(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                close()
                moveToRelative(11f, 8f)
                lineToRelative(-4.5f, 4.5f)
                lineTo(18f, 21f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
                lineToRelative(1.5f, -1.5f)
                lineTo(24f, 18f)
                close()
            }
        }.build()
        
        return _Queue_play_next!!
    }

private var _Queue_play_next: ImageVector? = null

