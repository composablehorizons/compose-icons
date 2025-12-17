package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Label_outline: ImageVector
    get() {
        if (_Label_outline != null) return _Label_outline!!
        
        _Label_outline = ImageVector.Builder(
            name = "label_outline",
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
                moveTo(17.03f, 5f)
                horizontalLineTo(3f)
                verticalLineToRelative(13.99f)
                lineToRelative(14.03f, 0.01f)
                lineTo(22f, 12f)
                lineToRelative(-4.97f, -7f)
                close()
                moveTo(16f, 17f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineToRelative(11f)
                lineToRelative(3.55f, 5f)
                lineTo(16f, 17f)
                close()
            }
        }.build()
        
        return _Label_outline!!
    }

private var _Label_outline: ImageVector? = null

