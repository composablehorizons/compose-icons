package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Music_video: ImageVector
    get() {
        if (_Music_video != null) return _Music_video!!
        
        _Music_video = ImageVector.Builder(
            name = "music_video",
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
                verticalLineToRelative(18f)
                horizontalLineToRelative(22f)
                verticalLineTo(3f)
                close()
                moveToRelative(-2f, 16f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14f)
                close()
                moveTo(8f, 15f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                curveToRelative(0.35f, 0f, 0.69f, 0.07f, 1f, 0.18f)
                verticalLineTo(6f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7.03f)
                curveToRelative(-0.02f, 1.64f, -1.35f, 2.97f, -3f, 2.97f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                close()
            }
        }.build()
        
        return _Music_video!!
    }

private var _Music_video: ImageVector? = null

