package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Tablet: ImageVector
    get() {
        if (_Tablet != null) return _Tablet!!
        
        _Tablet = ImageVector.Builder(
            name = "tablet",
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
                moveTo(23f, 4f)
                horizontalLineTo(1f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(21.99f)
                lineTo(23f, 4f)
                close()
                moveToRelative(-4f, 14f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(12f)
                close()
            }
        }.build()
        
        return _Tablet!!
    }

private var _Tablet: ImageVector? = null

