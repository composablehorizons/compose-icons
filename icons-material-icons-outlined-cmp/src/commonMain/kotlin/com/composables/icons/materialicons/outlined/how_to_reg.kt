package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.How_to_reg: ImageVector
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
                moveTo(11f, 12f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
                moveToRelative(0f, -6f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(5f, 18f)
                curveToRelative(0.2f, -0.63f, 2.57f, -1.68f, 4.96f, -1.94f)
                lineToRelative(2.04f, -2f)
                curveToRelative(-0.39f, -0.04f, -0.68f, -0.06f, -1f, -0.06f)
                curveToRelative(-2.67f, 0f, -8f, 1.34f, -8f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9f)
                lineToRelative(-2f, -2f)
                horizontalLineTo(5f)
                close()
                moveToRelative(15.6f, -5.5f)
                lineToRelative(-5.13f, 5.17f)
                lineToRelative(-2.07f, -2.08f)
                lineTo(12f, 17f)
                lineToRelative(3.47f, 3.5f)
                lineTo(22f, 13.91f)
                close()
            }
        }.build()
        
        return _How_to_reg!!
    }

private var _How_to_reg: ImageVector? = null

