package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.`2k_plus`: ImageVector
    get() {
        if (_2k_plus != null) return _2k_plus!!
        
        _2k_plus = ImageVector.Builder(
            name = "2k_plus",
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
                    moveTo(19f, 3f)
                    horizontalLineTo(5f)
                    curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                    verticalLineToRelative(14f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(14f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(5f)
                    curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                    close()
                    moveTo(10f, 11.5f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(7.5f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(1.75f)
                    curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                    verticalLineToRelative(0f)
                    curveTo(10f, 14.66f, 9.66f, 15f, 9.25f, 15f)
                    horizontalLineTo(7f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-1.5f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(6.75f)
                    curveTo(6.34f, 10.5f, 6f, 10.16f, 6f, 9.75f)
                    verticalLineToRelative(0f)
                    curveTo(6f, 9.34f, 6.34f, 9f, 6.75f, 9f)
                    horizontalLineTo(9f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineTo(11.5f)
                    close()
                    moveTo(14.04f, 14.73f)
                    lineToRelative(-1.54f, -1.98f)
                    verticalLineToRelative(1.5f)
                    curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                    horizontalLineToRelative(0f)
                    curveTo(11.34f, 15f, 11f, 14.66f, 11f, 14.25f)
                    verticalLineToRelative(-4.5f)
                    curveTo(11f, 9.34f, 11.34f, 9f, 11.75f, 9f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                    verticalLineToRelative(1.5f)
                    lineToRelative(1.54f, -1.98f)
                    curveTo(14.17f, 9.1f, 14.38f, 9f, 14.59f, 9f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.58f, 0f, 0.91f, 0.66f, 0.56f, 1.12f)
                    lineTo(13.75f, 12f)
                    lineToRelative(1.41f, 1.88f)
                    curveTo(15.5f, 14.34f, 15.17f, 15f, 14.59f, 15f)
                    horizontalLineToRelative(0f)
                    curveTo(14.38f, 15f, 14.17f, 14.9f, 14.04f, 14.73f)
                    close()
                    moveTo(18.5f, 12.5f)
                    horizontalLineToRelative(-1f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(-1f)
                    curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(-1f)
                    curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(1f)
                    curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                    verticalLineToRelative(0f)
                    curveTo(19f, 12.28f, 18.78f, 12.5f, 18.5f, 12.5f)
                    close()
                }
            }
        }.build()
        
        return _2k_plus!!
    }

private var _2k_plus: ImageVector? = null

