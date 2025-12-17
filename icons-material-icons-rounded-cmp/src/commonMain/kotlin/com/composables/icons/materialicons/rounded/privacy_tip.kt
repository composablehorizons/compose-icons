package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Privacy_tip: ImageVector
    get() {
        if (_Privacy_tip != null) return _Privacy_tip!!
        
        _Privacy_tip = ImageVector.Builder(
            name = "privacy_tip",
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
                    moveTo(4.19f, 4.47f)
                    curveTo(3.47f, 4.79f, 3f, 5.51f, 3f, 6.3f)
                    verticalLineTo(11f)
                    curveToRelative(0f, 5.55f, 3.84f, 10.74f, 9f, 12f)
                    curveToRelative(5.16f, -1.26f, 9f, -6.45f, 9f, -12f)
                    verticalLineTo(6.3f)
                    curveToRelative(0f, -0.79f, -0.47f, -1.51f, -1.19f, -1.83f)
                    lineToRelative(-7f, -3.11f)
                    curveToRelative(-0.52f, -0.23f, -1.11f, -0.23f, -1.62f, 0f)
                    lineTo(4.19f, 4.47f)
                    close()
                    moveTo(12f, 7f)
                    lineTo(12f, 7f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveTo(11f, 7.45f, 11.45f, 7f, 12f, 7f)
                    close()
                    moveTo(12f, 11f)
                    lineTo(12f, 11f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(4f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-4f)
                    curveTo(11f, 11.45f, 11.45f, 11f, 12f, 11f)
                    close()
                }
            }
        }.build()
        
        return _Privacy_tip!!
    }

private var _Privacy_tip: ImageVector? = null

