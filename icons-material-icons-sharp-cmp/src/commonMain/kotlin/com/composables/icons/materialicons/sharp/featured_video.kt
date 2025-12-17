package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Featured_video: ImageVector
    get() {
        if (_Featured_video != null) return _Featured_video!!
        
        _Featured_video = ImageVector.Builder(
            name = "featured_video",
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
                moveTo(23f, 3f)
                horizontalLineTo(1f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(22f)
                verticalLineTo(3f)
                close()
                moveToRelative(-11f, 9f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(7f)
                close()
            }
        }.build()
        
        return _Featured_video!!
    }

private var _Featured_video: ImageVector? = null

