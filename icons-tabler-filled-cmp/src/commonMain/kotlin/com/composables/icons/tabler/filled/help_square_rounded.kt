package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.HelpSquareRounded: ImageVector
    get() {
        if (_HelpSquareRounded != null) return _HelpSquareRounded!!
        
        _HelpSquareRounded = ImageVector.Builder(
            name = "help-square-rounded",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                lineToRelative(0.642f, 0.005f)
                lineToRelative(0.616f, 0.017f)
                lineToRelative(0.299f, 0.013f)
                lineToRelative(0.579f, 0.034f)
                lineToRelative(0.553f, 0.046f)
                curveToRelative(4.687f, 0.455f, 6.65f, 2.333f, 7.166f, 6.906f)
                lineToRelative(0.03f, 0.29f)
                lineToRelative(0.046f, 0.553f)
                lineToRelative(0.041f, 0.727f)
                lineToRelative(0.006f, 0.15f)
                lineToRelative(0.017f, 0.617f)
                lineToRelative(0.005f, 0.642f)
                lineToRelative(-0.005f, 0.642f)
                lineToRelative(-0.017f, 0.616f)
                lineToRelative(-0.013f, 0.299f)
                lineToRelative(-0.034f, 0.579f)
                lineToRelative(-0.046f, 0.553f)
                curveToRelative(-0.455f, 4.687f, -2.333f, 6.65f, -6.906f, 7.166f)
                lineToRelative(-0.29f, 0.03f)
                lineToRelative(-0.553f, 0.046f)
                lineToRelative(-0.727f, 0.041f)
                lineToRelative(-0.15f, 0.006f)
                lineToRelative(-0.617f, 0.017f)
                lineToRelative(-0.642f, 0.005f)
                lineToRelative(-0.642f, -0.005f)
                lineToRelative(-0.616f, -0.017f)
                lineToRelative(-0.299f, -0.013f)
                lineToRelative(-0.579f, -0.034f)
                lineToRelative(-0.553f, -0.046f)
                curveToRelative(-4.687f, -0.455f, -6.65f, -2.333f, -7.166f, -6.906f)
                lineToRelative(-0.03f, -0.29f)
                lineToRelative(-0.046f, -0.553f)
                lineToRelative(-0.041f, -0.727f)
                lineToRelative(-0.006f, -0.15f)
                lineToRelative(-0.017f, -0.617f)
                lineToRelative(-0.004f, -0.318f)
                verticalLineToRelative(-0.648f)
                lineToRelative(0.004f, -0.318f)
                lineToRelative(0.017f, -0.616f)
                lineToRelative(0.013f, -0.299f)
                lineToRelative(0.034f, -0.579f)
                lineToRelative(0.046f, -0.553f)
                curveToRelative(0.455f, -4.687f, 2.333f, -6.65f, 6.906f, -7.166f)
                lineToRelative(0.29f, -0.03f)
                lineToRelative(0.553f, -0.046f)
                lineToRelative(0.727f, -0.041f)
                lineToRelative(0.15f, -0.006f)
                lineToRelative(0.617f, -0.017f)
                curveToRelative(0.21f, -0.003f, 0.424f, -0.005f, 0.642f, -0.005f)
                close()
                moveToRelative(0f, 13f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.986f, 0f)
                lineToRelative(0.007f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                close()
                moveToRelative(1.368f, -6.673f)
                arcToRelative(2.98f, 2.98f, 0f, false, false, -3.631f, 0.728f)
                arcToRelative(1f, 1f, 0f, false, false, 1.44f, 1.383f)
                lineToRelative(0.171f, -0.18f)
                arcToRelative(0.98f, 0.98f, 0f, false, true, 1.11f, -0.15f)
                arcToRelative(1f, 1f, 0f, false, true, -0.34f, 1.886f)
                lineToRelative(-0.232f, 0.012f)
                arcToRelative(1f, 1f, 0f, false, false, 0.111f, 1.994f)
                arcToRelative(3f, 3f, 0f, false, false, 1.371f, -5.673f)
                close()
            }
        }.build()
        
        return _HelpSquareRounded!!
    }

private var _HelpSquareRounded: ImageVector? = null

