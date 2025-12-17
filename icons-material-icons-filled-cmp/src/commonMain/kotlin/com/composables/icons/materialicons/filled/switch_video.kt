package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Switch_video: ImageVector
    get() {
        if (_Switch_video != null) return _Switch_video!!
        
        _Switch_video = ImageVector.Builder(
            name = "switch_video",
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
                moveTo(18f, 9.5f)
                verticalLineTo(6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.5f)
                lineToRelative(4f, 4f)
                verticalLineToRelative(-13f)
                lineToRelative(-4f, 4f)
                close()
                moveToRelative(-5f, 6f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineToRelative(2.5f)
                lineTo(3.5f, 12f)
                lineTo(7f, 8.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(6f)
                verticalLineTo(8.5f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(-3.5f, 3.5f)
                close()
            }
        }.build()
        
        return _Switch_video!!
    }

private var _Switch_video: ImageVector? = null

