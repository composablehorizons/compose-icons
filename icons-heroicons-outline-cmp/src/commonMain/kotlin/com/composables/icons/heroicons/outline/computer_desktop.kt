package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ComputerDesktop: ImageVector
    get() {
        if (_ComputerDesktop != null) return _ComputerDesktop!!
        
        _ComputerDesktop = ImageVector.Builder(
            name = "computer-desktop",
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
                moveTo(9f, 17.25f)
                verticalLineToRelative(1.007f)
                arcToRelative(3f, 3f, 0f, false, true, -0.879f, 2.122f)
                lineTo(7.5f, 21f)
                horizontalLineToRelative(9f)
                lineToRelative(-0.621f, -0.621f)
                arcTo(3f, 3f, 0f, false, true, 15f, 18.257f)
                verticalLineTo(17.25f)
                moveToRelative(6f, -12f)
                verticalLineTo(15f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.25f, 2.25f)
                horizontalLineTo(5.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 3f, 15f)
                verticalLineTo(5.25f)
                moveToRelative(18f, 0f)
                arcTo(2.25f, 2.25f, 0f, false, false, 18.75f, 3f)
                horizontalLineTo(5.25f)
                arcTo(2.25f, 2.25f, 0f, false, false, 3f, 5.25f)
                moveToRelative(18f, 0f)
                verticalLineTo(12f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.25f, 2.25f)
                horizontalLineTo(5.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 3f, 12f)
                verticalLineTo(5.25f)
            }
        }.build()
        
        return _ComputerDesktop!!
    }

private var _ComputerDesktop: ImageVector? = null

