package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Sign: ImageVector
    get() {
        if (_Sign != null) return _Sign!!
        
        _Sign = ImageVector.Builder(
            name = "sign",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(496f, 64f)
                horizontalLineTo(128f)
                verticalLineTo(16f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                horizontalLineTo(80f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(48f)
                horizontalLineTo(16f)
                curveTo(7.2f, 64f, 0f, 71.2f, 0f, 80f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(368f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(128f)
                horizontalLineToRelative(368f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(80f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
                moveTo(160f, 384f)
                horizontalLineToRelative(320f)
                verticalLineTo(160f)
                horizontalLineTo(160f)
                verticalLineToRelative(224f)
                close()
            }
        }.build()
        
        return _Sign!!
    }

private var _Sign: ImageVector? = null

