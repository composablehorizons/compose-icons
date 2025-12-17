package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Dumpster: ImageVector
    get() {
        if (_Dumpster != null) return _Dumpster!!
        
        _Dumpster = ImageVector.Builder(
            name = "dumpster",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 160f)
                curveToRelative(10.4f, 0f, 18f, -9.8f, 15.5f, -19.9f)
                lineToRelative(-24f, -96f)
                curveTo(549.7f, 37f, 543.3f, 32f, 536f, 32f)
                horizontalLineToRelative(-98.9f)
                lineToRelative(25.6f, 128f)
                horizontalLineTo(560f)
                close()
                moveTo(272f, 32f)
                horizontalLineTo(171.5f)
                lineToRelative(-25.6f, 128f)
                horizontalLineTo(272f)
                verticalLineTo(32f)
                close()
                moveToRelative(132.5f, 0f)
                horizontalLineTo(304f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(126.1f)
                lineTo(404.5f, 32f)
                close()
                moveTo(16f, 160f)
                horizontalLineToRelative(97.3f)
                lineToRelative(25.6f, -128f)
                horizontalLineTo(40f)
                curveToRelative(-7.3f, 0f, -13.7f, 5f, -15.5f, 12.1f)
                lineToRelative(-24f, 96f)
                curveTo(-2f, 150.2f, 5.6f, 160f, 16f, 160f)
                close()
                moveToRelative(544f, 64f)
                horizontalLineToRelative(-20f)
                lineToRelative(4f, -32f)
                horizontalLineTo(32f)
                lineToRelative(4f, 32f)
                horizontalLineTo(16f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(28f)
                lineToRelative(20f, 160f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-16f)
                lineToRelative(20f, -160f)
                horizontalLineToRelative(28f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
            }
        }.build()
        
        return _Dumpster!!
    }

private var _Dumpster: ImageVector? = null

