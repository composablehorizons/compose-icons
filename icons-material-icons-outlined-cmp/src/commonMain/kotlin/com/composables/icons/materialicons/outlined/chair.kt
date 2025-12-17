package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Chair: ImageVector
    get() {
        if (_Chair != null) return _Chair!!
        
        _Chair = ImageVector.Builder(
            name = "chair",
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
                    moveTo(20f, 8f)
                    verticalLineTo(6f)
                    curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                    horizontalLineTo(7f)
                    curveTo(5.35f, 3f, 4f, 4.35f, 4f, 6f)
                    verticalLineToRelative(2f)
                    curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                    verticalLineToRelative(5f)
                    curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(12f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-1f)
                    curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                    verticalLineToRelative(-5f)
                    curveTo(23f, 9.35f, 21.65f, 8f, 20f, 8f)
                    close()
                    moveTo(6f, 6f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(10f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(2.78f)
                    curveToRelative(-0.61f, 0.55f, -1f, 1.34f, -1f, 2.22f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(-2f)
                    curveToRelative(0f, -0.88f, -0.39f, -1.67f, -1f, -2.22f)
                    verticalLineTo(6f)
                    close()
                    moveTo(21f, 16f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(4f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-5f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(14f)
                    verticalLineToRelative(-4f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    verticalLineTo(16f)
                    close()
                }
            }
        }.build()
        
        return _Chair!!
    }

private var _Chair: ImageVector? = null

