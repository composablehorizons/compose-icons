package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ListUl: ImageVector
    get() {
        if (_ListUl != null) return _ListUl!!
        
        _ListUl = ImageVector.Builder(
            name = "list-ul",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(48f, 48f)
                arcToRelative(48f, 48f, 0f, true, false, 48f, 48f)
                arcToRelative(48f, 48f, 0f, false, false, -48f, -48f)
                close()
                moveToRelative(0f, 160f)
                arcToRelative(48f, 48f, 0f, true, false, 48f, 48f)
                arcToRelative(48f, 48f, 0f, false, false, -48f, -48f)
                close()
                moveToRelative(0f, 160f)
                arcToRelative(48f, 48f, 0f, true, false, 48f, 48f)
                arcToRelative(48f, 48f, 0f, false, false, -48f, -48f)
                close()
                moveToRelative(448f, 16f)
                horizontalLineTo(176f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(320f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
                moveToRelative(0f, -320f)
                horizontalLineTo(176f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(320f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(80f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineTo(176f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(320f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
            }
        }.build()
        
        return _ListUl!!
    }

private var _ListUl: ImageVector? = null

