package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Category: ImageVector
    get() {
        if (_Category != null) return _Category!!
        
        _Category = ImageVector.Builder(
            name = "category",
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
                moveTo(12f, 2f)
                lineToRelative(-5.5f, 9f)
                horizontalLineToRelative(11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 17.5f)
                arcTo(4.5f, 4.5f, 0f, false, true, 17.5f, 22f)
                arcTo(4.5f, 4.5f, 0f, false, true, 13f, 17.5f)
                arcTo(4.5f, 4.5f, 0f, false, true, 22f, 17.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 13.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(8f)
                horizontalLineTo(3f)
                close()
            }
        }.build()
        
        return _Category!!
    }

private var _Category: ImageVector? = null

