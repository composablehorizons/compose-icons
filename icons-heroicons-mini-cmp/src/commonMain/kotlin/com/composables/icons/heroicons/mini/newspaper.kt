package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Newspaper: ImageVector
    get() {
        if (_Newspaper != null) return _Newspaper!!
        
        _Newspaper = ImageVector.Builder(
            name = "newspaper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3.5f, 2f)
                horizontalLineToRelative(9f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14f, 3.5f)
                verticalLineToRelative(11.75f)
                arcTo(2.75f, 2.75f, 0f, false, false, 16.75f, 18f)
                horizontalLineToRelative(-12f)
                arcTo(2.75f, 2.75f, 0f, false, true, 2f, 15.25f)
                verticalLineTo(3.5f)
                close()
                moveToRelative(3.75f, 7f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-4.5f)
                close()
                moveToRelative(0f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(5f, 5.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 5.75f, 5f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-4.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 5f, 8.25f)
                verticalLineToRelative(-2.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.5f, 6.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(8.75f)
                arcToRelative(1.25f, 1.25f, 0f, true, false, 2.5f, 0f)
                verticalLineTo(8f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.5f, -1.5f)
                close()
            }
        }.build()
        
        return _Newspaper!!
    }

private var _Newspaper: ImageVector? = null

