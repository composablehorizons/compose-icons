package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Switch_left: ImageVector
    get() {
        if (_Switch_left != null) return _Switch_left!!
        
        _Switch_left = ImageVector.Builder(
            name = "switch_left",
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
                moveTo(8.5f, 8.62f)
                verticalLineToRelative(6.76f)
                lineTo(5.12f, 12f)
                lineTo(8.5f, 8.62f)
                moveTo(3.71f, 11.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(4.59f, 4.59f)
                curveTo(8.92f, 17.92f, 10f, 17.48f, 10f, 16.59f)
                verticalLineTo(7.41f)
                curveToRelative(0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f)
                lineTo(3.71f, 11.29f)
                close()
                moveTo(14f, 7.41f)
                verticalLineToRelative(9.17f)
                curveToRelative(0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f)
                lineToRelative(4.59f, -4.59f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-4.59f, -4.59f)
                curveTo(15.08f, 6.08f, 14f, 6.52f, 14f, 7.41f)
                close()
            }
        }.build()
        
        return _Switch_left!!
    }

private var _Switch_left: ImageVector? = null

