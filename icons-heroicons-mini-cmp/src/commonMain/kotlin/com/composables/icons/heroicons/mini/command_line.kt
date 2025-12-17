package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.CommandLine: ImageVector
    get() {
        if (_CommandLine != null) return _CommandLine!!
        
        _CommandLine = ImageVector.Builder(
            name = "command-line",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.25f, 3f)
                arcTo(2.25f, 2.25f, 0f, false, false, 1f, 5.25f)
                verticalLineToRelative(9.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 3.25f, 17f)
                horizontalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 19f, 14.75f)
                verticalLineToRelative(-9.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 16.75f, 3f)
                horizontalLineTo(3.25f)
                close()
                moveToRelative(0.943f, 8.752f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.055f, -1.06f)
                lineTo(6.128f, 9f)
                lineToRelative(-1.88f, -1.693f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.004f, -1.114f)
                lineToRelative(2.5f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.114f)
                lineToRelative(-2.5f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -0.055f)
                close()
                moveTo(9.75f, 10.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-2.5f)
                close()
            }
        }.build()
        
        return _CommandLine!!
    }

private var _CommandLine: ImageVector? = null

