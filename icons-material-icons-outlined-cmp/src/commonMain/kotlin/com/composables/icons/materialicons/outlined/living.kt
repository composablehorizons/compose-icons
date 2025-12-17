package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Living: ImageVector
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(17.75f, 10.35f)
                    verticalLineTo(9f)
                    curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                    horizontalLineToRelative(-5.5f)
                    curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                    verticalLineToRelative(1.35f)
                    curveTo(5.51f, 10.78f, 5f, 11.58f, 5f, 12.5f)
                    verticalLineTo(16f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(10f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineToRelative(-3.5f)
                    curveTo(19f, 11.58f, 18.49f, 10.78f, 17.75f, 10.35f)
                    close()
                    moveTo(9.25f, 7.5f)
                    horizontalLineToRelative(5.5f)
                    curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                    verticalLineToRelative(1.03f)
                    curveTo(14.99f, 10.15f, 14f, 11.2f, 14f, 12.5f)
                    verticalLineTo(13f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(-0.5f)
                    curveToRelative(0f, -1.3f, -0.99f, -2.35f, -2.25f, -2.47f)
                    verticalLineTo(9f)
                    curveTo(7.75f, 8.17f, 8.42f, 7.5f, 9.25f, 7.5f)
                    close()
                    moveTo(17.5f, 16f)
                    curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                    horizontalLineTo(7f)
                    curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                    verticalLineToRelative(-3.5f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(-2f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineTo(16f)
                    close()
                    moveTo(20f, 4f)
                    verticalLineToRelative(16f)
                    horizontalLineTo(4f)
                    verticalLineTo(4f)
                    horizontalLineTo(20f)
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
                }
            }
        }.build()
        
        return _Living!!
    }

private var _Living: ImageVector? = null

