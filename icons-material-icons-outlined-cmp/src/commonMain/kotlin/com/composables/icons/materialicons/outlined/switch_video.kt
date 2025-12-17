package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Switch_video: ImageVector
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 13f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                lineToRelative(-3f, 3f)
                lineToRelative(3f, 3f)
                close()
                moveToRelative(10f, -3.5f)
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
                moveTo(16f, 17f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(10f)
                close()
            }
        }.build()
        
        return _Switch_video!!
    }

private var _Switch_video: ImageVector? = null

