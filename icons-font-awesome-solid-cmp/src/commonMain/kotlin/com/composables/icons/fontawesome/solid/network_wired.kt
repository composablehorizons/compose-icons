package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.NetworkWired: ImageVector
    get() {
        if (_NetworkWired != null) return _NetworkWired!!
        
        _NetworkWired = ImageVector.Builder(
            name = "network-wired",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 264f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineTo(344f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(72f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(32f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineTo(224f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(128f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(72f)
                verticalLineToRelative(40f)
                horizontalLineTo(16f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(104f)
                verticalLineToRelative(40f)
                horizontalLineTo(64f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(128f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(160f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(352f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineToRelative(-56f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(304f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-56f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(128f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(160f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(352f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineToRelative(-56f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(104f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                close()
                moveTo(256f, 128f)
                verticalLineTo(64f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(64f)
                horizontalLineTo(256f)
                close()
                moveToRelative(-64f, 320f)
                horizontalLineTo(96f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(64f)
                close()
                moveToRelative(352f, 0f)
                horizontalLineToRelative(-96f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(64f)
                close()
            }
        }.build()
        
        return _NetworkWired!!
    }

private var _NetworkWired: ImageVector? = null

