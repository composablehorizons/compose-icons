package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Edit_location_alt: ImageVector
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
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 11f)
                        lineTo(13.12f, 11f)
                        lineTo(19.28f, 4.84f)
                        lineTo(17.16f, 2.72f)
                        lineTo(11f, 8.88f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.71f, 2f)
                        lineTo(20f, 1.29f)
                        curveTo(19.8f, 1.1f, 19.55f, 1f, 19.29f, 1f)
                        curveToRelative(-0.13f, 0f, -0.48f, 0.07f, -0.71f, 0.29f)
                        lineToRelative(-0.72f, 0.72f)
                        lineToRelative(2.12f, 2.12f)
                        lineToRelative(0.72f, -0.72f)
                        curveTo(21.1f, 3.02f, 21.1f, 2.39f, 20.71f, 2f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Edit_location_alt!!
    }

private var _Edit_location_alt: ImageVector? = null

