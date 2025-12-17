package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.No_backpack: ImageVector
    get() {
        if (_No_backpack != null) return _No_backpack!!
        
        _No_backpack = ImageVector.Builder(
            name = "no_backpack",
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
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6.98f, 4.15f)
                        curveToRelative(0.01f, 0f, 0.01f, -0.01f, 0.02f, -0.01f)
                        verticalLineTo(3.5f)
                        curveTo(7f, 2.67f, 7.67f, 2f, 8.5f, 2f)
                        reflectiveCurveTo(10f, 2.67f, 10f, 3.5f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(3.5f)
                        curveTo(14f, 2.67f, 14.67f, 2f, 15.5f, 2f)
                        reflectiveCurveTo(17f, 2.67f, 17f, 3.5f)
                        verticalLineToRelative(0.64f)
                        curveToRelative(1.72f, 0.45f, 3f, 2f, 3f, 3.86f)
                        verticalLineToRelative(9.17f)
                        lineToRelative(-2.03f, -2.03f)
                        curveTo(17.98f, 15.09f, 18f, 15.05f, 18f, 15f)
                        verticalLineToRelative(-2f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(-2.17f)
                        lineTo(6.98f, 4.15f)
                        close()
                        moveTo(20.49f, 21.9f)
                        curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                        lineToRelative(-0.14f, -0.14f)
                        curveTo(18.65f, 21.91f, 18.34f, 22f, 18f, 22f)
                        horizontalLineTo(6f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        verticalLineTo(8f)
                        curveToRelative(0f, -0.36f, 0.06f, -0.69f, 0.15f, -1.02f)
                        lineTo(2.1f, 4.93f)
                        curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                        curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                        lineToRelative(16.97f, 16.97f)
                        curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f)
                        close()
                        moveTo(11.17f, 14f)
                        lineToRelative(-2f, -2f)
                        horizontalLineTo(7f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineTo(11.17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _No_backpack!!
    }

private var _No_backpack: ImageVector? = null

