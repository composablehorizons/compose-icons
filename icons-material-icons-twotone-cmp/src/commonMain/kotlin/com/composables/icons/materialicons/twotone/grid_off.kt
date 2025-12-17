package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Grid_off: ImageVector
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 14f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2.89f)
                lineTo(17.11f, 14f)
                close()
                moveToRelative(-10f, -1.45f)
                verticalLineTo(14f)
                horizontalLineToRelative(1.45f)
                close()
                moveTo(14f, 10f)
                horizontalLineToRelative(-0.89f)
                lineToRelative(0.89f, 0.89f)
                close()
                moveToRelative(5.11f, 6f)
                lineToRelative(0.89f, 0.89f)
                verticalLineTo(16f)
                close()
                moveTo(8f, 4f)
                horizontalLineToRelative(-0.89f)
                lineToRelative(0.89f, 0.89f)
                close()
                moveToRelative(6f, 4f)
                verticalLineTo(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2.89f)
                lineTo(11.11f, 8f)
                close()
                moveToRelative(2f, -4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                close()
                moveToRelative(-6f, 12f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3.45f)
                lineToRelative(-0.55f, -0.55f)
                close()
                moveToRelative(-6f, -6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3.45f)
                lineTo(7.45f, 10f)
                close()
                moveToRelative(12f, 10f)
                horizontalLineToRelative(1.45f)
                lineTo(16f, 18.55f)
                close()
                moveTo(4f, 16f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineTo(4f)
                close()
                moveToRelative(0f, -9.45f)
                verticalLineTo(8f)
                horizontalLineToRelative(1.45f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 4f)
                verticalLineToRelative(0.89f)
                lineToRelative(2f, 2f)
                verticalLineTo(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2.89f)
                lineToRelative(2f, 2f)
                horizontalLineTo(14f)
                verticalLineToRelative(0.89f)
                lineToRelative(2f, 2f)
                verticalLineTo(10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2.89f)
                lineToRelative(2f, 2f)
                horizontalLineTo(20f)
                verticalLineToRelative(0.89f)
                lineToRelative(2f, 2f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(5.11f)
                lineToRelative(2f, 2f)
                horizontalLineTo(8f)
                close()
                moveToRelative(8f, 0f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineTo(4f)
                close()
                moveTo(1.41f, 1.14f)
                lineTo(0f, 2.55f)
                lineToRelative(2f, 2f)
                verticalLineTo(20f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(15.45f)
                lineToRelative(2.01f, 2.01f)
                lineToRelative(1.41f, -1.41f)
                lineTo(1.41f, 1.14f)
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
                lineToRelative(0.55f, 0.55f)
                verticalLineTo(20f)
                close()
                moveToRelative(2f, 0f)
                verticalLineToRelative(-1.45f)
                lineTo(17.45f, 20f)
                horizontalLineTo(16f)
                close()
            }
        }.build()
        
        return _Grid_off!!
    }

private var _Grid_off: ImageVector? = null

