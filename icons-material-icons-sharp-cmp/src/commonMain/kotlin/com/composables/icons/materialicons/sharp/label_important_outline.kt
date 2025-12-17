package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Label_important_outline: ImageVector
    get() {
        if (_Label_important_outline != null) return _Label_important_outline!!
        
        _Label_important_outline = ImageVector.Builder(
            name = "label_important_outline",
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
                moveTo(16.03f, 19f)
                horizontalLineTo(3f)
                lineToRelative(4.5f, -7f)
                lineTo(3f, 5f)
                horizontalLineToRelative(13.03f)
                lineTo(21f, 12f)
                lineToRelative(-4.97f, 7f)
                close()
                moveTo(6.5f, 17f)
                horizontalLineTo(15f)
                lineToRelative(3.5f, -5f)
                lineTo(15f, 7f)
                horizontalLineTo(6.5f)
                lineToRelative(3.5f, 5f)
                lineToRelative(-3.5f, 5f)
                close()
            }
        }.build()
        
        return _Label_important_outline!!
    }

private var _Label_important_outline: ImageVector? = null

