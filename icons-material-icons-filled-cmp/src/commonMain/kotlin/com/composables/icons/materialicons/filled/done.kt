package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Done: ImageVector
    get() {
        if (_Done != null) return _Done!!
        
        _Done = ImageVector.Builder(
            name = "done",
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
                moveTo(9f, 16.2f)
                lineTo(4.8f, 12f)
                lineToRelative(-1.4f, 1.4f)
                lineTo(9f, 19f)
                lineTo(21f, 7f)
                lineToRelative(-1.4f, -1.4f)
                lineTo(9f, 16.2f)
                close()
            }
        }.build()
        
        return _Done!!
    }

private var _Done: ImageVector? = null

