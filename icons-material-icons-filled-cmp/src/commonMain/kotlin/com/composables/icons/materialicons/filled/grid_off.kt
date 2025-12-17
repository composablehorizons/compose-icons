package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Grid_off: ImageVector
    get() {
        if (_Grid_off != null) return _Grid_off!!
        
        _Grid_off = ImageVector.Builder(
            name = "grid_off",
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
                moveTo(8f, 4f)
                verticalLineToRelative(1.45f)
                lineToRelative(2f, 2f)
                verticalLineTo(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3.45f)
                lineToRelative(2f, 2f)
                horizontalLineTo(14f)
                verticalLineToRelative(1.45f)
                lineToRelative(2f, 2f)
                verticalLineTo(10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3.45f)
                lineToRelative(2f, 2f)
                horizontalLineTo(20f)
                verticalLineToRelative(1.45f)
                lineToRelative(2f, 2f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(4.55f)
                lineToRelative(2f, 2f)
                horizontalLineTo(8f)
                close()
                moveToRelative(8f, 0f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineTo(4f)
                close()
                moveTo(1.27f, 1.27f)
                lineTo(0f, 2.55f)
                lineToRelative(2f, 2f)
                verticalLineTo(20f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(15.46f)
                lineToRelative(2f, 2f)
                lineToRelative(1.27f, -1.27f)
                lineTo(1.27f, 1.27f)
                close()
                moveTo(10f, 12.55f)
                lineTo(11.45f, 14f)
                horizontalLineTo(10f)
                verticalLineToRelative(-1.45f)
                close()
                moveToRelative(-6f, -6f)
                lineTo(5.45f, 8f)
                horizontalLineTo(4f)
                verticalLineTo(6.55f)
                close()
                moveTo(8f, 20f)
                horizontalLineTo(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(0f, -6f)
                horizontalLineTo(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3.45f)
                lineToRelative(0.55f, 0.55f)
                verticalLineTo(14f)
                close()
                moveToRelative(6f, 6f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3.45f)
                lineToRelative(0.55f, 0.54f)
                verticalLineTo(20f)
                close()
                moveToRelative(2f, 0f)
                verticalLineToRelative(-1.46f)
                lineTo(17.46f, 20f)
                horizontalLineTo(16f)
                close()
            }
        }.build()
        
        return _Grid_off!!
    }

private var _Grid_off: ImageVector? = null

