package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Piano_off: ImageVector
    get() {
        if (_Piano_off != null) return _Piano_off!!
        
        _Piano_off = ImageVector.Builder(
            name = "piano_off",
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.49f, 21.9f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineTo(3.51f, 3.51f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineTo(3f, 5.83f)
                verticalLineTo(19f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(13.17f)
                lineToRelative(0.9f, 0.9f)
                curveTo(19.46f, 22.29f, 20.09f, 22.29f, 20.49f, 21.9f)
                close()
                moveTo(8.25f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(7.83f)
                lineToRelative(2f, 2f)
                verticalLineToRelative(3.67f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.25f)
                verticalLineTo(19f)
                close()
                moveTo(9.75f, 19f)
                verticalLineToRelative(-4.5f)
                horizontalLineTo(10f)
                curveToRelative(0.46f, 0f, 0.82f, -0.31f, 0.94f, -0.73f)
                lineToRelative(3.31f, 3.31f)
                verticalLineTo(19f)
                horizontalLineTo(9.75f)
                close()
                moveTo(11f, 8.17f)
                lineTo(5.83f, 3f)
                horizontalLineTo(19f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(13.17f)
                lineToRelative(-2f, -2f)
                verticalLineTo(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 0.19f, -0.07f, 0.36f, -0.16f, 0.51f)
                lineTo(13f, 10.17f)
                verticalLineTo(5f)
                horizontalLineToRelative(-2f)
                verticalLineTo(8.17f)
                close()
            }
        }.build()
        
        return _Piano_off!!
    }

private var _Piano_off: ImageVector? = null

