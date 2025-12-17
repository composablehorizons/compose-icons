package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Add_location: ImageVector
    get() {
        if (_Add_location != null) return _Add_location!!
        
        _Add_location = ImageVector.Builder(
            name = "add_location",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 6f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(3f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(3f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(-3f)
                        verticalLineTo(6f)
                        close()
                        moveTo(12f, 2f)
                        curveToRelative(4.2f, 0f, 8f, 3.22f, 8f, 8.2f)
                        curveToRelative(0f, 3.32f, -2.67f, 7.25f, -8f, 11.8f)
                        curveToRelative(-5.33f, -4.55f, -8f, -8.48f, -8f, -11.8f)
                        curveTo(4f, 5.22f, 7.8f, 2f, 12f, 2f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Add_location!!
    }

private var _Add_location: ImageVector? = null

