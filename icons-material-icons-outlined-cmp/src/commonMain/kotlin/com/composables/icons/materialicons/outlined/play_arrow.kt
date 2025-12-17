package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Play_arrow: ImageVector
    get() {
        if (_Play_arrow != null) return _Play_arrow!!
        
        _Play_arrow = ImageVector.Builder(
            name = "play_arrow",
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
                moveTo(10f, 8.64f)
                lineTo(15.27f, 12f)
                lineTo(10f, 15.36f)
                verticalLineTo(8.64f)
                moveTo(8f, 5f)
                verticalLineToRelative(14f)
                lineToRelative(11f, -7f)
                lineTo(8f, 5f)
                close()
            }
        }.build()
        
        return _Play_arrow!!
    }

private var _Play_arrow: ImageVector? = null

