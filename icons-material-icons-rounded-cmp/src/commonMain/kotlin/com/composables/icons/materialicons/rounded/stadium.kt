package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Stadium: ImageVector
    get() {
        if (_Stadium != null) return _Stadium!!
        
        _Stadium = ImageVector.Builder(
            name = "stadium",
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
                    moveTo(6.11f, 5.45f)
                    lineTo(3.72f, 6.64f)
                    curveTo(3.39f, 6.8f, 3f, 6.56f, 3f, 6.19f)
                    verticalLineTo(3.81f)
                    curveTo(3f, 3.44f, 3.39f, 3.2f, 3.72f, 3.36f)
                    lineToRelative(2.38f, 1.19f)
                    curveTo(6.47f, 4.74f, 6.47f, 5.26f, 6.11f, 5.45f)
                    close()
                    moveTo(18f, 3.81f)
                    verticalLineToRelative(2.38f)
                    curveToRelative(0f, 0.37f, 0.39f, 0.61f, 0.72f, 0.45f)
                    lineToRelative(2.38f, -1.19f)
                    curveToRelative(0.37f, -0.18f, 0.37f, -0.71f, 0f, -0.89f)
                    lineToRelative(-2.38f, -1.19f)
                    curveTo(18.39f, 3.2f, 18f, 3.44f, 18f, 3.81f)
                    close()
                    moveTo(11f, 2.81f)
                    verticalLineToRelative(2.38f)
                    curveToRelative(0f, 0.37f, 0.39f, 0.61f, 0.72f, 0.45f)
                    lineToRelative(2.38f, -1.19f)
                    curveToRelative(0.37f, -0.18f, 0.37f, -0.71f, 0f, -0.89f)
                    lineToRelative(-2.38f, -1.19f)
                    curveTo(11.39f, 2.2f, 11f, 2.44f, 11f, 2.81f)
                    close()
                    moveTo(5f, 10.04f)
                    curveTo(6.38f, 10.53f, 8.77f, 11f, 12f, 11f)
                    reflectiveCurveToRelative(5.62f, -0.47f, 7f, -0.96f)
                    curveTo(19f, 9.86f, 16.22f, 9f, 12f, 9f)
                    reflectiveCurveTo(5f, 9.86f, 5f, 10.04f)
                    close()
                    moveTo(14f, 17f)
                    horizontalLineToRelative(-4f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    lineToRelative(0f, 3.88f)
                    curveTo(4.94f, 21.49f, 2f, 20.34f, 2f, 19f)
                    verticalLineToRelative(-9f)
                    curveToRelative(0f, -1.66f, 4.48f, -3f, 10f, -3f)
                    reflectiveCurveToRelative(10f, 1.34f, 10f, 3f)
                    verticalLineToRelative(9f)
                    curveToRelative(0f, 1.34f, -2.94f, 2.48f, -7f, 2.87f)
                    lineTo(15f, 18f)
                    curveTo(15f, 17.45f, 14.55f, 17f, 14f, 17f)
                    close()
                }
            }
        }.build()
        
        return _Stadium!!
    }

private var _Stadium: ImageVector? = null

