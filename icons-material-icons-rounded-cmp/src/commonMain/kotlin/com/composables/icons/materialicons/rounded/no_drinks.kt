package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.No_drinks: ImageVector
    get() {
        if (_No_drinks != null) return _No_drinks!!
        
        _No_drinks = ImageVector.Builder(
            name = "no_drinks",
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
                    moveTo(20.49f, 20.49f)
                    lineTo(3.51f, 3.51f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(7.54f, 7.54f)
                    lineTo(11f, 14f)
                    verticalLineToRelative(5f)
                    horizontalLineTo(7f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(10f)
                    curveToRelative(0.32f, 0f, 0.59f, -0.16f, 0.78f, -0.4f)
                    lineToRelative(1.3f, 1.3f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f)
                    close()
                    moveTo(13f, 19f)
                    verticalLineToRelative(-3.17f)
                    lineTo(16.17f, 19f)
                    horizontalLineTo(13f)
                    close()
                    moveTo(7.83f, 5f)
                    lineToRelative(-2f, -2f)
                    horizontalLineToRelative(13.72f)
                    curveTo(20.35f, 3f, 21f, 3.65f, 21f, 4.45f)
                    curveToRelative(0f, 0.35f, -0.13f, 0.7f, -0.37f, 0.96f)
                    lineToRelative(-5.83f, 6.56f)
                    lineTo(9.83f, 7f)
                    horizontalLineToRelative(6.74f)
                    lineToRelative(1.78f, -2f)
                    horizontalLineTo(7.83f)
                    close()
                }
            }
        }.build()
        
        return _No_drinks!!
    }

private var _No_drinks: ImageVector? = null

