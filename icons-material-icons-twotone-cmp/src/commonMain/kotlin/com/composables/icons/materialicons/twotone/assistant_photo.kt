package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Assistant_photo: ImageVector
    get() {
        if (_Assistant_photo != null) return _Assistant_photo!!
        
        _Assistant_photo = ImageVector.Builder(
            name = "assistant_photo",
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
                moveTo(14.24f, 12f)
                lineToRelative(0.4f, 2f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineToRelative(-5.24f)
                lineToRelative(-0.4f, -2f)
                horizontalLineTo(7f)
                verticalLineToRelative(6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 14f)
                horizontalLineToRelative(5.6f)
                lineToRelative(0.4f, 2f)
                horizontalLineToRelative(7f)
                verticalLineTo(6f)
                horizontalLineToRelative(-5.6f)
                lineTo(14f, 4f)
                horizontalLineTo(5f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                close()
                moveToRelative(0f, -8f)
                horizontalLineToRelative(5.36f)
                lineToRelative(0.4f, 2f)
                horizontalLineTo(18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3.36f)
                lineToRelative(-0.4f, -2f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                close()
            }
        }.build()
        
        return _Assistant_photo!!
    }

private var _Assistant_photo: ImageVector? = null

