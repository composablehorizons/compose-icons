package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Download_done: ImageVector
    get() {
        if (_Download_done != null) return _Download_done!!
        
        _Download_done = ImageVector.Builder(
            name = "download_done",
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
                moveTo(5f, 18f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(4.6f, -2.7f)
                lineTo(5f, 10.7f)
                lineToRelative(2f, -1.9f)
                lineToRelative(2.6f, 2.6f)
                lineTo(17f, 4f)
                lineToRelative(2f, 2f)
                lineToRelative(-9.4f, 9.3f)
                close()
            }
        }.build()
        
        return _Download_done!!
    }

private var _Download_done: ImageVector? = null

