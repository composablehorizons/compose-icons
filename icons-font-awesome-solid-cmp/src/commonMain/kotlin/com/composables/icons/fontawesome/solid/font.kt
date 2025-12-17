package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Font: ImageVector
    get() {
        if (_Font != null) return _Font!!
        
        _Font = ImageVector.Builder(
            name = "font",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(432f, 416f)
                horizontalLineToRelative(-23.41f)
                lineTo(277.88f, 53.69f)
                arcTo(32f, 32f, 0f, false, false, 247.58f, 32f)
                horizontalLineToRelative(-47.16f)
                arcToRelative(32f, 32f, 0f, false, false, -30.3f, 21.69f)
                lineTo(39.41f, 416f)
                horizontalLineTo(16f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(128f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineToRelative(-19.58f)
                lineToRelative(23.3f, -64f)
                horizontalLineToRelative(152.56f)
                lineToRelative(23.3f, 64f)
                horizontalLineTo(304f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(128f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
                moveTo(176.85f, 272f)
                lineTo(224f, 142.51f)
                lineTo(271.15f, 272f)
                close()
            }
        }.build()
        
        return _Font!!
    }

private var _Font: ImageVector? = null

