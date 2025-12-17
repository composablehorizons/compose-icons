package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Newspaper: ImageVector
    get() {
        if (_Newspaper != null) return _Newspaper!!
        
        _Newspaper = ImageVector.Builder(
            name = "newspaper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(9f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(3f)
                close()
                moveTo(4f, 4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                close()
                moveToRelative(4f, 3.5f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineToRelative(4f)
                verticalLineTo(7.5f)
                close()
                moveToRelative(-4f, 3f)
                horizontalLineToRelative(4f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineToRelative(-1.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(6.25f)
                arcToRelative(1.25f, 1.25f, 0f, true, false, 2.5f, 0f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
            }
        }.build()
        
        return _Newspaper!!
    }

private var _Newspaper: ImageVector? = null

