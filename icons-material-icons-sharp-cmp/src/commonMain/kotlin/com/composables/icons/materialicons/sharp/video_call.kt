package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Video_call: ImageVector
    get() {
        if (_Video_call != null) return _Video_call!!
        
        _Video_call = ImageVector.Builder(
            name = "video_call",
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
                moveTo(17f, 10.5f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-4.5f)
                lineToRelative(4f, 4f)
                verticalLineToRelative(-11f)
                lineToRelative(-4f, 4f)
                close()
                moveTo(14f, 13f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineTo(9f)
                verticalLineToRelative(-3f)
                horizontalLineTo(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Video_call!!
    }

private var _Video_call: ImageVector? = null

