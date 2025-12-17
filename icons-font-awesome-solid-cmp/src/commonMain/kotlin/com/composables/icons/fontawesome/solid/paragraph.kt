package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Paragraph: ImageVector
    get() {
        if (_Paragraph != null) return _Paragraph!!
        
        _Paragraph = ImageVector.Builder(
            name = "paragraph",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 48f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, 16f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(368f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, 16f)
                horizontalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, -16f)
                verticalLineTo(96f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(368f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, 16f)
                horizontalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, -16f)
                verticalLineTo(352f)
                horizontalLineToRelative(-32f)
                arcToRelative(160f, 160f, 0f, false, true, 0f, -320f)
                horizontalLineToRelative(240f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, 16f)
                close()
            }
        }.build()
        
        return _Paragraph!!
    }

private var _Paragraph: ImageVector? = null

