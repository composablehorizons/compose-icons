package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Mail_outline: ImageVector
    get() {
        if (_Mail_outline != null) return _Mail_outline!!
        
        _Mail_outline = ImageVector.Builder(
            name = "mail_outline",
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
                moveTo(22f, 4f)
                horizontalLineTo(2.01f)
                lineTo(2f, 20f)
                horizontalLineToRelative(20f)
                verticalLineTo(4f)
                close()
                moveToRelative(-2f, 14f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                lineToRelative(8f, 5f)
                lineToRelative(8f, -5f)
                verticalLineToRelative(10f)
                close()
                moveToRelative(-8f, -7f)
                lineTo(4f, 6f)
                horizontalLineToRelative(16f)
                lineToRelative(-8f, 5f)
                close()
            }
        }.build()
        
        return _Mail_outline!!
    }

private var _Mail_outline: ImageVector? = null

