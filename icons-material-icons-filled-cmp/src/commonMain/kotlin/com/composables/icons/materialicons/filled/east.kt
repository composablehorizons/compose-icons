package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.East: ImageVector
    get() {
        if (_East != null) return _East!!
        
        _East = ImageVector.Builder(
            name = "east",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 5f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(18.17f, 11f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                horizontalLineToRelative(16.17f)
                lineToRelative(-4.59f, 4.59f)
                lineTo(15f, 19f)
                lineToRelative(7f, -7f)
                lineTo(15f, 5f)
                close()
            }
        }.build()
        
        return _East!!
    }

private var _East: ImageVector? = null

