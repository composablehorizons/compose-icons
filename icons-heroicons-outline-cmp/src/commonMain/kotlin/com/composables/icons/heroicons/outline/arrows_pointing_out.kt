package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowsPointingOut: ImageVector
    get() {
        if (_ArrowsPointingOut != null) return _ArrowsPointingOut!!
        
        _ArrowsPointingOut = ImageVector.Builder(
            name = "arrows-pointing-out",
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
                moveTo(3.75f, 3.75f)
                verticalLineToRelative(4.5f)
                moveToRelative(0f, -4.5f)
                horizontalLineToRelative(4.5f)
                moveToRelative(-4.5f, 0f)
                lineTo(9f, 9f)
                moveTo(3.75f, 20.25f)
                verticalLineToRelative(-4.5f)
                moveToRelative(0f, 4.5f)
                horizontalLineToRelative(4.5f)
                moveToRelative(-4.5f, 0f)
                lineTo(9f, 15f)
                moveTo(20.25f, 3.75f)
                horizontalLineToRelative(-4.5f)
                moveToRelative(4.5f, 0f)
                verticalLineToRelative(4.5f)
                moveToRelative(0f, -4.5f)
                lineTo(15f, 9f)
                moveToRelative(5.25f, 11.25f)
                horizontalLineToRelative(-4.5f)
                moveToRelative(4.5f, 0f)
                verticalLineToRelative(-4.5f)
                moveToRelative(0f, 4.5f)
                lineTo(15f, 15f)
            }
        }.build()
        
        return _ArrowsPointingOut!!
    }

private var _ArrowsPointingOut: ImageVector? = null

