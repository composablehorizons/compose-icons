package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.`10k`: ImageVector
    get() {
        if (_10k != null) return _10k!!
        
        _10k = ImageVector.Builder(
            name = "10k",
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
                    moveTo(10f, 10.5f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(10f)
                    verticalLineTo(10.5f)
                    close()
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
                    moveTo(6.75f, 15f)
                    lineTo(6.75f, 15f)
                    curveTo(6.34f, 15f, 6f, 14.66f, 6f, 14.25f)
                    verticalLineTo(10.5f)
                    horizontalLineTo(5.25f)
                    curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                    verticalLineToRelative(0f)
                    curveTo(4.5f, 9.34f, 4.84f, 9f, 5.25f, 9f)
                    horizontalLineTo(6.5f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(4.25f)
                    curveTo(7.5f, 14.66f, 7.16f, 15f, 6.75f, 15f)
                    close()
                    moveTo(13f, 14f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(9.5f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-4f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineTo(12f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineTo(14f)
                    close()
                    moveTo(17.59f, 15f)
                    lineTo(17.59f, 15f)
                    curveToRelative(-0.22f, 0f, -0.42f, -0.1f, -0.55f, -0.27f)
                    lineToRelative(-1.54f, -1.98f)
                    verticalLineToRelative(1.5f)
                    curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                    horizontalLineToRelative(0f)
                    curveTo(14.34f, 15f, 14f, 14.66f, 14f, 14.25f)
                    verticalLineToRelative(-4.5f)
                    curveTo(14f, 9.34f, 14.34f, 9f, 14.75f, 9f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                    verticalLineToRelative(1.5f)
                    lineToRelative(1.54f, -1.98f)
                    curveTo(17.17f, 9.1f, 17.38f, 9f, 17.59f, 9f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.58f, 0f, 0.91f, 0.66f, 0.56f, 1.12f)
                    lineTo(16.75f, 12f)
                    lineToRelative(1.41f, 1.88f)
                    curveTo(18.5f, 14.34f, 18.17f, 15f, 17.59f, 15f)
                    close()
                }
            }
        }.build()
        
        return _10k!!
    }

private var _10k: ImageVector? = null

