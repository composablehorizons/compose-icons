package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Superscript: ImageVector
    get() {
        if (_Superscript != null) return _Superscript!!
        
        _Superscript = ImageVector.Builder(
            name = "superscript",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(496f, 160f)
                horizontalLineToRelative(-16f)
                verticalLineTo(16f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineToRelative(-48f)
                arcToRelative(16f, 16f, 0f, false, false, -14.29f, 8.83f)
                lineToRelative(-16f, 32f)
                arcTo(16f, 16f, 0f, false, false, 400f, 64f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(-16f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(96f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
                moveTo(336f, 64f)
                horizontalLineToRelative(-67f)
                arcToRelative(16f, 16f, 0f, false, false, -13.14f, 6.87f)
                lineToRelative(-79.9f, 115f)
                lineToRelative(-79.9f, -115f)
                arcTo(16f, 16f, 0f, false, false, 83f, 64f)
                horizontalLineTo(16f)
                arcTo(16f, 16f, 0f, false, false, 0f, 80f)
                verticalLineToRelative(48f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(33.48f)
                lineToRelative(77.81f, 112f)
                lineToRelative(-77.81f, 112f)
                horizontalLineTo(16f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(48f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(67f)
                arcToRelative(16f, 16f, 0f, false, false, 13.14f, -6.87f)
                lineToRelative(79.9f, -115f)
                lineToRelative(79.9f, 115f)
                arcTo(16f, 16f, 0f, false, false, 269f, 448f)
                horizontalLineToRelative(67f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-48f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineToRelative(-33.48f)
                lineToRelative(-77.81f, -112f)
                lineToRelative(77.81f, -112f)
                horizontalLineTo(336f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(80f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
            }
        }.build()
        
        return _Superscript!!
    }

private var _Superscript: ImageVector? = null

