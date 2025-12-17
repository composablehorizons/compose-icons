package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Join_inner: ImageVector
    get() {
        if (_Join_inner != null) return _Join_inner!!
        
        _Join_inner = ImageVector.Builder(
            name = "join_inner",
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
                    moveTo(15f, 12f)
                    arcTo(3f, 5.74f, 0f, false, true, 12f, 17.74f)
                    arcTo(3f, 5.74f, 0f, false, true, 9f, 12f)
                    arcTo(3f, 5.74f, 0f, false, true, 15f, 12f)
                    close()
                }
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9.04f, 16.87f)
                        curveTo(8.71f, 16.95f, 8.36f, 17f, 8f, 17f)
                        curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                        reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                        curveToRelative(0.36f, 0f, 0.71f, 0.05f, 1.04f, 0.13f)
                        curveToRelative(0.39f, -0.56f, 0.88f, -1.12f, 1.49f, -1.63f)
                        curveTo(9.75f, 5.19f, 8.9f, 5f, 8f, 5f)
                        curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                        reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                        curveToRelative(0.9f, 0f, 1.75f, -0.19f, 2.53f, -0.5f)
                        curveTo(9.92f, 17.99f, 9.43f, 17.43f, 9.04f, 16.87f)
                        close()
                    }
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(16f, 5f)
                    curveToRelative(-0.9f, 0f, -1.75f, 0.19f, -2.53f, 0.5f)
                    curveToRelative(0.61f, 0.51f, 1.1f, 1.07f, 1.49f, 1.63f)
                    curveTo(15.29f, 7.05f, 15.64f, 7f, 16f, 7f)
                    curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                    reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                    curveToRelative(-0.36f, 0f, -0.71f, -0.05f, -1.04f, -0.13f)
                    curveToRelative(-0.39f, 0.56f, -0.88f, 1.12f, -1.49f, 1.63f)
                    curveTo(14.25f, 18.81f, 15.1f, 19f, 16f, 19f)
                    curveToRelative(3.86f, 0f, 7f, -3.14f, 7f, -7f)
                    reflectiveCurveTo(19.86f, 5f, 16f, 5f)
                    close()
                }
            }
        }.build()
        
        return _Join_inner!!
    }

private var _Join_inner: ImageVector? = null

