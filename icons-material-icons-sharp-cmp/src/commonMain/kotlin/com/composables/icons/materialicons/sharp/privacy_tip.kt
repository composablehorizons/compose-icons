package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Privacy_tip: ImageVector
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
                    moveTo(12f, 1f)
                    lineTo(3f, 5f)
                    verticalLineToRelative(6f)
                    curveToRelative(0f, 5.55f, 3.84f, 10.74f, 9f, 12f)
                    curveToRelative(5.16f, -1.26f, 9f, -6.45f, 9f, -12f)
                    verticalLineTo(5f)
                    lineTo(12f, 1f)
                    lineTo(12f, 1f)
                    close()
                    moveTo(11f, 7f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(7f)
                    close()
                    moveTo(11f, 11f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(11f)
                    close()
                }
            }
        }.build()
        
        return _Privacy_tip!!
    }

private var _Privacy_tip: ImageVector? = null

