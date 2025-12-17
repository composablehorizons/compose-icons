package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Markunread_mailbox: ImageVector
    get() {
        if (_Markunread_mailbox != null) return _Markunread_mailbox!!
        
        _Markunread_mailbox = ImageVector.Builder(
            name = "markunread_mailbox",
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
                moveTo(22f, 6f)
                horizontalLineTo(10f)
                verticalLineToRelative(6f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                horizontalLineToRelative(6f)
                verticalLineTo(0f)
                horizontalLineTo(6f)
                verticalLineToRelative(6f)
                horizontalLineTo(2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(20f)
                verticalLineTo(6f)
                close()
            }
        }.build()
        
        return _Markunread_mailbox!!
    }

private var _Markunread_mailbox: ImageVector? = null

