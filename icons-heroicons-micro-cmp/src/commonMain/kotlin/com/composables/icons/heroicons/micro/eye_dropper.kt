package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.EyeDropper: ImageVector
    get() {
        if (_EyeDropper != null) return _EyeDropper!!
        
        _EyeDropper = ImageVector.Builder(
            name = "eye-dropper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 4f)
                arcToRelative(3.001f, 3.001f, 0f, false, true, -2.25f, 2.905f)
                verticalLineTo(8.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.22f, 0.53f)
                lineToRelative(-0.5f, 0.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineToRelative(-0.72f, -0.72f)
                lineToRelative(-4.677f, 4.678f)
                arcTo(1.75f, 1.75f, 0f, false, true, 4.336f, 14f)
                horizontalLineToRelative(-0.672f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.177f, 0.073f)
                lineToRelative(-0.707f, 0.707f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineToRelative(-0.5f, -0.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                lineToRelative(0.707f, -0.707f)
                arcTo(0.25f, 0.25f, 0f, false, false, 2f, 12.336f)
                verticalLineToRelative(-0.672f)
                curveToRelative(0f, -0.464f, 0.184f, -0.909f, 0.513f, -1.237f)
                lineTo(7.189f, 5.75f)
                lineToRelative(-0.72f, -0.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                lineToRelative(0.5f, -0.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.531f, -0.22f)
                horizontalLineToRelative(1.595f)
                arcTo(3.001f, 3.001f, 0f, false, true, 15f, 4f)
                close()
                moveTo(9.19f, 7.75f)
                lineToRelative(-0.94f, -0.94f)
                lineToRelative(-4.677f, 4.678f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.073f, 0.176f)
                verticalLineToRelative(0.672f)
                curveToRelative(0f, 0.058f, -0.003f, 0.115f, -0.009f, 0.173f)
                arcToRelative(1.74f, 1.74f, 0f, false, true, 0.173f, -0.009f)
                horizontalLineToRelative(0.672f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.177f, -0.073f)
                lineTo(9.189f, 7.75f)
                close()
            }
        }.build()
        
        return _EyeDropper!!
    }

private var _EyeDropper: ImageVector? = null

