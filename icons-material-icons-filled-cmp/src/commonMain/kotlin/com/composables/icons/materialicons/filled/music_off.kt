package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Music_off: ImageVector
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.27f, 3f)
                lineTo(3f, 4.27f)
                lineToRelative(9f, 9f)
                verticalLineToRelative(0.28f)
                curveToRelative(-0.59f, -0.34f, -1.27f, -0.55f, -2f, -0.55f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-1.73f)
                lineTo(19.73f, 21f)
                lineTo(21f, 19.73f)
                lineTo(4.27f, 3f)
                close()
                moveTo(14f, 7f)
                horizontalLineToRelative(4f)
                verticalLineTo(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(5.18f)
                lineToRelative(2f, 2f)
                close()
            }
        }.build()
        
        return _Music_off!!
    }

private var _Music_off: ImageVector? = null

