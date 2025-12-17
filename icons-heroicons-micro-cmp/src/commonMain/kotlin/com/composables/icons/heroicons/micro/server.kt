package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Server: ImageVector
    get() {
        if (_Server != null) return _Server!!
        
        _Server = ImageVector.Builder(
            name = "server",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.665f, 3.588f)
                arcTo(2f, 2f, 0f, false, true, 5.622f, 2f)
                horizontalLineToRelative(4.754f)
                arcToRelative(2f, 2f, 0f, false, true, 1.958f, 1.588f)
                lineToRelative(1.098f, 5.218f)
                arcToRelative(3.487f, 3.487f, 0f, false, false, -1.433f, -0.306f)
                horizontalLineTo(4f)
                curveToRelative(-0.51f, 0f, -0.995f, 0.11f, -1.433f, 0.306f)
                lineToRelative(1.099f, -5.218f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 10f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, 4f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                horizontalLineTo(4f)
                close()
                moveToRelative(8f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                close()
                moveTo(9.75f, 12f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                close()
            }
        }.build()
        
        return _Server!!
    }

private var _Server: ImageVector? = null

