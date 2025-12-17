package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Living: ImageVector
    get() {
        if (_Living != null) return _Living!!
        
        _Living = ImageVector.Builder(
            name = "living",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(16.5f, 11.5f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-7f)
                        verticalLineToRelative(-2f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                        verticalLineTo(16f)
                        curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                        horizontalLineToRelative(10f)
                        curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                        verticalLineToRelative(-3.5f)
                        curveTo(17.5f, 11.95f, 17.05f, 11.5f, 16.5f, 11.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 12.5f)
                        verticalLineTo(13f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(-0.5f)
                        curveToRelative(0f, -1.3f, 0.99f, -2.35f, 2.25f, -2.47f)
                        verticalLineTo(9f)
                        curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                        horizontalLineToRelative(-5.5f)
                        curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                        verticalLineToRelative(1.03f)
                        curveTo(9.01f, 10.15f, 10f, 11.2f, 10f, 12.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 2f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                        verticalLineToRelative(16f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(4f)
                        curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                        close()
                        moveTo(19f, 16f)
                        curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                        horizontalLineTo(7f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        verticalLineToRelative(-3.5f)
                        curveToRelative(0f, -0.92f, 0.51f, -1.72f, 1.25f, -2.15f)
                        verticalLineTo(9f)
                        curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                        horizontalLineToRelative(5.5f)
                        curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                        verticalLineToRelative(1.35f)
                        curveTo(18.49f, 10.78f, 19f, 11.58f, 19f, 12.5f)
                        verticalLineTo(16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Living!!
    }

private var _Living: ImageVector? = null

