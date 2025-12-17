package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Tv: ImageVector
    get() {
        if (_Tv != null) return _Tv!!
        
        _Tv = ImageVector.Builder(
            name = "tv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(592f, 0f)
                horizontalLineTo(48f)
                arcTo(48f, 48f, 0f, false, false, 0f, 48f)
                verticalLineToRelative(320f)
                arcToRelative(48f, 48f, 0f, false, false, 48f, 48f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(32f)
                horizontalLineTo(112f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(416f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineTo(352f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(240f)
                arcToRelative(48f, 48f, 0f, false, false, 48f, -48f)
                verticalLineTo(48f)
                arcToRelative(48f, 48f, 0f, false, false, -48f, -48f)
                close()
                moveToRelative(-16f, 352f)
                horizontalLineTo(64f)
                verticalLineTo(64f)
                horizontalLineToRelative(512f)
                close()
            }
        }.build()
        
        return _Tv!!
    }

private var _Tv: ImageVector? = null

