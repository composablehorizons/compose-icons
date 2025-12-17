package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.RectangleStack: ImageVector
    get() {
        if (_RectangleStack != null) return _RectangleStack!!
        
        _RectangleStack = ImageVector.Builder(
            name = "rectangle-stack",
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
                moveTo(6f, 6.878f)
                verticalLineTo(6f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 2.25f, -2.25f)
                horizontalLineToRelative(7.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 18f, 6f)
                verticalLineToRelative(0.878f)
                moveToRelative(-12f, 0f)
                curveToRelative(0.235f, -0.083f, 0.487f, -0.128f, 0.75f, -0.128f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.263f, 0f, 0.515f, 0.045f, 0.75f, 0.128f)
                moveToRelative(-12f, 0f)
                arcTo(2.25f, 2.25f, 0f, false, false, 4.5f, 9f)
                verticalLineToRelative(0.878f)
                moveToRelative(13.5f, -3f)
                arcTo(2.25f, 2.25f, 0f, false, true, 19.5f, 9f)
                verticalLineToRelative(0.878f)
                moveToRelative(0f, 0f)
                arcToRelative(2.246f, 2.246f, 0f, false, false, -0.75f, -0.128f)
                horizontalLineTo(5.25f)
                curveToRelative(-0.263f, 0f, -0.515f, 0.045f, -0.75f, 0.128f)
                moveToRelative(15f, 0f)
                arcTo(2.25f, 2.25f, 0f, false, true, 21f, 12f)
                verticalLineToRelative(6f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.25f, 2.25f)
                horizontalLineTo(5.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 3f, 18f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.98f, 0.626f, -1.813f, 1.5f, -2.122f)
            }
        }.build()
        
        return _RectangleStack!!
    }

private var _RectangleStack: ImageVector? = null

