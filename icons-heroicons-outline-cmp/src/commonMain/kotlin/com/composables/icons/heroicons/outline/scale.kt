package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Scale: ImageVector
    get() {
        if (_Scale != null) return _Scale!!
        
        _Scale = ImageVector.Builder(
            name = "scale",
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
                moveTo(12f, 3f)
                verticalLineToRelative(17.25f)
                moveToRelative(0f, 0f)
                curveToRelative(-1.472f, 0f, -2.882f, 0.265f, -4.185f, 0.75f)
                moveTo(12f, 20.25f)
                curveToRelative(1.472f, 0f, 2.882f, 0.265f, 4.185f, 0.75f)
                moveTo(18.75f, 4.97f)
                arcTo(48.416f, 48.416f, 0f, false, false, 12f, 4.5f)
                curveToRelative(-2.291f, 0f, -4.545f, 0.16f, -6.75f, 0.47f)
                moveToRelative(13.5f, 0f)
                curveToRelative(1.01f, 0.143f, 2.01f, 0.317f, 3f, 0.52f)
                moveToRelative(-3f, -0.52f)
                lineToRelative(2.62f, 10.726f)
                curveToRelative(0.122f, 0.499f, -0.106f, 1.028f, -0.589f, 1.202f)
                arcToRelative(5.988f, 5.988f, 0f, false, true, -2.031f, 0.352f)
                arcToRelative(5.988f, 5.988f, 0f, false, true, -2.031f, -0.352f)
                curveToRelative(-0.483f, -0.174f, -0.711f, -0.703f, -0.59f, -1.202f)
                lineTo(18.75f, 4.971f)
                close()
                moveToRelative(-16.5f, 0.52f)
                curveToRelative(0.99f, -0.203f, 1.99f, -0.377f, 3f, -0.52f)
                moveToRelative(0f, 0f)
                lineToRelative(2.62f, 10.726f)
                curveToRelative(0.122f, 0.499f, -0.106f, 1.028f, -0.589f, 1.202f)
                arcToRelative(5.989f, 5.989f, 0f, false, true, -2.031f, 0.352f)
                arcToRelative(5.989f, 5.989f, 0f, false, true, -2.031f, -0.352f)
                curveToRelative(-0.483f, -0.174f, -0.711f, -0.703f, -0.59f, -1.202f)
                lineTo(5.25f, 4.971f)
                close()
            }
        }.build()
        
        return _Scale!!
    }

private var _Scale: ImageVector? = null

