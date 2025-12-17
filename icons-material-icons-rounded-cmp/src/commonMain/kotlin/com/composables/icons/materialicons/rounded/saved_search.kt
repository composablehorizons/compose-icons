package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Saved_search: ImageVector
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
                        curveToRelative(1.13f, -1.55f, 1.63f, -3.58f, 0.98f, -5.74f)
                        curveToRelative(-0.68f, -2.23f, -2.57f, -3.98f, -4.85f, -4.44f)
                        curveTo(6.21f, 2.2f, 2.2f, 6.22f, 3.14f, 10.86f)
                        curveToRelative(0.46f, 2.29f, 2.21f, 4.18f, 4.44f, 4.85f)
                        curveToRelative(2.16f, 0.65f, 4.19f, 0.15f, 5.74f, -0.98f)
                        lineToRelative(5.56f, 5.56f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
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

