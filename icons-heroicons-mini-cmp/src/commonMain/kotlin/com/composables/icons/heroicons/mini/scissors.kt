package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Scissors: ImageVector
    get() {
        if (_Scissors != null) return _Scissors!!
        
        _Scissors = ImageVector.Builder(
            name = "scissors",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.469f, 3.75f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 5.617f, 4.11f)
                lineToRelative(0.883f, 0.51f)
                curveToRelative(0.025f, 0.092f, 0.147f, 0.116f, 0.21f, 0.043f)
                curveToRelative(0.15f, -0.176f, 0.318f, -0.338f, 0.5f, -0.484f)
                curveToRelative(0.286f, -0.23f, 0.3f, -0.709f, -0.018f, -0.892f)
                lineToRelative(-0.825f, -0.477f)
                arcTo(3.501f, 3.501f, 0f, false, false, 1.47f, 3.75f)
                close()
                moveToRelative(2.03f, 3.482f)
                arcToRelative(2f, 2f, 0f, true, true, 2f, -3.464f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 3.464f)
                close()
                moveTo(9.956f, 8.322f)
                arcToRelative(2.75f, 2.75f, 0f, false, false, -1.588f, 1.822f)
                lineTo(7.97f, 11.63f)
                lineToRelative(-0.884f, 0.51f)
                arcTo(3.501f, 3.501f, 0f, false, false, 1.47f, 16.25f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 6.367f, -2.81f)
                lineToRelative(10.68f, -6.166f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.182f, -1.373f)
                lineToRelative(-0.703f, -0.189f)
                arcToRelative(2.75f, 2.75f, 0f, false, false, -1.78f, 0.123f)
                lineTo(9.955f, 8.322f)
                close()
                moveTo(2.768f, 15.5f)
                arcToRelative(2f, 2f, 0f, true, true, 3.464f, -2f)
                arcToRelative(2f, 2f, 0f, false, true, -3.464f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.52f, 11.89f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.056f, 0.894f)
                lineToRelative(3.274f, 1.381f)
                arcToRelative(2.75f, 2.75f, 0f, false, false, 1.78f, 0.123f)
                lineToRelative(0.704f, -0.189f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.18f, -1.373f)
                lineToRelative(-3.47f, -2.004f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0f)
                lineTo(12.52f, 11.89f)
                close()
            }
        }.build()
        
        return _Scissors!!
    }

private var _Scissors: ImageVector? = null

