package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Language: ImageVector
    get() {
        if (_Language != null) return _Language!!
        
        _Language = ImageVector.Builder(
            name = "language",
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
                moveTo(10.5f, 21f)
                lineToRelative(5.25f, -11.25f)
                lineTo(21f, 21f)
                moveToRelative(-9f, -3f)
                horizontalLineToRelative(7.5f)
                moveTo(3f, 5.621f)
                arcToRelative(48.474f, 48.474f, 0f, false, true, 6f, -0.371f)
                moveToRelative(0f, 0f)
                curveToRelative(1.12f, 0f, 2.233f, 0.038f, 3.334f, 0.114f)
                moveTo(9f, 5.25f)
                verticalLineTo(3f)
                moveToRelative(3.334f, 2.364f)
                curveTo(11.176f, 10.658f, 7.69f, 15.08f, 3f, 17.502f)
                moveToRelative(9.334f, -12.138f)
                curveToRelative(0.896f, 0.061f, 1.785f, 0.147f, 2.666f, 0.257f)
                moveToRelative(-4.589f, 8.495f)
                arcToRelative(18.023f, 18.023f, 0f, false, true, -3.827f, -5.802f)
            }
        }.build()
        
        return _Language!!
    }

private var _Language: ImageVector? = null

