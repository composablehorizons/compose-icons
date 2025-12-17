package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.EmojiAstonished: ImageVector
    get() {
        if (_EmojiAstonished != null) return _EmojiAstonished!!
        
        _EmojiAstonished = ImageVector.Builder(
            name = "emoji-astonished",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 15f)
                arcTo(7f, 7f, 0f, true, true, 8f, 1f)
                arcToRelative(7f, 7f, 0f, false, true, 0f, 14f)
                moveToRelative(0f, 1f)
                arcTo(8f, 8f, 0f, true, false, 8f, 0f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 16f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 6.5f)
                curveTo(7f, 7.328f, 6.552f, 8f, 6f, 8f)
                reflectiveCurveToRelative(-1f, -0.672f, -1f, -1.5f)
                reflectiveCurveTo(5.448f, 5f, 6f, 5f)
                reflectiveCurveToRelative(1f, 0.672f, 1f, 1.5f)
                moveToRelative(4f, 0f)
                curveToRelative(0f, 0.828f, -0.448f, 1.5f, -1f, 1.5f)
                reflectiveCurveToRelative(-1f, -0.672f, -1f, -1.5f)
                reflectiveCurveTo(9.448f, 5f, 10f, 5f)
                reflectiveCurveToRelative(1f, 0.672f, 1f, 1.5f)
                moveTo(4.884f, 4.022f)
                arcToRelative(2f, 2f, 0f, false, true, 1.458f, -0.048f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.316f, -0.948f)
                arcToRelative(3f, 3f, 0f, false, false, -2.167f, 0.077f)
                arcToRelative(3.1f, 3.1f, 0f, false, false, -0.773f, 0.478f)
                quadToRelative(-0.036f, 0.03f, -0.07f, 0.064f)
                lineToRelative(-0.002f, 0.001f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.707f, 0.708f)
                lineToRelative(-0.001f, 0.002f)
                lineToRelative(0.001f, -0.002f)
                arcToRelative(2f, 2f, 0f, false, true, 0.122f, -0.1f)
                arcToRelative(2f, 2f, 0f, false, true, 0.41f, -0.232f)
                close()
                moveToRelative(6.232f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -1.458f, -0.048f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.316f, -0.948f)
                arcToRelative(3f, 3f, 0f, false, true, 2.168f, 0.077f)
                arcToRelative(3f, 3f, 0f, false, true, 0.773f, 0.478f)
                lineToRelative(0.07f, 0.064f)
                verticalLineToRelative(0.001f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.706f, 0.708f)
                lineToRelative(0.002f, 0.002f)
                lineToRelative(-0.002f, -0.002f)
                arcToRelative(2f, 2f, 0f, false, false, -0.122f, -0.1f)
                arcToRelative(2f, 2f, 0f, false, false, -0.41f, -0.232f)
                close()
                moveTo(8f, 10f)
                curveToRelative(-0.998f, 0f, -1.747f, 0.623f, -2.247f, 1.246f)
                curveToRelative(-0.383f, 0.478f, 0.08f, 1.06f, 0.687f, 0.98f)
                quadToRelative(1.56f, -0.202f, 3.12f, 0f)
                curveToRelative(0.606f, 0.08f, 1.07f, -0.502f, 0.687f, -0.98f)
                curveTo(9.747f, 10.623f, 8.998f, 10f, 8f, 10f)
            }
        }.build()
        
        return _EmojiAstonished!!
    }

private var _EmojiAstonished: ImageVector? = null

