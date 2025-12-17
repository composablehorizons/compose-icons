package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.How_to_reg: ImageVector
    get() {
        if (_How_to_reg != null) return _How_to_reg!!
        
        _How_to_reg = ImageVector.Builder(
            name = "how_to_reg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(9f, 17f)
                    lineToRelative(3f, -2.94f)
                    curveToRelative(-0.39f, -0.04f, -0.68f, -0.06f, -1f, -0.06f)
                    curveToRelative(-2.67f, 0f, -8f, 1.34f, -8f, 4f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(9f)
                    lineToRelative(-3f, -3f)
                    close()
                    moveToRelative(2f, -5f)
                    curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                    reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                    reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                    reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(15.47f, 20.5f)
                    lineTo(12f, 17f)
                    lineToRelative(1.4f, -1.41f)
                    lineToRelative(2.07f, 2.08f)
                    lineToRelative(5.13f, -5.17f)
                    lineToRelative(1.4f, 1.41f)
                    close()
                }
            }
        }.build()
        
        return _How_to_reg!!
    }

private var _How_to_reg: ImageVector? = null

