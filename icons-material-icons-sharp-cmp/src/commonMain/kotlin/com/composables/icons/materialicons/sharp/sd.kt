package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Sd: ImageVector
    get() {
        if (_Sd != null) return _Sd!!
        
        _Sd = ImageVector.Builder(
            name = "sd",
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
                    moveTo(2f, 4f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(4f)
                    horizontalLineTo(2f)
                    close()
                    moveTo(13f, 9f)
                    horizontalLineToRelative(4f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(4f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(9f)
                    close()
                    moveTo(9.5f, 13.5f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(6f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(9.5f)
                    verticalLineToRelative(-0.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(1f)
                    horizontalLineTo(11f)
                    verticalLineTo(15f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(0.5f)
                    horizontalLineTo(9.5f)
                    close()
                    moveTo(14.5f, 13.5f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(13.5f)
                    close()
                }
            }
        }.build()
        
        return _Sd!!
    }

private var _Sd: ImageVector? = null

