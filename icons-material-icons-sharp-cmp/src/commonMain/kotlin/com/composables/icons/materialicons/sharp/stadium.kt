package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Stadium: ImageVector
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
                    moveTo(7f, 5f)
                    lineTo(3f, 7f)
                    verticalLineTo(3f)
                    lineTo(7f, 5f)
                    close()
                    moveTo(18f, 3f)
                    verticalLineToRelative(4f)
                    lineToRelative(4f, -2f)
                    lineTo(18f, 3f)
                    close()
                    moveTo(11f, 2f)
                    verticalLineToRelative(4f)
                    lineToRelative(4f, -2f)
                    lineTo(11f, 2f)
                    close()
                    moveTo(5f, 10.04f)
                    curveTo(6.38f, 10.53f, 8.77f, 11f, 12f, 11f)
                    reflectiveCurveToRelative(5.62f, -0.47f, 7f, -0.96f)
                    curveTo(19f, 9.86f, 16.22f, 9f, 12f, 9f)
                    reflectiveCurveTo(5f, 9.86f, 5f, 10.04f)
                    close()
                    moveTo(15f, 17f)
                    horizontalLineTo(9f)
                    lineToRelative(0f, 4.88f)
                    curveTo(4.94f, 21.49f, 2f, 20.34f, 2f, 19f)
                    verticalLineToRelative(-9f)
                    curveToRelative(0f, -1.66f, 4.48f, -3f, 10f, -3f)
                    reflectiveCurveToRelative(10f, 1.34f, 10f, 3f)
                    verticalLineToRelative(9f)
                    curveToRelative(0f, 1.34f, -2.94f, 2.48f, -7f, 2.87f)
                    lineTo(15f, 17f)
                    close()
                }
            }
        }.build()
        
        return _Stadium!!
    }

private var _Stadium: ImageVector? = null

