package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Server: ImageVector
    get() {
        if (_Server != null) return _Server!!
        
        _Server = ImageVector.Builder(
            name = "server",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.632f, 3.533f)
                arcTo(2f, 2f, 0f, false, true, 6.577f, 2f)
                horizontalLineToRelative(6.846f)
                arcToRelative(2f, 2f, 0f, false, true, 1.945f, 1.533f)
                lineToRelative(1.976f, 8.234f)
                arcTo(3.489f, 3.489f, 0f, false, false, 16f, 11.5f)
                horizontalLineTo(4f)
                curveToRelative(-0.476f, 0f, -0.93f, 0.095f, -1.344f, 0.267f)
                lineToRelative(1.976f, -8.234f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 13f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, 4f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                horizontalLineTo(4f)
                close()
                moveToRelative(11.24f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineTo(16f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(0.01f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineTo(15f)
                close()
                moveToRelative(-2.25f, -0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(0.01f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineTo(13f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineTo(15f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-0.01f)
                close()
            }
        }.build()
        
        return _Server!!
    }

private var _Server: ImageVector? = null

