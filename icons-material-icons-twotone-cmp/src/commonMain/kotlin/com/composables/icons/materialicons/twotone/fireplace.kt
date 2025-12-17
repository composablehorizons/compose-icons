package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Fireplace: ImageVector
    get() {
        if (_Fireplace != null) return _Fireplace!!
        
        _Fireplace = ImageVector.Builder(
            name = "fireplace",
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
                        moveTo(4f, 20f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(2.23f)
                        curveToRelative(-0.75f, -0.93f, -1.2f, -2.04f, -1.23f, -3f)
                        curveToRelative(-0.02f, -0.53f, -0.73f, -4.43f, 6f, -8f)
                        curveToRelative(0f, 0f, -0.8f, 2.61f, 2.15f, 4.63f)
                        curveTo(15.91f, 12.15f, 17f, 13.11f, 17f, 15f)
                        curveToRelative(0f, 1.13f, -0.39f, 2.16f, -1.02f, 3f)
                        horizontalLineTo(18f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(4f)
                        horizontalLineTo(4f)
                        verticalLineTo(20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12.01f, 12.46f)
                        curveToRelative(-0.15f, 0.42f, -0.15f, 0.82f, -0.08f, 1.28f)
                        curveToRelative(0.1f, 0.55f, 0.33f, 1.04f, 0.2f, 1.6f)
                        curveToRelative(-0.13f, 0.59f, -0.77f, 1.38f, -1.53f, 1.63f)
                        curveToRelative(1.28f, 1.05f, 3.2f, 0.37f, 3.39f, -1.32f)
                        curveTo(14.16f, 14.11f, 12.55f, 13.67f, 12.01f, 12.46f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2f, 2f)
                        verticalLineToRelative(20f)
                        horizontalLineToRelative(20f)
                        verticalLineTo(2f)
                        horizontalLineTo(2f)
                        close()
                        moveTo(12f, 18f)
                        curveToRelative(-1.58f, 0f, -2.97f, -1.88f, -3f, -3.06f)
                        curveToRelative(0f, -0.05f, -0.01f, -0.13f, -0.01f, -0.22f)
                        curveToRelative(-0.13f, -1.73f, 1f, -3.2f, 2.47f, -4.37f)
                        curveToRelative(0.47f, 1.01f, 1.27f, 2.03f, 2.57f, 2.92f)
                        curveTo(14.61f, 13.69f, 15f, 14.13f, 15f, 15f)
                        curveTo(15f, 16.65f, 13.65f, 18f, 12f, 18f)
                        close()
                        moveTo(20f, 20f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(-2.02f)
                        curveToRelative(0.63f, -0.84f, 1.02f, -1.87f, 1.02f, -3f)
                        curveToRelative(0f, -1.89f, -1.09f, -2.85f, -1.85f, -3.37f)
                        curveTo(12.2f, 9.61f, 13f, 7f, 13f, 7f)
                        curveToRelative(-6.73f, 3.57f, -6.02f, 7.47f, -6f, 8f)
                        curveToRelative(0.03f, 0.96f, 0.49f, 2.07f, 1.23f, 3f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(4f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(20f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Fireplace!!
    }

private var _Fireplace: ImageVector? = null

