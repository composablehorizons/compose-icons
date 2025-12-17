package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.H1: ImageVector
    get() {
        if (_H1 != null) return _H1!!
        
        _H1 = ImageVector.Builder(
            name = "h1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(2.243f, 4.493f)
                verticalLineToRelative(7.5f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(7.502f)
                moveToRelative(0f, -7.501f)
                horizontalLineToRelative(10.5f)
                moveToRelative(0f, -7.5f)
                verticalLineToRelative(7.5f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(7.501f)
                moveToRelative(4.501f, -8.627f)
                lineToRelative(2.25f, -1.5f)
                verticalLineToRelative(10.126f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(-2.25f)
                moveToRelative(2.25f, 0f)
                horizontalLineToRelative(2.25f)
            }
        }.build()
        
        return _H1!!
    }

private var _H1: ImageVector? = null

