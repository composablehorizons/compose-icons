package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Tv: ImageVector
    get() {
        if (_Tv != null) return _Tv!!
        
        _Tv = ImageVector.Builder(
            name = "tv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(7f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2.5f, 2f)
                horizontalLineToRelative(15f)
                arcTo(1.5f, 1.5f, 0f, false, true, 19f, 3.5f)
                verticalLineToRelative(10f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineTo(12f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(4.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(2.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1f, 13.5f)
                verticalLineToRelative(-10f)
                close()
                moveToRelative(16.5f, 0f)
                horizontalLineToRelative(-15f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-10f)
                close()
            }
        }.build()
        
        return _Tv!!
    }

private var _Tv: ImageVector? = null

