package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Tips_and_updates: ImageVector
    get() {
        if (_Tips_and_updates != null) return _Tips_and_updates!!
        
        _Tips_and_updates = ImageVector.Builder(
            name = "tips_and_updates",
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
                moveTo(7f, 20f)
                horizontalLineToRelative(4f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveTo(7f, 21.1f, 7f, 20f)
                close()
                moveTo(5f, 19f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                close()
                moveTo(16.5f, 9.5f)
                curveToRelative(0f, 3.82f, -2.66f, 5.86f, -3.77f, 6.5f)
                horizontalLineTo(5.27f)
                curveTo(4.16f, 15.36f, 1.5f, 13.32f, 1.5f, 9.5f)
                curveTo(1.5f, 5.36f, 4.86f, 2f, 9f, 2f)
                reflectiveCurveTo(16.5f, 5.36f, 16.5f, 9.5f)
                close()
                moveTo(21.37f, 7.37f)
                lineTo(20f, 8f)
                lineToRelative(1.37f, 0.63f)
                lineTo(22f, 10f)
                lineToRelative(0.63f, -1.37f)
                lineTo(24f, 8f)
                lineToRelative(-1.37f, -0.63f)
                lineTo(22f, 6f)
                lineTo(21.37f, 7.37f)
                close()
                moveTo(19f, 6f)
                lineToRelative(0.94f, -2.06f)
                lineTo(22f, 3f)
                lineToRelative(-2.06f, -0.94f)
                lineTo(19f, 0f)
                lineToRelative(-0.94f, 2.06f)
                lineTo(16f, 3f)
                lineToRelative(2.06f, 0.94f)
                lineTo(19f, 6f)
                close()
            }
        }.build()
        
        return _Tips_and_updates!!
    }

private var _Tips_and_updates: ImageVector? = null

