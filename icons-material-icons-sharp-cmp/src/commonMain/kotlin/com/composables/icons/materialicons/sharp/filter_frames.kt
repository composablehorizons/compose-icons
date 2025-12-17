package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Filter_frames: ImageVector
    get() {
        if (_Filter_frames != null) return _Filter_frames!!
        
        _Filter_frames = ImageVector.Builder(
            name = "filter_frames",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 4f)
                horizontalLineToRelative(-6f)
                lineToRelative(-4f, -4f)
                lineToRelative(-4f, 4f)
                horizontalLineTo(2f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(20f)
                verticalLineTo(4f)
                close()
                moveToRelative(-2f, 16f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineToRelative(4.52f)
                lineToRelative(3.52f, -3.5f)
                lineTo(15.52f, 6f)
                horizontalLineTo(20f)
                verticalLineToRelative(14f)
                close()
                moveTo(18f, 8f)
                horizontalLineTo(6f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(12f)
            }
        }.build()
        
        return _Filter_frames!!
    }

private var _Filter_frames: ImageVector? = null

