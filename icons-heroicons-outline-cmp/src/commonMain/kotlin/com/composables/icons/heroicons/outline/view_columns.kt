package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ViewColumns: ImageVector
    get() {
        if (_ViewColumns != null) return _ViewColumns!!
        
        _ViewColumns = ImageVector.Builder(
            name = "view-columns",
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
                moveTo(9f, 4.5f)
                verticalLineToRelative(15f)
                moveToRelative(6f, -15f)
                verticalLineToRelative(15f)
                moveToRelative(-10.875f, 0f)
                horizontalLineToRelative(15.75f)
                curveToRelative(0.621f, 0f, 1.125f, -0.504f, 1.125f, -1.125f)
                verticalLineTo(5.625f)
                curveToRelative(0f, -0.621f, -0.504f, -1.125f, -1.125f, -1.125f)
                horizontalLineTo(4.125f)
                curveTo(3.504f, 4.5f, 3f, 5.004f, 3f, 5.625f)
                verticalLineToRelative(12.75f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                close()
            }
        }.build()
        
        return _ViewColumns!!
    }

private var _ViewColumns: ImageVector? = null

