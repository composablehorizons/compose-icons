package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Arrow_back_ios_new: ImageVector
    get() {
        if (_Arrow_back_ios_new != null) return _Arrow_back_ios_new!!
        
        _Arrow_back_ios_new = ImageVector.Builder(
            name = "arrow_back_ios_new",
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
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(16.88f, 2.88f)
                    lineTo(16.88f, 2.88f)
                    curveToRelative(-0.49f, -0.49f, -1.28f, -0.49f, -1.77f, 0f)
                    lineToRelative(-8.41f, 8.41f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(8.41f, 8.41f)
                    curveToRelative(0.49f, 0.49f, 1.28f, 0.49f, 1.77f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.49f, -0.49f, 0.49f, -1.28f, 0f, -1.77f)
                    lineTo(9.54f, 12f)
                    lineToRelative(7.35f, -7.35f)
                    curveTo(17.37f, 4.16f, 17.37f, 3.37f, 16.88f, 2.88f)
                    close()
                }
            }
        }.build()
        
        return _Arrow_back_ios_new!!
    }

private var _Arrow_back_ios_new: ImageVector? = null

