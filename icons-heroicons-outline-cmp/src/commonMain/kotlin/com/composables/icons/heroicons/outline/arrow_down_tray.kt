package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowDownTray: ImageVector
    get() {
        if (_ArrowDownTray != null) return _ArrowDownTray!!
        
        _ArrowDownTray = ImageVector.Builder(
            name = "arrow-down-tray",
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
                moveTo(3f, 16.5f)
                verticalLineToRelative(2.25f)
                arcTo(2.25f, 2.25f, 0f, false, false, 5.25f, 21f)
                horizontalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 21f, 18.75f)
                verticalLineTo(16.5f)
                moveTo(16.5f, 12f)
                lineTo(12f, 16.5f)
                moveToRelative(0f, 0f)
                lineTo(7.5f, 12f)
                moveToRelative(4.5f, 4.5f)
                verticalLineTo(3f)
            }
        }.build()
        
        return _ArrowDownTray!!
    }

private var _ArrowDownTray: ImageVector? = null

