package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Trophy: ImageVector
    get() {
        if (_Trophy != null) return _Trophy!!
        
        _Trophy = ImageVector.Builder(
            name = "trophy",
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
                moveTo(16.5f, 18.75f)
                horizontalLineToRelative(-9f)
                moveToRelative(9f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                horizontalLineToRelative(-15f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                moveToRelative(9f, 0f)
                verticalLineToRelative(-3.375f)
                curveToRelative(0f, -0.621f, -0.503f, -1.125f, -1.125f, -1.125f)
                horizontalLineToRelative(-0.871f)
                moveTo(7.5f, 18.75f)
                verticalLineToRelative(-3.375f)
                curveToRelative(0f, -0.621f, 0.504f, -1.125f, 1.125f, -1.125f)
                horizontalLineToRelative(0.872f)
                moveToRelative(5.007f, 0f)
                horizontalLineTo(9.497f)
                moveToRelative(5.007f, 0f)
                arcToRelative(7.454f, 7.454f, 0f, false, true, -0.982f, -3.172f)
                moveTo(9.497f, 14.25f)
                arcToRelative(7.454f, 7.454f, 0f, false, false, 0.981f, -3.172f)
                moveTo(5.25f, 4.236f)
                curveToRelative(-0.982f, 0.143f, -1.954f, 0.317f, -2.916f, 0.52f)
                arcTo(6.003f, 6.003f, 0f, false, false, 7.73f, 9.728f)
                moveTo(5.25f, 4.236f)
                verticalLineTo(4.5f)
                curveToRelative(0f, 2.108f, 0.966f, 3.99f, 2.48f, 5.228f)
                moveTo(5.25f, 4.236f)
                verticalLineTo(2.721f)
                curveTo(7.456f, 2.41f, 9.71f, 2.25f, 12f, 2.25f)
                curveToRelative(2.291f, 0f, 4.545f, 0.16f, 6.75f, 0.47f)
                verticalLineToRelative(1.516f)
                moveTo(7.73f, 9.728f)
                arcToRelative(6.726f, 6.726f, 0f, false, false, 2.748f, 1.35f)
                moveToRelative(8.272f, -6.842f)
                verticalLineTo(4.5f)
                curveToRelative(0f, 2.108f, -0.966f, 3.99f, -2.48f, 5.228f)
                moveToRelative(2.48f, -5.492f)
                arcToRelative(46.32f, 46.32f, 0f, false, true, 2.916f, 0.52f)
                arcToRelative(6.003f, 6.003f, 0f, false, true, -5.395f, 4.972f)
                moveToRelative(0f, 0f)
                arcToRelative(6.726f, 6.726f, 0f, false, true, -2.749f, 1.35f)
                moveToRelative(0f, 0f)
                arcToRelative(6.772f, 6.772f, 0f, false, true, -3.044f, 0f)
            }
        }.build()
        
        return _Trophy!!
    }

private var _Trophy: ImageVector? = null

