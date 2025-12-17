package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Archive: ImageVector
    get() {
        if (_Archive != null) return _Archive!!
        
        _Archive = ImageVector.Builder(
            name = "archive",
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
                moveTo(18.71f, 3f)
                horizontalLineTo(5.29f)
                lineTo(3f, 5.79f)
                verticalLineTo(21f)
                horizontalLineToRelative(18f)
                verticalLineTo(5.79f)
                lineTo(18.71f, 3f)
                close()
                moveTo(12f, 17.5f)
                lineTo(6.5f, 12f)
                horizontalLineTo(10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.5f)
                lineTo(12f, 17.5f)
                close()
                moveTo(5.12f, 5f)
                lineToRelative(0.81f, -1f)
                horizontalLineToRelative(12f)
                lineToRelative(0.94f, 1f)
                horizontalLineTo(5.12f)
                close()
            }
        }.build()
        
        return _Archive!!
    }

private var _Archive: ImageVector? = null

