package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Details: ImageVector
    get() {
        if (_Details != null) return _Details!!
        
        _Details = ImageVector.Builder(
            name = "details",
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
                moveTo(12f, 3f)
                lineTo(2f, 21f)
                horizontalLineToRelative(20f)
                lineTo(12f, 3f)
                close()
                moveTo(13f, 8.92f)
                lineTo(18.6f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(8.92f)
                close()
                moveTo(11f, 8.92f)
                verticalLineTo(19f)
                horizontalLineTo(5.4f)
                lineTo(11f, 8.92f)
                close()
            }
        }.build()
        
        return _Details!!
    }

private var _Details: ImageVector? = null

