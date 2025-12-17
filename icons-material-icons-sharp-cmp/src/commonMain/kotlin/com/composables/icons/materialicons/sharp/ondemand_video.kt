package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Ondemand_video: ImageVector
    get() {
        if (_Ondemand_video != null) return _Ondemand_video!!
        
        _Ondemand_video = ImageVector.Builder(
            name = "ondemand_video",
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
                verticalLineToRelative(16f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6.99f)
                lineTo(23f, 3f)
                close()
                moveToRelative(-2f, 14f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(12f)
                close()
                moveToRelative(-5f, -6f)
                lineToRelative(-7f, 4f)
                verticalLineTo(7f)
                lineToRelative(7f, 4f)
                close()
            }
        }.build()
        
        return _Ondemand_video!!
    }

private var _Ondemand_video: ImageVector? = null

