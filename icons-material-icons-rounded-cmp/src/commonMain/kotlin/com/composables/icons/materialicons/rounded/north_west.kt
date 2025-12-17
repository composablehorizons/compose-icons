package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.North_west: ImageVector
    get() {
        if (_North_west != null) return _North_west!!
        
        _North_west = ImageVector.Builder(
            name = "north_west",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 15f)
                lineTo(6f, 15f)
                curveToRelative(0.56f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(8.41f)
                lineTo(17.89f, 19.3f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(0f, 0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineTo(8.41f, 7f)
                horizontalLineTo(14f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(6f)
                curveTo(5.45f, 5f, 5f, 5.45f, 5f, 6f)
                verticalLineTo(14f)
                curveTo(5f, 14.55f, 5.45f, 15f, 6f, 15f)
                close()
            }
        }.build()
        
        return _North_west!!
    }

private var _North_west: ImageVector? = null

