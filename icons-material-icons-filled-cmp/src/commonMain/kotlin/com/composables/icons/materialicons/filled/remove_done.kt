package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Remove_done: ImageVector
    get() {
        if (_Remove_done != null) return _Remove_done!!
        
        _Remove_done = ImageVector.Builder(
            name = "remove_done",
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
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.79f, 12f)
                lineToRelative(5.58f, 5.59f)
                lineTo(5.96f, 19f)
                lineTo(0.37f, 13.41f)
                lineTo(1.79f, 12f)
                close()
                moveToRelative(0.45f, -7.78f)
                lineTo(12.9f, 14.89f)
                lineToRelative(-1.28f, 1.28f)
                lineTo(7.44f, 12f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(11.62f, 19f)
                lineToRelative(2.69f, -2.69f)
                lineToRelative(4.89f, 4.89f)
                lineToRelative(1.41f, -1.41f)
                lineTo(3.65f, 2.81f)
                lineTo(2.24f, 4.22f)
                close()
                moveToRelative(14.9f, 9.27f)
                lineTo(23.62f, 7f)
                lineTo(22.2f, 5.59f)
                lineToRelative(-6.48f, 6.48f)
                lineToRelative(1.42f, 1.42f)
                close()
                moveTo(17.96f, 7f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.65f, 3.66f)
                lineToRelative(1.41f, 1.41f)
                lineTo(17.96f, 7f)
                close()
            }
        }.build()
        
        return _Remove_done!!
    }

private var _Remove_done: ImageVector? = null

