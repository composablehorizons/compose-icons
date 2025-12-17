package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Pause_presentation: ImageVector
    get() {
        if (_Pause_presentation != null) return _Pause_presentation!!
        
        _Pause_presentation = ImageVector.Builder(
            name = "pause_presentation",
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
                moveTo(1f, 3f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(22f)
                verticalLineTo(3f)
                horizontalLineTo(1f)
                close()
                moveToRelative(20f, 16f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14f)
                close()
                moveTo(9f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineTo(9f)
                close()
                moveToRelative(4f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Pause_presentation!!
    }

private var _Pause_presentation: ImageVector? = null

