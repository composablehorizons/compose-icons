package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowsPointingIn: ImageVector
    get() {
        if (_ArrowsPointingIn != null) return _ArrowsPointingIn!!
        
        _ArrowsPointingIn = ImageVector.Builder(
            name = "arrows-pointing-in",
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
                moveTo(9f, 9f)
                verticalLineTo(4.5f)
                moveTo(9f, 9f)
                horizontalLineTo(4.5f)
                moveTo(9f, 9f)
                lineTo(3.75f, 3.75f)
                moveTo(9f, 15f)
                verticalLineToRelative(4.5f)
                moveTo(9f, 15f)
                horizontalLineTo(4.5f)
                moveTo(9f, 15f)
                lineToRelative(-5.25f, 5.25f)
                moveTo(15f, 9f)
                horizontalLineToRelative(4.5f)
                moveTo(15f, 9f)
                verticalLineTo(4.5f)
                moveTo(15f, 9f)
                lineToRelative(5.25f, -5.25f)
                moveTo(15f, 15f)
                horizontalLineToRelative(4.5f)
                moveTo(15f, 15f)
                verticalLineToRelative(4.5f)
                moveToRelative(0f, -4.5f)
                lineToRelative(5.25f, 5.25f)
            }
        }.build()
        
        return _ArrowsPointingIn!!
    }

private var _ArrowsPointingIn: ImageVector? = null

