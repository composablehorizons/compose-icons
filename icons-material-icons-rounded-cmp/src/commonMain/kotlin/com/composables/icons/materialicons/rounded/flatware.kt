package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Flatware: ImageVector
    get() {
        if (_Flatware != null) return _Flatware!!
        
        _Flatware = ImageVector.Builder(
            name = "flatware",
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
                    moveTo(16f, 7.08f)
                    curveToRelative(0f, 1.77f, -0.84f, 3.25f, -2f, 3.82f)
                    verticalLineTo(20f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-9.1f)
                    curveToRelative(-1.16f, -0.57f, -2f, -2.05f, -2f, -3.82f)
                    curveTo(10.01f, 4.83f, 11.35f, 3f, 13f, 3f)
                    curveTo(14.66f, 3f, 16f, 4.83f, 16f, 7.08f)
                    close()
                    moveTo(18.27f, 3.18f)
                    curveTo(17.64f, 2.99f, 17f, 3.49f, 17f, 4.15f)
                    lineTo(17f, 20f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-7f)
                    horizontalLineToRelative(1f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineTo(7f)
                    curveTo(21f, 5.54f, 20.14f, 3.74f, 18.27f, 3.18f)
                    close()
                    moveTo(8.28f, 3f)
                    curveToRelative(-0.4f, 0f, -0.72f, 0.32f, -0.72f, 0.72f)
                    verticalLineTo(7f)
                    horizontalLineTo(6.72f)
                    verticalLineTo(3.72f)
                    curveTo(6.72f, 3.32f, 6.4f, 3f, 6f, 3f)
                    reflectiveCurveTo(5.28f, 3.32f, 5.28f, 3.72f)
                    verticalLineTo(7f)
                    horizontalLineTo(4.44f)
                    verticalLineTo(3.72f)
                    curveTo(4.44f, 3.32f, 4.12f, 3f, 3.72f, 3f)
                    reflectiveCurveTo(3f, 3.32f, 3f, 3.72f)
                    verticalLineTo(9f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    verticalLineToRelative(9f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-9f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(3.72f)
                    curveTo(9f, 3.32f, 8.68f, 3f, 8.28f, 3f)
                    close()
                }
            }
        }.build()
        
        return _Flatware!!
    }

private var _Flatware: ImageVector? = null

