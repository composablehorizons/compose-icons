package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Volume_mute: ImageVector
    get() {
        if (_Volume_mute != null) return _Volume_mute!!
        
        _Volume_mute = ImageVector.Builder(
            name = "volume_mute",
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
                moveTo(9f, 13f)
                horizontalLineToRelative(2.83f)
                lineTo(14f, 15.17f)
                verticalLineTo(8.83f)
                lineTo(11.83f, 11f)
                horizontalLineTo(9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(4f)
                lineToRelative(5f, 5f)
                verticalLineTo(4f)
                lineToRelative(-5f, 5f)
                horizontalLineTo(7f)
                close()
                moveToRelative(7f, -0.17f)
                verticalLineToRelative(6.34f)
                lineTo(11.83f, 13f)
                horizontalLineTo(9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.83f)
                lineTo(14f, 8.83f)
                close()
            }
        }.build()
        
        return _Volume_mute!!
    }

private var _Volume_mute: ImageVector? = null

