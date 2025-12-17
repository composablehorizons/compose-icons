package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Vibration: ImageVector
    get() {
        if (_Vibration != null) return _Vibration!!
        
        _Vibration = ImageVector.Builder(
            name = "vibration",
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
                moveTo(0f, 15f)
                horizontalLineToRelative(2f)
                verticalLineTo(9f)
                horizontalLineTo(0f)
                verticalLineToRelative(6f)
                close()
                moveToRelative(3f, 2f)
                horizontalLineToRelative(2f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineToRelative(10f)
                close()
                moveToRelative(19f, -8f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineTo(9f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(-3f, 8f)
                horizontalLineToRelative(2f)
                verticalLineTo(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(10f)
                close()
                moveTo(18f, 3f)
                horizontalLineTo(6f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(12f)
                verticalLineTo(3f)
                close()
                moveToRelative(-2f, 16f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(14f)
                close()
            }
        }.build()
        
        return _Vibration!!
    }

private var _Vibration: ImageVector? = null

