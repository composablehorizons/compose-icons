package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Perm_media: ImageVector
    get() {
        if (_Perm_media != null) return _Perm_media!!
        
        _Perm_media = ImageVector.Builder(
            name = "perm_media",
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
                moveTo(2f, 6f)
                horizontalLineTo(0f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-2f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                close()
                moveToRelative(22f, -2f)
                horizontalLineTo(14f)
                lineToRelative(-2f, -2f)
                horizontalLineTo(4f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(20f)
                verticalLineTo(4f)
                close()
                moveTo(7f, 15f)
                lineToRelative(4.5f, -6f)
                lineToRelative(3.5f, 4.51f)
                lineToRelative(2.5f, -3.01f)
                lineTo(21f, 15f)
                horizontalLineTo(7f)
                close()
            }
        }.build()
        
        return _Perm_media!!
    }

private var _Perm_media: ImageVector? = null

