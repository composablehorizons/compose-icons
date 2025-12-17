package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Event: ImageVector
    get() {
        if (_Event != null) return _Event!!
        
        _Event = ImageVector.Builder(
            name = "event",
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
                moveTo(17f, 13f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                close()
                moveTo(16f, 2f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(3.01f)
                lineTo(3f, 22f)
                horizontalLineToRelative(18f)
                verticalLineTo(4f)
                horizontalLineToRelative(-3f)
                verticalLineTo(2f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(3f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(11f)
                close()
            }
        }.build()
        
        return _Event!!
    }

private var _Event: ImageVector? = null

