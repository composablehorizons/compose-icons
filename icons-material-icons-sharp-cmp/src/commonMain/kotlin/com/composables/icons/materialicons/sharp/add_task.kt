package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Add_task: ImageVector
    get() {
        if (_Add_task != null) return _Add_task!!
        
        _Add_task = ImageVector.Builder(
            name = "add_task",
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
                moveTo(22f, 5.18f)
                lineTo(10.59f, 16.6f)
                lineToRelative(-4.24f, -4.24f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.83f, 2.83f)
                lineToRelative(10f, -10f)
                lineTo(22f, 5.18f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                reflectiveCurveToRelative(3.59f, -8f, 8f, -8f)
                curveToRelative(1.57f, 0f, 3.04f, 0.46f, 4.28f, 1.25f)
                lineToRelative(1.45f, -1.45f)
                curveTo(16.1f, 2.67f, 14.13f, 2f, 12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                curveToRelative(1.73f, 0f, 3.36f, -0.44f, 4.78f, -1.22f)
                lineToRelative(-1.5f, -1.5f)
                curveTo(14.28f, 19.74f, 13.17f, 20f, 12f, 20f)
                close()
                moveTo(19f, 15f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineTo(15f)
                close()
            }
        }.build()
        
        return _Add_task!!
    }

private var _Add_task: ImageVector? = null

