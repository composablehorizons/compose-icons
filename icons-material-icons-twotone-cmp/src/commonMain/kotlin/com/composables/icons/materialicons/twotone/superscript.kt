package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Superscript: ImageVector
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
                    moveTo(22f, 7f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(7f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(3f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(1f)
                    curveTo(23f, 6.55f, 22.55f, 7f, 22f, 7f)
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

