package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Cube: ImageVector
    get() {
        if (_Cube != null) return _Cube!!
        
        _Cube = ImageVector.Builder(
            name = "cube",
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
                moveTo(21f, 7.5f)
                lineToRelative(-9f, -5.25f)
                lineTo(3f, 7.5f)
                moveToRelative(18f, 0f)
                lineToRelative(-9f, 5.25f)
                moveToRelative(9f, -5.25f)
                verticalLineToRelative(9f)
                lineToRelative(-9f, 5.25f)
                moveTo(3f, 7.5f)
                lineToRelative(9f, 5.25f)
                moveTo(3f, 7.5f)
                verticalLineToRelative(9f)
                lineToRelative(9f, 5.25f)
                moveToRelative(0f, -9f)
                verticalLineToRelative(9f)
            }
        }.build()
        
        return _Cube!!
    }

private var _Cube: ImageVector? = null

