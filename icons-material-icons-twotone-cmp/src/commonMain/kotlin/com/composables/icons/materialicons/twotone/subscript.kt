package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Subscript: ImageVector
    get() {
        if (_Subscript != null) return _Subscript!!
        
        _Subscript = ImageVector.Builder(
            name = "subscript",
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
                    moveTo(22f, 18f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(-2f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(-3f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(3f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(1f)
                    curveTo(23f, 17.55f, 22.55f, 18f, 22f, 18f)
                    close()
                    moveTo(5.88f, 18f)
                    horizontalLineToRelative(2.66f)
                    lineToRelative(3.4f, -5.42f)
                    horizontalLineToRelative(0.12f)
                    lineToRelative(3.4f, 5.42f)
                    horizontalLineToRelative(2.66f)
                    lineToRelative(-4.65f, -7.27f)
                    lineTo(17.81f, 4f)
                    horizontalLineToRelative(-2.68f)
                    lineToRelative(-3.07f, 4.99f)
                    horizontalLineToRelative(-0.12f)
                    lineTo(8.85f, 4f)
                    horizontalLineTo(6.19f)
                    lineToRelative(4.32f, 6.73f)
                    lineTo(5.88f, 18f)
                    close()
                }
            }
        }.build()
        
        return _Subscript!!
    }

private var _Subscript: ImageVector? = null

