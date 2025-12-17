package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Plug: ImageVector
    get() {
        if (_Plug != null) return _Plug!!
        
        _Plug = ImageVector.Builder(
            name = "plug",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 32f)
                arcToRelative(32f, 32f, 0f, false, false, -64f, 0f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(64f)
                close()
                moveToRelative(48f, 128f)
                horizontalLineTo(16f)
                arcTo(16f, 16f, 0f, false, false, 0f, 176f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineTo(32f)
                verticalLineToRelative(32f)
                arcTo(160.07f, 160.07f, 0f, false, false, 160f, 412.8f)
                verticalLineTo(512f)
                horizontalLineToRelative(64f)
                verticalLineTo(412.8f)
                arcTo(160.07f, 160.07f, 0f, false, false, 352f, 256f)
                verticalLineTo(224f)
                horizontalLineToRelative(16f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(176f)
                arcTo(16f, 16f, 0f, false, false, 368f, 160f)
                close()
                moveTo(128f, 32f)
                arcToRelative(32f, 32f, 0f, false, false, -64f, 0f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(64f)
                close()
            }
        }.build()
        
        return _Plug!!
    }

private var _Plug: ImageVector? = null

