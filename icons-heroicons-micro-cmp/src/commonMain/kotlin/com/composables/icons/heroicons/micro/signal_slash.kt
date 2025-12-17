package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.SignalSlash: ImageVector
    get() {
        if (_SignalSlash != null) return _SignalSlash!!
        
        _SignalSlash = ImageVector.Builder(
            name = "signal-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(4.782f, 4.783f)
                arcToRelative(1f, 1f, 0f, false, false, 0.935f, 0.935f)
                lineToRelative(4.783f, 4.782f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineTo(8.998f, 7.937f)
                arcToRelative(1f, 1f, 0f, false, false, -0.935f, -0.935f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(3.05f, 12.95f)
                arcToRelative(7.003f, 7.003f, 0f, false, true, -1.33f, -8.047f)
                lineTo(2.86f, 6.04f)
                arcToRelative(5.501f, 5.501f, 0f, false, false, 1.25f, 5.849f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                close()
                moveTo(5.26f, 10.74f)
                arcToRelative(3.87f, 3.87f, 0f, false, true, -1.082f, -3.38f)
                lineTo(5.87f, 9.052f)
                curveToRelative(0.112f, 0.226f, 0.262f, 0.439f, 0.45f, 0.627f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.061f)
                close()
                moveTo(12.95f, 3.05f)
                arcToRelative(7.003f, 7.003f, 0f, false, true, 1.33f, 8.048f)
                lineToRelative(-1.14f, -1.139f)
                arcToRelative(5.501f, 5.501f, 0f, false, false, -1.25f, -5.848f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, -1.06f)
                close()
                moveTo(10.74f, 5.26f)
                arcToRelative(3.87f, 3.87f, 0f, false, true, 1.082f, 3.38f)
                lineTo(10.13f, 6.948f)
                arcToRelative(2.372f, 2.372f, 0f, false, false, -0.45f, -0.627f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, -1.061f)
                close()
            }
        }.build()
        
        return _SignalSlash!!
    }

private var _SignalSlash: ImageVector? = null

