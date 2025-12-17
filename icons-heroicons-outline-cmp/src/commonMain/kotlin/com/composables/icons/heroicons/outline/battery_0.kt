package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Battery0: ImageVector
    get() {
        if (_Battery0 != null) return _Battery0!!
        
        _Battery0 = ImageVector.Builder(
            name = "battery-0",
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
                moveTo(21f, 10.5f)
                horizontalLineToRelative(0.375f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineToRelative(2.25f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                horizontalLineTo(21f)
                moveTo(3.75f, 18f)
                horizontalLineToRelative(15f)
                arcTo(2.25f, 2.25f, 0f, false, false, 21f, 15.75f)
                verticalLineToRelative(-6f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.25f, -2.25f)
                horizontalLineToRelative(-15f)
                arcTo(2.25f, 2.25f, 0f, false, false, 1.5f, 9.75f)
                verticalLineToRelative(6f)
                arcTo(2.25f, 2.25f, 0f, false, false, 3.75f, 18f)
                close()
            }
        }.build()
        
        return _Battery0!!
    }

private var _Battery0: ImageVector? = null

