package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.HomeModern: ImageVector
    get() {
        if (_HomeModern != null) return _HomeModern!!
        
        _HomeModern = ImageVector.Builder(
            name = "home-modern",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.536f, 3.444f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.571f, -1.387f)
                lineTo(3.5f, 4.719f)
                verticalLineTo(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(1.586f)
                lineToRelative(-0.535f, 0.22f)
                arcTo(0.75f, 0.75f, 0f, false, false, 2f, 6.958f)
                verticalLineTo(12.5f)
                horizontalLineToRelative(-0.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, true, true, 2f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(3.664f)
                lineToRelative(0.536f, -0.22f)
                close()
                moveTo(11.829f, 5.802f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.333f, 0.623f)
                verticalLineTo(8.5f)
                curveToRelative(0f, 0.027f, 0.001f, 0.053f, 0.004f, 0.08f)
                verticalLineTo(13f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(7.957f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.535f, -1.4f)
                lineToRelative(-2.004f, -0.826f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.703f, 0.07f)
                close()
            }
        }.build()
        
        return _HomeModern!!
    }

private var _HomeModern: ImageVector? = null

