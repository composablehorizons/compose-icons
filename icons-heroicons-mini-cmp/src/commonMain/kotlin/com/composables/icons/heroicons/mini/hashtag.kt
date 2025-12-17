package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Hashtag: ImageVector
    get() {
        if (_Hashtag != null) return _Hashtag!!
        
        _Hashtag = ImageVector.Builder(
            name = "hashtag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.493f, 2.852f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.486f, -0.204f)
                lineTo(7.545f, 6f)
                horizontalLineTo(4.198f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(3.14f)
                lineToRelative(-0.69f, 5f)
                horizontalLineTo(3.302f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(3.14f)
                lineToRelative(-0.435f, 3.148f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.486f, 0.204f)
                lineTo(7.955f, 14f)
                horizontalLineToRelative(2.986f)
                lineToRelative(-0.434f, 3.148f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.486f, 0.204f)
                lineTo(12.456f, 14f)
                horizontalLineToRelative(3.346f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-3.14f)
                lineToRelative(0.69f, -5f)
                horizontalLineToRelative(3.346f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-3.14f)
                lineToRelative(0.435f, -3.148f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.486f, -0.204f)
                lineTo(12.045f, 6f)
                horizontalLineTo(9.059f)
                lineToRelative(0.434f, -3.148f)
                close()
                moveTo(8.852f, 7.5f)
                lineToRelative(-0.69f, 5f)
                horizontalLineToRelative(2.986f)
                lineToRelative(0.69f, -5f)
                horizontalLineTo(8.852f)
                close()
            }
        }.build()
        
        return _Hashtag!!
    }

private var _Hashtag: ImageVector? = null

