package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Mouse: ImageVector
    get() {
        if (_Mouse != null) return _Mouse!!
        
        _Mouse = ImageVector.Builder(
            name = "mouse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 352f)
                arcToRelative(160f, 160f, 0f, false, false, 160f, 160f)
                horizontalLineToRelative(64f)
                arcToRelative(160f, 160f, 0f, false, false, 160f, -160f)
                verticalLineTo(224f)
                horizontalLineTo(0f)
                close()
                moveTo(176f, 0f)
                horizontalLineToRelative(-16f)
                arcTo(160f, 160f, 0f, false, false, 0f, 160f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(176f)
                close()
                moveToRelative(48f, 0f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(192f)
                horizontalLineToRelative(176f)
                verticalLineToRelative(-32f)
                arcTo(160f, 160f, 0f, false, false, 224f, 0f)
                close()
            }
        }.build()
        
        return _Mouse!!
    }

private var _Mouse: ImageVector? = null

