package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Temple_buddhist: ImageVector
    get() {
        if (_Temple_buddhist != null) return _Temple_buddhist!!
        
        _Temple_buddhist = ImageVector.Builder(
            name = "temple_buddhist",
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
                    moveTo(21f, 9.02f)
                    curveToRelative(0f, 1.09f, -0.89f, 1.98f, -1.98f, 1.98f)
                    horizontalLineTo(18f)
                    verticalLineTo(8.86f)
                    curveToRelative(1.72f, -0.44f, 3f, -1.99f, 3f, -3.84f)
                    verticalLineTo(5f)
                    lineToRelative(-2f, 0.02f)
                    curveTo(19f, 6.11f, 18.11f, 7f, 17.02f, 7f)
                    horizontalLineTo(16.5f)
                    lineTo(12f, 1f)
                    lineTo(7.5f, 7f)
                    horizontalLineTo(6.98f)
                    curveTo(5.89f, 7f, 5f, 6.11f, 5f, 5.02f)
                    horizontalLineTo(3f)
                    curveToRelative(0f, 1.86f, 1.28f, 3.4f, 3f, 3.84f)
                    verticalLineTo(11f)
                    horizontalLineTo(4.98f)
                    curveTo(3.89f, 11f, 3f, 10.11f, 3f, 9.02f)
                    horizontalLineTo(1f)
                    curveToRelative(0f, 1.86f, 1.28f, 3.4f, 3f, 3.84f)
                    verticalLineTo(22f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(-4f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(-9.14f)
                    curveToRelative(1.72f, -0.44f, 3f, -1.99f, 3f, -3.84f)
                    verticalLineTo(9f)
                    lineTo(21f, 9.02f)
                    close()
                    moveTo(12f, 4.33f)
                    lineTo(14f, 7f)
                    horizontalLineToRelative(-4f)
                    lineTo(12f, 4.33f)
                    close()
                    moveTo(8f, 9f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(8f)
                    verticalLineTo(9f)
                    close()
                    moveTo(18f, 20f)
                    horizontalLineToRelative(-3f)
                    verticalLineToRelative(-2f)
                    curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                    curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(-7f)
                    horizontalLineToRelative(12f)
                    verticalLineTo(20f)
                    close()
                }
            }
        }.build()
        
        return _Temple_buddhist!!
    }

private var _Temple_buddhist: ImageVector? = null

