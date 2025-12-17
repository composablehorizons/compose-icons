package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Stop: ImageVector
    get() {
        if (_Stop != null) return _Stop!!
        
        _Stop = ImageVector.Builder(
            name = "stop",
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
                moveTo(5.25f, 7.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 7.5f, 5.25f)
                horizontalLineToRelative(9f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 2.25f, 2.25f)
                verticalLineToRelative(9f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.25f, 2.25f)
                horizontalLineToRelative(-9f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.25f, -2.25f)
                verticalLineToRelative(-9f)
                close()
            }
        }.build()
        
        return _Stop!!
    }

private var _Stop: ImageVector? = null

