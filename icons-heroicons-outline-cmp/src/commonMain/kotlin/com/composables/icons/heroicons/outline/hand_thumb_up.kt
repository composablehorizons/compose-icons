package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.HandThumbUp: ImageVector
    get() {
        if (_HandThumbUp != null) return _HandThumbUp!!
        
        _HandThumbUp = ImageVector.Builder(
            name = "hand-thumb-up",
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
                moveTo(6.633f, 10.25f)
                curveToRelative(0.806f, 0f, 1.533f, -0.446f, 2.031f, -1.08f)
                arcToRelative(9.041f, 9.041f, 0f, false, true, 2.861f, -2.4f)
                curveToRelative(0.723f, -0.384f, 1.35f, -0.956f, 1.653f, -1.715f)
                arcToRelative(4.498f, 4.498f, 0f, false, false, 0.322f, -1.672f)
                verticalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 2.25f, 2.25f)
                curveToRelative(0f, 1.152f, -0.26f, 2.243f, -0.723f, 3.218f)
                curveToRelative(-0.266f, 0.558f, 0.107f, 1.282f, 0.725f, 1.282f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(3.126f)
                curveToRelative(1.026f, 0f, 1.945f, 0.694f, 2.054f, 1.715f)
                curveToRelative(0.045f, 0.422f, 0.068f, 0.85f, 0.068f, 1.285f)
                arcToRelative(11.95f, 11.95f, 0f, false, true, -2.649f, 7.521f)
                curveToRelative(-0.388f, 0.482f, -0.987f, 0.729f, -1.605f, 0.729f)
                horizontalLineTo(13.48f)
                curveToRelative(-0.483f, 0f, -0.964f, -0.078f, -1.423f, -0.23f)
                lineToRelative(-3.114f, -1.04f)
                arcToRelative(4.501f, 4.501f, 0f, false, false, -1.423f, -0.23f)
                horizontalLineTo(5.904f)
                moveToRelative(10.598f, -9.75f)
                horizontalLineTo(14.25f)
                moveTo(5.904f, 18.5f)
                curveToRelative(0.083f, 0.205f, 0.173f, 0.405f, 0.27f, 0.602f)
                curveToRelative(0.197f, 0.4f, -0.078f, 0.898f, -0.523f, 0.898f)
                horizontalLineToRelative(-0.908f)
                curveToRelative(-0.889f, 0f, -1.713f, -0.518f, -1.972f, -1.368f)
                arcToRelative(12f, 12f, 0f, false, true, -0.521f, -3.507f)
                curveToRelative(0f, -1.553f, 0.295f, -3.036f, 0.831f, -4.398f)
                curveTo(3.387f, 9.953f, 4.167f, 9.5f, 5f, 9.5f)
                horizontalLineToRelative(1.053f)
                curveToRelative(0.472f, 0f, 0.745f, 0.556f, 0.5f, 0.96f)
                arcToRelative(8.958f, 8.958f, 0f, false, false, -1.302f, 4.665f)
                curveToRelative(0f, 1.194f, 0.232f, 2.333f, 0.654f, 3.375f)
                close()
            }
        }.build()
        
        return _HandThumbUp!!
    }

private var _HandThumbUp: ImageVector? = null

