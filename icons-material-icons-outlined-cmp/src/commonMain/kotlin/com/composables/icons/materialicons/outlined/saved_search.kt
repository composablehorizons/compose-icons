package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Saved_search: ImageVector
    get() {
        if (_Saved_search != null) return _Saved_search!!
        
        _Saved_search = ImageVector.Builder(
            name = "saved_search",
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
                        moveTo(14.73f, 13.31f)
                        curveTo(15.52f, 12.24f, 16f, 10.93f, 16f, 9.5f)
                        curveTo(16f, 5.91f, 13.09f, 3f, 9.5f, 3f)
                        reflectiveCurveTo(3f, 5.91f, 3f, 9.5f)
                        curveTo(3f, 13.09f, 5.91f, 16f, 9.5f, 16f)
                        curveToRelative(1.43f, 0f, 2.74f, -0.48f, 3.81f, -1.27f)
                        lineTo(19.59f, 21f)
                        lineTo(21f, 19.59f)
                        lineTo(14.73f, 13.31f)
                        close()
                        moveTo(9.5f, 14f)
                        curveTo(7.01f, 14f, 5f, 11.99f, 5f, 9.5f)
                        reflectiveCurveTo(7.01f, 5f, 9.5f, 5f)
                        reflectiveCurveTo(14f, 7.01f, 14f, 9.5f)
                        reflectiveCurveTo(11.99f, 14f, 9.5f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.29f, 8.44f)
                        lineTo(9.5f, 6f)
                        lineTo(8.71f, 8.44f)
                        lineTo(6.25f, 8.44f)
                        lineTo(8.26f, 10.03f)
                        lineTo(7.49f, 12.5f)
                        lineTo(9.5f, 10.97f)
                        lineTo(11.51f, 12.5f)
                        lineTo(10.74f, 10.03f)
                        lineTo(12.75f, 8.44f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Saved_search!!
    }

private var _Saved_search: ImageVector? = null

