package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.`8k_plus`: ImageVector
    get() {
        if (_8k_plus != null) return _8k_plus!!
        
        _8k_plus = ImageVector.Builder(
            name = "8k_plus",
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
                    moveTo(7.5f, 12.5f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(14f)
                    horizontalLineToRelative(-1f)
                    verticalLineTo(12.5f)
                    close()
                    moveTo(7.5f, 10f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(1.5f)
                    horizontalLineToRelative(-1f)
                    verticalLineTo(10f)
                    close()
                    moveTo(21f, 3f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(18f)
                    horizontalLineToRelative(18f)
                    verticalLineTo(3f)
                    close()
                    moveTo(10f, 14f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(7f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-4f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineTo(14f)
                    close()
                    moveTo(16f, 15f)
                    horizontalLineToRelative(-1.75f)
                    lineToRelative(-1.75f, -2.25f)
                    verticalLineTo(15f)
                    horizontalLineTo(11f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(2.25f)
                    lineTo(14.25f, 9f)
                    horizontalLineTo(16f)
                    lineToRelative(-2.25f, 3f)
                    lineTo(16f, 15f)
                    close()
                    moveTo(19f, 12.5f)
                    horizontalLineToRelative(-1.5f)
                    verticalLineTo(14f)
                    horizontalLineToRelative(-1f)
                    verticalLineToRelative(-1.5f)
                    horizontalLineTo(15f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(1.5f)
                    verticalLineTo(10f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(1.5f)
                    horizontalLineTo(19f)
                    verticalLineTo(12.5f)
                    close()
                }
            }
        }.build()
        
        return _8k_plus!!
    }

private var _8k_plus: ImageVector? = null

