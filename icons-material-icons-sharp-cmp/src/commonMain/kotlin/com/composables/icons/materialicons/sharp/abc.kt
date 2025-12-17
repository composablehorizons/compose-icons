package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Abc: ImageVector
    get() {
        if (_Abc != null) return _Abc!!
        
        _Abc = ImageVector.Builder(
            name = "abc",
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
                    moveTo(21f, 11f)
                    horizontalLineToRelative(-1.5f)
                    verticalLineToRelative(-0.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(13f)
                    horizontalLineTo(21f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-5f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(5f)
                    verticalLineTo(11f)
                    close()
                    moveTo(8f, 9f)
                    verticalLineToRelative(6f)
                    horizontalLineTo(6.5f)
                    verticalLineToRelative(-1.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(15f)
                    horizontalLineTo(3f)
                    verticalLineTo(9f)
                    horizontalLineTo(8f)
                    close()
                    moveTo(6.5f, 10.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(12f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(10.5f)
                    close()
                    moveTo(13.5f, 12f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(4f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(1f)
                    curveTo(14.5f, 11.55f, 14.05f, 12f, 13.5f, 12f)
                    close()
                    moveTo(11f, 10.5f)
                    verticalLineToRelative(0.75f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(10.5f)
                    horizontalLineTo(11f)
                    close()
                    moveTo(13f, 12.75f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(0.75f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(12.75f)
                    close()
                }
            }
        }.build()
        
        return _Abc!!
    }

private var _Abc: ImageVector? = null

