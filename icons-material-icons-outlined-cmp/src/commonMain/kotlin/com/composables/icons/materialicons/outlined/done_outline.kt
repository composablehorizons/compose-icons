package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Done_outline: ImageVector
    get() {
        if (_Done_outline != null) return _Done_outline!!
        
        _Done_outline = ImageVector.Builder(
            name = "done_outline",
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
                moveTo(19.77f, 4.93f)
                lineToRelative(1.4f, 1.4f)
                lineTo(8.43f, 19.07f)
                lineToRelative(-5.6f, -5.6f)
                lineToRelative(1.4f, -1.4f)
                lineToRelative(4.2f, 4.2f)
                lineTo(19.77f, 4.93f)
                moveToRelative(0f, -2.83f)
                lineTo(8.43f, 13.44f)
                lineToRelative(-4.2f, -4.2f)
                lineTo(0f, 13.47f)
                lineToRelative(8.43f, 8.43f)
                lineTo(24f, 6.33f)
                lineTo(19.77f, 2.1f)
                close()
            }
        }.build()
        
        return _Done_outline!!
    }

private var _Done_outline: ImageVector? = null

