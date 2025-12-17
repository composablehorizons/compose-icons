package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Filter_alt: ImageVector
    get() {
        if (_Filter_alt != null) return _Filter_alt!!
        
        _Filter_alt = ImageVector.Builder(
            name = "filter_alt",
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
                    moveTo(24f, 24f)
                    horizontalLineTo(0f)
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(7f, 6f)
                    horizontalLineToRelative(10f)
                    lineToRelative(-5.01f, 6.3f)
                    lineTo(7f, 6f)
                    close()
                    moveTo(4.25f, 5.61f)
                    curveTo(6.27f, 8.2f, 10f, 13f, 10f, 13f)
                    verticalLineToRelative(6f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-6f)
                    curveToRelative(0f, 0f, 3.72f, -4.8f, 5.74f, -7.39f)
                    curveTo(20.25f, 4.95f, 19.78f, 4f, 18.95f, 4f)
                    horizontalLineTo(5.04f)
                    curveTo(4.21f, 4f, 3.74f, 4.95f, 4.25f, 5.61f)
                    close()
                }
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 6f)
                lineTo(17f, 6f)
                lineTo(11.99f, 12.3f)
                close()
            }
        }.build()
        
        return _Filter_alt!!
    }

private var _Filter_alt: ImageVector? = null

