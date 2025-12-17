package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Weekend: ImageVector
    get() {
        if (_Weekend != null) return _Weekend!!
        
        _Weekend = ImageVector.Builder(
            name = "weekend",
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
                moveTo(6f, 9.03f)
                verticalLineTo(14f)
                horizontalLineToRelative(12f)
                verticalLineTo(9.03f)
                horizontalLineToRelative(2f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                verticalLineToRelative(4.03f)
                close()
                moveTo(19f, 15f)
                horizontalLineTo(5f)
                verticalLineToRelative(-4.97f)
                horizontalLineTo(1f)
                verticalLineTo(19f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-8.97f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.build()
        
        return _Weekend!!
    }

private var _Weekend: ImageVector? = null

