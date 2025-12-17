package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Done_all: ImageVector
    get() {
        if (_Done_all != null) return _Done_all!!
        
        _Done_all = ImageVector.Builder(
            name = "done_all",
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
                moveTo(18f, 7f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-6.34f, 6.34f)
                lineToRelative(1.41f, 1.41f)
                lineTo(18f, 7f)
                close()
                moveToRelative(4.24f, -1.41f)
                lineTo(11.66f, 16.17f)
                lineTo(7.48f, 12f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(11.66f, 19f)
                lineToRelative(12f, -12f)
                lineToRelative(-1.42f, -1.41f)
                close()
                moveTo(0.41f, 13.41f)
                lineTo(6f, 19f)
                lineToRelative(1.41f, -1.41f)
                lineTo(1.83f, 12f)
                lineTo(0.41f, 13.41f)
                close()
            }
        }.build()
        
        return _Done_all!!
    }

private var _Done_all: ImageVector? = null

