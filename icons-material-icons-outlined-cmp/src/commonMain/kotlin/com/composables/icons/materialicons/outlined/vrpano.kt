package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Vrpano: ImageVector
    get() {
        if (_Vrpano != null) return _Vrpano!!
        
        _Vrpano = ImageVector.Builder(
            name = "vrpano",
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
                        moveTo(21.01f, 4f)
                        curveTo(20.45f, 4f, 17.4f, 5.5f, 12f, 5.5f)
                        curveToRelative(-5.31f, 0f, -8.49f, -1.49f, -9.01f, -1.49f)
                        curveTo(2.46f, 4.01f, 2f, 4.45f, 2f, 5.02f)
                        verticalLineTo(19f)
                        curveToRelative(0f, 0.57f, 0.46f, 1f, 0.99f, 1f)
                        curveToRelative(0.57f, 0f, 3.55f, -1.5f, 9.01f, -1.5f)
                        curveToRelative(5.42f, 0f, 8.44f, 1.5f, 9.01f, 1.5f)
                        curveToRelative(0.53f, 0f, 0.99f, -0.43f, 0.99f, -1f)
                        verticalLineTo(5f)
                        curveTo(22f, 4.43f, 21.54f, 4f, 21.01f, 4f)
                        close()
                        moveTo(20f, 17.63f)
                        curveToRelative(-2.01f, -0.59f, -4.62f, -1.13f, -8f, -1.13f)
                        curveToRelative(-3.39f, 0f, -5.99f, 0.54f, -8f, 1.13f)
                        verticalLineTo(6.38f)
                        curveTo(6.58f, 7.11f, 9.32f, 7.5f, 12f, 7.5f)
                        curveToRelative(3.38f, 0f, 5.99f, -0.54f, 8f, -1.13f)
                        verticalLineTo(17.63f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9.17f, 10.99f)
                        lineToRelative(-3.69f, 4.42f)
                        curveTo(7.48f, 15.15f, 9.66f, 15f, 12f, 15f)
                        curveToRelative(2.3f, 0f, 4.52f, 0.15f, 6.51f, 0.4f)
                        lineTo(14f, 10f)
                        lineToRelative(-2.83f, 3.39f)
                        lineTo(9.17f, 10.99f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Vrpano!!
    }

private var _Vrpano: ImageVector? = null

