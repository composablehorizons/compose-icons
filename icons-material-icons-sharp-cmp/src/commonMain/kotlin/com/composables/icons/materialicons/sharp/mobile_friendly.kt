package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Mobile_friendly: ImageVector
    get() {
        if (_Mobile_friendly != null) return _Mobile_friendly!!
        
        _Mobile_friendly = ImageVector.Builder(
            name = "mobile_friendly",
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
                moveTo(21f, 1f)
                horizontalLineTo(7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineTo(4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(16f)
                horizontalLineTo(9f)
                verticalLineToRelative(-2f)
                horizontalLineTo(7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(14f)
                verticalLineTo(1f)
                close()
                moveTo(7.01f, 13.47f)
                lineToRelative(-2.55f, -2.55f)
                lineToRelative(-1.27f, 1.27f)
                lineTo(7f, 16f)
                lineToRelative(7.19f, -7.19f)
                lineToRelative(-1.27f, -1.27f)
                lineToRelative(-5.91f, 5.93f)
                close()
            }
        }.build()
        
        return _Mobile_friendly!!
    }

private var _Mobile_friendly: ImageVector? = null

