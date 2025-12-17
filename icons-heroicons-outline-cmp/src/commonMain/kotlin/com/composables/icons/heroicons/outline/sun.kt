package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Sun: ImageVector
    get() {
        if (_Sun != null) return _Sun!!
        
        _Sun = ImageVector.Builder(
            name = "sun",
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
                moveTo(12f, 3f)
                verticalLineToRelative(2.25f)
                moveToRelative(6.364f, 0.386f)
                lineToRelative(-1.591f, 1.591f)
                moveTo(21f, 12f)
                horizontalLineToRelative(-2.25f)
                moveToRelative(-0.386f, 6.364f)
                lineToRelative(-1.591f, -1.591f)
                moveTo(12f, 18.75f)
                verticalLineTo(21f)
                moveToRelative(-4.773f, -4.227f)
                lineToRelative(-1.591f, 1.591f)
                moveTo(5.25f, 12f)
                horizontalLineTo(3f)
                moveToRelative(4.227f, -4.773f)
                lineTo(5.636f, 5.636f)
                moveTo(15.75f, 12f)
                arcToRelative(3.75f, 3.75f, 0f, true, true, -7.5f, 0f)
                arcToRelative(3.75f, 3.75f, 0f, false, true, 7.5f, 0f)
                close()
            }
        }.build()
        
        return _Sun!!
    }

private var _Sun: ImageVector? = null

