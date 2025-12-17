package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.HomeModern: ImageVector
    get() {
        if (_HomeModern != null) return _HomeModern!!
        
        _HomeModern = ImageVector.Builder(
            name = "home-modern",
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
                moveTo(8.25f, 21f)
                verticalLineToRelative(-4.875f)
                curveToRelative(0f, -0.621f, 0.504f, -1.125f, 1.125f, -1.125f)
                horizontalLineToRelative(2.25f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineTo(21f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(4.5f)
                verticalLineTo(3.545f)
                moveTo(12.75f, 21f)
                horizontalLineToRelative(7.5f)
                verticalLineTo(10.75f)
                moveTo(2.25f, 21f)
                horizontalLineToRelative(1.5f)
                moveToRelative(18f, 0f)
                horizontalLineToRelative(-18f)
                moveTo(2.25f, 9f)
                lineToRelative(4.5f, -1.636f)
                moveTo(18.75f, 3f)
                lineToRelative(-1.5f, 0.545f)
                moveToRelative(0f, 6.205f)
                lineToRelative(3f, 1f)
                moveToRelative(1.5f, 0.5f)
                lineToRelative(-1.5f, -0.5f)
                moveTo(6.75f, 7.364f)
                verticalLineTo(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(18f)
                moveToRelative(3f, -13.636f)
                lineToRelative(10.5f, -3.819f)
            }
        }.build()
        
        return _HomeModern!!
    }

private var _HomeModern: ImageVector? = null

