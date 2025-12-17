package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Stars: ImageVector
    get() {
        if (_Stars != null) return _Stars!!
        
        _Stars = ImageVector.Builder(
            name = "stars",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.99f, 2f)
                curveTo(6.47f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.47f, 10f, 9.99f, 10f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                reflectiveCurveTo(17.52f, 2f, 11.99f, 2f)
                close()
                moveToRelative(3.23f, 15.39f)
                lineTo(12f, 15.45f)
                lineToRelative(-3.22f, 1.94f)
                curveToRelative(-0.38f, 0.23f, -0.85f, -0.11f, -0.75f, -0.54f)
                lineToRelative(0.85f, -3.66f)
                lineToRelative(-2.83f, -2.45f)
                curveToRelative(-0.33f, -0.29f, -0.15f, -0.84f, 0.29f, -0.88f)
                lineToRelative(3.74f, -0.32f)
                lineToRelative(1.46f, -3.45f)
                curveToRelative(0.17f, -0.41f, 0.75f, -0.41f, 0.92f, 0f)
                lineToRelative(1.46f, 3.44f)
                lineToRelative(3.74f, 0.32f)
                curveToRelative(0.44f, 0.04f, 0.62f, 0.59f, 0.28f, 0.88f)
                lineToRelative(-2.83f, 2.45f)
                lineToRelative(0.85f, 3.67f)
                curveToRelative(0.1f, 0.43f, -0.36f, 0.77f, -0.74f, 0.54f)
                close()
            }
        }.build()
        
        return _Stars!!
    }

private var _Stars: ImageVector? = null

