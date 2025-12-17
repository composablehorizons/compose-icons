package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Local_fire_department: ImageVector
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12.58f, 15.07f)
                        curveToRelative(-0.2f, 0.92f, -0.94f, 1.96f, -2.38f, 2.31f)
                        curveToRelative(2.9f, 2.37f, 5.64f, 0.2f, 5.56f, -2.32f)
                        curveToRelative(0f, -2.05f, -2.95f, -3.21f, -3.27f, -5.08f)
                        curveTo(11.62f, 12.24f, 12.9f, 13.64f, 12.58f, 15.07f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.48f, 12.35f)
                        curveToRelative(-1.57f, -4.08f, -7.16f, -4.3f, -5.81f, -10.23f)
                        curveToRelative(0.1f, -0.44f, -0.37f, -0.78f, -0.75f, -0.55f)
                        curveTo(9.29f, 3.71f, 6.68f, 8f, 8.87f, 13.62f)
                        curveToRelative(0.18f, 0.46f, -0.36f, 0.89f, -0.75f, 0.59f)
                        curveToRelative(-1.81f, -1.37f, -2f, -3.34f, -1.84f, -4.75f)
                        curveToRelative(0.06f, -0.52f, -0.62f, -0.77f, -0.91f, -0.34f)
                        curveTo(4.69f, 10.16f, 4f, 11.84f, 4f, 14.37f)
                        curveToRelative(0.38f, 5.6f, 5.11f, 7.32f, 6.81f, 7.54f)
                        curveToRelative(2.43f, 0.31f, 5.06f, -0.14f, 6.95f, -1.87f)
                        curveTo(19.84f, 18.11f, 20.6f, 15.03f, 19.48f, 12.35f)
                        close()
                        moveTo(10.2f, 17.38f)
                        curveToRelative(1.44f, -0.35f, 2.18f, -1.39f, 2.38f, -2.31f)
                        curveToRelative(0.33f, -1.43f, -0.96f, -2.83f, -0.09f, -5.09f)
                        curveToRelative(0.33f, 1.87f, 3.27f, 3.04f, 3.27f, 5.08f)
                        curveTo(15.84f, 17.59f, 13.1f, 19.76f, 10.2f, 17.38f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Local_fire_department!!
    }

private var _Local_fire_department: ImageVector? = null

