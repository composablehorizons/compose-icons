package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Edit_location_alt: ImageVector
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(13.54f, 13f)
                            horizontalLineTo(10f)
                            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                            verticalLineTo(8.46f)
                            curveTo(9f, 8.2f, 9.11f, 7.94f, 9.29f, 7.76f)
                            lineToRelative(5.32f, -5.32f)
                            curveTo(13.78f, 2.16f, 12.9f, 2f, 12f, 2f)
                            curveToRelative(-4.2f, 0f, -8f, 3.22f, -8f, 8.2f)
                            curveToRelative(0f, 3.18f, 2.44f, 6.92f, 7.33f, 11.22f)
                            curveToRelative(0.38f, 0.33f, 0.96f, 0.33f, 1.34f, 0f)
                            curveTo(17.56f, 17.12f, 20f, 13.37f, 20f, 10.2f)
                            curveToRelative(0f, -1.01f, -0.16f, -1.94f, -0.45f, -2.8f)
                            lineToRelative(-5.31f, 5.31f)
                            curveTo(14.06f, 12.89f, 13.8f, 13f, 13.54f, 13f)
                            close()
                        }
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
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
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

