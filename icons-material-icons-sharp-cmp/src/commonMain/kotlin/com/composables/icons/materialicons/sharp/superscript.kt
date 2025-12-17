package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Superscript: ImageVector
    get() {
        if (_Superscript != null) return _Superscript!!
        
        _Superscript = ImageVector.Builder(
            name = "superscript",
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
                    moveTo(20f, 7f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(20f)
                    close()
                    moveTo(5.88f, 20f)
                    horizontalLineToRelative(2.66f)
                    lineToRelative(3.4f, -5.42f)
                    horizontalLineToRelative(0.12f)
                    lineToRelative(3.4f, 5.42f)
                    horizontalLineToRelative(2.66f)
                    lineToRelative(-4.65f, -7.27f)
                    lineTo(17.81f, 6f)
                    horizontalLineToRelative(-2.68f)
                    lineToRelative(-3.07f, 4.99f)
                    horizontalLineToRelative(-0.12f)
                    lineTo(8.85f, 6f)
                    horizontalLineTo(6.19f)
                    lineToRelative(4.32f, 6.73f)
                    lineTo(5.88f, 20f)
                    close()
                }
            }
        }.build()
        
        return _Superscript!!
    }

private var _Superscript: ImageVector? = null

