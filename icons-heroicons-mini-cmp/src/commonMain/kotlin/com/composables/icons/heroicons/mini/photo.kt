package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Photo: ImageVector
    get() {
        if (_Photo != null) return _Photo!!
        
        _Photo = ImageVector.Builder(
            name = "photo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 5.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 3.25f, 3f)
                horizontalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 19f, 5.25f)
                verticalLineToRelative(9.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 16.75f, 17f)
                horizontalLineTo(3.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 1f, 14.75f)
                verticalLineToRelative(-9.5f)
                close()
                moveToRelative(1.5f, 5.81f)
                verticalLineToRelative(3.69f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(13.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-2.69f)
                lineToRelative(-2.22f, -2.219f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 0f)
                lineToRelative(-1.91f, 1.909f)
                lineToRelative(0.47f, 0.47f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineTo(6.53f, 8.091f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 0f)
                lineToRelative(-2.97f, 2.97f)
                close()
                moveTo(12f, 7f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                close()
            }
        }.build()
        
        return _Photo!!
    }

private var _Photo: ImageVector? = null

