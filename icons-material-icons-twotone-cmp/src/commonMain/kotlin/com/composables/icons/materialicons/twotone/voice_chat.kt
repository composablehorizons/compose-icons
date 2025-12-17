package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Voice_chat: ImageVector
    get() {
        if (_Voice_chat != null) return _Voice_chat!!
        
        _Voice_chat = ImageVector.Builder(
            name = "voice_chat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 17.17f)
                lineTo(5.17f, 16f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineToRelative(13.17f)
                close()
                moveTo(7f, 7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2.4f)
                lineTo(17f, 7f)
                verticalLineToRelative(6f)
                lineToRelative(-3f, -2.4f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                lineTo(2f, 22f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 14f)
                horizontalLineTo(5.17f)
                lineTo(4f, 17.17f)
                verticalLineTo(4f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                close()
                moveToRelative(-6f, -5.4f)
                lineToRelative(3f, 2.4f)
                verticalLineTo(7f)
                lineToRelative(-3f, 2.4f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(7f)
                close()
            }
        }.build()
        
        return _Voice_chat!!
    }

private var _Voice_chat: ImageVector? = null

