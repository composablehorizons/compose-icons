package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Add_location: ImageVector
    get() {
        if (_Add_location != null) return _Add_location!!
        
        _Add_location = ImageVector.Builder(
            name = "add_location",
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
                            moveTo(13f, 7f)
                            curveToRelative(0f, -0.55f, -0.44f, -1f, -1f, -1f)
                            curveToRelative(-0.55f, 0f, -1f, 0.44f, -1f, 1f)
                            verticalLineToRelative(2f)
                            horizontalLineTo(9f)
                            curveToRelative(-0.55f, 0f, -1f, 0.44f, -1f, 1f)
                            curveToRelative(0f, 0.55f, 0.44f, 1f, 1f, 1f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(2f)
                            curveToRelative(0f, 0.55f, 0.44f, 1f, 1f, 1f)
                            curveToRelative(0.55f, 0f, 1f, -0.44f, 1f, -1f)
                            verticalLineToRelative(-2f)
                            horizontalLineToRelative(2f)
                            curveToRelative(0.55f, 0f, 1f, -0.44f, 1f, -1f)
                            curveToRelative(0f, -0.55f, -0.44f, -1f, -1f, -1f)
                            horizontalLineToRelative(-2f)
                            verticalLineTo(7f)
                            close()
                            moveTo(12f, 2f)
                            curveToRelative(4.2f, 0f, 8f, 3.22f, 8f, 8.2f)
                            curveToRelative(0f, 3.18f, -2.45f, 6.92f, -7.34f, 11.23f)
                            curveToRelative(-0.38f, 0.33f, -0.95f, 0.33f, -1.33f, 0f)
                            curveTo(6.45f, 17.12f, 4f, 13.38f, 4f, 10.2f)
                            curveTo(4f, 5.22f, 7.8f, 2f, 12f, 2f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Add_location!!
    }

private var _Add_location: ImageVector? = null

