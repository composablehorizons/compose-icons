package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Toolbox: ImageVector
    get() {
        if (_Toolbox != null) return _Toolbox!!
        
        _Toolbox = ImageVector.Builder(
            name = "toolbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(502.63f, 214.63f)
                lineToRelative(-45.25f, -45.25f)
                curveToRelative(-6f, -6f, -14.14f, -9.37f, -22.63f, -9.37f)
                horizontalLineTo(384f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                horizontalLineTo(176f)
                curveToRelative(-26.51f, 0f, -48f, 21.49f, -48f, 48f)
                verticalLineToRelative(80f)
                horizontalLineTo(77.25f)
                curveToRelative(-8.49f, 0f, -16.62f, 3.37f, -22.63f, 9.37f)
                lineTo(9.37f, 214.63f)
                curveToRelative(-6f, 6f, -9.37f, 14.14f, -9.37f, 22.63f)
                verticalLineTo(320f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.84f, 0f, 16f, 7.16f, 16f, 16f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.84f, 0f, 16f, 7.16f, 16f, 16f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-82.75f)
                curveToRelative(0f, -8.48f, -3.37f, -16.62f, -9.37f, -22.62f)
                close()
                moveTo(320f, 160f)
                horizontalLineTo(192f)
                verticalLineTo(96f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(64f)
                close()
                moveToRelative(64f, 208f)
                curveToRelative(0f, 8.84f, -7.16f, 16f, -16f, 16f)
                horizontalLineToRelative(-32f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                verticalLineToRelative(-16f)
                horizontalLineTo(192f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 8.84f, -7.16f, 16f, -16f, 16f)
                horizontalLineToRelative(-32f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                verticalLineToRelative(-16f)
                horizontalLineTo(0f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(448f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-96f)
                horizontalLineTo(384f)
                verticalLineToRelative(16f)
                close()
            }
        }.build()
        
        return _Toolbox!!
    }

private var _Toolbox: ImageVector? = null

