package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.EyeDropper: ImageVector
    get() {
        if (_EyeDropper != null) return _EyeDropper!!
        
        _EyeDropper = ImageVector.Builder(
            name = "eye-dropper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.098f, 2.598f)
                arcToRelative(3.75f, 3.75f, 0f, true, true, 3.622f, 6.275f)
                lineToRelative(-1.72f, 0.46f)
                verticalLineTo(12f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.22f, 0.53f)
                lineToRelative(-0.75f, 0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineToRelative(-0.97f, -0.97f)
                lineToRelative(-7.94f, 7.94f)
                arcToRelative(2.56f, 2.56f, 0f, false, true, -1.81f, 0.75f)
                arcToRelative(1.06f, 1.06f, 0f, false, false, -0.75f, 0.31f)
                lineToRelative(-0.97f, 0.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineToRelative(-0.75f, -0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                lineToRelative(0.97f, -0.97f)
                arcToRelative(1.06f, 1.06f, 0f, false, false, 0.31f, -0.75f)
                curveToRelative(0f, -0.68f, 0.27f, -1.33f, 0.75f, -1.81f)
                lineTo(11.69f, 9f)
                lineToRelative(-0.97f, -0.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                lineToRelative(0.75f, -0.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 12f, 6f)
                horizontalLineToRelative(2.666f)
                lineToRelative(0.461f, -1.72f)
                curveToRelative(0.165f, -0.617f, 0.49f, -1.2f, 0.971f, -1.682f)
                close()
                moveToRelative(-3.348f, 7.463f)
                lineTo(4.81f, 18f)
                arcToRelative(1.06f, 1.06f, 0f, false, false, -0.31f, 0.75f)
                curveToRelative(0f, 0.318f, -0.06f, 0.63f, -0.172f, 0.922f)
                arcToRelative(2.56f, 2.56f, 0f, false, true, 0.922f, -0.172f)
                curveToRelative(0.281f, 0f, 0.551f, -0.112f, 0.75f, -0.31f)
                lineToRelative(7.94f, -7.94f)
                lineToRelative(-1.19f, -1.19f)
                close()
            }
        }.build()
        
        return _EyeDropper!!
    }

private var _EyeDropper: ImageVector? = null

