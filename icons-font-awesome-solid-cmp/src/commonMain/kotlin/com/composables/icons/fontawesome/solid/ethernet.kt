package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Ethernet: ImageVector
    get() {
        if (_Ethernet != null) return _Ethernet!!
        
        _Ethernet = ImageVector.Builder(
            name = "ethernet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(496f, 192f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                horizontalLineToRelative(-48f)
                verticalLineTo(80f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                horizontalLineTo(144f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(48f)
                horizontalLineTo(80f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(48f)
                horizontalLineTo(16f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(224f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(80f)
                verticalLineTo(320f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(64f)
                verticalLineTo(320f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(64f)
                verticalLineTo(320f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(64f)
                verticalLineTo(320f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(80f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(208f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
            }
        }.build()
        
        return _Ethernet!!
    }

private var _Ethernet: ImageVector? = null

