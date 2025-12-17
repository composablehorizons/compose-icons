package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Heading: ImageVector
    get() {
        if (_Heading != null) return _Heading!!
        
        _Heading = ImageVector.Builder(
            name = "heading",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 96f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, 16f)
                horizontalLineTo(320f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, -16f)
                horizontalLineToRelative(32f)
                verticalLineTo(288f)
                horizontalLineTo(160f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, 16f)
                horizontalLineTo(32f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, -16f)
                horizontalLineToRelative(32f)
                verticalLineTo(96f)
                horizontalLineTo(32f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, -16f)
                verticalLineTo(48f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, -16f)
                horizontalLineToRelative(160f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, 16f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(192f)
                verticalLineTo(96f)
                horizontalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, -16f)
                verticalLineTo(48f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, -16f)
                horizontalLineToRelative(160f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, 16f)
                close()
            }
        }.build()
        
        return _Heading!!
    }

private var _Heading: ImageVector? = null

