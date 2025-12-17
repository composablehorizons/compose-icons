package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Legend_toggle: ImageVector
    get() {
        if (_Legend_toggle != null) return _Legend_toggle!!
        
        _Legend_toggle = ImageVector.Builder(
            name = "legend_toggle",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19f, 15f)
                    horizontalLineTo(5f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(14f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(20f, 14.55f, 19.55f, 15f, 19f, 15f)
                    close()
                    moveTo(19f, 17f)
                    horizontalLineTo(5f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(14f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveTo(20f, 17.45f, 19.55f, 17f, 19f, 17f)
                    close()
                    moveTo(15f, 11f)
                    lineToRelative(4.58f, -3.25f)
                    curveTo(19.84f, 7.56f, 20f, 7.26f, 20f, 6.94f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.81f, -0.92f, -1.29f, -1.58f, -0.82f)
                    lineTo(15f, 8.55f)
                    lineTo(10f, 5f)
                    lineTo(4.48f, 8.36f)
                    curveTo(4.18f, 8.55f, 4f, 8.87f, 4f, 9.22f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.78f, 0.85f, 1.26f, 1.52f, 0.85f)
                    lineToRelative(4.4f, -2.68f)
                    lineTo(15f, 11f)
                    close()
                }
            }
        }.build()
        
        return _Legend_toggle!!
    }

private var _Legend_toggle: ImageVector? = null

