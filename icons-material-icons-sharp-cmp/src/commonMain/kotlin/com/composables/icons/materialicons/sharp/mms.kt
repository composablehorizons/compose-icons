package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Mms: ImageVector
    get() {
        if (_Mms != null) return _Mms!!
        
        _Mms = ImageVector.Builder(
            name = "mms",
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
                moveTo(22f, 2f)
                horizontalLineTo(2f)
                verticalLineToRelative(20f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(16f)
                verticalLineTo(2f)
                close()
                moveTo(5f, 14f)
                lineToRelative(3.5f, -4.5f)
                lineToRelative(2.5f, 3.01f)
                lineTo(14.5f, 8f)
                lineToRelative(4.5f, 6f)
                horizontalLineTo(5f)
                close()
            }
        }.build()
        
        return _Mms!!
    }

private var _Mms: ImageVector? = null

