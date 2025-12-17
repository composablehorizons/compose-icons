package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Pager: ImageVector
    get() {
        if (_Pager != null) return _Pager!!
        
        _Pager = ImageVector.Builder(
            name = "pager",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 64f)
                horizontalLineTo(64f)
                arcToRelative(64f, 64f, 0f, false, false, -64f, 64f)
                verticalLineToRelative(256f)
                arcToRelative(64f, 64f, 0f, false, false, 64f, 64f)
                horizontalLineToRelative(384f)
                arcToRelative(64f, 64f, 0f, false, false, 64f, -64f)
                verticalLineTo(128f)
                arcToRelative(64f, 64f, 0f, false, false, -64f, -64f)
                close()
                moveTo(160f, 368f)
                horizontalLineTo(80f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, -16f)
                verticalLineToRelative(-16f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, -16f)
                horizontalLineToRelative(80f)
                close()
                moveToRelative(128f, -16f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, 16f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(80f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, 16f)
                close()
                moveToRelative(160f, -128f)
                arcToRelative(32f, 32f, 0f, false, true, -32f, 32f)
                horizontalLineTo(96f)
                arcToRelative(32f, 32f, 0f, false, true, -32f, -32f)
                verticalLineToRelative(-64f)
                arcToRelative(32f, 32f, 0f, false, true, 32f, -32f)
                horizontalLineToRelative(320f)
                arcToRelative(32f, 32f, 0f, false, true, 32f, 32f)
                close()
            }
        }.build()
        
        return _Pager!!
    }

private var _Pager: ImageVector? = null

