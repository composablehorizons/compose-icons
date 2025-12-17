package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Thumb_up_alt: ImageVector
    get() {
        if (_Thumb_up_alt != null) return _Thumb_up_alt!!
        
        _Thumb_up_alt = ImageVector.Builder(
            name = "thumb_up_alt",
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
                moveTo(14.17f, 1f)
                lineTo(7f, 8.18f)
                verticalLineTo(21f)
                horizontalLineToRelative(12.31f)
                lineTo(23f, 12.4f)
                verticalLineTo(8f)
                horizontalLineToRelative(-8.31f)
                lineToRelative(1.12f, -5.38f)
                close()
                moveTo(1f, 9f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(12f)
                horizontalLineTo(1f)
                close()
            }
        }.build()
        
        return _Thumb_up_alt!!
    }

private var _Thumb_up_alt: ImageVector? = null

