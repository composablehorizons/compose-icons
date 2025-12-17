package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Edit_location_alt: ImageVector
    get() {
        if (_Edit_location_alt != null) return _Edit_location_alt!!
        
        _Edit_location_alt = ImageVector.Builder(
            name = "edit_location_alt",
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
                    moveTo(13.95f, 13f)
                    horizontalLineTo(9f)
                    verticalLineTo(8.05f)
                    lineToRelative(5.61f, -5.61f)
                    curveTo(13.78f, 2.16f, 12.9f, 2f, 12f, 2f)
                    curveToRelative(-4.2f, 0f, -8f, 3.22f, -8f, 8.2f)
                    curveToRelative(0f, 3.32f, 2.67f, 7.25f, 8f, 11.8f)
                    curveToRelative(5.33f, -4.55f, 8f, -8.48f, 8f, -11.8f)
                    curveToRelative(0f, -1.01f, -0.16f, -1.94f, -0.45f, -2.8f)
                    lineTo(13.95f, 13f)
                    close()
                    moveTo(11f, 11f)
                    horizontalLineToRelative(2.12f)
                    lineToRelative(6.16f, -6.16f)
                    lineToRelative(-2.12f, -2.12f)
                    lineTo(11f, 8.88f)
                    verticalLineTo(11f)
                    close()
                    moveTo(19.29f, 0.59f)
                    lineToRelative(-1.42f, 1.42f)
                    lineToRelative(2.12f, 2.12f)
                    lineToRelative(1.42f, -1.42f)
                    lineTo(19.29f, 0.59f)
                    close()
                }
            }
        }.build()
        
        return _Edit_location_alt!!
    }

private var _Edit_location_alt: ImageVector? = null

