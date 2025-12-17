package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Music_off: ImageVector
    get() {
        if (_Music_off != null) return _Music_off!!
        
        _Music_off = ImageVector.Builder(
            name = "music_off",
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
                moveTo(14f, 9.61f)
                verticalLineTo(7f)
                horizontalLineToRelative(4f)
                verticalLineTo(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(4.61f)
                close()
                moveTo(4.41f, 2.86f)
                lineTo(3f, 4.27f)
                lineToRelative(9f, 9f)
                verticalLineToRelative(0.28f)
                curveToRelative(-0.94f, -0.54f, -2.1f, -0.75f, -3.33f, -0.32f)
                curveToRelative(-1.34f, 0.48f, -2.37f, 1.67f, -2.61f, 3.07f)
                curveToRelative(-0.46f, 2.74f, 1.86f, 5.08f, 4.59f, 4.65f)
                curveToRelative(1.96f, -0.31f, 3.35f, -2.11f, 3.35f, -4.1f)
                verticalLineToRelative(-1.58f)
                lineTo(19.73f, 21f)
                lineToRelative(1.41f, -1.41f)
                lineTo(12f, 10.44f)
                lineTo(4.41f, 2.86f)
                close()
            }
        }.build()
        
        return _Music_off!!
    }

private var _Music_off: ImageVector? = null

