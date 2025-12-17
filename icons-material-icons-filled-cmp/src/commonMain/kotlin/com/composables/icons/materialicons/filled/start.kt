package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Start: ImageVector
    get() {
        if (_Start != null) return _Start!!
        
        _Start = ImageVector.Builder(
            name = "start",
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
                moveTo(14.59f, 7.41f)
                lineTo(18.17f, 11f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12.17f)
                lineToRelative(-3.59f, 3.59f)
                lineTo(16f, 18f)
                lineToRelative(6f, -6f)
                lineToRelative(-6f, -6f)
                lineTo(14.59f, 7.41f)
                close()
                moveTo(2f, 6f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(2f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                close()
            }
        }.build()
        
        return _Start!!
    }

private var _Start: ImageVector? = null

