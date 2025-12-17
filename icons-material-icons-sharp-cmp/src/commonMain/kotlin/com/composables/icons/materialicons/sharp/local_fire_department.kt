package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Local_fire_department: ImageVector
    get() {
        if (_Local_fire_department != null) return _Local_fire_department!!
        
        _Local_fire_department = ImageVector.Builder(
            name = "local_fire_department",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19.48f, 12.37f)
                    curveTo(17.82f, 8.05f, 11.65f, 8f, 13.99f, 0.99f)
                    curveTo(9.52f, 3f, 5.98f, 8.17f, 9.48f, 15f)
                    curveTo(4.53f, 12.92f, 6.7f, 7.71f, 6.7f, 7.71f)
                    reflectiveCurveTo(4f, 9.37f, 4f, 14.39f)
                    curveToRelative(0.38f, 5.6f, 5.11f, 7.32f, 6.81f, 7.54f)
                    curveToRelative(2.43f, 0.31f, 5.06f, -0.14f, 6.95f, -1.87f)
                    curveTo(19.84f, 18.13f, 20.6f, 15.05f, 19.48f, 12.37f)
                    close()
                    moveTo(10.2f, 17.4f)
                    curveToRelative(1.44f, -0.35f, 2.18f, -1.39f, 2.38f, -2.31f)
                    curveToRelative(0.33f, -1.43f, -0.96f, -2.83f, -0.09f, -5.09f)
                    curveToRelative(0.33f, 1.87f, 3.27f, 3.04f, 3.27f, 5.08f)
                    curveTo(15.84f, 17.61f, 13.1f, 19.78f, 10.2f, 17.4f)
                    close()
                }
            }
        }.build()
        
        return _Local_fire_department!!
    }

private var _Local_fire_department: ImageVector? = null

