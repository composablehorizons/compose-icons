package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Link: ImageVector
    get() {
        if (_Link != null) return _Link!!
        
        _Link = ImageVector.Builder(
            name = "link",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(13.19f, 8.688f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 1.242f, 7.244f)
                lineToRelative(-4.5f, 4.5f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -6.364f, -6.364f)
                lineToRelative(1.757f, -1.757f)
                moveToRelative(13.35f, -0.622f)
                lineToRelative(1.757f, -1.757f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -6.364f, -6.364f)
                lineToRelative(-4.5f, 4.5f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 1.242f, 7.244f)
            }
        }.build()
        
        return _Link!!
    }

private var _Link: ImageVector? = null

