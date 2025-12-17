package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Filter_frames: ImageVector
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
                moveTo(20f, 4f)
                horizontalLineToRelative(-4f)
                lineToRelative(-4f, -4f)
                lineToRelative(-4f, 4f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 16f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineToRelative(4.52f)
                lineToRelative(3.52f, -3.5f)
                lineTo(15.52f, 6f)
                horizontalLineTo(20f)
                verticalLineToRelative(14f)
                close()
                moveTo(6f, 18f)
                horizontalLineToRelative(12f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                verticalLineToRelative(10f)
                close()
                moveToRelative(2f, -8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(6f)
                horizontalLineTo(8f)
                verticalLineToRelative(-6f)
                close()
            }
        }.build()
        
        return _Filter_frames!!
    }

private var _Filter_frames: ImageVector? = null

